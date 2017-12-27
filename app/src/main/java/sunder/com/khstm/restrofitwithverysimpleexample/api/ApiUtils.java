package sunder.com.khstm.restrofitwithverysimpleexample.api;

import sunder.com.khstm.restrofitwithverysimpleexample.remote.RetrofitClient;

/**
 * Created by Admin on 12/27/2017.
 */

public class ApiUtils {
    private ApiUtils() {}

    public static final String BASE_URL = "http://jsonplaceholder.typicode.com/";

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
