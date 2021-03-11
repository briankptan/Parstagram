package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);


        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("9Gfvjx6wbXn4u4HBO03e3YeTqfN0KrYkaVvuXznA")
                .clientKey("uZQ9rbEN4k6SXhs9ZbswQode43z7vvQQXwgRsORS")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
