package gokhan.mutabakatclient.model;

//import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.*;
//import javax.validation.constraints.Size;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@Entity
//@Table(name = "smtp")
public class Smtp  {
//    @JsonProperty("smtp")
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
    private UUID id;

//    @Size(min = 3, max = 100, message = "Adres 3 karakter ile 100 Karakter arasında olabilir")
//    @Column(name = "gonderenadres1")
    private String sentAddress;

//    @Size(min = 8, max = 100, message = "Şifre 8 karakter ile 100 Karakter arasında olabilir")
//    @Column(name = "sifre")
    private String password;

//    @Size(min = 3, max = 50, message = "Sunucu Adı 3 karakter ile 50 Karakter arasında olabilir")
//    @Column(name = "sunucuadi")
    private String serverName;

//    @Column(name = "musteriid", nullable = false)
    private UUID customerId;

//    @ManyToOne
//    @JsonBackReference
//    @JoinColumn(name = "musteriid", insertable = false, updatable = false)
//    private Customer customer;

}
