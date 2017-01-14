package com.insperion.sets.alarma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button addgroup, groups, rbu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EULADialog eulaDialog = new EULADialog(MainActivity.this);
        eulaDialog.show();

        addgroup = (Button)findViewById(R.id.addgroup);
        addgroup.setOnClickListener(this);
        groups = (Button)findViewById(R.id.groups);
        groups.setOnClickListener(this);
        rbu = (Button)findViewById(R.id.rbu);
        rbu.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i = null;

        switch (v.getId()) {
            case R.id.addgroup:
                i = new Intent(MainActivity.this, AddGroupActivity.class);
                break;
            case R.id.groups:
                i = new Intent(MainActivity.this, GroupsActivity.class);
                break;
            case R.id.rbu:
                i = new Intent(MainActivity.this, ReportBadUseActivity.class);
                break;
        }

        startActivity(i);
    }

}
