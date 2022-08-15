package gokhan.mutabakatclient.client;

import gokhan.mutabakatclient.model.UserEntity;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class UserClient {

    public static String MUTABAKAT_PATH_USER_V1 = "http://localhost:8081/api/v1/test/users/";
    static RestTemplate restTemplate = new RestTemplate();
    static String TestString ="b77c8567-401a-4eb5-918f-8bde4e2578c1";

    private static void getUserEntityFindAll(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        ResponseEntity<String> result= restTemplate.exchange(MUTABAKAT_PATH_USER_V1 + "findall/",
                HttpMethod.GET, entity, String.class);
        System.out.println(result);
    }

    private static void getUserEntityByIdTest(){
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(TestString));
        UserEntity UserEntity = restTemplate.getForObject(MUTABAKAT_PATH_USER_V1 + UUID.fromString(TestString),
                gokhan.mutabakatclient.model.UserEntity.class, param);
        System.out.println(UserEntity);
    }


    private static void getUserEntityById(String uuid){
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(uuid));
        UserEntity UserEntity = restTemplate.getForObject(MUTABAKAT_PATH_USER_V1 + UUID.fromString(uuid),
                gokhan.mutabakatclient.model.UserEntity.class, param);
        System.out.println(UserEntity);
    }

    private static void createUserEntity(UserEntity UserEntity){
        ResponseEntity<UserEntity> createdUserEntity =  restTemplate.postForEntity(MUTABAKAT_PATH_USER_V1 + "create/", UserEntity,
                UserEntity.class);
        System.out.println(createdUserEntity.getBody());
    }

    private static void updateUserEntity(UserEntity UserEntity){
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(TestString));
        String TestURL = MUTABAKAT_PATH_USER_V1 + "update/" + TestString;
        restTemplate.put(TestURL, UserEntity, param);
    }

    private static void deleteUserEntityByIdTest() {
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(TestString));
        String TestURL = MUTABAKAT_PATH_USER_V1 + UUID.fromString(TestString);
        restTemplate.delete(TestURL, param);
    }

    private static void deleteUserEntityById(String uuid) {
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(uuid));
        String TestURL = MUTABAKAT_PATH_USER_V1 + UUID.fromString(uuid);
        restTemplate.delete(TestURL, param);
    }

    public static void main( String[] args ) {
//        getUserEntityFindAll();
//        deleteUserEntityById();
//        getUserEntityById( );
//        createUserEntity();
//        updateUserEntity()
    }

}
