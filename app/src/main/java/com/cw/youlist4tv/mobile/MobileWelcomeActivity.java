package com.cw.youlist4tv.mobile;

import android.os.Bundle;

import com.cw.youlist4tv.R;
import com.cw.youlist4tv.ui.LeanbackActivity;

//todo temp mark
//public class MobileWelcomeActivity extends Activity {
public class MobileWelcomeActivity extends LeanbackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //todo temp mark
//        setContentView(R.layout.activity_mobile_welcome);
        setContentView(R.layout.main);
    }
}
