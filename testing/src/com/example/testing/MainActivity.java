package com.example.testing;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.Display;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    
    public void styling(){
        TextView Head = (TextView)findViewById(R.id.Header);
        TextView result = (TextView)findViewById(R.id.Result);
        EditText name = (EditText)findViewById(R.id.Name);
        EditText dob = (EditText)findViewById(R.id.DOB);
        Button check = (Button)findViewById(R.id.Check);
        Button clear = (Button)findViewById(R.id.Clear);

        Display display = getWindowManager(). getDefaultDisplay();
        int deviceHeight = display.getHeight(), deviceWidth = display.getWidth();

        check.setHeight((5*deviceHeight)/100);
        check.setWidth((40*deviceWidth)/100);
        clear.setHeight((5*deviceHeight)/100);
        clear.setWidth((35*deviceWidth)/100);
        name.setHeight((7*deviceHeight)/100);
        dob.setHeight((7*deviceHeight)/100);
        Head.getLayoutParams().height = (8 * deviceHeight)/100;
        result.getLayoutParams().height = (40 * deviceHeight)/100;
        result.getLayoutParams().width = (90 * deviceWidth)/100;
    }

    public void displayMessage(View view){
        String userName, userYear;
        
        EditText et= (EditText)findViewById(R.id.Name);
        userName = et.getText().toString();

        EditText et2= (EditText)findViewById(R.id.DOB);
        userYear = et2.getText().toString();

        TextView Results = (TextView)findViewById(R.id.Result);

        int currentYear = 2021;
        int UserYear = Integer.parseInt(userYear);
        int userYears = currentYear - UserYear;
        String userAge = Integer.toString(userYears);

        Results.setText("Hello there " + userName + ", this year makes you " + userAge + " years old.");
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        styling();
    }

    public void ClearAll(View view){
        EditText et= (EditText)findViewById(R.id.Name);

        EditText et2= (EditText)findViewById(R.id.DOB);

        TextView Results = (TextView)findViewById(R.id.Result);

         et.setText(""); et2.setText(""); Results.setText("");
    }
}