package gokhan.mutabakatclient.model;

import lombok.*;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Customer{
    private UUID id;
    private String name;
    private String eMail;
    private String address1;
    private String address2;
    private String taxOffice;
    private String taxID;
    private String phoneNumber;
    private Boolean valid;
    private UUID dealerId;//y
    private List<Account> accounts;
    private List<UserEntity> users;
//    private List<Smtp> smtps;
//
//
}
