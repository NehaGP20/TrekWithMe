package com.example.maps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    Button btnChoose,btnSee,btnChoose1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnChoose = (Button)findViewById(R.id.btn_choose);
        btnSee = (Button)findViewById(R.id.btn_see);
        btnChoose1 = (Button)findViewById(R.id.btn_choose1);
        btnChoose.setOnClickListener(this);
        btnSee.setOnClickListener(this);
        btnChoose1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.equals(btnChoose)) {
            Intent it = new Intent(Menu.this,MapsActivity.class);
            startActivity(it);

        } else if(v.equals(btnSee)) {

            Intent it = new Intent(Menu.this,PackingGuides.class);
            startActivity(it);

        } else if(v.equals(btnChoose1)) {
            Intent it = new Intent(Menu.this,RentedGear.class);
            startActivity(it);

        }

    }
}


