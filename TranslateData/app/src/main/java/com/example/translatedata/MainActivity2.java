package com.example.translatedata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText edtName = findViewById(R.id.editTextTextPersonName);

        Intent it = getIntent();
        if (it != null) {
            //edtName.setText( it.getStringExtra("key"));

            //先获取Bundle
            Bundle bundle = it.getExtras();
            edtName.setText( bundle.getString("key"));
        }

        ((Button)findViewById(R.id.btn_ret)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent();
                it.putExtra("title", edtName.getText().toString());
                setResult(321, it);
                finish();//返回
            }
        });
    }
}