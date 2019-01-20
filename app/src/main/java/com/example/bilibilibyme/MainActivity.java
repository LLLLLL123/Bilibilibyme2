package com.example.bilibilibyme;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.bilibilibyme.base.BaseFragment;
import com.example.bilibilibyme.fragments.AnimalFragment;
import com.example.bilibilibyme.fragments.CartonFragment;
import com.example.bilibilibyme.fragments.DishFragment;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager = getSupportFragmentManager();
    private BaseFragment[] fragments = {new AnimalFragment(), new CartonFragment(), new DishFragment()};


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.navigation_home:
                changeFragment(0);
                return true;
            case R.id.navigation_dashboard:
                changeFragment(1);
                return true;
            case R.id.navigation_notifications:
                changeFragment(2);
                return true;
        }
        return false;
    }

    private void changeFragment(int i) {
    }
};


@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        initFragment();
    }

    /**
     * 初始化fragment
     */
    private void initFragment() {
       for(int i=0;i<3;i++){
           fragmentManager.beginTransaction().add(R.id.fragment_container, fragments[i]).commit();
       }
    }
    private void changeFragment(int position){
        fragmentManager.beginTransaction().replace(R.id.fragment_container,fragments[position]).commit();
    }
}


