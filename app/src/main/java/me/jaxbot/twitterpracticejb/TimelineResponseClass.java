package me.jaxbot.twitterpracticejb;

import java.util.ArrayList;

/**
 * Created by pc on 4/8/2017.
 */

public class TimelineResponseClass {
    String created_at;
    String text;
    int favorite_count;// these are likes to a post

    //these are in user so make class
    ArrayList<media> med;

    public ArrayList<media> getMed() {
        return med;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getFavorite_count() {
        return favorite_count;
    }

    public void setFavorite_count(int favorite_count) {
        this.favorite_count = favorite_count;
    }

    public void setMed(ArrayList<media> med) {
        this.med = med;
    }


    class media
    {
        String media_url;

        String type;
        public String getMedia_url() {
            return media_url;
        }

        public void setMedia_url(String media_url) {
            this.media_url = media_url;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }


    }
    class user
    {

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getProfile_image_url() {
            return profile_image_url;
        }

        public void setProfile_image_url(String profile_image_url) {
            this.profile_image_url = profile_image_url;
        }

        String name;
        String profile_image_url;
    }
}
