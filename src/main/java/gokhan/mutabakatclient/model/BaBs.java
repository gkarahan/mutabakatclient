package gokhan.mutabakatclient.model;

import lombok.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaBs {
    private UUID id;
    private String accountCode;
    private String accountName;
    private String eMail;
    private String address1;
    private String address2;
    private String reconcilliationStartDate;
    private String reconcilliationEndDate;
    private Integer numberOfDocuments;
    private Double cumulativeTotal;
    private String sentDate;
    private String responseDate;
    private String responseBody;
    private String phoneNumber;
    private UUID accountId;

}
