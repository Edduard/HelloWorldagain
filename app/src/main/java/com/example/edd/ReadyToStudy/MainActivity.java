package com.example.edd.ReadyToStudy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;



public class MainActivity extends ActionBarActivity {

    //Declara NUMELE mesajul care va fi trimis catre cealalta activitate
    public final static String EXTRA_MESSAGE = "Mesajul primit la cealalta activtate se numeste EXTRA_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Actiunea care se desfasoara cand se apasa pe Buttonul 1
    public void onClickButton1(View view)
    {
        Intent intent = new Intent(this, NextActivity.class);  //primul parametru este activitatea de la care se trimite intentul catre cel de-al doilea parametru (activitatea urmatoare)
        TextView text = (TextView) findViewById(R.id.textView); //Cauta textView-ul de unde sa ia textul care o sa fie trimis catre utmatorul activity
        String message = text.getText().toString(); //Salveaza textul textView-ului curent in "message"
        intent.putExtra(EXTRA_MESSAGE, message);    //Pune mesajul "message" in variabila cu numele "EXTRA_MESSAGE" si o adauga la inten
        startActivity(intent);  //Porneste activitatea urmatoare prin intent
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


}

