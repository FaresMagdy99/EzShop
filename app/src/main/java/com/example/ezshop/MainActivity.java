package com.example.ezshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private  EditText Password;
    private TextView Info;
    private Button Login;
    private int Count = 5;
    // add comment
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.etName);
        Password = (EditText)findViewById(R.id.etPassword);
        Info = (TextView)findViewById(R.id.tvInfo);
        Login = (Button)findViewById(R.id.btnLogin);

        Info.setText("No of attempts remaining: 5");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Validate(Name.getText().toString(), Password.getText().toString());
            }
        });

    }

    private void  Validate(String username, String password){
        if ((username.equals("Admin")) && (password.equals("1234"))){
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        }
        else{
            Count--;
            Info.setText("No of attempts remaining: " + String.valueOf(Count));
            if(Count == 0){
                Login.setEnabled(false);
            }
        }

    }
}