package com.lc.legendarycricket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

import java.io.ByteArrayOutputStream;

public class history extends AppCompatActivity {



    LinearLayout ClubBtn,history2;
    ConstraintLayout one,two,three,four,five;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);




        ClubBtn = findViewById(R.id.clubicon3);

        history2 = findViewById(R.id.player3);




        one = findViewById(R.id.test);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dataPass("The birth of cricket","The birth of cricket can be traced back to 16th-century England, where it emerged as a recreational pastime played in rural communities. Although the exact origins are somewhat uncertain, cricket gradually gained popularity and evolved into a recognized sport with formal rules.\n" +
                        "\n" +
                        "During the 17th century, cricket was primarily played by the English aristocracy and the upper classes. It was often associated with leisurely pursuits and was seen as a game that required skill, strategy, and good sportsmanship. Matches were played on village greens or open fields, with rudimentary equipment and rules that varied from one locality to another.\n" +
                        "\n" +
                        "One of the earliest recorded instances of cricket being played is a court case from 1598, which mentions a game of \"creckett\" played by schoolboys in Sussex. As the popularity of the sport grew, so did the need for standardization and organization.\n" +
                        "\n" +
                        "In the 18th century, cricket began to establish itself as a more formalized game. The influential Hambledon Club, founded in 1760 in Hampshire, played a significant role in shaping the sport. The club helped in developing and documenting a set of rules that aimed to regulate the game and ensure fairness.\n" +
                        "\n" +
                        "The evolution of cricket's rules and regulations continued with the establishment of the Marylebone Cricket Club (MCC) in 1787. The MCC became the custodian of cricket's laws and gradually took on the responsibility of maintaining the spirit and integrity of the game. Under the leadership of figures like Thomas Lord, the MCC introduced the first formalized laws in 1788. These laws laid the foundation for the modern game and have since undergone numerous amendments to adapt to changing times.\n" +
                        "\n" +
                        "As cricket gained popularity, it started to spread beyond England's borders. The sport found its way to other parts of the British Empire, including Australia, India, the West Indies, and South Africa. Each region developed its own cricketing culture, contributing to the diverse and vibrant nature of the sport.\n" +
                        "\n" +
                        "Today, cricket has evolved into a global phenomenon, capturing the hearts of millions across continents. From timeless Test matches to fast-paced limited-overs encounters, the sport continues to thrive, showcasing the skills of players and captivating audiences with its blend of tradition and innovation.\n" +
                        "\n" +
                        "The birth of cricket was a humble beginning, originating as a simple game played in English villages. However, through the efforts of enthusiasts, the establishment of rules, and the spread of the sport worldwide, cricket has grown into one of the most beloved and widely followed sports on the planet.",R.drawable.birthofcricket);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                about_club.imageView.setImageResource(R.drawable.sydney_thunder_banner);


                dataPass("Test Cricket and the Ashes","Test cricket and the Ashes hold a special place in the history of cricket, representing one of the most iconic and enduring rivalries in the sport. Let's explore the brief story of Test cricket and the Ashes:\n" +
                        "\n" +
                        "In 1877, the first-ever Test match was played between Australia and England at the Melbourne Cricket Ground (MCG). This marked the birth of Test cricket, the longest and most traditional format of the game. Test matches are played over five days, allowing for a comprehensive examination of players' skills, endurance, and mental fortitude.\n" +
                        "\n" +
                        "The term \"Test\" originated from the notion that these matches were seen as the ultimate examination of a player's abilities, testing their skills in various aspects of the game. As Test cricket gained prominence, it became the pinnacle of international cricket, with nations striving to achieve success in this format.\n" +
                        "\n" +
                        "The Ashes, one of cricket's most celebrated rivalries, emerged from the Test matches between Australia and England. In 1882, Australia defeated England for the first time on English soil at The Oval. Following the loss, an English newspaper published a mock obituary, stating that English cricket had died and that its ashes would be taken to Australia. Thus, the concept of the Ashes was born.\n" +
                        "\n" +
                        "The Ashes urn, a small trophy, became the symbol of the contest. It is believed to contain the remains of a burnt cricket bail. The urn is kept at the Marylebone Cricket Club (MCC) Museum at Lord's Cricket Ground in London.\n" +
                        "\n" +
                        "The Ashes series is played between England and Australia, alternating between the two countries. It represents a fierce battle for cricketing supremacy and pride. The series is played over several Test matches, with the team that wins or retains the Ashes determined by their performance throughout the series.\n" +
                        "\n" +
                        "Over the years, the Ashes has witnessed some extraordinary cricketing moments and fierce rivalries. Legendary players like Sir Donald Bradman, Sir Ian Botham, Shane Warne, and Andrew Flintoff have left an indelible mark on the Ashes history with their exceptional performances.",R.drawable.testgame);


            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dataPass("The Rise of T20 Cricket","T20 (Twenty20) cricket has had a profound impact on international cricket and has garnered immense popularity among fans worldwide. The International Cricket Council (ICC), as the governing body of cricket, has played a crucial role in the development and promotion of T20 cricket on the global stage. Let's explore the brief story of T20 cricket and its relationship with the ICC:\n" +
                        "\n" +
                        "Introduction of T20 Cricket:\n" +
                        "The concept of T20 cricket was first introduced in 2003 with the creation of the Twenty20 Cup in England.\n" +
                        "The format aimed to provide a shorter and more action-packed version of the game, appealing to a broader audience and attracting new fans.\n" +
                        "T20 cricket quickly gained traction and emerged as a dynamic and entertaining format, characterized by fast-paced matches played over 20 overs per side.\n" +
                        "Recognition and Global Expansion:\n" +
                        "Recognizing the potential of T20 cricket, the ICC took steps to promote and integrate the format into the international cricket calendar.\n" +
                        "In 2007, the ICC organized the inaugural T20 World Cup in South Africa, which witnessed thrilling matches and unexpected results.\n" +
                        "The success of the tournament led to the formal recognition and acceptance of T20 cricket as an official format by the ICC.\n" +
                        "Establishment of T20 International Matches:\n" +
                        "Following the success of the T20 World Cup, the ICC introduced T20 International matches, allowing national teams to compete in this format.\n" +
                        "T20 International matches provided teams with additional opportunities to showcase their skills and engage with fans.\n" +
                        "The ICC created a ranking system for T20 International cricket, further enhancing the competitiveness and significance of T20 matches.\n" +
                        "Development of T20 Leagues:\n" +
                        "The emergence of domestic T20 leagues around the world, such as the Indian Premier League (IPL), prompted the ICC to establish guidelines and regulations for these tournaments.\n" +
                        "The ICC worked closely with member boards to ensure that T20 leagues adhered to certain standards, including player contracts, anti-corruption measures, and player release policies.\n" +
                        "T20 World Cup:\n" +
                        "The ICC organizes the T20 World Cup every four years, providing a global platform for teams to compete in the T20 format.\n" +
                        "The tournament showcases the best players and teams from around the world, generating immense excitement and global viewership.\n" +
                        "The T20 World Cup has witnessed thrilling matches, remarkable performances, and upsets, cementing its status as a marquee event in the cricketing calendar.\n" +
                        "Growth and Popularity:\n" +
                        "T20 cricket has witnessed exponential growth and popularity, attracting large crowds, sponsors, and broadcasters.\n" +
                        "The format has revolutionized the game, with its fast-paced action, explosive batting, and nail-biting finishes capturing the attention of fans across all age groups.\n" +
                        "The ICC continues to promote and support T20 cricket, recognizing its significance in the overall development and globalization of the sport.",R.drawable.t20gameagain);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                about_club.imageView.setImageResource(R.drawable.sydney_thunder_banner);


                dataPass("The Rise of ODI Cricket","ODI (One Day International) cricket, a format known for its excitement and fast-paced action, has played a significant role in transforming the landscape of international cricket. Let's explore the brief story of ODI cricket:\n" +
                        "\n" +
                        "The concept of limited-overs cricket was introduced in the 1960s as a means to create a shorter and more spectator-friendly version of the game. The first official One Day International took place on 5th January 1971 between Australia and England at the Melbourne Cricket Ground (MCG). This marked the beginning of a new era in cricket.\n" +
                        "\n" +
                        "The ODI format offered a condensed version of the game, played in a single day, with each team batting for a limited number of overs. The initial matches were played over 60 overs per side but were later reduced to 50 overs, which became the standard.\n" +
                        "\n" +
                        "The introduction of colored clothing, white cricket balls, and floodlights added a vibrant and dynamic element to ODI cricket, captivating audiences worldwide. This format allowed for more aggressive and attacking play, leading to the evolution of new strategies and techniques.\n" +
                        "\n" +
                        "The first Cricket World Cup was held in 1975 in England, providing a platform for teams to compete in ODI cricket on a global scale. The tournament garnered immense popularity and showcased the intense competition among cricketing nations. The West Indies emerged as the champions, setting the stage for future editions of the World Cup.\n" +
                        "\n" +
                        "ODI cricket continued to gain momentum throughout the years, captivating fans with its thrilling encounters, close finishes, and memorable performances. The limited-overs format became a breeding ground for innovation, with players like Vivian Richards, Sachin Tendulkar, and AB de Villiers pushing the boundaries of what was considered possible in the game.\n" +
                        "\n" +
                        "As the popularity of ODI cricket soared, several iconic moments etched themselves into cricketing folklore. From the tied semi-final between Australia and South Africa in the 1999 World Cup to India's dramatic victory in the 2011 final on home soil, ODI cricket has produced countless unforgettable moments.\n" +
                        "\n" +
                        "With the rise of T20 cricket in the 2000s, the ODI format faced competition but managed to retain its significance. The International Cricket Council (ICC) introduced bilateral ODI series and continued organizing the Cricket World Cup, ensuring that this format continued to thrive.\n" +
                        "\n" +
                        "Today, ODI cricket remains an integral part of the international cricket calendar. It provides a platform for teams to showcase their skills, compete for prestigious trophies, and entertain fans with its mix of power-hitting, skilled bowling, and strategic gameplay.\n" +
                        "\n" +
                        "In conclusion, ODI cricket revolutionized the game, offering a shorter and more dynamic format that captivated audiences worldwide. The format's evolution, the staging of Cricket World Cups, and the countless memorable moments have cemented ODI cricket's status as a cherished and iconic part of the cricketing landscape.",R.drawable.wcup);


            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataPass("International Cricket Council","T20 (Twenty20) cricket has had a profound impact on international cricket and has garnered immense popularity among fans worldwide. The International Cricket Council (ICC), as the governing body of cricket, has played a crucial role in the development and promotion of T20 cricket on the global stage. Let's explore the brief story of T20 cricket and its relationship with the ICC:\n" +
                        "\n" +
                        "Introduction of T20 Cricket:\n" +
                        "The concept of T20 cricket was first introduced in 2003 with the creation of the Twenty20 Cup in England.\n" +
                        "The format aimed to provide a shorter and more action-packed version of the game, appealing to a broader audience and attracting new fans.\n" +
                        "T20 cricket quickly gained traction and emerged as a dynamic and entertaining format, characterized by fast-paced matches played over 20 overs per side.\n" +
                        "Recognition and Global Expansion:\n" +
                        "Recognizing the potential of T20 cricket, the ICC took steps to promote and integrate the format into the international cricket calendar.\n" +
                        "In 2007, the ICC organized the inaugural T20 World Cup in South Africa, which witnessed thrilling matches and unexpected results.\n" +
                        "The success of the tournament led to the formal recognition and acceptance of T20 cricket as an official format by the ICC.\n" +
                        "Establishment of T20 International Matches:\n" +
                        "Following the success of the T20 World Cup, the ICC introduced T20 International matches, allowing national teams to compete in this format.\n" +
                        "T20 International matches provided teams with additional opportunities to showcase their skills and engage with fans.\n" +
                        "The ICC created a ranking system for T20 International cricket, further enhancing the competitiveness and significance of T20 matches.\n" +
                        "Development of T20 Leagues:\n" +
                        "The emergence of domestic T20 leagues around the world, such as the Indian Premier League (IPL), prompted the ICC to establish guidelines and regulations for these tournaments.\n" +
                        "The ICC worked closely with member boards to ensure that T20 leagues adhered to certain standards, including player contracts, anti-corruption measures, and player release policies.\n" +
                        "T20 World Cup:\n" +
                        "The ICC organizes the T20 World Cup every four years, providing a global platform for teams to compete in the T20 format.\n" +
                        "The tournament showcases the best players and teams from around the world, generating immense excitement and global viewership.\n" +
                        "The T20 World Cup has witnessed thrilling matches, remarkable performances, and upsets, cementing its status as a marquee event in the cricketing calendar.\n" +
                        "Growth and Popularity:\n" +
                        "T20 cricket has witnessed exponential growth and popularity, attracting large crowds, sponsors, and broadcasters.\n" +
                        "The format has revolutionized the game, with its fast-paced action, explosive batting, and nail-biting finishes capturing the attention of fans across all age groups.\n" +
                        "The ICC continues to promote and support T20 cricket, recognizing its significance in the overall development and globalization of the sport.\n" +
                        "In conclusion, T20 cricket's rise to prominence and its integration into the international cricket landscape can be attributed to the efforts of the ICC. Through the establishment of T20 International matches, the organization of the T20 World Cup, and the regulation of domestic T20 leagues, the ICC has played a vital role in nurturing and promoting T20 cricket as an exciting and globally embraced format of the game.",R.drawable.icc);
            }
        });


        //----------------------Activity Switch---------------
        ClubBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(history.this, club.class);
                startActivity(intent);
                Animatoo.INSTANCE.animateSlideRight(history.this);
                finish();
            }
        });

        history2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(history.this, deshboard.class);
                startActivity(intent);
                Animatoo.INSTANCE.animateSlideRight(history.this);
                finish();
            }
        });




    }

    private void dataPass(String name, String details, int drawable) {
        Intent intent = new Intent(history.this,historydetails.class);

        Bitmap bitmap = BitmapFactory.decodeResource
                (getResources(), drawable); // your bitmap
        ByteArrayOutputStream bs = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 50, bs);

        intent.putExtra("byteArray", bs.toByteArray());

        intent.putExtra("name", name);
        intent.putExtra("details", details);

        startActivity(intent);

        Animatoo.INSTANCE.animateSwipeRight(history.this);
    }

}