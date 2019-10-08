package c.controller.employee;

import c.Factory.employee.DriverFactory;
import c.domain.employee.Driver;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
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
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DriverControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    private String baseURL="http://localhost:8080/driver";

    @Test
    public void acreate() {

        Driver driver = DriverFactory.getDriver(1, "clay","petersen" ,"driver", "21", "021", "22/05/19", "code b");
        driver.setEmpID(1);

        ResponseEntity<Driver>postResponse = restTemplate.postForEntity(baseURL + "/new", driver, Driver.class);

        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());

    }

    @Test
    public void bfindById() {

        Driver driver = restTemplate.getForObject(baseURL + "/find/1", Driver.class);

        assertNotNull(driver);

    }

    @Test
    public void cupdate() {

        int id = 1;
        Driver driver = restTemplate.getForObject(baseURL + "/find/" + id, Driver.class);
        driver.setEmpName("george");

        restTemplate.put(baseURL + "/update/" + id, driver);

        Driver updatedDriver = restTemplate.getForObject(baseURL + "/update/" + id, Driver.class);

        assertNotNull(updatedDriver);

    }

    @Test
    public void delete() {

        int id = 1;
        Driver driver = restTemplate.getForObject(baseURL + "/find/" + id, Driver.class);
        assertNotNull(driver);

        restTemplate.delete(baseURL + "/delete/" + id);

        try {
            driver = restTemplate.getForObject(baseURL + "/find/" + id, Driver.class);
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
