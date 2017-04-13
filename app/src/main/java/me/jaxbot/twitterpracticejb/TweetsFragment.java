package me.jaxbot.twitterpracticejb;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.TwitterException;

import java.util.ArrayList;

import retrofit2.Call;

/**
 * Created by pc on 4/5/2017.
 */

public class TweetsFragment extends Fragment {
    ListView listView;
    ArrayList<String> tweet;
    ArrayList<SettingUser> user;
    ArrayAdapter<String> adapter;
    ItemClickListener listener;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.tweets_fragment,container,false);

        listView = (ListView)v.findViewById(R.id.tweets);

        user = new ArrayList<>();
        tweet = new ArrayList<>();


        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,tweet);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                listener.onUserItemClicked(user.get(i));
            }
        });
        Log.i("yy", "onCreate: ");
        fetchUsers();
        return v;
    }

    private void fetchUsers() {
        try {
            String header=new GetHeader("https://api.twitter.com/1.1/statuses/user_timeline.json","GET",null,null).header;
            Log.d("mmm",header );
//            String header=new GetHeader("https://api.twitter.com/1.1/account/settings.json","GET",null,null).header;
            ApiInterface apiInterface=ApiClient.getApiInterface();

            Call<ArrayList<SettingUser>> showsettings = apiInterface.showsettings(header);
            showsettings.enqueue(new Callback<ArrayList<SettingUser>>() {
                @Override
                public void success(Result<ArrayList<SettingUser>> result) {
                    retrofit2.Response response = result.response;
//                    SettingUser user= (SettingUser) response.body();
                    ArrayList<SettingUser> array2 = (ArrayList<SettingUser>) response.body();
                    if (array2 != null) {
                        user.clear();
                        user.addAll(array2);
                        for (int i = 0; i < user.size(); i++) {
                            tweet.add(user.get(i).gettext());
                            Log.d("mmm", user.get(i).gettext());
                        }

                        adapter.notifyDataSetChanged();
//                    Log.d("fetched",user.getDiscoverable_by_email()+" "+user.getScreen_name());
                    }

                }
                @Override
                public void failure(TwitterException exception) {
                    Log.d("mmm",exception.getMessage().toString());
                    Log.d("mmm",exception.toString());

                }
            });




        } catch (Exception e) {
            Log.d("mmm",e.getMessage().toString());

            e.printStackTrace();
        }
    }
    public void setItemClickListener(ItemClickListener listener){
        this.listener = listener;
    }

    public interface ItemClickListener
    {
        public void onUserItemClicked(SettingUser user);

    }
}
