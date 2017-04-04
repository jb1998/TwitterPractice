package me.jaxbot.twitterpracticejb;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

/**
 * Created by pc on 4/3/2017.
 */

public interface ApiInterface {

    @GET("statuses/user_timeline.json")
    Call<SettingUser> showsettings(@Header("Authorization") String header);
}
