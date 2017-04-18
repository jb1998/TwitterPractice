package me.jaxbot.twitterpracticejb;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.TwitterException;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by pc on 4/5/2017.
 */

public class UserAccountFragment extends Fragment {
//    TweetsFragment.ItemClickListener listener;
    TextView createdat, name;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.useraccount, container, false);
        createdat = (TextView) v.findViewById(R.id.created_at);
        name = (TextView) v.findViewById(R.id.name);
        fetchUsers();
        return v;
    }

    private void fetchUsers() {
        String header = null;
        try {
            header = new GetHeader("https://api.twitter.com/1.1/users/show.json", "GET", null, null).header;
        } catch (SignatureException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

//            String header=new GetHeader("https://api.twitter.com/1.1/account/settings.json","GET",null,null).header;
        ApiInterface apiInterface = ApiClient.getApiInterface();

        Call<UserAccountClass> showsettings = apiInterface.showuser(header, Twitter.getSessionManager().getActiveSession().getUserName());
        showsettings.enqueue(new retrofit2.Callback<UserAccountClass>() {
            @Override
            public void onResponse(Call<UserAccountClass> call, Response<UserAccountClass> response) {
                createdat.setText(response.body().created_at);
                name.setText(response.body().name);
            }

            @Override
            public void onFailure(Call<UserAccountClass> call, Throwable t) {

            }
        });


    }


}
