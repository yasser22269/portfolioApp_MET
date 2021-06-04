package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    private Button button ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);





        //facebook profile button
        button =  findViewById(R.id.facebook);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cv = new Intent();
                cv.setAction(Intent.ACTION_VIEW);
                cv.addCategory(Intent.CATEGORY_BROWSABLE);
                cv.setData(Uri.parse("https://www.facebook.com/HoDhoOoD"));
                startActivity(cv);
            }
        });
    }
}