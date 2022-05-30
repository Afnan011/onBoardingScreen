package dev.afnan.onboardingscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Adapter;

import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

public class slideActivity extends AppCompatActivity {

    WormDotsIndicator wormDotsIndicator;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);

//        wormDotsIndicator = (WormDotsIndicator) findViewById(R.id.worm_dots_indicator);
//        viewPager = (ViewPager) findViewById(R.id.view_pager);
//        adapter = new ViewPagerAdapter();
//        viewPager.setAdapter(adapter);
//        wormDotsIndicator.setViewPager(viewPager);

    }
}