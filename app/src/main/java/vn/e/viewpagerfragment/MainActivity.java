package vn.e.viewpagerfragment;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


  /*  private Button btnChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnChange = findViewById(R.id.btnChange);

        final FragmentManager fragmentManager = getSupportFragmentManager();

        // add fragment vao activity
        MainFragment mainFragment = new MainFragment();
        fragmentManager.beginTransaction().add(R.id.container, mainFragment).commit();


        // thay doi fragment tren activity
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SubFragment subFragment = new SubFragment();
                //fragmentManager.beginTransaction().add(R.id.container, subFragment).commit();
                fragmentManager.beginTransaction().replace(R.id.container, subFragment).commit();
            }
        });

    }*/

    private TabLayout tabs;
    private ViewPager pagers;

    private MyPagerAdapter myPagerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);
        tabs = findViewById(R.id.tabs);
        pagers = findViewById(R.id.pagers);

        myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());

        pagers.setAdapter(myPagerAdapter);

        // lien ket tablayout vs viewpager
        tabs.setupWithViewPager(pagers);

        //Viewpager va Tablayout


    }
}

