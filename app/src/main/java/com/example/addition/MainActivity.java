package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText number1;
    private EditText number2;
    private Button add;
    private TextView ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ans=findViewById(R.id.textView);
        number1=findViewById(R.id.editTextNumber);
        number2=findViewById(R.id.editTextNumber2);
        add=findViewById(R.id.button);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str= number1.getText().toString();
                int num1=Integer.parseInt(str);
                String str2= number2.getText().toString();
                int num2=Integer.parseInt(str2);
                int number=num1+num2;
                ans.setText("The Addition of "+num1+" and "+num2+" is"+number);
            }
        });

    }
}