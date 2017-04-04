package me.jaxbot.twitterpracticejb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.TwitterException;

import retrofit2.Call;

public class OAuthRequestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oauth_request);

        try {
            String header=new GetHeader("https://api.twitter.com/1.1/statuses/user_timeline.json","GET",null,null).header;

            ApiInterface apiInterface=ApiClient.getApiInterface();

            Call<SettingUser> showsettings = apiInterface.showsettings(header);
            showsettings.enqueue(new Callback<SettingUser>() {
                @Override
                public void success(Result<SettingUser> result) {
                    retrofit2.Response response = result.response;
                    SettingUser user= (SettingUser) response.body();
                    Log.d("mmm", user.gettext());
//                    Log.d("lala",user.getDiscoverable_by_email()+user.getScreen_name());
                }

                @Override
                public void failure(TwitterException exception) {
                    Log.d("lala",exception.getMessage().toString());
                    Log.d("lala",exception.toString());

                }
            });




        } catch (Exception e) {
            Log.d("lala",e.getMessage().toString());
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }
    }

