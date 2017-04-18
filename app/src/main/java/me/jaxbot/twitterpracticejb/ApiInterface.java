package me.jaxbot.twitterpracticejb;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * Created by pc on 4/3/2017.
 */

public interface ApiInterface {

//    @GET("statuses/user_timeline.json")
            @GET("users/show.json")
            Call<UserAccountClass> showuser(@Header("Authorization") String header, @Query("screen_name")String screen_name);
//    @GET("account/settings.json")
//    Call<ArrayList<UserTimelineResponseClass>> showsettings(@Header("Authorization") String header);
}
