package gokhan.mutabakatclient.client;

import gokhan.mutabakatclient.model.EMailLog;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class EMailLogClient {

    public static String MUTABAKAT_PATH_EMAILLOG_V1 = "http://localhost:8081/api/v1/test/emaillogs/";
    static RestTemplate restTemplate = new RestTemplate();
    static String TestString ="d27d216c-7d6c-4ebf-a08e-47cfb9560d69";

    private static void getEMailLogFindAll(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        ResponseEntity<String> result= restTemplate.exchange(MUTABAKAT_PATH_EMAILLOG_V1 + "findall/",
                HttpMethod.GET, entity, String.class);
        System.out.println(result);
    }

    private static void getEMailLogById(){
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(TestString));
        EMailLog EMailLog = restTemplate.getForObject(MUTABAKAT_PATH_EMAILLOG_V1 + UUID.fromString(TestString),
                gokhan.mutabakatclient.model.EMailLog.class, param);
        System.out.println(EMailLog);
    }

    private static void createEMailLog(EMailLog eMailLog){
        ResponseEntity<EMailLog> createdEMailLog =  restTemplate.postForEntity(MUTABAKAT_PATH_EMAILLOG_V1 + "create/", eMailLog,
                EMailLog.class);
        System.out.println(createdEMailLog.getBody());
    }

    private static void updateEMailLog(EMailLog eMailLog){
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(TestString));
        String TestURL = MUTABAKAT_PATH_EMAILLOG_V1 + "update/" + TestString;
        restTemplate.put(TestURL, eMailLog, param);
    }

    private static void deleteEMailLogById() {
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(TestString));
        String TestURL = MUTABAKAT_PATH_EMAILLOG_V1 + UUID.fromString(TestString);
        restTemplate.delete(TestURL, param);
    }


    public static void main( String[] args ) {
//        getEMailLogFindAll();
//        deleteEMailLogById();
//        getEMailLogById();
//        createEMailLog();
//        updateEMailLog()
    }

}
