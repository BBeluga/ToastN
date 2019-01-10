package com.netec.toastpersonalizado;

import android.app.Activity;
import android.os.Bundle;

import com.netec.toastnetec.NToast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NToast toast = new NToast(this,"Mensaje de prueba");
    }
}
