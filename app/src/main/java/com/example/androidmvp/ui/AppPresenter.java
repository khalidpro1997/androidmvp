package com.example.androidmvp.ui;


import com.example.androidmvp.util.MyModel;

//This will acts as a presenter
public class AppPresenter {


    //1-The link between Presenter and the view(Main Activity) is done by
    //Interface AppView


    AppView AppView;

    public AppPresenter(com.example.androidmvp.ui.AppView appView) {
        AppView = appView;
    }

    //2-Linkage between presenter and model.

    public MyModel GetAppFromModel(){
        return new MyModel("MVP Pattern",900000,10);
    }


    //3- Linkage between presenter and the MainActivity.

    public void getAppName(){
        AppView.onGetAppName(GetAppFromModel().getAppName());
    }
}
