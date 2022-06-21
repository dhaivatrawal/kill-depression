package com.zedr.dhaivat.killdepression;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    CardView clkone,clktwo,clkthree,clkfour,clkfive,clksix,clkseven;
    ImageView share,rateMe,moreapps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clkone = findViewById(R.id.cdone);
        clktwo = findViewById(R.id.cdtwo);
        clkthree = findViewById(R.id.cdthree);
        clkfour = findViewById(R.id.cdfour);
        clkfive = findViewById(R.id.cdfive);
        clksix = findViewById(R.id.cdsix);
        clkseven = findViewById(R.id.cdseven);


        clkone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),One.class);
                startActivity(intent);
            }
        });

        clktwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Two.class);
                startActivity(intent);
            }
        });
        clkthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Three.class);
                startActivity(intent);
            }
        });
        clkfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Four.class);
                startActivity(intent);
            }
        });
        clkfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Five.class);
                startActivity(intent);
            }
        });
        clksix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Six.class);
                startActivity(intent);
            }
        });
        clkseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Seven.class);
                startActivity(intent);
            }
        });

        ImageView share=findViewById(R.id.share);
        ImageView rateMe=findViewById(R.id.rateMe);
        ImageView moreapps=findViewById(R.id.moreapps);

        rateMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Intent.ACTION_SEND);
                final  String appPackageNAm = getApplicationContext().getPackageName();
                String strAppLink ="";
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("market://details?id=" + appPackageNAm)));
                } catch (android.content.ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://play.google.com/store/apps/details?id=" + appPackageNAm)));
                }
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Intent.ACTION_SEND);
                final  String appPackageNAme = getApplicationContext().getPackageName();
                String strAppLink ="";

                try
                {
                    strAppLink = "http://play.google.com/store/apps/details?id=" + appPackageNAme;
                }
                catch (android.content.ActivityNotFoundException anfe)
                {
                    strAppLink = "https:/play.google.com/store/apps/details?id=" + appPackageNAme;
                }
                a.setType("text/link");
                String sharebody = "Hey You ?\n" +
                        "Are you Depressed?\n" +
                        "Want to get out of Depression?\n" +
                        "Here is an Application that gives a solution to your Depression.\n\n"+"-Different types of Depression\n"+"-Symptoms of Depression\n"+"-Causes and Risk factors\n"+"-Diagnosis\n"+"-Treatments\n"+"-ADA and your Rights\n"+"-Depression in Kids\n\n" +
                        " Please Comment and Rate Us." + "Download this Exclusive application and Share it." + "\n\n"+""+strAppLink;
                String sharesub = "APP NAME ";
                a.putExtra(Intent.EXTRA_SUBJECT,sharesub);
                a.putExtra(Intent.EXTRA_TEXT,sharebody);
                startActivity(Intent.createChooser(a,"Share Using"));
            }

        });

        moreapps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String play = "https://play.google.com/store/apps/collection/cluster?clp=igM4ChkKEzgwMjI3ODMwODE5MjM0NDY3NTcQCBgDEhkKEzgwMjI3ODMwODE5MjM0NDY3NTcQCBgDGAA%3D:S:ANO1ljKP1O8&gsr=CjuKAzgKGQoTODAyMjc4MzA4MTkyMzQ0Njc1NxAIGAMSGQoTODAyMjc4MzA4MTkyMzQ0Njc1NxAIGAMYAA%3D%3D:S:ANO1ljLhPUE&hl=en";
                Intent isl =new Intent(Intent.ACTION_VIEW,Uri.parse(play));
                startActivity(isl);
            }
        });

    }
}
