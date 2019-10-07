package c.controller.employee;


import c.Factory.employee.AdministratorFactory;
import c.domain.employee.Administrator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import static junit.framework.TestCase.assertEquals;
import static org.hibernate.validator.internal.util.Contracts.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AdministratorControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    private String baseURL="http://localhost:8080/administrator";

    @Test
    public void create() {

        Administrator admin = AdministratorFactory.getAdministrator(1, "front desk");
        admin.setEmpID(1);

        ResponseEntity<Administrator> postResponse = restTemplate.postForEntity(baseURL + "/new", admin, Administrator.class);

        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());

    }

    @Test
    public void findById() {

        Administrator admin = restTemplate.getForObject(baseURL + "/find/" + "1", Administrator.class);

        assertNotNull(admin);

    }

    @Test
    public void update() {

        int id = 1;
        Administrator admin = restTemplate.getForObject(baseURL + "/find/" + id, Administrator.class);
        admin.setEmpName("george");

        restTemplate.put(baseURL + "/update/" + id, admin);

        Administrator updatedAdmin = restTemplate.getForObject(baseURL + "/update/" + id, Administrator.class);

        assertNotNull(updatedAdmin);

    }

    @Test
    public void delete() {

        int id = 1;
        Administrator admin = restTemplate.getForObject(baseURL + "/find/" + id, Administrator.class);
        assertNotNull(admin);

        restTemplate.delete(baseURL + "/delete/" + id);

        try {
            admin = restTemplate.getForObject(baseURL + "/find/" + id, Administrator.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }

    }

    @Test
    public void getAll() {

        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);

        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/getAll", HttpMethod.GET, entity, String.class);

        assertNotNull(response.getBody());

    }

}
