package com.lc.legendarycricket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

import java.io.ByteArrayOutputStream;

public class history extends AppCompatActivity {


    LinearLayout club,playerBtn;
    ConstraintLayout one,two,three,four,five;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);


        club = findViewById(R.id.clubicon);
        playerBtn = findViewById(R.id.player);

        playerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(history.this,deshboard.class));
                Animatoo.INSTANCE.animateSlideLeft(history.this);
                finish();
            }
        });

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
        four.setOnClickListener(new View.OnClickListener() {
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