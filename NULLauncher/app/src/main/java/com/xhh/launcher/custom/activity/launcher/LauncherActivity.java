package com.xhh.launcher.custom.activity.launcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

import com.xhh.launcher.custom.R;
import com.xhh.launcher.custom.app.APPManager;

public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        APPManager.getInstance().addActivity(this);
        setContentView(R.layout.activity_launcher);
        Object obj=null;
        obj.toString();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                Toast.makeText(LauncherActivity.this, "按下返回键", Toast.LENGTH_SHORT).show();
                return false;
        }
        return super.onKeyDown(keyCode, event);
    }
}