package com.example.rmp_1_grgrt;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class BlankFragment extends Fragment {

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        EditText editText = view.findViewById(R.id.editText);
        Button button = view.findViewById(R.id.button);
        TextView textView = view.findViewById(R.id.textView);

        // Устанавливаем обработчик нажатия на кнопку
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Получаем текст из EditText
                String newText = editText.getText().toString();

                // Устанавливаем новый текст в TextView
                textView.setText(newText);
            }
        });

        return view;
    }
}