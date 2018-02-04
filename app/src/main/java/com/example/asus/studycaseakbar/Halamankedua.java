package com.example.asus.studycaseakbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.view.View;

/**
 * Created by ASUS on 04/02/2018.
 */

public class Halamankedua extends AppCompatActivity {

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lamandua);

        Bundle b = getIntent().getExtras();
        TextView rumahmakan = (TextView) findViewById(R.id.txtrestoran);
        TextView porsi = (TextView) findViewById(R.id.txtjumlah2) ;
        TextView harga = (TextView) findViewById(R.id.txtharga2);

        rumahmakan.setText(b.getCharSequence("rumahmakan"));
        porsi.setText(b.getCharSequence("jumlah"));
        harga.setText(b.getCharSequence("harga"));



    }

}