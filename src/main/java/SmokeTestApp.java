import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class SmokeTestApp {

    public static void main(String[] args) throws UnirestException {

      //  findByStatusRequest();
        getPetById();
       // conditionSivasli();
    }

    public static void conditionSivasli(){
        // eğer(if) müşterinin ismi ahmet ise ekrana naber sivaslı yazsın
        // değilse(else) işim olmaz yazsın.
        // müsterinin memleketi azerbaycan sa
        // naber gardaş yazsın
        // değilse naber insan
        String musteriIsmi="veli";
        String memleket="azerbaycan";

        if(memleket.equals("azerbaycan")){
            System.out.println("naber gardaş");
        }
        else{
            System.out.println("naber insan");
        }
        if(musteriIsmi.equals("ahmet")){
            System.out.println("naber sivaslı");
        }
        else{
            System.out.println("işim olmaz");
        }


        if(musteriIsmi == "ahmet") {
            System.out.println("naber sivaslı");
        }

    }
    public static void getPetById() throws UnirestException {

        Unirest.setTimeouts(0, 0);
        HttpResponse<String> response = Unirest.get("https://petstore.swagger.io/v2/pet/1")
                .asString();
        System.out.println(response.getBody());
        System.out.println(response.getStatus());
        // eğer status 200 ise PASSED
        // değilse FAILED.
        int status=response.getStatus();
        if(status == 200){
            System.out.println("PASSED");
        }
        else{
            System.out.println("FAILED");
        }
    }

    public static void findByStatusRequest() throws UnirestException {
        Unirest.setTimeouts(0, 0);
        /*HttpResponse<JsonNode> response = Unirest.get("https://petstore.swagger.io/v2/pet/findByStatus?status=pending")
                .asJson();*/
        //System.out.println(response.getBody());

        Unirest.setTimeouts(0, 0);
        HttpResponse<String> response1 =
                Unirest.get("https://petstore.swagger.io/v2/pet/findByStatus?status=pending")
                .asString();
        System.out.println(response1.getBody());


    }

}
