import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetPetByIdTest {

    @Test
    public void testPetById() throws UnirestException {

        // I will retrieve pet by id
        // so ı need to check status code is 200 in response
        Unirest.setTimeouts(0, 0);
        HttpResponse<String> response = Unirest.get("https://petstore.swagger.io/v2/pet/1")
                .asString();
        //System.out.println(response.getStatus());
        assertEquals(200,response.getStatus());

    }

    @Test
    public void testOrderById() throws UnirestException {
        Unirest.setTimeouts(0, 0);
        HttpResponse<String> response = Unirest.get("https://petstore.swagger.io/v2/store/order/2")
                .asString();
        assertEquals(200,response.getStatus());
       // System.out.println(response.getBody());

    }

    @Test
    public void testInventoryById(){

    }
}
