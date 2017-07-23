package com.londonappbrewery.climapm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class ChangeCityController extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.change_city_layout);
    final EditText edt_cityName = (EditText) findViewById(R.id.edt_cityName);
    final ImageButton btn_back = (ImageButton) findViewById(R.id.btn_back);
    btn_back.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        finish();
      }
    });

    edt_cityName.setOnEditorActionListener(new TextView.OnEditorActionListener() {
      @Override
      public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        String newCity = edt_cityName.getText().toString();
        Intent intent = new Intent(ChangeCityController.this, WeatherController.class);
        intent.putExtra("City", newCity);
        startActivity(intent);
        return false;
      }
    });
  }
}
