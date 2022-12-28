package ca.ylo.ws.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Error {

    private String reason;
    private LocalDateTime time;

}
