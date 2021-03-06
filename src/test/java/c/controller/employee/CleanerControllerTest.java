package c.controller.employee;

import c.Factory.employee.CleanerFactory;
import c.domain.employee.Cleaner;
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

public class CleanerControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    private String baseURL="http://localhost:8080/cleaner";

    @Test
    public void create() {

        Cleaner cleaner = CleanerFactory.getCleaner("1",null,null,null, null, null);


        ResponseEntity<Cleaner> postResponse = restTemplate.postForEntity(baseURL + "/new", cleaner, Cleaner.class);

        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());

    }

    @Test
    public void findById() {

        Cleaner cleaner = restTemplate.getForObject(baseURL + "/find/1", Cleaner.class);

        assertNotNull(cleaner);

    }

    @Test
    public void update() {

        int id = 1;
        Cleaner cleaner = restTemplate.getForObject(baseURL + "/find/" + id, Cleaner.class);

        restTemplate.put(baseURL + "/update/" + id, cleaner);

        Cleaner updatedCleaner = restTemplate.getForObject(baseURL + "/update/" + id, Cleaner.class);

        assertNotNull(updatedCleaner);

    }

    @Test
    public void delete() {

        int id = 1;
        Cleaner cleaner = restTemplate.getForObject(baseURL + "/find/" + id, Cleaner.class);
        assertNotNull(cleaner);

        restTemplate.delete(baseURL + "/delete/" + id);

        try {
            cleaner = restTemplate.getForObject(baseURL + "/find/" + id, Cleaner.class);
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
