package com.example.dialog;

import android.app.Dialog;
import android.content.Context;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class GenderSelectDlg extends Dialog {

    public GenderSelectDlg(@NonNull Context context, int themeResId) {
        super(context, themeResId);
        setContentView(R.layout.gender_select);

        RadioGroup rg = findViewById(R.id.rg_gender);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i)
                {
                    case R.id.mele:
                        Toast.makeText(context, "男生", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_female:
                        Toast.makeText(context, "女生", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_unkown:
                        Toast.makeText(context, "未知", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_guess:
                        Toast.makeText(context, "你猜", Toast.LENGTH_SHORT).show();
                        break;
                }
                dismiss();
            }
        });
    }

}
