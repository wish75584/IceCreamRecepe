package com.stubborn.icecreamrecepe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView one, two, three, four, five, six, seven, eight, nine,
            ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen,
            seventeen, eighteen, nineteen, twenty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        ten = findViewById(R.id.ten);
        eleven = findViewById(R.id.eleven);
        twelve = findViewById(R.id.twelve);
        thirteen = findViewById(R.id.thirteen);
        fourteen = findViewById(R.id.fourteen);
        fifteen = findViewById(R.id.fifteen);
        sixteen = findViewById(R.id.sixteen);
        seventeen = findViewById(R.id.seventeen);
        eighteen = findViewById(R.id.eighteen);
        nineteen = findViewById(R.id.nineteen);
        twenty = findViewById(R.id.twenty);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        ten.setOnClickListener(this);
        eleven.setOnClickListener(this);
        twelve.setOnClickListener(this);
        thirteen.setOnClickListener(this);
        fourteen.setOnClickListener(this);
        fifteen.setOnClickListener(this);
        sixteen.setOnClickListener(this);
        seventeen.setOnClickListener(this);
        eighteen.setOnClickListener(this);
        nineteen.setOnClickListener(this);
        twenty.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == one) {
            Intent intent = new Intent(MainActivity.this, rcpOne.class);
            startActivity(intent);
        }
        if (v == two) {
            Intent intent = new Intent(MainActivity.this, rcpTwo.class);
            startActivity(intent);
        } if (v == three) {
            Intent intent = new Intent(MainActivity.this, rcpThree.class);
            startActivity(intent);
        } if (v == four) {
            Intent intent = new Intent(MainActivity.this, rcpFour.class);
            startActivity(intent);
        } if (v == five) {
            Intent intent = new Intent(MainActivity.this, rcpFive.class);
            startActivity(intent);
        } if (v == six) {
            Intent intent = new Intent(MainActivity.this, rcpSix.class);
            startActivity(intent);
        } if (v == seven) {
            Intent intent = new Intent(MainActivity.this, rcpSeven.class);
            startActivity(intent);
        } if (v == eight) {
            Intent intent = new Intent(MainActivity.this, rcpEight.class);
            startActivity(intent);
        } if (v == nine) {
            Intent intent = new Intent(MainActivity.this, rcpNine.class);
            startActivity(intent);
        } if (v == ten) {
            Intent intent = new Intent(MainActivity.this, rcpTen.class);
            startActivity(intent);
        } if (v == eleven) {
            Intent intent = new Intent(MainActivity.this, rcpEleven.class);
            startActivity(intent);
        } if (v == twelve) {
            Intent intent = new Intent(MainActivity.this, rcpTwelve.class);
            startActivity(intent);
        } if (v == thirteen) {
            Intent intent = new Intent(MainActivity.this, rcpThirteen.class);
            startActivity(intent);
        } if (v == fourteen) {
            Intent intent = new Intent(MainActivity.this, rcpFourteen.class);
            startActivity(intent);
        } if (v == fifteen) {
            Intent intent = new Intent(MainActivity.this, rcpFifteen.class);
            startActivity(intent);
        } if (v == sixteen) {
            Intent intent = new Intent(MainActivity.this, rcpSixteen.class);
            startActivity(intent);
        } if (v == seventeen) {
            Intent intent = new Intent(MainActivity.this, rcpSevventeen.class);
            startActivity(intent);
        } if (v == eighteen) {
            Intent intent = new Intent(MainActivity.this, rcpEighteen.class);
            startActivity(intent);
        } if (v == nineteen) {
            Intent intent = new Intent(MainActivity.this, rcpNineteen.class);
            startActivity(intent);
        } if (v == twenty) {
            Intent intent = new Intent(MainActivity.this, rcpTwenty.class);
            startActivity(intent);
        }
    }

}