package com.example.ecocity;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.ecocity.R.id;
import com.google.android.material.textfield.TextInputEditText;

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

    public void addEventS(View view) {
        RememberState.setType("события");
        setContentView(R.layout.add_sub_s_activity);
    }

    public void addEventN(View view) {
        RememberState.setType("новости");
        setContentView(R.layout.add_sub_n_activity);
    }

    public void addEventO(View view) {
        RememberState.setType("обращения");
        setContentView(R.layout.add_sub_o_activity);
    }

    public void add_commit(View view) {
        setContentView(R.layout.add_commit_activity);
    }

    public void commit_changes(View view) {

        TextInputEditText t1 = (TextInputEditText)findViewById(id.t1);
        TextInputEditText t2 = (TextInputEditText)findViewById(id.t2);

        RememberState.commit(String.valueOf(t1.getText()), String.valueOf(t2.getText()));

        Toast toast = Toast.makeText(getApplicationContext(), "Запись добавлена", Toast.LENGTH_SHORT);
        toast.show();

        homePage(view);
    }
}