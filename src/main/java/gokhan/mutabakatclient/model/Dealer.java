package gokhan.mutabakatclient.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Dealer implements Serializable {
    private UUID id;
    private String Name;
    private String eMail;
    private Boolean Valid;
    private List<Customer> customers;

}


