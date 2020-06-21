package org.techtown.firebaselistexample.Second;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.techtown.firebaselistexample.Third.Consumer;
import org.techtown.firebaselistexample.R;
import org.techtown.firebaselistexample.Third.Sales;

public class SelectCorS extends AppCompatActivity {
    private TextView tv_result; //닉네임 text
    private ImageView tv_profile; //이미지 뷰

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_cor_s);


        Intent intent = getIntent();
        String nickName = intent.getStringExtra("nickname");
        String photoUrl = intent.getStringExtra("photoUrl");

        tv_result = findViewById(R.id.tv_result);
        tv_result.setText(nickName);

        tv_profile = findViewById(R.id.tv_profile);
        Glide.with(this).load(photoUrl).into(tv_profile); //profile url를 이미지 뷰에 세팅

        Button c_button = findViewById(R.id.Consumer);
        c_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Consumer.class);
                startActivity(intent);
            }
        });
        Button s_button = findViewById(R.id.Sales);
        s_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Sales.class);
                startActivity(intent);
            }
        });



    }
}
