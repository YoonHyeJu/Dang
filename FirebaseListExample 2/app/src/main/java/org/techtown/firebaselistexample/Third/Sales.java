package org.techtown.firebaselistexample.Third;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.techtown.firebaselistexample.R;
import org.techtown.firebaselistexample.SalesFragment.Fragment_s_1;
import org.techtown.firebaselistexample.SalesFragment.Fragment_s_2;
import org.techtown.firebaselistexample.SalesFragment.Fragment_s_3;
import org.techtown.firebaselistexample.SalesFragment.Fragment_s_4;
import org.techtown.firebaselistexample.SalesFragment.Fragment_s_5;

public class Sales extends AppCompatActivity {
    private FragmentManager fragmentManager = getSupportFragmentManager();
    private Fragment_s_1 fragment_s_1 = new Fragment_s_1();
    private Fragment_s_2 fragment_s_2 = new Fragment_s_2();
    private Fragment_s_3 fragment_s_3 = new Fragment_s_3();
    private Fragment_s_4 fragment_s_4 = new Fragment_s_4();
    private Fragment_s_5 fragment_s_5 = new Fragment_s_5();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, fragment_s_1).commitAllowingStateLoss();
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new Sales.ItemSelectedListenter());

    }
    private class ItemSelectedListenter implements BottomNavigationView.OnNavigationItemSelectedListener {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            switch (item.getItemId()) {
                case R.id.navigation_one:
                    transaction.replace(R.id.frameLayout, fragment_s_1).commitAllowingStateLoss();
                    break;
                case R.id.navigation_two:
                    transaction.replace(R.id.frameLayout, fragment_s_2).commitAllowingStateLoss();
                    break;
                case R.id.navigation_three:
                    transaction.replace(R.id.frameLayout, fragment_s_3).commitAllowingStateLoss();
                    break;
                case R.id.navigation_four:
                    transaction.replace(R.id.frameLayout, fragment_s_4).commitAllowingStateLoss();
                    break;
                case R.id.navigation_five:
                    transaction.replace(R.id.frameLayout, fragment_s_5).commitAllowingStateLoss();
                    break;
            }

            return true;
        }
    }
}
