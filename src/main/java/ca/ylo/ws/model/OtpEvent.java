package ca.ylo.ws.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class OtpEvent {

    private String otpEventId;
    private String phoneNumber;
    private Date requestedAt;
    private Date expiresAt;
    @JsonIgnore
    private String otpValue;

}
