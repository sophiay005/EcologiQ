package sohee.yoon.ecologiq;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);


        Button myprofileBtn = findViewById(R.id.buttonmyprofile);
        Button loginBtn = findViewById(R.id.buttonlogin);
        Button myorderBtn = findViewById(R.id.buttonmyorder);
        Button brandsBtn = findViewById(R.id.buttonbrands);
        Button contactBtn = findViewById(R.id.buttoncontactus);

        myprofileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //page change
                Intent it = new Intent(Menu.this, MyProfile.class);
                startActivity(it);

            }
         });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //page change
                Intent it = new Intent(Menu.this, Login.class);
                startActivity(it);

            }
        });

        myorderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //page change
                Intent it = new Intent(Menu.this, MyOrder.class);
                startActivity(it);

            }
        });

        brandsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //page change
                Intent it = new Intent(Menu.this, Brands.class);
                startActivity(it);

            }
        });

        contactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //page change
                Intent it = new Intent(Menu.this, ContactUs.class);
                startActivity(it);

            }
        });

    }
}
