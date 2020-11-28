package com.example.maps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OrderDetails extends AppCompatActivity {

    TextView listView, priceView, dateView;
    String list_choice,date_choosen;
    Double prices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);
        listView = (TextView)findViewById(R.id.listView);
        priceView = (TextView)findViewById(R.id.priceView);
        dateView = (TextView)findViewById(R.id.dateView);

        Bundle bundle = getIntent().getExtras();
        list_choice = bundle.getString("choices");
        date_choosen = bundle.getString("dateChoosen");
        prices = bundle.getDouble("price");

        listView.setText(list_choice);
        dateView.setText(date_choosen);
        priceView.setText(prices.toString());

    }
}
