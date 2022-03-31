package sohee.yoon.ecologiq;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Brands extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.brands);

        Button elanebeautyBtn = findViewById(R.id.buttonElateBeauty);

        elanebeautyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //page change
                Intent it = new Intent(Brands.this, ElateBeauty.class);
                startActivity(it);

            }
        });
    }
}