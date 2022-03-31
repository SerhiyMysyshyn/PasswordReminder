package com.example.myapp;

import com.example.myapp.mainList.DataManager;

public class Program {
    private final String id;
    private final String userId;
    private final String programName;
    private final String email;
    private final String password;
    private final String description;
    private final String timeData;
    private final String dateData;

    public Program(String id, String userId, String programName, String email, String password, String description, String timeData, String dateData){
        this.id = id;
        this.userId = userId;
        this.programName = programName;
        this.email = email;
        this.password = password;
        this.description = description;
        this.timeData = timeData;
        this.dateData = dateData;
    }

    public static Program getItem(String id){
        for (int i=0; i<DataManager.ProgramDataList.size(); i++){
            if (DataManager.ProgramDataList.get(i).get(Program.Field.ID).equals(id)){
                return DataManager.ProgramDataList.get(i);
            }
        }
        return null;
    }

    public String getProgramName() {
        return programName;
    }

    public int getId(){
        return userId.hashCode() + id.hashCode() + programName.hashCode();
    }

    @Override
    public String toString(){
        return id + "," + userId + "," + programName + "," + email + "," + password + "," + description + "," + timeData + "," + dateData;
    }

    public static enum Field {
        USERID, ID, NAME, EMAIL, PASSWORD, DESCRIPTION, TIME, DATE
    }

    public String get(Field f) {
        switch (f) {
            case USERID: return userId;
            case ID: return id;
            case EMAIL: return email;
            case PASSWORD: return password;
            case DESCRIPTION: return description;
            case TIME: return timeData;
            case DATE: return dateData;
            case NAME: default: return programName;
        }
    }
}
