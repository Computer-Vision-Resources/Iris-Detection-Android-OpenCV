package ahmed.sheikh.myapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class VideoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.video_activity);

        Button button = findViewById(R.id.proceed);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
            }
        });

    }

//    private CountDownTimer countDownTimer;
//    private TextView showTime;
//    private boolean mTimerRunning;
//    private long mTimeLeftInMillis;


//    showTime = findViewById(R.id.text_view_countdown);
//    Bundle b = getIntent().getExtras();
//    String secs = b.getString("minutes");
//    long secsToTerminate = Long.parseLong(secs);
//
//    secsToTerminate *= 1000;
//    mTimeLeftInMillis = secsToTerminate;
//    startTimer();

//        Button g = findViewById(R.id.goThere);
//        g.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Intent fdIntent = new Intent(getApplicationContext(), fdActivity.class);
//                        startActivity(fdIntent);
//                    }
//                }
//        );

// Working Media player file,
//  final MediaPlayer toneMP = MediaPlayer.create(this, R.raw.tone);
//  toneMP.start();

//
//        Button resumeTimer = findViewById(R.id.resumeTimerbutton);
//        resumeTimer.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        if (mTimerRunning) {
//                            pauseTimer();
//                        } else {
//                            startTimer();
//                        }
//                    }
//                }
//        );

//        Button playSoundbutton = findViewById(R.id.playSoundbutton);
//        playSoundbutton.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        toneMP.start();
//                    }
//                }
//        );
}
//
//    private void startTimer() {
//        countDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
//            @Override
//            public void onTick(long millisUntilFinished) {
//                mTimeLeftInMillis = millisUntilFinished;
//                int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
//                int seconds = (int) (mTimeLeftInMillis / 1000) % 60;
//                String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
//                showTime.setText(timeLeftFormatted);
//            }
//
//            @Override
//            public void onFinish() {
//                mTimerRunning = false;
//                AlertDialog alertDialog = new AlertDialog.Builder(VideoActivity.this).create();
//                alertDialog.setTitle("Light Me");
//                alertDialog.setIcon(R.drawable.antivirus);
//                alertDialog.setMessage("Your session has ended, you will be redirected to main page.");
//                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
//                        new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog, int which) {
//                                dialog.dismiss();
//                                System.exit(1);
//                            }
//                        });
//                alertDialog.show();
//            }
//        }.start();
//
//        mTimerRunning = true;
//    }
//
//    private void pauseTimer() {
//        countDownTimer.cancel();
//        mTimerRunning = false;
//    }