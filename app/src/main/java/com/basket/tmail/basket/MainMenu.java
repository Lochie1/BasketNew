package com.basket.tmail.basket;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.content.Intent;

public class MainMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        RelativeLayout basketlayout = new RelativeLayout(this);

        Button messagebutton = new Button(this);

        basketlayout.addView(messagebutton);
        setContentView(basketlayout);


        setContentView(R.layout.activity_menu); }

        public void messages(View view){
           Intent intent = new Intent(MainMenu.this, messages.class);
            startActivity(intent);}

        public void email(View view){
           Intent intent1 = new Intent(MainMenu.this, email.class);
            startActivity(intent1);}

        public void settings(View view){
           Intent intent2 = new Intent(MainMenu.this, Settings.class);
           startActivity(intent2);}






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
