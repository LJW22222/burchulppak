#!/bin/bash

# Docker 환경변수 설정
export DOCKER_USERNAME="leejownwon"
export DOCKER_REPO="burchulppak"

# 디렉토리 이동
cd /app || { echo "디렉토리 이동 실패"; exit 1; }

# 로그 파일 삭제 (파일이 존재하는지 확인)
if [ -f "concal.log" ]; then
  echo "Log file found, removing..."
  sudo rm concal.log
else
  echo "No log file found"
fi

# 실행 중인 Spring 관련 컨테이너 중지
echo "Stopping all running containers related to Spring..."
SPRING_CONTAINER_ID=$(sudo docker ps --filter "name=${DOCKER_REPO}" -q)
if [ -n "$SPRING_CONTAINER_ID" ]; then
  echo "Stopping the running Spring container..."
  sudo docker stop "$SPRING_CONTAINER_ID"
  sudo docker rm "$SPRING_CONTAINER_ID"
else
  echo "No running Spring container found"
fi

# 최신 이미지 가져오기
echo "Pulling latest Docker image..."
sudo docker pull "${DOCKER_USERNAME}/${DOCKER_REPO}"

# 포트 8795에서 실행 중인 컨테이너 중지 및 제거 (Spring 포트)
CONTAINER_ID=$(sudo docker ps --filter "publish=8795" -q)
if [ -n "$CONTAINER_ID" ]; then
  echo "Stopping and removing existing container using port 8795..."
  sudo docker stop "$CONTAINER_ID"
  sudo docker rm "$CONTAINER_ID"
else
  echo "No container found on port 8795"
fi

# 새로운 Docker 컨테이너 실행 (Spring 애플리케이션)
CONTAINER_NAME="${DOCKER_REPO}"
echo "Running new Docker container for Spring..."
sudo docker run -p 8795:8080 --name "$CONTAINER_NAME" -d "${DOCKER_USERNAME}/${DOCKER_REPO}"

# 컨테이너 실행 확인 후 로그 실시간 추적 및 저장
if sudo docker ps --filter "name=$CONTAINER_NAME" | grep -q "$CONTAINER_NAME"; then
  echo "Container is running. Tracking logs..."
  sudo docker logs -f "$CONTAINER_NAME" &> concal.log &
else
  echo "Container '$CONTAINER_NAME' is not running."
  exit 1
fi

# 사용하지 않는 Docker 이미지 정리
echo "Cleaning up unused Docker images..."
sudo docker image prune -f
