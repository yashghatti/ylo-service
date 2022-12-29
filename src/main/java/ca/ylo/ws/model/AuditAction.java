package ca.ylo.ws.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AuditAction {
    private String resourceId;
    private String action;
}
