package ahmed.sheikh.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeActivity extends Activity {

    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.home_activity);
//        if (getResources().getDisplayMetrics().widthPixels > getResources().getDisplayMetrics().heightPixels) {
//            Toast.makeText(this, "Screen switched to Landscape mode", Toast.LENGTH_SHORT).show();
//        } else {
//            Toast.makeText(this, "Screen switched to Portrait mode", Toast.LENGTH_SHORT).show();
//        }
//

        et = findViewById(R.id.numberOfMinutes);

        Button button = findViewById(R.id.startBtn);
        button.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {

                String etText = et.getText().toString();
                if (etText != null && !"".equals(etText)) {
                    if (!etText.matches("\\d+")) {
                        Toast.makeText(getApplicationContext(), "Make sure to enter numeric characters only.",
                                Toast.LENGTH_SHORT).show();
                    } else {
                        int userInput = Integer.parseInt(etText) * 1000;
                        int minutes = (int) (userInput / 1000) / 60;
                        int seconds = (int) (userInput / 1000) % 60;
                        Toast.makeText(getApplicationContext(), "We will take care of you for " + minutes + " mins and " + seconds + " secs.",
                                Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), SplashActivity.class);
                        intent.putExtra("minutes", etText);
                        Log.i("value", etText);
                        startActivity(intent);
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Enter the amount of minutes, please.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}


// Check if OpenCV is installed
// if(OpenCVLoader.initDebug()){
// Toast.makeText(getApplicationContext(), "Successful", Toast.LENGTH_SHORT).show();
// } else {
//   Toast.makeText(getApplicationContext(), "Failure", Toast.LENGTH_SHORT).show();
//}