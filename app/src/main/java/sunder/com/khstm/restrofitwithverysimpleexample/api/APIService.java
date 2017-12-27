package sunder.com.khstm.restrofitwithverysimpleexample.api;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import sunder.com.khstm.restrofitwithverysimpleexample.model.Post;

/**
 * Created by Admin on 12/27/2017.
 */

public interface APIService {
    @POST("/posts")
    @FormUrlEncoded
    Call<Post> savePost(@Field("title") String title,
                        @Field("body") String body,
                        @Field("userId") long userId);
}
