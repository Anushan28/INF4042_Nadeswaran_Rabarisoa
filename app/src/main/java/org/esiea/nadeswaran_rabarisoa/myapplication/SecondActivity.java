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
        btn_back.setOnClickListener(this);
    }

    public void test_intent2(){
        Intent s = new Intent(this, GetBiersServices.class);
        startActivity(s);
        GetBiersServices.startActionBiers(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_back:
                Intent s = new Intent(this, MainActivity.class);
                startActivity(s);
                break;

            default:
                break;
        }
    }
}
