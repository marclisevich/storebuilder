@Path("/json/product")
public class JSONService {

  @POST
  @Path("/post")
  @Consumes("application/json")
  public Response createProductInJSON(Product product) {

    String result = "Product created : " + product;
    return Response.status(201).entity(result).build();

  }
  //...
  Apache HttpClient to send a “POST” request.

  import java.io.BufferedReader;
  import java.io.IOException;
  import java.io.InputStreamReader;
  import java.net.MalformedURLException;
  import org.apache.http.HttpResponse;
  import org.apache.http.client.methods.HttpPost;
  import org.apache.http.entity.StringEntity;


  public class ApacheHttpClientPost {

    public static void main(String[] args) {

      try {
        httpClient = new DefaultHttpClient();
        HttpPost postRequest = new HttpPost(
          "http://localhost:8080/RESTfulExample/json/product/post");

        StringEntity input = new StringEntity("{\"qty\":100,\"name\":\"iPad 4\"}");
        input.setContentType("application/json");
        postRequest.setEntity(input);

        HttpResponse response = httpClient.execute(postRequest);

        if (response.getStatusLine().getStatusCode() != 201) {
          throw new RuntimeException("Failed : HTTP error code : "
            + response.getStatusLine().getStatusCode());
        }

        BufferedReader br = new BufferedReader(
          new InputStreamReader((response.getEntity().getContent())));

        String output;
        System.out.println("Output from Server .... \n");
        while ((output = br.readLine()) != null) {
          System.out.println(output);
        }

        httpClient.getConnectionManager().shutdown();
      }

      } catch (MalformedURLException e) {

        e.printStackTrace();

      } catch (IOException e) {

        e.printStackTrace();

      }

    }

  }


class StoreBuilder {

  class Main {
    def getMessage() {
      "Weclome to the newly configuring Nerd Consutling Stores"

    }
  }

case class ByFours(field1: String, field2: String field3: String, field4 : String) {
}

}