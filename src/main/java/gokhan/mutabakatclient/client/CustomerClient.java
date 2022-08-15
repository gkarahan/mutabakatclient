package gokhan.mutabakatclient.client;

import gokhan.mutabakatclient.model.Customer;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class CustomerClient {

    public static String MUTABAKAT_PATH_CUSTOMER_V1 = "http://localhost:8081/api/v1/test/customers/";
    static RestTemplate restTemplate = new RestTemplate();
    static String TestString ="363ea33a-71b5-4c62-8155-e89d0ed7dca8";


    private static void getCustomerFindAll(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        ResponseEntity<String> result= restTemplate.exchange(MUTABAKAT_PATH_CUSTOMER_V1 + "findall/",
                HttpMethod.GET, entity, String.class);
        System.out.println(result);
    }

    private static void getCustomerByIdTest(){
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(TestString));
        Customer customer = restTemplate.getForObject(MUTABAKAT_PATH_CUSTOMER_V1 + UUID.fromString(TestString), 
                Customer.class, param);
        System.out.println(customer);
    }

    private static void getCustomerById(String uuid){
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(uuid));
        Customer customer = restTemplate.getForObject(MUTABAKAT_PATH_CUSTOMER_V1 + UUID.fromString(uuid),
                Customer.class, param);
        System.out.println(customer);
    }

    private static void createCustomer(Customer customer){
        ResponseEntity<Customer> createdCustomer =  restTemplate.postForEntity(MUTABAKAT_PATH_CUSTOMER_V1 + "create/", customer, 
                Customer.class);
        System.out.println(createdCustomer.getBody());
    }

    private static void updateCustomer(Customer customer){
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(TestString));
        String TestURL = MUTABAKAT_PATH_CUSTOMER_V1 + "update/" + TestString;
        restTemplate.put(TestURL, customer, param);
    }

    private static void deleteCustomerByIdTest() {
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(TestString));
        String TestURL = MUTABAKAT_PATH_CUSTOMER_V1 + UUID.fromString(TestString);
        restTemplate.delete(TestURL, param);
    }

    private static void deleteCustomerById(String uuid) {
        Map<String, UUID> param = new HashMap<>();
        param.put("id", UUID.fromString(uuid));
        String TestURL = MUTABAKAT_PATH_CUSTOMER_V1 + UUID.fromString(uuid);
        restTemplate.delete(TestURL, param);
    }

    public static void main( String[] args ) {
//        getCustomerFindAll();
//        getCustomerByIdTest( );
//        deleteCustomerByIdTest();
//        createCustomer();
//        updateCustomer()
    }

}
