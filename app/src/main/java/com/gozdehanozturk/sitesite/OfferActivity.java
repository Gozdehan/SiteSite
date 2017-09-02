package com.gozdehanozturk.sitesite;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class OfferActivity extends AppCompatActivity {

    EditText editOneri;
    Spinner spinner;
    Button btnGonder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Önerileriniz?");


        editOneri = (EditText) findViewById(R.id.edtOneri);


       spinner = (Spinner)findViewById(R.id.spKategori);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.category_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        btnGonder = (Button)findViewById(R.id.btnGonder);

        btnGonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("oneriler");


                String item = spinner.getSelectedItem().toString();

                String key = myRef.push().getKey();
                myRef.child(key).setValue(editOneri.getText().toString()+"/"+item);

                Toast.makeText(OfferActivity.this,"MESAJINIZ BAŞARIYLA GÖNDERİLDİ", Toast.LENGTH_LONG).show();

            }
        });

    }

}
