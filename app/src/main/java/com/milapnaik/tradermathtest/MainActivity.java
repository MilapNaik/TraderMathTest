package com.milapnaik.tradermathtest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.milapnaik.mentalmathworkout.MESSAGE";
    public final static String TEST_TYPE = "com.milapnaik.mentalmathworkout.MESSAGE";
    private DatabaseOperations db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        Context ctx = this;
        db = new DatabaseOperations(ctx);
        db.close();

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

    /** Called when the user clicks the Math Test button */
    public void MathTest(View view) {
        Intent intent = new Intent(this, PracticeOrTest.class);
        String test = "Mathtest";
        intent.putExtra(TEST_TYPE, test);
        startActivity(intent);
    }

    public void SeqTest(View view) {
        Intent intent = new Intent(this, PracticeOrTest.class);
        String test = "Seqtest";
        intent.putExtra(TEST_TYPE, test);
        startActivity(intent);
    }


    public void Info(View view) {
        Intent intent = new Intent(this, Info.class);
        startActivity(intent);
    }

    public void Settings(View view) {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
}
