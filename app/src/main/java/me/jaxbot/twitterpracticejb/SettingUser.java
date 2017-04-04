package me.jaxbot.twitterpracticejb;

/**
 * Created by pc on 4/2/2017.
 */

public class SettingUser {
    String screen_name;
    String language;
    String discoverable_by_email;
    String text;
    public String gettext() {
        return text;
    }

    public void settext(String text) {
        this.text = text;
    }



    public String getScreen_name() {
        return screen_name;
    }

    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDiscoverable_by_email() {
        return discoverable_by_email;
    }

    public void setDiscoverable_by_email(String discoverable_by_email) {
        this.discoverable_by_email = discoverable_by_email;
    }

}
