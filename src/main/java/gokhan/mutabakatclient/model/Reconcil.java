package gokhan.mutabakatclient.model;

//import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

//import javax.persistence.*;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Size;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@Entity
//@Table(name = "carimutabakat")
public class Reconcil {
//   @JsonProperty("Reconcil")
//   @OnDelete(action = OnDeleteAction.CASCADE)
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
    private UUID id;

//    @NotBlank(message = "Cari Kodu bilgisini giriniz!")
//    @Size(min = 3, max = 10, message = "Cari Kodu 8 karakter ile 100 Karakter arasında olabilir")
//    @Column(name = "carikodu")
    private String accountCode;

//    @NotBlank(message = "Cari Adı bilgisini giriniz!")
//    @Size(min = 3, max = 100, message = "İsim 3 karakter ile 100 Karakter arasında olabilir")
//    @Column(name = "cariadi")
    private String accountName;

//    @Email(message = "eMail bilgisi hatalı")
//    @Column(name = "eposta")
    private String eMail;

//    @Size(min = 3, max = 100, message = "Adres1 3 karakter ile 100 Karakter arasında olabilir")
//    @Column(name = "adres1")
    private String address1;

//    @Size(min = 3, max = 100, message = "Adres2 3 karakter ile 100 Karakter arasında olabilir")
//    @Column(name = "adres2")
    private String address2;

//    @Size(min = 10, max = 12, message = "Telefon No 10 karakter ile 12 Karakter arasında olabilir")
//    @Column(name = "telefonno")
    private String phoneNumber;

//    @Size(min = 9, max = 20, message = "MutabakatTarihi 9 karakter ile 20 Karakter arasında olabilir")
//    @Column(name = "mutabakattarihi")
    private String reconcilliationDate;

//   @Size(min = 9, max = 20, message = "MutabakatTarihiBaslangic 9 karakter ile 20 Karakter arasında olabilir")
//   @Column(name = "gonderimtarihi")
   private String sentDate;

//   @Size(min = 9, max = 20, message = "MutabakatTarihiBitiş 9 karakter ile 20 Karakter arasında olabilir")
//   @Column(name = "cevaptarihi")
   private String responseDate;

//    @Size(min = 3, max = 50, message = "Cevap içeriği 3 karakter ile 50 Karakter arasında olabilir")
//    @Column(name = "bakiyeturu")
    private String AccountType;

//    @Column(name = "tutar")
    private Double total;

//    @Size( max = 5, message = "Para Cinsi max 5 Karakter olabilir")
//    @Column(name = "paracinsi")
    private String currency;

//    @Size(min = 2, max = 1000, message = "Cevap 2 karakter ile 1000 Karakter arasında olabilir")
//    @Column(name = "cevap")
    private String response;

//    @Size(min = 2, max = 10, message = "Durum 2 karakter ile 10 Karakter arasında olabilir")
//    @Column(name = "durum")
    private String status;

//    @Column(name = "cariid", nullable = false)
    private UUID accountId;

//    @ManyToOne
//    @JsonBackReference
//    @JoinColumn(name = "cariid", insertable = false, updatable = false)
//    private Account account;
//
}
