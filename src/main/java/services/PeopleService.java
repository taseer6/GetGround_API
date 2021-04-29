package services;

import Constants.EndPoints;
import configurations.Implementation.RestApiConfigs;
import dto.People;
import utilities.RestApi;


/**
 * This Service Class contains all the
 * functions/methods related to People Endpoint
 */
public class PeopleService {

    private RestApi restApi;

    public PeopleService() {
        restApi = new RestApi(new RestApiConfigs());
    }

    public void printAPIResponse(String pathParameter) {
       restApi.printGetResponse(EndPoints.API_People+pathParameter );
    }

    public People getPeople(String pathParameter) {
        return restApi.getReqToPojo(EndPoints.API_People + pathParameter, People.class);
    }
}
