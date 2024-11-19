package umc.study.apiPayload.code;

import org.springframework.http.HttpStatus;

public interface ErrorReason {
    String getCode();        // 에러 코드 반환
    String getMessage();     // 에러 메시지 반환
    HttpStatus getHttpStatus(); // HTTP 상태 코드 반환
}