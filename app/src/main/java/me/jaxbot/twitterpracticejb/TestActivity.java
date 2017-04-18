package me.jaxbot.twitterpracticejb;
;

import android.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class TestActivity extends FragmentActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        UserAccountFragment fragmentOne = new UserAccountFragment();
        fragmentOne = (UserAccountFragment) getSupportFragmentManager().findFragmentById(R.id.activity_test);

    }



}
