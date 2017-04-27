package me.jaxbot.twitterpracticejb;
//
//import android.content.Intent;
//import android.support.design.widget.TabLayout;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.Toolbar;
//
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;
//import android.support.v4.app.FragmentPagerAdapter;
//import android.support.v4.view.ViewPager;
//import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.view.View;
//
//import android.widget.ArrayAdapter;
//import android.widget.ListView;
//
//import java.util.ArrayList;
//
//public class MainScreen extends AppCompatActivity implements TweetsFragment.ItemClickListener {
//////
////    /**
////     * The {@link android.support.v4.view.PagerAdapter} that will provide
////     * fragments for each of the sections. We use a
////     * {@link FragmentPagerAdapter} derivative, which will keep every
////     * loaded fragment in memory. If this becomes too memory intensive, it
////     * may be best to switch to a
////     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
////     */
//    private ListView mDrawerList;
//    private ArrayAdapter<String> mAdapter;
//    private SectionsPagerAdapter mSectionsPagerAdapter;
//    ArrayList<String> tweet;
//    ArrayList<SettingUser> user;
////    /**
////     * The {@link ViewPager} that will host the section contents.
////     */
//    private ViewPager mViewPager;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main_screen);
//
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        tweet = new ArrayList<>();
//        user = new ArrayList<>();
//
//        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
//
//        mViewPager = (ViewPager) findViewById(R.id.container);
//        mViewPager.setAdapter(mSectionsPagerAdapter);
//
//        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
//        tabLayout.setupWithViewPager(mViewPager);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
//
//
//
//    }
//
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main_screen, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//
//    @Override
//    public void onUserItemClicked(SettingUser user) {
//
//        Intent ii = new Intent();
//        ii.setClass(MainScreen.this,DetailedTweet.class);
//        startActivity(ii);
//    }
//
//
//    /**
//     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
//     * one of the sections/tabs/pages.
//     */
//    public class SectionsPagerAdapter extends FragmentPagerAdapter {
//
//        public SectionsPagerAdapter(FragmentManager fm) {
//            super(fm);
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//
//            switch(position)
//            {
//                case 0 :
//                    TweetsFragment tweetsFragment = new TweetsFragment();
//                    tweetsFragment.setItemClickListener(MainScreen.this);
//                    return tweetsFragment;
//                case 1 :
//                    UserAccountFragment notificationsFragment = new UserAccountFragment();
//                    return notificationsFragment;
//                case 2 :
//                    FollowersFragment followersFragment = new FollowersFragment();
//                    return followersFragment;
//            }
//           return null;
//
//        }
//
//        @Override
//        public int getCount() {
//            // Show 3 total pages.
//            return 3;
//        }
//
//        @Override
//        public CharSequence getPageTitle(int position) {
//            switch (position) {
//                case 0:
//                    return "Tweets";
//                case 1:
//                    return "Notifications";
//                case 2:
//                    return "Followers";
//            }
//            return null;
//        }
//    }
//}
