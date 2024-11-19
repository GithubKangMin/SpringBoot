package umc.study.apiPayload.code;

import java.awt.desktop.UserSessionEvent;
import java.security.cert.CertPathValidatorException;

public interface BaseCode {

    CertPathValidatorException.Reason getReason();

    UserSessionEvent.Reason getReasonHttpStatus();
}