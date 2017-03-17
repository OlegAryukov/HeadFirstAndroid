package aryukov.ru.lesson1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.os.Handler;

import java.util.List;

public class MainActivity extends Activity{

    private int second = 0;
    private boolean flagRun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        runTimer();
    }


    public void onClickStart(View view){
        flagRun = true;
    }
    public void onClickStop(View view){
        flagRun = false;
    }
    public void onClickReset(View view){
        flagRun = false;
        second = 0;
    }

    private void runTimer(){
        final TextView  view = (TextView) findViewById(R.id.time_view);
        final Handler handler = new Handler();

        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = second/3600;
                int minutes = (second%3600)/60;
                int seconds = second%60;
                String time = String.format("%d:%02d;%02d", hours, minutes, seconds);
                view.setText(time);
                if(flagRun){
                    second++;
                }
                handler.postDelayed(this, 1000);
            }
        });


    }
}
