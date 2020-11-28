package com.example.maps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RentedGear extends AppCompatActivity{

    Button btnAdd1, btnAdd2, btnAdd3, btnAdd4, btnAdd5, btnAdd6, btnAdd7, btnAdd8, btnAdd9;
    EditText edtAdd1, edtAdd2, edtAdd3, edtAdd4, edtAdd5, edtAdd6, edtAdd7, edtAdd8, edtAdd9;

    String choices = "",date = "";
    Double price = 0.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rented_gear);
        btnAdd1 = (Button)findViewById(R.id.btn_add1);
        btnAdd2 = (Button)findViewById(R.id.btn_add2);
        btnAdd3 = (Button)findViewById(R.id.btn_add3);
        btnAdd4 = (Button)findViewById(R.id.btn_add4);
        btnAdd5 = (Button)findViewById(R.id.btn_add5);
        btnAdd6 = (Button)findViewById(R.id.btn_add6);
        btnAdd7 = (Button)findViewById(R.id.btn_add7);
        btnAdd8 = (Button)findViewById(R.id.btn_add8);
        btnAdd9 = (Button)findViewById(R.id.btn_add9);

        edtAdd1 = (EditText)findViewById(R.id.edt_add1);
        edtAdd2 = (EditText)findViewById(R.id.edt_add2);
        edtAdd3 = (EditText)findViewById(R.id.edt_add3);
        edtAdd4 = (EditText)findViewById(R.id.edt_add4);
        edtAdd5 = (EditText)findViewById(R.id.edt_add5);
        edtAdd6 = (EditText)findViewById(R.id.edt_add6);
        edtAdd7 = (EditText)findViewById(R.id.edt_add7);
        edtAdd8 = (EditText)findViewById(R.id.edt_add8);
        edtAdd9 = (EditText)findViewById(R.id.edt_add9);
    }
    public void add_to_list(View v) {
        if(v == findViewById(R.id.btn_add1)) {
            choices = choices + " Trekking Shoes" + "\n";
            String dtAdd1 = edtAdd1.getText().toString();
            date = date + dtAdd1;
            price = price + 200;
        }
        else if(v == findViewById(R.id.btn_add2)) {
            choices = choices + " Walking Stick" + "\n";
            String dtAdd2 = edtAdd2.getText().toString();
            date = date + dtAdd2;
            price = price + 50;
        }
        else if(v == findViewById(R.id.btn_add3)) {
            choices = choices + " Poncho for trek" + "\n";
            String dtAdd3 = edtAdd3.getText().toString();
            date = date + dtAdd3;
            price = price + 60;
        }
        else if(v == findViewById(R.id.btn_add4)) {
            choices = choices + " Head Torch" + "\n";
            String dtAdd4 = edtAdd4.getText().toString();
            date = date + dtAdd4;
            price = price + 60;
        }
        else if(v == findViewById(R.id.btn_add5)) {
            choices = choices + " Hollofil Jacket" + "\n";
            String dtAdd5 = edtAdd5.getText().toString();
            date = date + dtAdd5;
            price = price + 140;
        }
        else if(v == findViewById(R.id.btn_add6)) {
            choices = choices + " Windproof Fleece Pant" + "\n";
            String dtAdd6 = edtAdd6.getText().toString();
            date = date + dtAdd6;
            price = price + 90;
        }
        else  if(v == findViewById(R.id.btn_add7)) {
            choices = choices + " Waterproof Trekking Gloves" + "\n";
            String dtAdd7 = edtAdd7.getText().toString();
            date = date + dtAdd7;
            price = price + 60;
        }
        else if(v == findViewById(R.id.btn_add8)) {
            choices = choices + " Backpack with Rain Cover" + "\n";
            String dtAdd8 = edtAdd8.getText().toString();
            date = date + dtAdd8;
            price = price + 120;
        }
        else if(v == findViewById(R.id.btn_add9)) {
            choices = choices + " Fleece warm Jacket" + "\n";
            String dtAdd9 = edtAdd9.getText().toString();
            date = date + dtAdd9;
            price = price + 90;
        }

    }

    public void placeOrder(View v) {
        Intent it = new Intent(this,OrderDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices",choices);
        bundle.putString("dateChoosen",date);
        bundle.putDouble("price",price);
        it.putExtras(bundle);
        startActivity(it);
    }
}
