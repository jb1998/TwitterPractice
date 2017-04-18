package me.jaxbot.twitterpracticejb;

import java.util.ArrayList;

/**
 * Created by pc on 4/8/2017.
 */

public class UserTimeLine {
    String created_at;
    String text;
    ArrayList<UserTimelineResponseClass.media> med;
    UserTimeLine(String created_at, String text, ArrayList <UserTimelineResponseClass.media> med)
    {
        this.created_at=created_at;
        this.text=text;
        this.med=med;
    }
}
