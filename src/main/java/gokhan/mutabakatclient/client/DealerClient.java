package gokhan.mutabakatclient.client;

import gokhan.mutabakatclient.model.Dealer;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class DealerClient {

    public static String MUTABAKAT_PATH_DEALER_V1 = "http://localhost:8081/api/v1/test/dealers/";
    static RestTemplate restTemplate = new RestTemplate();
    static String TestString ="645cfa9d-cd83-4149-8265-5330da8a9f33";

    private static void getDealerFindAll(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        ResponseEntity<String> result= restTemplate.exchange(MUTABAKAT_PATH_DEALER_V1 + "findall/",
                HttpMethod.GET, entity, String.class);
        System.out.println(result);
    }

    private static void getDealerByIdTest(){
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(TestString));
        Dealer Dealer = restTemplate.getForObject(MUTABAKAT_PATH_DEALER_V1 + UUID.fromString(TestString),
                gokhan.mutabakatclient.model.Dealer.class, param);
        System.out.println(Dealer);
    }

    private static void getDealerById(String uuid){
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(uuid));
        Dealer Dealer = restTemplate.getForObject(MUTABAKAT_PATH_DEALER_V1 + UUID.fromString(uuid),
                gokhan.mutabakatclient.model.Dealer.class, param);
        System.out.println(Dealer);
    }

    private static void createDealer(Dealer Dealer){
        ResponseEntity<Dealer> createdDealer =  restTemplate.postForEntity(MUTABAKAT_PATH_DEALER_V1 + "create/", Dealer,
                Dealer.class);
        System.out.println(createdDealer.getBody());
    }

    private static void updateDealer(Dealer Dealer){
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(TestString));
        String TestURL = MUTABAKAT_PATH_DEALER_V1 + "update/" + TestString;
        restTemplate.put(TestURL, Dealer, param);
    }

    private static void deleteDealerByIdTest() {
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(TestString));
        String TestURL = MUTABAKAT_PATH_DEALER_V1 + UUID.fromString(TestString);
        restTemplate.delete(TestURL, param);
    }

    private static void deleteDealerById(String uuid) {
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(uuid));
        String TestURL = MUTABAKAT_PATH_DEALER_V1 + UUID.fromString(uuid);
        restTemplate.delete(TestURL, param);
    }

    public static void main( String[] args ) {
//        getDealerFindAll();
//        getDealerByIdTest( );
//        deleteDealerByIdTest();
//        createDealer();
//        updateDealer()
    }

}
