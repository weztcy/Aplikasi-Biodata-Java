package com.example.latihan1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button_call, button_email, button_loc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_call = findViewById(R.id.button_call);
        button_email = findViewById(R.id.button_email);
        button_loc = findViewById(R.id.button_loc);
        String email = "111202113254@mhs.dinus.ac.id";

        button_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor = "081337272669";
                Intent menelepon = new Intent(Intent.ACTION_DIAL);
                menelepon.setData(Uri.fromParts("tel", nomor, null));
                startActivity(menelepon);
            }
        });
        button_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mengemail = new Intent(Intent.ACTION_VIEW
                        , Uri.parse("mailto:"+ email));
                startActivity(mengemail);
            }
        });
        button_loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openMap = new Intent(Intent.ACTION_VIEW
                        , Uri.parse("https://goo.gl/maps/hPZgRBoL2NYJWg8R7"));
                startActivity(openMap);
            }
        });
    }
}