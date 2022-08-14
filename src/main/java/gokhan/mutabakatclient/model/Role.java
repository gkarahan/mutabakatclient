package gokhan.mutabakatclient.model;

//import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
//import org.springframework.security.core.GrantedAuthority;

//import javax.persistence.*;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;
//import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@Entity
//@Table(name = "roles")
public class Role  {
//    @Id
    //    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
    private Integer id;

//    @NotBlank(message = "Rol Adını Giriniz!")
//    @Column(name = "roladi")
    private String name;

//    @NotNull(message = "Geçerli bilgisi girilmedi!")
//    @Column(name = "gecerli ")
    private Boolean valid;

//    @JsonIgnore
//    @ManyToMany(mappedBy = "roles")
//    private Set<UserEntity> users;

//    @Override
//    public String getAuthority() {
//        return name;
//    }
}
