package ahmed.sheikh.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class TimeTrail extends Activity {

    private TextView showTime;
    private long mTimeLeftInMillis;
    private CountDownTimerWithPause countDownTimer;
    private Button startTimer;
    private Button pauseTimer;
    private Button resumeTimer;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        countDownTimer.cancel();
        mTimeLeftInMillis = 0;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time_activity);
        Bundle b = getIntent().getExtras();
        String secs = b.getString("minutes");
        long secsToTerminate = Long.parseLong(secs);

        showTime = findViewById(R.id.text_view_countdown);

        secsToTerminate *= 1000;
        mTimeLeftInMillis = secsToTerminate;
        updateTimerUI(mTimeLeftInMillis);


        startTimer = findViewById(R.id.btnStartTimer);
        startTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (countDownTimer == null) {
                    countDownTimer = new CountDownTimerWithPause(mTimeLeftInMillis, 1000, true) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            updateTimerUI(millisUntilFinished);
                        }

                        @Override
                        public void onFinish() {
                            Toast.makeText(getApplicationContext(), "Finished...", Toast.LENGTH_SHORT).show();
                            updateTimerUI(0L);
                        }
                    }.create();
                }
            }
        });

        pauseTimer = findViewById(R.id.btnPauseTimer);
        pauseTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (countDownTimer != null)
                    countDownTimer.pause();
            }
        });

        resumeTimer = findViewById(R.id.btnResumeTimer);
        resumeTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (countDownTimer != null)
                    countDownTimer.resume();
            }
        });
    }

    private void updateTimerUI(Long milliSeconds) {
        int minutes = (int) (milliSeconds / 1000) / 60;
        int seconds = (int) (milliSeconds / 1000) % 60;
        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
        showTime.setText(timeLeftFormatted);
    }
}


// if (countDownTimer == null) {
// countDownTimer = new CountDownTimerWithPause(mTimeLeftInMillis, 1000, false) {
// @Override
// public void onTick(long millisUntilFinished) {
// updateTimerUI(millisUntilFinished);
// }
// @Override
// public void onFinish() {
// Toast.makeText(getApplicationContext(), "Finished...", Toast.LENGTH_SHORT).show();
// updateTimerUI(0L);
// }
// }.start();
// }

// stopTimer = findViewById(R.id.btnStopTimer);
// stopTimer.setOnClickListener(new View.OnClickListener() {
// @Override
//  public void onClick(View v) {
//      countDownTimer.
//  }
// });