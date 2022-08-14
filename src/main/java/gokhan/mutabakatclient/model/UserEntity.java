package gokhan.mutabakatclient.model;

//import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

//import javax.persistence.*;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//import java.util.Set;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@Entity
//@Table(name = "Kullanici")
public class UserEntity {
 //   @JsonProperty("users")
 //   @OnDelete(action = OnDeleteAction.CASCADE)
//    @Id
    //    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
    private UUID id;

//    @NotBlank(message = "İsim bilgisini giriniz!")
//    @Size(min = 3, max = 100, message = "İsim 3 karakter ile 100 Karakter arasında olabilir")
//    @Column(name = "adi")
    private String name;

//    @Email(message = "eMail bilgisi hatalı")
//    @Column(name = "eposta")
    private String EMail;

//    @Size(min = 8, max = 100, message = "Şifre 8 karakter ile 100 Karakter arasında olabilir")
//    @Column(name = "sifre")
    private String password;

//    @NotNull(message = "Geçerli bilgisi girilmedi!")
//    @Column(name = "gecerli ")
    private Boolean valid;

//    SifreSifirlamaZamani varchar(30),
//    @Size(min = 10, max = 100, message = "VSifre sifirlama 10 karakter ile 100 Karakter arasında olabilir")
//    @Column(name = "sifresifirlamazamani")
    private String passwordResetTiming;

//    @NotNull(message = "Geçerli bilgisi Bayi Id girilmedi!")
//    @Column(name = "sifresifirlamaguid")
    private UUID passwordResetId;

//    @Column(name = "musteriid", nullable = false)
    private UUID customerid;

//    @Column(name = "bayiid", nullable = false)
    private UUID dealerid;

//    @ManyToOne
//    @JsonBackReference
//    @JoinColumn(name = "musteriid", insertable = false, updatable = false)
//    private Customer customer;


//    @ManyToMany
//    @JoinTable(name="kullanicirole",
//            joinColumns = @JoinColumn(name = "kullaniciid"),
//            inverseJoinColumns= @JoinColumn(name = "roleid"))
//    private Set<Role> roles;

}
