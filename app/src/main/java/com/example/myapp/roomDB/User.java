package com.example.myapp.roomDB;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    //@PrimaryKey(autoGenerate = true)
    @PrimaryKey()
    public long id;

    public String remoteDatabaseRowID;

    public String userId;

    public String username;

    public String email;

    public String password;

    public User(){
    }

    public User(String remoteDatabaseRowID, String userId, String username, String email, String password){
        this.remoteDatabaseRowID = remoteDatabaseRowID;
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRemoteDatabaseRowID() {
        return remoteDatabaseRowID;
    }

    public void setRemoteDatabaseRowID(String remoteDatabaseRowID) {
        this.remoteDatabaseRowID = remoteDatabaseRowID;
    }

    public String getUserId() { return userId; }

    public void setUserId(String userId) { this.userId = userId; }

    public String getUsername() {
        return username;
    }

    public void setUsername(String firstName) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return "User: "+ id + ", "+ remoteDatabaseRowID +", "+ userId + ", " + username + ", " + email + ", " + password;
    }

}
