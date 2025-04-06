package server.burchulppak.infra.exception;

import lombok.RequiredArgsConstructor;
import server.burchulppak.common.exception.BaseErrorCode;
import server.burchulppak.common.exception.ErrorReason;

import static server.burchulppak.common.constants.ErrorCode.NOT_FOUND;

@RequiredArgsConstructor
public enum BusErrorCode implements BaseErrorCode {

    NOT_FOUNT_BUS_INFO(NOT_FOUND,"BUS_404", "버스 정보가 존재하지 않습니다."),
    NOT_FOUNT_BUS_STATION_INFO(NOT_FOUND,"BUS_STATION_404", "버스 정류장 정보가 존재하지 않습니다.")
    ;

    private final Integer status;
    private final String errorCode;
    private final String message;

    @Override
    public ErrorReason getErrorReason() {
        return ErrorReason.of(status, errorCode, message);
    }
}
