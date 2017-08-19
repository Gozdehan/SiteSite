package com.gozdehanozturk.sitesite;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class OfferActivity extends AppCompatActivity {

    EditText editOneri;
    Button btnGonder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer);

        editOneri = (EditText) findViewById(R.id.edtOneri);
        btnGonder = (Button)findViewById(R.id.btnGonder);

        btnGonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("oneriler");

                String key = myRef.push().getKey();
                myRef.child(key).setValue(editOneri.getText().toString());

            }
        });

    }

}
