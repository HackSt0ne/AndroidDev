package com.example.menutest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class PopupMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu);

        Button btn = findViewById(R.id.button4);

        //1. 设置View的单击响应回调
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //2。 创建PopupMenu对象实例
                PopupMenu menu  = new PopupMenu(PopupMenuActivity.this, view);

                //3. 给PpoMenu设置按钮的布局文件
                menu.getMenuInflater().inflate(R.menu.menu_test, menu.getMenu());

                //3. 设置菜单响应方法
                menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        int id = menuItem.getItemId();
                        if(id == R.id.mn_set)
                        {
                            Toast.makeText(PopupMenuActivity.this, "您点击的是PopupMenu中的设置菜单", Toast.LENGTH_SHORT).show();
                        }

                        return true;
                    }
                });

                //4. 调用show方法
                menu.show();
            }
        });

    }
}