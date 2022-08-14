package gokhan.mutabakatclient.client;

import gokhan.mutabakatclient.model.BaBs;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class BaBsClient {

    public static String MUTABAKAT_PATH_V1 = "http://localhost:8081/api/v1/test/babss/";
    static RestTemplate restTemplate = new RestTemplate();
    static String TestString ="12107427-82f1-4c96-8086-6c4842884465";
    static BaBs baBs = new BaBs(UUID.fromString("a57512ba-bfd4-4950-862a-243df8a7ef8b"),"Car34044", "DK",
            "gokhan.karahan@gmail.com","RUMELI HİSARI MAH ARPACI ÇEŞME SOK NO 40 SARIYER", "ISTANBUL",
            "16.04.2022", "30.04.2022",44, 7890.12,
            "16.05.2022", "30.05.2022", "DENEME",
            "5325097432", UUID.fromString("068560b3-17e6-415d-858f-bcfab6a5e889"));

    private static void getBaBsFindAll(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        ResponseEntity<String> result= restTemplate.exchange(MUTABAKAT_PATH_V1 + "findall/", HttpMethod.GET, entity, String.class);
        System.out.println(result);
    }

    private static void getBaBsById(){
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(TestString));
        BaBs baBs = restTemplate.getForObject(MUTABAKAT_PATH_V1 + UUID.fromString(TestString),
                BaBs.class, param);
        System.out.println(baBs);
    }

    private static void createBaBs(BaBs baBs){
        ResponseEntity<BaBs> createdBaBs =  restTemplate.postForEntity(MUTABAKAT_PATH_V1 + "create/", baBs, BaBs.class);
        System.out.println(createdBaBs.getBody());
    }

    private static void updateBaBs(BaBs baBs){
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(TestString));
        String TestURL =MUTABAKAT_PATH_V1 + "update/" + UUID.fromString(TestString);
    }

    private static void deleteBaBsById() {
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(TestString));
        String TestURL = MUTABAKAT_PATH_V1 + UUID.fromString(TestString);
        restTemplate.delete(TestURL, param);
    }


    public static void main( String[] args ) {
//        getBaBsFindAll();
//        getBaBsById();
//        createBaBs();
//        updateBaBs();
//        deleteBaBsById();
    }
}
