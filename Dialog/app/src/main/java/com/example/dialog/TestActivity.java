package com.example.dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        ((Button)findViewById(R.id.button6)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //日期选择对话框
                DatePickerDialog dialog = new DatePickerDialog(TestActivity.this,
                        R.style.MyDatePickerDialogStyle,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                                Toast.makeText(TestActivity.this,
                                        "您选择的日志：年："+ i + "， 月： "+ i1 + ", 日："+i2, Toast.LENGTH_SHORT).show();
                            }
                        },year, month, day );
                dialog.show();
            }
        });

        ((Button)findViewById(R.id.button7)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GenderSelectDlg dlg = new GenderSelectDlg(TestActivity.this, R.style.mydlg);
                dlg.show();
            }
        });
    }
}