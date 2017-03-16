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

import java.util.List;

public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onSendMesssage(View view){
        Intent intent = new Intent(this, ReceieveMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.messageToSend);
        String meessageText = editText.getText().toString();
        intent.putExtra(ReceieveMessageActivity.TEXT_SERVICES_MANAGER_SERVICE, meessageText);
        startActivity(intent);
    }
}
