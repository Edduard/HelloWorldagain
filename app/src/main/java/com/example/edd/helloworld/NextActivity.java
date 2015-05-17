package com.example.edd.helloworld;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class NextActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Foloseste layoutul primei activitati

        //Cauta intentul care a deschis activitatea
        Intent intent = getIntent();

        //Primeste mesajul venit odata cu intentului
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //Pune mesajul intr-un text view
        TextView text = (TextView) findViewById(R.id.textView);
        text.setText(message+" - Activitatea 2");
    }
    public void onClickButton1(View view)
    {
        System.out.println("Butonul din activitatea 2 a fost apasat! ");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_next, menu);
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
}
