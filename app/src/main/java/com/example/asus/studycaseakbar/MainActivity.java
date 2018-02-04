package com.example.asus.studycaseakbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        EditText jumlah;
        public void onEatbus(View view) {
            Intent intent = new Intent(getApplicationContext(), Halamankedua.class);
            Bundle b = new Bundle();
            jumlah = (EditText) findViewById(R.id.txtjumlah);
            String jmlh = jumlah.getText().toString();
            int harga=Integer.parseInt(jmlh)*50000;

            b.putString("rumahmakan","EATBUS");
            b.putString("jumlah",jumlah.getText().toString());
            b.putString("harga",String.valueOf(harga));
            intent.putExtras(b);
            Toast.makeText(this, "Jangan Makan Malam Disini, Uang Kamu Tidak Cukup", Toast.LENGTH_SHORT).show();

            startActivity(intent);
        }

        public void onAbnormal (View view) {
            Intent intent = new Intent(getApplicationContext(), Halamankedua.class);
            Bundle b = new Bundle();
            jumlah = (EditText) findViewById(R.id.txtjumlah);
            String jmlh = jumlah.getText().toString();
            int harga=Integer.parseInt(jmlh)*30000;

            b.putString("rumahmakan","ABNORMAL");
            b.putString("jumlah",jumlah.getText().toString());
            b.putString("harga",String.valueOf(harga));
            intent.putExtras(b);

            Toast.makeText(this, "Disini Aja Makan Malamnya", Toast.LENGTH_SHORT).show();


        }
}
