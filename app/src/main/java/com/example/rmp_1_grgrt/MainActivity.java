package com.example.rmp_1_grgrt;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Создаем экземпляр фрагмента
        BlankFragment blankFragment = new BlankFragment();

        // Получаем FragmentManager и начинаем транзакцию
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // Добавляем фрагмент в контейнер
        fragmentTransaction.add(R.id.fragment_container, blankFragment);

        // Завершаем транзакцию
        fragmentTransaction.commit();
    }
}