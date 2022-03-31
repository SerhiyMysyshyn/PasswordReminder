package com.example.myapp.roomDB;

import android.app.Application;

import androidx.room.Room;

public class UserDelegate extends Application {

    private UserDatabase userDatabase;

    @Override
    public void onCreate(){
        super.onCreate();

        userDatabase = Room.databaseBuilder(getApplicationContext(), UserDatabase.class,"user_database")
                .allowMainThreadQueries()
                .build();
    }

    public UserDatabase getUserDatabase(){
        return userDatabase;
    }

}
