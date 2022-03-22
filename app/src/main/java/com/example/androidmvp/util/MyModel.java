package com.example.androidmvp.util;

public class MyModel {

    String appName;
    int appDownload;
    int appRating;


    //constructor
    public MyModel(String appName, int appDownload, int appRating) {
        this.appName = appName;
        this.appDownload = appDownload;
        this.appRating = appRating;
    }

    //setter and getter.
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getAppDownload() {
        return appDownload;
    }

    public void setAppDownload(int appDownload) {
        this.appDownload = appDownload;
    }

    public int getAppRating() {
        return appRating;
    }

    public void setAppRating(int appRating) {
        this.appRating = appRating;
    }
}
