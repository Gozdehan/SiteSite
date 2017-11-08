package com.gozdehanozturk.sitesite.activity;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.gozdehanozturk.sitesite.R;

public class OfferActivity extends AppCompatActivity {

    EditText editOneri;
    Spinner spinner;
    Button btnGonder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer);

        getSupportActionBar().setTitle("Önerileriniz");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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

                if(editOneri.getText().toString().equals("")){
                    Toast.makeText(OfferActivity.this,"LÜTFEN SİTE ADRESİNİ GİRİNİZ", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(spinner.getSelectedItem().equals("KATEGORİ SEÇİNİZ")){
                    Toast.makeText(OfferActivity.this, "LÜTFEN KATEGORİ SEÇİNİZ", Toast.LENGTH_SHORT).show();
                }
                else{
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("oneriler");

                    String item = spinner.getSelectedItem().toString();

                    String key = myRef.push().getKey();
                    myRef.child(key).setValue(editOneri.getText().toString()+"/"+item);

                    Toast.makeText(OfferActivity.this,"MESAJINIZ BAŞARIYLA GÖNDERİLDİ", Toast.LENGTH_LONG).show();
                    editOneri.setText("");
                }

            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
