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
        Button axiologyBtn = findViewById(R.id.buttonAxiology);
        Button odyliqueBtn = findViewById(R.id.buttonOdylique);
        Button dabhermakeupBtn = findViewById(R.id.buttonDabHerbMakeup);
        Button plantmakeupBtn = findViewById(R.id.buttonPlantMakeup);
        Button fatandthemoonBtn = findViewById(R.id.buttonFatAndTheMoon);
        Button dirtyhippieBtn = findViewById(R.id.buttonDirtyHippie);
        Button riverorganicsBtn = findViewById(R.id.buttonRiverOrganics);
        Button enteryourbrandBtn = findViewById(R.id.buttonenteryourbrand);

        elanebeautyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //page change
                Intent it = new Intent(Brands.this, ElateBeauty.class);
                startActivity(it);

            }
        });
        axiologyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //page change
                Intent it = new Intent(Brands.this, Axiology.class);
                startActivity(it);

            }
        });
        odyliqueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //page change
                Intent it = new Intent(Brands.this, Odylique.class);
                startActivity(it);

            }
        });
        dabhermakeupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //page change
                Intent it = new Intent(Brands.this, DabHerbMakeup.class);
                startActivity(it);

            }
        });
        plantmakeupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //page change
                Intent it = new Intent(Brands.this, PlantMakeup.class);
                startActivity(it);

            }
        });
        fatandthemoonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //page change
                Intent it = new Intent(Brands.this, FatAndTheMoon.class);
                startActivity(it);

            }
        });
        dirtyhippieBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //page change
                Intent it = new Intent(Brands.this, DirtyHippie.class);
                startActivity(it);

            }
        });
        riverorganicsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //page change
                Intent it = new Intent(Brands.this, RiverOrganics.class);
                startActivity(it);

            }
        });

        enteryourbrandBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //page change
                Intent it = new Intent(Brands.this, EnterYourBrand.class);
                startActivity(it);

            }
        });
    }
}