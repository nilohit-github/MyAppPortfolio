package com.example.android.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CharSequence text = "";
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view) {

        Button app_button1 = (Button) findViewById(R.id.app1_button);
        Button app_button2 = (Button) findViewById(R.id.app2_button);
        Button app_button3 = (Button) findViewById(R.id.app3_button);
        Button app_button4 = (Button) findViewById(R.id.app4_button);
        Button app_button5 = (Button) findViewById(R.id.app5_button);
        Button app_button6 = (Button) findViewById(R.id.app6_button);

        if (view == app_button1) {
            text = "This button will launch my Spotify streamer app!";

        } else if (view == app_button2) {
            text = "This button will launch my Scores app!";
        } else if (view == app_button3) {
            text = "This button will launch my Library app!";
        } else if (view == app_button4) {
            text = "This button will launch my Build It Bigger app!";
        } else if (view == app_button5) {
            text = "This button will launch my Food Reader app!";
        } else if (view == app_button6) {
            text = "This button will launch my Capstone app!";
        }
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;

        toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
        toast.setGravity(Gravity.CENTER |Gravity.TOP, view.getLeft(), view.getTop()+(view.getBottom()-view.getTop())/2);
        toast.show();
    }
}
