package com.omelchenkoaleks.beeradviserandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class FindBeerActivity extends Activity {

    TextView brands;
    Spinner color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // метод сообщает какой макет используется активностью
        setContentView(R.layout.activity_find_beer);
    }

    // метод сработает, когда юзер кликнет по кнопке
    public void onClickFindBeer(View view) {
        // получаем ссылку на TextView
        brands = findViewById(R.id.brands);
        // получаем ссылку на Spinner
        color = findViewById(R.id.color);
        // получаем вариант, выбранный в Spinner
        String beerType = String.valueOf(color.getSelectedItem());
        // выводим выбранный вариант
        brands.setText(beerType);
    }
}