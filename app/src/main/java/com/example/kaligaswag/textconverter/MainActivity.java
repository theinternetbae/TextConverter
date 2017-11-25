package com.example.kaligaswag.textconverter;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText input, output;
    Spinner spinner;
    ImageView copy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText) findViewById(R.id.editTextInput);
        output = (EditText) findViewById(R.id.editTextOutput);
        spinner = (Spinner) findViewById(R.id.spinner);
        copy = (ImageView) findViewById(R.id.imageView);

        final String[] spin = {"select", "small char", "crossed char"};

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, spin);
        spinner.setAdapter(adapter);



        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String in = input.getText().toString();
                Converter converter = new Converter();
                switch (spin[position]){
                    case "small char":
                       String con = converter.smalltext(in);
                       output.setText(con);
                       break;
                    case "select":
                        output.setText(in);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("label", output.getText().toString());
                clipboard.setPrimaryClip(clip);
                Toast.makeText(getApplicationContext(), "Copied!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
