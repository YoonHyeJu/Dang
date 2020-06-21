package org.techtown.firebaselistexample.customerFragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.techtown.firebaselistexample.R;
import org.techtown.firebaselistexample.example;


public class Fragment1 extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.fragment_1, container, false);

        Button user_info_button = (Button) rootview.findViewById(R.id.user_info_button);
        user_info_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), example.class);
                startActivity(intent);
            }
        });




       return rootview;



    }
}
