package com.omelchenkoaleks.beeradviserandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class FindBeerActivity extends Activity {

    TextView brands;
    Spinner color;

    private BeerExpert expert = new BeerExpert();

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

        // получаем контейнер List с сортами пива
        // или получаем рекомендации от класса BeerExpert
        List<String> brandList = expert.getBrands(beerType);
        // построим String по данным из List
        StringBuilder brandFormatted = new StringBuilder();
        for (String brand : brandList) {
            brandFormatted.append(brand).append('\n');
        }
        // вывести сорта пива
        brands.setText(brandFormatted);
    }
}