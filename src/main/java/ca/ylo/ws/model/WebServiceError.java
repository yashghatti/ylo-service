package ca.ylo.ws.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Accessors(chain = true)
public class WebServiceError {

    private String reason;
    private LocalDateTime time;

    public WebServiceError() {
        this.time = LocalDateTime.now();
    }
}
