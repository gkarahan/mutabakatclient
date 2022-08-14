package gokhan.mutabakatclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Account {
    private UUID id;
    private String accountCode;
    private String name;
    private String eMail;
    private String address1;
    private String address2;
    private String phoneNumber;
    private Boolean valid;
    @JsonProperty("Customer")
    private List<Customer> customers;
    @JsonProperty("eMailLogs")
    private List<EMailLog> eMailLogs;
    @JsonProperty("baBs")
    private List<BaBs> baBss;
    @JsonProperty("reconcils")
    private List<Reconcil> reconcils;


//
//    @ManyToOne
//    @JsonBackReference
//    @JoinColumn(name = "musteriid")
//    private Customer customer;
//
//    @JsonManagedReference
//    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL )
//    private Set<EMailLog> eMailLogs;
//
//    @JsonManagedReference
//    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL )
//    private Set<BaBs> baBs;
//
//    @JsonManagedReference
//    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL )
//    private Set<Reconcil> reconcils;

}
