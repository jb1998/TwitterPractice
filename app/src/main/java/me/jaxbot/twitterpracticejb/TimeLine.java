package me.jaxbot.twitterpracticejb;

import com.twitter.sdk.android.tweetui.Timeline;

import java.util.ArrayList;

/**
 * Created by pc on 4/8/2017.
 */

public class TimeLine {
    String created_at;
    String text;
    ArrayList<TimelineResponseClass.media> med;
    TimeLine(String created_at,String text,ArrayList <TimelineResponseClass.media> med)
    {
        this.created_at=created_at;
        this.text=text;
        this.med=med;
    }
}
