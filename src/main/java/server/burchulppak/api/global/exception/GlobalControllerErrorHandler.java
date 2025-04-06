package server.burchulppak.api.global.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import server.burchulppak.api.global.dto.Response;
import server.burchulppak.common.exception.CustomException;

@RestControllerAdvice
public class GlobalControllerErrorHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<Response<Void>> handleCustomException(CustomException exception) {
        return ResponseEntity
                .status(exception.getErrorCode().getErrorReason().status())
                .body(Response.error(exception.getErrorCode().toString(), exception.getMessage()));
    }

}
