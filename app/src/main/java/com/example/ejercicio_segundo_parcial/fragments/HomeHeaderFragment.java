package com.example.ejercicio_segundo_parcial.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.ejercicio_segundo_parcial.R;

public class HomeHeaderFragment extends Fragment {

    ImageView ivHeader;

    public HomeHeaderFragment(){
        super(R.layout.fragment_home_header);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ivHeader = view.findViewById(R.id.iv_header);
        ivHeader.setImageResource(getArguments().getInt("drawable"));
        ivHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
