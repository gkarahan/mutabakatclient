package gokhan.mutabakatclient.client;

import gokhan.mutabakatclient.model.Smtp;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class SmtpClient {

    public static String MUTABAKAT_PATH_SMTP_V1 = "http://localhost:8081/api/v1/test/smtps/";
    static RestTemplate restTemplate = new RestTemplate();
    static String TestString ="12107427-82f1-4c96-8086-6c4842884465";
    static Smtp Smtp = new Smtp(UUID.fromString("7e1d7259-3bc5-4cd4-85d4-a97c81dff3c9"),
            "karahan.gokhan@gmail.com",
            "RESTTEMPLATE",
            "smtp.Dk.com",
            UUID.fromString("c91a87de-8a33-41d4-bf23-97c4261140e0"));
    
    private static void getSmtpFindAll(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        ResponseEntity<String> result= restTemplate.exchange(MUTABAKAT_PATH_SMTP_V1 + "findall/", 
                HttpMethod.GET, entity, String.class);
        System.out.println(result);
    }

    private static void getSmtpById(){
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(TestString));
        Smtp Smtp = restTemplate.getForObject(MUTABAKAT_PATH_SMTP_V1 + UUID.fromString(TestString),
                Smtp.class, param);
        System.out.println(Smtp);
    }

    private static void createSmtp(Smtp smtp){
        ResponseEntity<Smtp> createdSmtp =  restTemplate.postForEntity(MUTABAKAT_PATH_SMTP_V1 + "create/", 
                Smtp, Smtp.class);
        System.out.println(createdSmtp.getBody());
    }

    private static void updateSmtp(Smtp smtp){
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(TestString));
        String TestURL = MUTABAKAT_PATH_SMTP_V1 + "update/" + UUID.fromString(TestString);
        restTemplate.put(TestURL, Smtp, param);
    }

    private static void deleteSmtpById() {
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(TestString));
        String TestURL = MUTABAKAT_PATH_SMTP_V1 + UUID.fromString(TestString);
        restTemplate.delete(TestURL, param);
    }

    public static void main( String[] args ) {
//        getSmtpFindAll();
//        deleteSmtpById();
//        getSmtpById( );
//        createSmtp();
//        updateSmtp()
    }
}
