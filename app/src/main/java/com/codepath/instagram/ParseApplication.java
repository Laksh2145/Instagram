package com.codepath.instagram;

import android.app.Application;
import android.view.View;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("h1x6cUd1Z7Pg0H5GuGQ9LgfLpImbCH9va241PPxC")
                .clientKey("Sf7sBwQDghRNiba94NKeq0Fm6e2tPb7E5pGQLhmm")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }

}
