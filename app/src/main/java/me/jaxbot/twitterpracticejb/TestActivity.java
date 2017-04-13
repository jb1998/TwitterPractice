package me.jaxbot.twitterpracticejb;
;

import android.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class TestActivity extends FragmentActivity implements TweetsFragment.ItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        TweetsFragment fragmentOne;
        fragmentOne = (TweetsFragment) getSupportFragmentManager().findFragmentById(R.id.myfragment);
        fragmentOne.setItemClickListener(this);
    }

    @Override
    public void onUserItemClicked(SettingUser user) {
        Toast.makeText(TestActivity.this,"finally over",Toast.LENGTH_SHORT).show();

    }
}
