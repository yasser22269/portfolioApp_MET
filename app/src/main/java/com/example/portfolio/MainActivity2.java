package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.net.Uri;

public class MainActivity2 extends AppCompatActivity {
    private Button button1,button2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

         //Portfolio button
        button1 =  findViewById(R.id.Portfolio);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Portfolio = new Intent();
                Portfolio.setAction(Intent.ACTION_VIEW);
                Portfolio.addCategory(Intent.CATEGORY_BROWSABLE);
                Portfolio.setData(Uri.parse("https://portfolioyasser.netlify.app"));
                startActivity(Portfolio);
            }
        });



        //cv button
        button2 =  findViewById(R.id.cv);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cv = new Intent();
                cv.setAction(Intent.ACTION_VIEW);
                cv.addCategory(Intent.CATEGORY_BROWSABLE);
                cv.setData(Uri.parse("https://portfolioyasser.netlify.app/Yasser%20Abd%20Elghany%20cv.pdf"));
                startActivity(cv);
            }
        });
    }


}