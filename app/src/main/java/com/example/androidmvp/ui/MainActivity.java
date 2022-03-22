package com.example.androidmvp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.androidmvp.R;
import com.example.androidmvp.util.MyModel;

public class MainActivity extends AppCompatActivity implements AppView {
    Button btn;
    TextView textView;

    //Linking Activity with presenter
    AppPresenter appPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        //instantiating the presenter.
        appPresenter =  new AppPresenter(this);

        //we need to create a button that when the user
        //clicked it, it will display text in textview.

        //1- implementing MVP Pattern


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Calling the Presenter to get data from DB
                //No linkage between Activity and Model.
                //our MainActivity is handling UI Only.
                //All logic occurs at the presenter.
                appPresenter.getAppName();
            }
        });

    }

    @Override
    public void onGetAppName(String string) {
        textView.setText(string);
    }
//MVP PATTERN
    //View :Activity with textview & button
    //Model : MyModel
    //Presenter: AppPresenter,

}