package com.example.ecocity;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.ecocity.R.id;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);

        EventManager.init();
    }

    public void homePage(View view) {
        setContentView(R.layout.home_activity);
        linearLayout = (LinearLayout) findViewById(id.linearlayoutvertical);
        EventManager.addContent(this, linearLayout, "новости");
    }

    public void eventPage(View view) {
        setContentView(R.layout.event_activity);
        linearLayout = (LinearLayout) findViewById(id.linearlayoutvertical);
        EventManager.addContent(this, linearLayout, "события");
    }

    public void blagoPage(View view) {
        setContentView(R.layout.blago_activity);
        linearLayout = (LinearLayout) findViewById(id.linearlayoutvertical);
        EventManager.addContent(this, linearLayout, "обращения");
    }

    public void mapPage(View view) {
        setContentView(R.layout.map_activity);
    }

    public void privatePage(View view) {
        setContentView(R.layout.private_activity);
    }

    public void addPage(View view) {
        setContentView(R.layout.add_activity);
    }

    public void addEventS(View view){
        RememberState.setType("новости");
    }

    public void addEventN(View view){
        RememberState.setType("обращения");
    }

    public void addEventO(View view){
        RememberState.setType("события");
    }
}