package gokhan.mutabakatclient.model;

import lombok.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EMailLog {
    private UUID id;
    private String sender;
    private String receiver;
    private String subject;
    private String body;
    private Outcome outcome;
    private UUID accountId;
}
