package com.example.lisencemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText age,gender;
    Button button;
    LinearLayout main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        age=findViewById(R.id.age);
        gender=findViewById(R.id.gender);
        result=findViewById(R.id.result);
        button=findViewById(R.id.button);
        main=findViewById(R.id.main);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(age.getEditableText().toString());
                String g = gender.getEditableText().toString();
                if(a>=18){
                    result.setText("you are eligible");
                    main.setBackgroundColor(getResources().getColor(R.color.properage));
                } else if (a<18) {
                    result.setText("you are not eligible");
                    main.setBackgroundColor(getResources().getColor(R.color.underage));
                }
                    else {
                        result.setText("enter valid value");
                    }
            }
        });

    }
}