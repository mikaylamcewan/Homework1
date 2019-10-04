package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.LocalTime;
import android.view.View;


public class MainActivity extends AppCompatActivity {
public Button twelvehour;
public Button twentyfourhour;


    //Sydney
    public ConstraintLayout Syd;
    public TextView City1;
    public ImageView sydicon;
    public TextView sydtime;

    //Athens
    public ConstraintLayout Ath;
    public TextView City2;
    public ImageView athicon;
    public TextView athtime;

    //London
    public ConstraintLayout Lon;
    public TextView City3;
    public ImageView lonicon;
    public TextView lontime;

    //Singapore
    public ConstraintLayout Sin;
    public TextView City4;
    public ImageView sinicon;
    public TextView sintime;

    //Paris
    public ConstraintLayout Par;
    public TextView City5;
    public ImageView paricon;
    public TextView partime;

    //Barcelona
    public ConstraintLayout Bar;
    public TextView City6;
    public ImageView baricon;
    public TextView bartime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Syd = findViewById(R.id.times1);
        City1 = Syd.findViewById(R.id.textView2);
        City1.setText("SYDNEY");
        sydicon = Syd.findViewById(R.id.imageView2);
        sydicon.setImageResource(R.drawable.sydney);
        sydtime = Syd.findViewById(R.id.textView3);
        sydtime.setText(getting12time("Australia/Sydney"));

        Ath = findViewById(R.id.times2);
        City2 = Ath.findViewById(R.id.textView2);
        City2.setText("ATHENS");
        athicon = Ath.findViewById(R.id.imageView2);
        athicon.setImageResource(R.drawable.athens);
        athtime = Ath.findViewById(R.id.textView3);
        athtime.setText(getting12time("Europe/Athens"));

        Lon = findViewById(R.id.times3);
        City3 = Lon.findViewById(R.id.textView2);
        City3.setText("LONDON");
        lonicon = Lon.findViewById(R.id.imageView2);
        lonicon.setImageResource(R.drawable.london);
        lontime = Lon.findViewById(R.id.textView3);
        lontime.setText(getting12time("Europe/London"));

        Sin = findViewById(R.id.times4);
        City4 = Sin.findViewById(R.id.textView2);
        City4.setText("SINGAPORE");
        sinicon = Sin.findViewById(R.id.imageView2);
        sinicon.setImageResource(R.drawable.singapore);
        sintime = Sin.findViewById(R.id.textView3);
        sintime.setText(getting12time("Singapore"));

        Par = findViewById(R.id.times5);
        City5 = Par.findViewById(R.id.textView2);
        City5.setText("PARIS");
        paricon = Par.findViewById(R.id.imageView2);
        paricon.setImageResource(R.drawable.paris);
        partime = Par.findViewById(R.id.textView3);
        partime.setText(getting12time("Europe/Paris"));

        Bar = findViewById(R.id.times6);
        City5 = Bar.findViewById(R.id.textView2);
        City5.setText("BARCELONA");
        baricon = Bar.findViewById(R.id.imageView2);
        baricon.setImageResource(R.drawable.barcelona);
        bartime = Bar.findViewById(R.id.textView3);
        bartime.setText(getting12time("Europe/Zagreb"));


    }
    //get 12 hour time
    public  String getting12time(String timeZone){
        ZoneId zonelocation = ZoneId.of(timeZone);
        LocalTime localTime = LocalTime.now(zonelocation);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        String twelvetime = localTime.format(formatter);
        return twelvetime;
    }
    //getting refreshed 12 hour time
    public void twelve(View view){
        sydtime.setText(getting12time("Australia/Sydney"));
        athtime.setText(getting12time("Europe/Athens"));
        lontime.setText(getting12time("Europe/London"));
        sintime.setText(getting12time("Singapore"));
        partime.setText(getting12time("Europe/Paris"));
        bartime.setText(getting12time("Europe/Zagreb"));
    }
    //get 24 hour time
    public  String getting24Time(String timeZone) {
        ZoneId zonelocation = ZoneId.of(timeZone);
        LocalTime localTime=LocalTime.now(zonelocation);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HHmm");
        String twentyfourtime=localTime.format(formatter);
        return twentyfourtime;
    }

    //getting refreshed 24 hour time
    public void twentyfour(View view){
        sydtime.setText(getting24Time("Australia/Sydney"));
        athtime.setText(getting24Time("Europe/Athens"));
        lontime.setText(getting24Time("Europe/London"));
        sintime.setText(getting24Time("Singapore"));
        partime.setText(getting24Time("Europe/Paris"));
        bartime.setText(getting24Time("Europe/Zagreb"));
    }


}
