package com.example.instaclone;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("F1GuISMXyAl2QrnpZ74k72sz6E4R8XeyQeie7CmX")
                .clientKey("5vwcIdmmXfvchNnXluqmMsIDsJxIgknB19vx8y89")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
