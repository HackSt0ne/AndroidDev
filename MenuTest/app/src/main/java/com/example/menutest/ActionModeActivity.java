package com.example.menutest;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActionModeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_mode);

        Button btn = findViewById(R.id.button3);
        btn.setOnLongClickListener(new View.OnLongClickListener()
        {

            @Override
            public boolean onLongClick(View view) {
                startActionMode(cb);
                return true;
            }
        });

    }

    ActionMode.Callback cb = new ActionMode.Callback() {
        private static final String TAG = "ActionMode.Callback";
        @Override
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            //创建上下文模式的时候调用
            //实例化菜单控件
            Log.d(TAG, "onCreateActionMode");
            getMenuInflater().inflate(R.menu.menu_test, menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            //onCreateActionMode之后被调用
            Log.d(TAG, "onPrepareActionMode");
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            //菜单被点击时调用
            Log.d(TAG, "onActionItemClicked");
            int id = menuItem.getItemId();
            if(id == R.id.mn_set)
            {
                Toast.makeText(ActionModeActivity.this, "您点击了设置菜单", Toast.LENGTH_SHORT).show();
            }
            return true;
        }

        @Override
        public void onDestroyActionMode(ActionMode actionMode) {
            //退出上下文菜单时调用
            Log.d(TAG, "onDestroyActionMode");
        }
    };
}