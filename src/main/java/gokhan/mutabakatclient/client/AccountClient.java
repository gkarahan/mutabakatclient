package gokhan.mutabakatclient.client;

import gokhan.mutabakatclient.model.Account;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class AccountClient {

    public static String MUTABAKAT_PATH_ACCOUNT_V1 = "http://localhost:8081/api/v1/test/accounts/";
    static RestTemplate restTemplate = new RestTemplate();
    static String TestString ="1af11a08-3468-466a-bc52-52c8a68d81e7";
//    static Account account = new Account(UUID.fromString("1af11a08-3468-466a-bc52-52c8a68d81e7"),"Car34009","DK",
//            "zvoeear@4ce7.com", "BA?LAR BA?I MH. KIZLAR PINARI CD. NO:116/E KEÇ?ÖREN/ANKARA", "ANKARA",
//            "5559632134", null,null ,null,null,null);
//
//    static Account accountUpdate = new Account(UUID.fromString("1af11a08-3468-466a-bc52-52c8a68d81e7"),"Car34009","DK",
//            "zvoeear@4ce7.com", "BAĞLAR BAŞI MH. KIZLAR PINARI CD. NO:116/E KEÇİÖREN/ANKARA", "ANKARA",
//            "5559632134", null,null ,null,null,null);

    private static void getAccountFindAll(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        ResponseEntity<String> result= restTemplate.exchange(MUTABAKAT_PATH_ACCOUNT_V1 + "findall/",
                HttpMethod.GET, entity, String.class);
        System.out.println(result);
    }

    private static void getAccountById(){
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(TestString));
        Account account = restTemplate.getForObject(MUTABAKAT_PATH_ACCOUNT_V1 + UUID.fromString(TestString),
                Account.class, param);
        System.out.println(account);
    }

    private static void deleteAccountById() {
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(TestString));
        String TestPath = MUTABAKAT_PATH_ACCOUNT_V1 + TestString;
        System.out.println(TestPath);
        restTemplate.delete(TestString, param);
    }

    private static void createAccount(Account account){
        ResponseEntity<Account> createdAccount =  restTemplate.postForEntity(MUTABAKAT_PATH_ACCOUNT_V1 + "create/",
                account, Account.class);
        System.out.println(createdAccount.getBody());
    }

    private static void updateAccount(Account account){
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(TestString));
        String TestURL =MUTABAKAT_PATH_ACCOUNT_V1 + "update/" + TestString;
        restTemplate.put(TestURL, account, param);
    }

    public static void main( String[] args ) {
//        getAccountFindAll();
//        deleteAccountById();
//        getAccountById( );
//        createAccount();
//        updateAccount()
    }

}
