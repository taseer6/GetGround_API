package utilities;


import dto.People;
import org.springframework.web.client.RestTemplate;
import configurations.IRestAPIConfigs;

/**
 * RestApi class is a utility for
 * calling rest api using rest template
 */
public class RestApi {
    IRestAPIConfigs apiCredentials;
    RestTemplate restClient;

    /**
     * takes IRestAPIConfigs as parameter which
     * defines the necessary requirements
     */
    public RestApi(IRestAPIConfigs apiCredentials) {
        this.apiCredentials = apiCredentials;
        init();
    }

    private void init() {
        restClient = new RestTemplate();
        restClient.setErrorHandler(apiCredentials.restErrorHandler());
    }


    /**
     * prints the Get request
     */

    public void printGetResponse(String queryParam) {
        System.out.println(restClient.getForEntity(apiCredentials.baseUrl()+queryParam, String.class));
    }

    /**
     * method for returning POJO of a
     * Get Request
     *
     * @return
     */

    public <T> T getReqToPojo(String queryParam, Class<T> pos) {
        T javaObject= restClient.getForObject(apiCredentials.baseUrl()+queryParam, pos);
        return javaObject;
    }
}
