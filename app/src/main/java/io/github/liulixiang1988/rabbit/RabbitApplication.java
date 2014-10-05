package io.github.liulixiang1988.rabbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by liulixiang on 14-10-5.
 */
public class RabbitApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "6wZyARdh21YE1SFqceoIh24beo9WCzpYnjMCgqCV", "9KT8jUIBizQbLh2yo5QLUWz74LJcRnIUcorTDuN8");

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
    }
}
