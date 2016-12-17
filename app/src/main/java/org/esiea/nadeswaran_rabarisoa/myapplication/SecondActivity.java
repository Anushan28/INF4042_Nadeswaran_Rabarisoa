package org.esiea.nadeswaran_rabarisoa.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button btn_back = (Button) findViewById(R.id.btn_back);
        Button btn_dl = (Button) findViewById(R.id.btn_dl);
        btn_back.setOnClickListener(this);
        btn_dl.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_back:
                Intent s = new Intent(this, MainActivity.class);
                startActivity(s);
                break;

            case R.id.btn_dl:
                GetBiersServices.startActionBiers();
                break;

            default:
                break;
        }
    }
}
