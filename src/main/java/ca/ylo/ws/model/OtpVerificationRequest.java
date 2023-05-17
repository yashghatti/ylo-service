package ca.ylo.ws.model;

import lombok.Data;

@Data
public class OtpVerificationRequest {

    private String otpEventId;
    private String otpValue;

}
