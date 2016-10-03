package com.jaiky.test.toastdialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2;
    ToastDialog mToastDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mToastDialog == null)
                    mToastDialog = new ToastDialog(MainActivity.this);
                mToastDialog.setMsg("正在加载...")
                .show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mToastDialog == null)
                    mToastDialog = new ToastDialog(MainActivity.this);
                mToastDialog.setIsAllowClose(false);
            }
        });
    }




}
