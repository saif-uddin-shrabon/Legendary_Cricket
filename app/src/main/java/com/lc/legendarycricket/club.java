package com.lc.legendarycricket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

import java.io.ByteArrayOutputStream;

public class club extends AppCompatActivity {

    LinearLayout club,playerBtn,history2;
    ConstraintLayout mumbai,sydney,kolkata,rajasthan,comill,chennai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);

        club = findViewById(R.id.clubicon);
        playerBtn = findViewById(R.id.player);
        history2 = findViewById(R.id.historyclub);

        playerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(club.this,deshboard.class));
                Animatoo.INSTANCE.animateSlideLeft(club.this);
                finish();
            }
        });


        history2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(club.this, history.class);
                startActivity(intent);
                Animatoo.INSTANCE.animateSlideRight(club.this);
                finish();
            }
        });

        mumbai = findViewById(R.id.mumbai);
        sydney = findViewById(R.id.sydney);
        kolkata = findViewById(R.id.kolkata);
        rajasthan = findViewById(R.id.raj);
        comill = findViewById(R.id.comilla);
        chennai = findViewById(R.id.chennai);

        mumbai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dataPass("Mumbai Indian ","Mumbai Indians (MI) is a professional cricket team based in Mumbai, India. The team is one of the eight franchises that compete in the Indian Premier League (IPL), which is India's premier domestic Twenty20 cricket tournament. The Mumbai Indians are the most successful team in the history of the IPL, having won the championship a record five times.\n" +
                        "\n" +
                        "The franchise is owned by India's biggest conglomerate, Reliance Industries, and is captained by Rohit Sharma, an accomplished Indian cricketer. The team's home matches are played at the Wankhede Stadium in Mumbai, which has a capacity of around 33,000 spectators.\n" +
                        "\n" +
                        "Mumbai Indians have a strong fan base and enjoy tremendous support from cricket enthusiasts in Mumbai and across India. The team is known for its blue and gold team colors and the \"Duniya Hila Denge Hum\" (\"We'll Shake the World\") slogan, reflecting their ambition to dominate the IPL.\n" +
                        "\n" +
                        "Since the inception of the IPL in 2008, the Mumbai Indians have consistently been one of the most successful teams in the tournament. They won their first IPL title in 2013 under the captaincy of Rohit Sharma, and then followed it up with victories in 2015, 2017, 2019, and 2020. These achievements have firmly established them as a powerhouse in the league.\n" +
                        "\n" +
                        "The Mumbai Indians have assembled a formidable squad over the years, featuring both established international stars and promising domestic players. Some notable players who have represented the team include Sachin Tendulkar, Lasith Malinga, Kieron Pollard, Hardik Pandya, Jasprit Bumrah, and Quinton de Kock, among others.\n" +
                        "\n" +
                        "Under the leadership of Rohit Sharma and the coaching of Mahela Jayawardene, the Mumbai Indians have developed a winning culture and a reputation for nurturing young talent. They have a strong support staff, which includes experienced coaches, analysts, and trainers who play a crucial role in the team's success.\n" +
                        "\n" +
                        "Apart from their on-field accomplishments, the Mumbai Indians are also involved in various philanthropic initiatives and community development programs. They aim to contribute to the growth and development of cricket in Mumbai and provide opportunities to budding cricketers through their grassroots programs.\n" +
                        "\n" +
                        "Overall, the Mumbai Indians are a dominant force in the IPL, known for their consistent performance, strong team spirit, and ability to groom young talent. Their success and popularity have made them one of the most iconic and celebrated franchises in Indian cricket.",R.drawable.mmb_icon);
            }
        });
        sydney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                about_club.imageView.setImageResource(R.drawable.sydney_thunder_banner);


                dataPass("Sydney Thunder (Australia)","Sydney Thunder is a professional cricket team based in Sydney, Australia. The team is one of the eight founding members of the Big Bash League (BBL), which is Australia's premier domestic Twenty20 cricket competition. The Thunder represents the Sydney region and plays its home matches at the Sydney Showground Stadium.\n" +
                        "\n" +
                        "Since its establishment in 2011, the Sydney Thunder has become a prominent team in the BBL. The team's colors are green and black, and their logo features a thunderbolt. The Thunder has developed a strong following among cricket fans in Sydney and has gained recognition for its exciting style of play.\n" +
                        "\n" +
                        "The Sydney Thunder achieved their greatest success in the BBL during the 2015-2016 season when they won the championship. Led by captain Michael Hussey, the team had a remarkable campaign, defeating the Melbourne Stars in the final to claim their maiden title.\n" +
                        "\n" +
                        "The Thunder has featured a number of notable cricketers over the years, including international players like Shane Watson, Usman Khawaja, Jos Buttler, Pat Cummins, and Eoin Morgan. The team has also focused on nurturing young talent and has provided a platform for emerging Australian players to showcase their skills.\n" +
                        "\n" +
                        "The BBL is an annual tournament that takes place during the Australian summer, typically from December to February. The Sydney Thunder competes against seven other teams from various cities in Australia, including the Sydney Sixers, their cross-town rivals. Matches in the BBL are known for their festive atmosphere, with music, fireworks, and enthusiastic crowds adding to the entertainment value.\n" +
                        "\n" +
                        "Overall, the Sydney Thunder is a well-established and respected team in Australian cricket, known for its exciting brand of cricket and passionate fan base.",R.drawable.sydney_thunder_banner);


            }
        });
        kolkata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataPass("Kolkata Knight Riders","Kolkata Knight Riders (KKR) is a franchise cricket team that competes in the Indian Premier League (IPL). The team is based in Kolkata, the capital city of the Indian state of West Bengal. KKR was one of the original eight teams established when the IPL was formed in 2008.\n" +
                        "\n" +
                        "Ownership: Kolkata Knight Riders is jointly owned by Bollywood actor Shah Rukh Khan, actress Juhi Chawla, and her spouse Jay Mehta. The team is managed by the Red Chillies Entertainment, a company owned by Shah Rukh Khan.\n" +
                        "\n" +
                        "Team Colors and Logo: The team's primary colors are purple and gold. The logo of Kolkata Knight Riders features a blazing golden chakra with the team's name written in bold purple letters.\n" +
                        "\n" +
                        "Home Ground: KKR plays its home matches at the iconic Eden Gardens stadium in Kolkata, which is known for its passionate cricket atmosphere. The stadium has a seating capacity of over 66,000 spectators.\n" +
                        "\n" +
                        "Performance in IPL: Kolkata Knight Riders have had a mix of success and challenges in the IPL. In the early seasons, they struggled to make an impact. However, they won their first IPL title in 2012 under the captaincy of Gautam Gambhir. They repeated their success in 2014, winning their second IPL championship.\n" +
                        "\n" +
                        "Captaincy and Key Players: Over the years, KKR has seen different players taking up the role of captain. Initially, Sourav Ganguly led the team in the first three seasons. Subsequently, Gautam Gambhir took over and led the team to their two title wins. In recent years, Dinesh Karthik and Eoin Morgan have captained the team. KKR has had several notable players in their squad, including Andre Russell, Sunil Narine, Shubman Gill, and Pat Cummins.\n" +
                        "\n" +
                        "Team Spirit and Fanbase: Kolkata Knight Riders enjoy immense popularity and have a passionate fanbase, often referred to as the \"KKR Army.\" The team's matches are known for their vibrant atmosphere, with fans displaying their loyalty by donning the team colors and chanting slogans. The team's association with Bollywood superstar Shah Rukh Khan has also contributed to its massive fan following.\n" +
                        "\n" +
                        "Off-field Initiatives: Kolkata Knight Riders have been actively involved in social initiatives. Their \"Knight Riders Foundation\" focuses on various philanthropic activities, including supporting child health and education programs.\n" +
                        "\n" +
                        "The Kolkata Knight Riders franchise continues to be a prominent presence in the IPL, captivating cricket fans with their performances, star-studded lineup, and the enthusiasm of their supporters.",R.drawable.kkr_icon);
            }
        });
        rajasthan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataPass("Rajasthan Royals","Rajasthan Royals is a professional cricket team based in Jaipur, Rajasthan, India. The team competes in the Indian Premier League (IPL), a premier Twenty20 cricket tournament in India. The franchise was one of the eight founding members of the IPL and played its first season in 2008.\n" +
                        "\n" +
                        "Ownership and Home Ground:\n" +
                        "The Rajasthan Royals franchise is owned by Royal Multisport Pvt. Ltd. The team's home ground is the Sawai Mansingh Stadium in Jaipur, which has a seating capacity of around 23,000 spectators. However, due to venue restrictions, the team has also played home matches in other stadiums like the Brabourne Stadium in Mumbai and the Sardar Patel Stadium in Ahmedabad.\n" +
                        "\n" +
                        "Team Color and Logo:\n" +
                        "The Rajasthan Royals team color is royal blue, and their logo features a lion with a golden mane, holding a bat with the text \"Rajasthan Royals\" written around it.\n" +
                        "\n" +
                        "IPL Success:\n" +
                        "In their inaugural season in 2008, under the captaincy of Shane Warne, the Rajasthan Royals surprised everyone by winning the IPL championship. It was a remarkable achievement as they were considered underdogs and had the smallest budget among all the teams. Their success was built on a team of young and relatively unknown players who performed exceptionally well throughout the tournament.\n" +
                        "\n" +
                        "However, since that inaugural triumph, the Rajasthan Royals have not been able to replicate the same level of success. They have made it to the playoffs on a few occasions but haven't managed to reach the final or win the championship again. The team has undergone several changes in ownership and leadership over the years.\n" +
                        "\n" +
                        "Notable Players:\n" +
                        "Over the years, Rajasthan Royals have had several notable players representing them. Some of the prominent players who have played for the team include Shane Warne, Rahul Dravid, Yusuf Pathan, Shane Watson, Ajinkya Rahane, Sanju Samson, Jos Buttler, and Jofra Archer.\n" +
                        "\n" +
                        "Team Philosophy and Approach:\n" +
                        "The Rajasthan Royals have often been associated with nurturing young talent and providing opportunities to relatively unknown players. They have placed an emphasis on building a strong team culture and focusing on the development of players. The team's approach has been to rely on a collective effort rather than relying heavily on individual star power.\n" +
                        "\n" +
                        "Community Engagement:\n" +
                        "The Rajasthan Royals have been involved in various community engagement initiatives. They have been actively promoting cricket at the grassroots level and have launched initiatives like the Rajasthan Royals Academy to identify and nurture young talent.\n" +
                        "\n" +
                        "In conclusion, the Rajasthan Royals is an IPL team known for their underdog victory in the inaugural season and their focus on nurturing young talent. While they have not enjoyed consistent success in recent years, the team continues to play an important role in the IPL and has a loyal fan base supporting them.",R.drawable.rcvb);
            }
        });
        comill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataPass("Comilla Victorians","The Comilla Victorians is a franchise cricket team that participated in the Bangladesh Premier League (BPL), which is the premier domestic Twenty20 cricket tournament in Bangladesh. However, please note that my knowledge is based on information available up until September 2021, and there may have been changes to the team since then.\n" +
                        "\n" +
                        "Ownership and Home Ground:\n" +
                        "The Comilla Victorians franchise was owned by Nafisa Kamal, the daughter of Mustafa Kamal, a former president of the International Cricket Council (ICC). The team represented the city of Comilla and played their home matches at the Zahur Ahmed Chowdhury Stadium in Chattogram, Bangladesh.\n" +
                        "\n" +
                        "Success in the BPL:\n" +
                        "The Comilla Victorians experienced significant success in the Bangladesh Premier League. They won the BPL championship twice, in the 2015-2016 and 2018-2019 seasons. In the 2015-2016 season, they were led by their captain Mashrafe Mortaza, and in the 2018-2019 season, they were led by Tamim Iqbal.\n" +
                        "\n" +
                        "Notable Players:\n" +
                        "Over the years, the Comilla Victorians had several notable players representing them in the BPL. Some prominent names associated with the team include Mashrafe Mortaza, Tamim Iqbal, Shoaib Malik, Imrul Kayes, Jos Buttler, Marlon Samuels, Andre Russell, and Dwayne Bravo.\n" +
                        "\n" +
                        "Team Culture and Approach:\n" +
                        "The Comilla Victorians focused on building a strong team culture and were known for their competitive approach in the BPL. They had a balanced squad with a mix of experienced domestic and international players. The team emphasized strategic planning and utilized a combination of local talent and international stars to achieve success.\n" +
                        "\n" +
                        "Unfortunately, since my knowledge is up to September 2021, I cannot provide the most recent updates regarding the Comilla Victorians, including their participation in the most recent BPL seasons. I recommend referring to the latest news and official sources for the most accurate and up-to-date information on the team.",R.drawable.cv_icon);
            }
        });
        chennai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataPass("Chennai Super Kings","The Chennai Super Kings is a franchise cricket team based in Chennai, Tamil Nadu, India. The team was founded in 2008 and has been a prominent participant in the Indian Premier League (IPL) since its inception. The team is owned by the India Cements, a leading cement manufacturing company.\n" +
                        "\n" +
                        "CSK is one of the most successful teams in the history of the IPL. They have consistently performed well and have a large and passionate fan base. The team is known for its strong on-field performances and consistent presence in the playoffs.\n" +
                        "\n" +
                        "Under the captaincy of Mahendra Singh Dhoni, CSK has won the IPL title three times (in 2010, 2011, and 2018). They have also reached the finals on four other occasions (in 2008, 2012, 2013, and 2015), showcasing their consistent excellence in the tournament.\n" +
                        "\n" +
                        "The team is recognized for its core group of players who have been associated with the franchise for several years, creating a sense of stability and familiarity. Apart from Dhoni, CSK has had players like Suresh Raina, Ravindra Jadeja, Dwayne Bravo, and Faf du Plessis, who have made significant contributions to the team's success.\n" +
                        "\n" +
                        "The home ground of the Chennai Super Kings is the M.A. Chidambaram Stadium, also known as Chepauk Stadium, in Chennai. The stadium has a rich cricketing history and holds a special place in the hearts of CSK fans.\n" +
                        "\n" +
                        "Overall, the Chennai Super Kings is considered one of the most successful and popular teams in the IPL, with a strong track record and a devoted fan following.",R.drawable.cs_icon);
            }
        });


    }

    private void dataPass(String name, String details, int drawable) {
        Intent intent = new Intent(club.this,about_club.class);

        Bitmap bitmap = BitmapFactory.decodeResource
                (getResources(), drawable); // your bitmap
        ByteArrayOutputStream bs = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 50, bs);

        intent.putExtra("byteArray", bs.toByteArray());

        intent.putExtra("name", name);
        intent.putExtra("details", details);

        startActivity(intent);
        Animatoo.INSTANCE.animateSwipeRight(club.this);
    }

}