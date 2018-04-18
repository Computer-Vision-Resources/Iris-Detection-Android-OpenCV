package ahmed.sheikh.myapplication;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.Window;

public class SplashActivity extends Activity {

    public static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.splash_activity);

        runApp();
    }

    private void runApp() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
//                Intent introIntent = new Intent(SplashActivity.this, fdActivity.class);
                Intent introIntent = new Intent(SplashActivity.this, fdActivity.class);
                Bundle b = getIntent().getExtras();
                String secs = b.getString("minutes");
                introIntent.putExtra("minutes", secs);
                startActivity(introIntent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}