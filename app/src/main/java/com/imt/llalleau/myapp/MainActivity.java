package com.imt.llalleau.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    static final  String TAG = MainActivity.class.getName();
    static final String DATA_MESSAGE_KEY = "message";

    private EditText editText;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.editText = (EditText)findViewById(R.id.editText);
        this.btn = (Button)findViewById(R.id.button);
        this.btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==this.btn){
            Log.d(TAG,"Click on button");
            String message = this.editText.getText().toString();
            if(message.length()>0){
                Log.d(TAG,"message is :"+message);
                Intent intent= new Intent(this,second.class);
                intent.putExtra(DATA_MESSAGE_KEY,message);
                startActivity(intent);
            }else{
                Toast.makeText(this, "Message can't be empty", Toast.LENGTH_LONG).show();

            }



        }
    }
}
