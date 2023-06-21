package com.lc.legendarycricket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.LinearLayout;

import java.io.ByteArrayOutputStream;

public class deshboard extends AppCompatActivity {

    ConstraintLayout Sachin,Mashrafi,BrainLara,muttiah,shane,imran;
    LinearLayout ClubBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deshboard);

        Sachin = findViewById(R.id.sachintendulkar);
        Mashrafi = findViewById(R.id.mashrafi);
        BrainLara = findViewById(R.id.BrainLara);
        muttiah = findViewById(R.id.muttiahmuralitharan);
        shane = findViewById(R.id.shanewarne);
        imran = findViewById(R.id.imrankhan);
        ClubBtn = findViewById(R.id.Club);
        String bulletPoints = getString(R.string.bullet_points);


        Sachin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String playername =  "Sachin Tendulkar";
                String playerBigraphy = "Sachin Ramesh Tendulkar is a former Indian international cricketer who is widely regarded as one of the greatest batsmen of all time. He is the all-time leading run-scorer in both Test and ODI cricket. Tendulkar holds the record for the most centuries and half-centuries in both formats. \n" +
                        "Tendulkar was born on 24 April 1973 in Mumbai, India. He started playing cricket at a young age and was soon identified as a talented batsman. He made his Test debut for India in 1989 at the age of 16 years and 205 days, becoming the youngest player to play Test cricket for India.\n" +
                        "\n" +
                        "Tendulkar went on to have a long and illustrious career, playing 200 Test matches and 463 ODIs for India. He scored 15,921 runs in Test cricket and 18,426 runs in ODI cricket. He also scored 100 centuries in international cricket, a record that still stands today.\n" +
                        "\n" +
                        "Tendulkar retired from international cricket in 2013. He is now a successful businessman and philanthropist. He is also a member of the Rajya Sabha, the upper house of the Indian parliament.\n" +
                        "\n" +
                        "Tendulkar is a national icon in India and is widely respected for his achievements in cricket. He is known for his dedication to the game and his humility off the field. He is also an inspiration to many young cricketers around the world.";
                String totralRun = "18,426";
                String totalMatchPlayed = "500";
                String Testmatches = "200";
                String odi = "463";
                String t20matches = "1";
                String achivement = "\n" +
                        "Tendulkar was awarded the Bharat Ratna, India's highest civilian award, in 2014.\n" +
                        "He was inducted into the ICC Hall of Fame in 2009.\n" +
                        "He is the only player to have scored 100 centuries in international cricket.\n" +
                        "He is the only player to have scored more than 15,000 runs in Test cricket.";

                Bitmap bitmap = BitmapFactory.decodeResource
                        (getResources(), R.drawable.sachintend); // your bitmap
                ByteArrayOutputStream bs = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, bs);


                Intent intent = new Intent(deshboard.this, DetailsActivity.class);

                intent.putExtra("playername", playername);
                intent.putExtra("playerBigraphy", playerBigraphy);
                intent.putExtra("totralRun", totralRun);
                intent.putExtra("totalMatchPlayed", totalMatchPlayed);
                intent.putExtra("Testmatches", Testmatches);
                intent.putExtra("odi", odi);
                intent.putExtra("t20matches", t20matches);
                intent.putExtra("achivement", achivement);
                intent.putExtra("byteArray", bs.toByteArray());

                startActivity(intent);

            }
        });


        Mashrafi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String playername =  "Masrafi Bin Mortoza";
                String playerBigraphy = "Mashrafe Bin Mortaza (born 5 October 1983) is a Bangladeshi politician and former international cricketer who captained in all three formats of the game for the Bangladesh national cricket team and currently serves as a Member of Parliament of Narail-2 district. He is widely regarded as the greatest captain for Bangladesh in ODI and T20 formats of all time.\n" +
                        "Mortaza was born in the district of Narail in south-west Bangladesh. He enjoyed playing sports such as football and badminton from a young age, and sometimes went swimming in the nearby River Chitra instead of doing school work. He has been described as an open and animated character who enjoys motorcycling. He used to travel from a local bridge onto the tops of passing goods barges. He is very popular in his home town, leading to him being dubbed their \"Prince of Hearts\".\n" +
                        "Mortaza made his Test debut for Bangladesh in 2001, and his ODI debut in 2002. He quickly became one of the leading bowlers in the Bangladesh team, and was appointed captain in 2007. Under his leadership, Bangladesh reached the semi-finals of the 2007 Cricket World Cup, and the final of the 2009 ICC World Twenty20.\n" +
                        "Mortaza retired from international cricket in 2019, but continues to play domestic cricket for the Khulna Division. He is also a politician, and was elected to the Jatiya Sangsad in 2018.\n";
                String totralRun = "2,394";
                String totalMatchPlayed = "385";
                String Testmatches = "61";
                String odi = "203";
                String t20matches = "35";
                String achivement = "ICC ODI Cricketer of the Year (2008)\n" +
                        "ICC ODI Team of the Year (2008, 2009)\n" +
                        "Wisden Leading Cricketer in the World (2008)";

                Bitmap bitmap = BitmapFactory.decodeResource
                        (getResources(), R.drawable.mashrafemortaza); // your bitmap
                ByteArrayOutputStream bs = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, bs);


                Intent intent = new Intent(deshboard.this, DetailsActivity.class);

                intent.putExtra("playername", playername);
                intent.putExtra("playerBigraphy", playerBigraphy);
                intent.putExtra("totralRun", totralRun);
                intent.putExtra("totalMatchPlayed", totalMatchPlayed);
                intent.putExtra("Testmatches", Testmatches);
                intent.putExtra("odi", odi);
                intent.putExtra("t20matches", t20matches);
                intent.putExtra("achivement", achivement);
                intent.putExtra("byteArray", bs.toByteArray());

                startActivity(intent);
            }
        });

        BrainLara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String playername =  "Brian lara";
                String playerBigraphy = "Brian Charles Lara is a Trinidadian former international cricketer, widely acknowledged as one of the greatest batsmen of all time. He topped the Test batting rankings on several occasions and holds several cricketing records, including the record for the highest individual score in first-class cricket, with 501 not out for Warwickshire against Durham at Edgbaston in 1994, which is the only quintuple-hundred in first-class cricket history.\n" +
                        "Lara was born in Cantaro, Trinidad and Tobago, on May 2, 1969. He began playing cricket at a young age and showed great promise. He made his first-class debut for Trinidad and Tobago in 1988 and quickly established himself as one of the most talented batsmen in the world.\n" +
                        "Lara made his Test debut for West Indies in 1990 and scored 44 runs in his first innings. He went on to score centuries in his next two Test innings, cementing his place in the West Indies team.\n" +
                        "Lara's career reached its peak in the 1990s. He scored 375 runs against England in 1994, breaking the world record for the highest individual score in Test cricket. He also scored 501 not out against Durham in 1994, which is the only quintuple-hundred in first-class cricket history.\n" +
                        "Lara continued to score heavily in the 2000s. He scored 400 runs against England in 2004, breaking his own world record for the highest individual score in Test cricket. He also scored 10,000 runs in ODI cricket in 2004, becoming the first West Indian to do so.\n" +
                        "Lara retired from international cricket in 2007. He finished his career with 11,953 runs in Test cricket, 10,405 runs in ODI cricket, and 199 runs in T20I cricket. He is the only batsman to have scored more than 10,000 runs in both Test and ODI cricket.\n" +
                        "Lara is considered to be one of the greatest batsmen of all time. He is a legend of the game and his records are likely to stand for many years to come.\n";
                String totralRun = "22,358";
                String totalMatchPlayed = "131";
                String Testmatches = "131";
                String odi = "168";
                String t20matches = "1";
                String achivement = "Lara was awarded the Order of the British Empire (OBE) in 2002.\n" +
                        "He was inducted into the ICC Hall of Fame in 2010.\n" +
                        "He is the only player to have scored more than 400 runs in a Test innings.\n" +
                        "He is the only player to have scored more than 10,000 runs in ODI cricket.";

                Bitmap bitmap = BitmapFactory.decodeResource
                        (getResources(), R.drawable.brainlaralegands); // your bitmap
                ByteArrayOutputStream bs = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, bs);


                Intent intent = new Intent(deshboard.this, DetailsActivity.class);

                intent.putExtra("playername", playername);
                intent.putExtra("playerBigraphy", playerBigraphy);
                intent.putExtra("totralRun", totralRun);
                intent.putExtra("totalMatchPlayed", totalMatchPlayed);
                intent.putExtra("Testmatches", Testmatches);
                intent.putExtra("odi", odi);
                intent.putExtra("t20matches", t20matches);
                intent.putExtra("achivement", achivement);
                intent.putExtra("byteArray", bs.toByteArray());

                startActivity(intent);

            }
        });


        muttiah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String playername =  "Muttiah Muralitharan";
                String playerBigraphy = "Muttiah Muralitharan (born 17 April 1972) is a former Sri Lankan cricketer who is widely regarded as one of the greatest bowlers in the history of the game. He is the highest wicket-taker in Test cricket with 800 wickets, and the second-highest wicket-taker in One Day Internationals (ODIs) with 534 wickets\n" +
                        "Muralitharan was born in Kandy, Sri Lanka. He began playing cricket at a young age, and was selected for the Sri Lankan under-19 team in 1989. He made his Test debut for Sri Lanka in 1992, and quickly became one of the leading bowlers in the world. Muralitharan was known for his ability to spin the ball both ways, and his \"doosra\" delivery was considered to be one of the most difficult deliveries to face in cricket.\n" +
                        "Muralitharan retired from international cricket in 2011, but continues to play domestic cricket in Sri Lanka. He also works as a commentator and a coach. Muralitharan's achievements and awards include:\n";
                String totralRun = "6,806";
                String totalMatchPlayed = "133";
                String Testmatches = "133";
                String odi = "332";
                String t20matches = "0";
                String achivement = "World Cup winner (1996)\n" +
                        "Wisden Leading Cricketer in the World (1998)\n" +
                        "Sir Garfield Sobers Trophy (2002)\n" +
                        "ICC Cricketer of the 20th Century (2000)\n" +
                        "Order of Sri Lanka (2002)";

                Bitmap bitmap = BitmapFactory.decodeResource
                        (getResources(), R.drawable.muttiahmuralitharancov); // your bitmap
                ByteArrayOutputStream bs = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, bs);


                Intent intent = new Intent(deshboard.this, DetailsActivity.class);

                intent.putExtra("playername", playername);
                intent.putExtra("playerBigraphy", playerBigraphy);
                intent.putExtra("totralRun", totralRun);
                intent.putExtra("totalMatchPlayed", totalMatchPlayed);
                intent.putExtra("Testmatches", Testmatches);
                intent.putExtra("odi", odi);
                intent.putExtra("t20matches", t20matches);
                intent.putExtra("achivement", achivement);
                intent.putExtra("byteArray", bs.toByteArray());

                startActivity(intent);

            }
        });

        shane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String playername =  "Shane Warne";
                String playerBigraphy = "Shane Keith Warne AO (13 September 1969 – 4 March 2022) was an Australian international cricketer who played as a right-arm leg spin bowler and a right-handed batsman. Widely regarded as one of the greatest bowlers in the history of the sport, he made 145 Test appearances, taking 708 wickets, and set the record for the most wickets taken by any bowler in Test cricket, a record he held until 2007. Warne was a member of the Australian team that won the 1999 Cricket World Cup.\n" +
                        "Warne was born in Melbourne, Victoria, Australia. He began playing cricket at a young age, and was selected for the Australian under-19 team in 1988. He made his Test debut for Australia in 1992, and quickly became one of the leading bowlers in the world. Warne was known for his ability to turn the ball both ways, and his \"Ball of the Century\" to Mike Gatting in 1993 is considered to be one of the greatest deliveries in cricket history.\n" +
                        "Warne retired from international cricket in 2007, but continued to play domestic cricket in Australia and India. He also worked as a commentator and a coach. Warne died of a heart attack in Thailand in 2022, at the age of 52.\n";
                String totralRun = "3,154";
                String totalMatchPlayed = "154";
                String Testmatches = "145";
                String odi = "194";
                String t20matches = "0";
                String achivement = "World Cup winner (1999)\n" +
                        "Wisden Leading Cricketer in the World (1994, 1999)\n" +
                        "Australian of the Year (1994)\n" +
                        "Order of Australia (1999)\n" +
                        "Sir Donald Bradman Award (2000";

                Bitmap bitmap = BitmapFactory.decodeResource
                        (getResources(), R.drawable.shanewarnecover); // your bitmap
                ByteArrayOutputStream bs = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, bs);


                Intent intent = new Intent(deshboard.this, DetailsActivity.class);

                intent.putExtra("playername", playername);
                intent.putExtra("playerBigraphy", playerBigraphy);
                intent.putExtra("totralRun", totralRun);
                intent.putExtra("totalMatchPlayed", totalMatchPlayed);
                intent.putExtra("Testmatches", Testmatches);
                intent.putExtra("odi", odi);
                intent.putExtra("t20matches", t20matches);
                intent.putExtra("achivement", achivement);
                intent.putExtra("byteArray", bs.toByteArray());

                startActivity(intent);

            }
        });

        imran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String playername =  "Imran Khan";
                String playerBigraphy = "Imran Khan Niazi (Urdu: عمران احمد خان نیازی; born 5 October 1952) is a Pakistani politician, philanthropist, and former cricketer who served as the 22nd prime minister of Pakistan from August 2018 until April 2022. He is the founder and chairman of the political party Pakistan Tehreek-e-Insaf (PTI).\n" +
                        "Khan was born into a wealthy Pashtun family in Lahore, Pakistan. He was educated at elite schools in Pakistan and the United Kingdom, including the Royal Grammar School in Worcester and Aitchison College in Lahore. He began his international cricket career in a 1971 Test series against England.\n" +
                        "Khan was a flamboyant all-rounder who was known for his powerful batting and his ability to take wickets with his fast bowling. He was the captain of the Pakistan national cricket team from 1982 to 1992, and led them to victory in the 1992 Cricket World Cup.\n" +
                        "Despite the controversy, Khan remains a popular figure in Pakistan. He is seen by many as a charismatic leader who is not afraid to speak his mind. It remains to be seen whether he will be able to fulfill his promises and make a lasting impact on Pakistan.\n";
                String totralRun = "3,807";
                String totalMatchPlayed = "262";
                String Testmatches = "88";
                String odi = "174";
                String t20matches = "0";
                String achivement = "\n" +
                        "World Cup winner (1992)\n" +
                        "Wisden Leading Cricketer in the World (1982, 1983, 1992)\n" +
                        "BBC Sports Personality of the Year (1992)\n" +
                        "Nishan-e-Pakistan (1992)\n" +
                        "Hilal-e-Imtiaz (1993";

                Bitmap bitmap = BitmapFactory.decodeResource
                        (getResources(), R.drawable.imrankhan); // your bitmap
                ByteArrayOutputStream bs = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, bs);


                Intent intent = new Intent(deshboard.this, DetailsActivity.class);

                intent.putExtra("playername", playername);
                intent.putExtra("playerBigraphy", playerBigraphy);
                intent.putExtra("totralRun", totralRun);
                intent.putExtra("totalMatchPlayed", totalMatchPlayed);
                intent.putExtra("Testmatches", Testmatches);
                intent.putExtra("odi", odi);
                intent.putExtra("t20matches", t20matches);
                intent.putExtra("achivement", achivement);
                intent.putExtra("byteArray", bs.toByteArray());

                startActivity(intent);

            }
        });






        //----------------------Activity Switch---------------
        ClubBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });




    }


}