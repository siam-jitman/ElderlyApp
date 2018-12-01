package th.in.streetfood.elderlyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.apache.cordova.DroidGap;

public class MainActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("http://streetfood.in.th/#/");
    }
}

