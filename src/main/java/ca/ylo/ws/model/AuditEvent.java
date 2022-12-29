package ca.ylo.ws.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class AuditEvent {

    private String userId;
    private LocalDateTime time;
    private List<AuditAction> actions;
    private String summary;

}
