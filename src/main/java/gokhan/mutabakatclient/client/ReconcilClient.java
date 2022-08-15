package gokhan.mutabakatclient.client;

import gokhan.mutabakatclient.model.Reconcil;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class ReconcilClient {

    public static String MUTABAKAT_PATH_RECONCIL_V1 = "http://localhost:8081/api/v1/test/recons/";
    static RestTemplate restTemplate = new RestTemplate();
    static String TestString ="fed4a7e0-76d5-4e3d-bc4f-6379330f2d49";

    private static void getReconcilFindAll(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        ResponseEntity<String> result= restTemplate.exchange(MUTABAKAT_PATH_RECONCIL_V1 + "findall/",
                HttpMethod.GET, entity, String.class);
        System.out.println(result);
    }

    private static void getReconcilByIdTest(){
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(TestString));
        Reconcil Reconcil = restTemplate.getForObject(MUTABAKAT_PATH_RECONCIL_V1 + UUID.fromString(TestString),
                gokhan.mutabakatclient.model.Reconcil.class, param);
        System.out.println(Reconcil);
    }

    private static void getReconcilById(String uuid){
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(uuid));
        Reconcil Reconcil = restTemplate.getForObject(MUTABAKAT_PATH_RECONCIL_V1 + UUID.fromString(uuid),
                gokhan.mutabakatclient.model.Reconcil.class, param);
        System.out.println(Reconcil);
    }

    private static void createReconcil(Reconcil Reconcil){
        ResponseEntity<Reconcil> createdReconcil =  restTemplate.postForEntity(MUTABAKAT_PATH_RECONCIL_V1 + "create/", Reconcil,
                Reconcil.class);
        System.out.println(createdReconcil.getBody());
    }

    private static void updateReconcil(Reconcil Reconcil){
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(TestString));
        String TestURL = MUTABAKAT_PATH_RECONCIL_V1 + "update/" + TestString;
        restTemplate.put(TestURL, Reconcil, param);
    }

    private static void deleteReconcilByIdTest() {
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(TestString));
        String TestURL = MUTABAKAT_PATH_RECONCIL_V1 + UUID.fromString(TestString);
        restTemplate.delete(TestURL, param);
    }

    private static void deleteReconcilById(String uuid) {
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(uuid));
        String TestURL = MUTABAKAT_PATH_RECONCIL_V1 + UUID.fromString(uuid);
        restTemplate.delete(TestURL, param);
    }

    public static void main( String[] args ) {
//        getReconcilFindAll();
//        getReconcilByIdTest();
//        deleteReconcilByIdTest();
//        createReconcil();
//        updateReconcil()
    }

}
