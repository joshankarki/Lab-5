package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    btnopen.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v)
        {
            Toast.makeText(MainActivity.this,"hello",Toast.LENGTH_LONG).show();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.MainContainer,new NewFragment()).commit();   }
    }
    );

}