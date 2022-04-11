package sohee.yoon.ecologiq;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MyProfile extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myprofile);

        Button findyourmatchBtn = findViewById(R.id.buttonfindyourmatch);

        findyourmatchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //page change
                Intent it = new Intent(MyProfile.this, FindYourMatch.class);
                startActivity(it);

            }
        });
    }
}
