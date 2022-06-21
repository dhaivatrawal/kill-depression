package com.zedr.dhaivat.killdepression;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class One extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<Club> clubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapterOne adapter = new RecyclerViewAdapterOne(clubs);

        initializeData();
        initializeAdapter();
    }

    private void initializeAdapter() {

        RecyclerViewAdapterOne adapter = new RecyclerViewAdapterOne(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<>();
        clubs.add(new One.Club("Major Depressive Disorder (MDD)","When people use the term clinical depression, they are generally referring to major depressive disorder (MDD).\n Major depressive disorder is a mood disorder characterized by a number of key features:\n" +
                "\n" +
                "Depressed mood\n" +
                "Lack of interest in activities normally enjoyed\n" +
                "Changes in weight\n" +
                "Changes in sleep\n" +
                "Fatigue\n" +
                "Feelings of worthlessness and guilt\n" +
                "Difficulty concentrating\n" +
                "Thoughts of death and suicide\n" +
                "\nIf a person experiences the majority of these symptoms for longer than a two-week period, they will often be diagnosed with MDD."));
        clubs.add(new One.Club("Persistent Depressive Disorder (PDD)","Dysthymia, now known as persistent depressive disorder, refers to a type of chronic depression present for more days than not for at least two years. It can be mild, moderate, or severe.1\uFEFF\n" +
                "\n" +
                "People might experience brief periods of not feeling depressed, but this relief of symptoms lasts for two months or less. While the symptoms are not as severe as major depressive disorder, they are pervasive and long-lasting.\n" +
                "\n" +
                "PDD symptoms include:\n" +
                "\n" +
                "Feelings of sadness\n" +
                "Loss of interest and pleasure\n" +
                "Anger and irritability\n" +
                "Feelings of guilt\n" +
                "Low self-esteem\n" +
                "Difficulty falling or staying asleep\n" +
                "Sleeping too much\n" +
                "Feelings of hopelessness\n" +
                "Fatigue and lack of energy\n" +
                "Changes in appetite\n" +
                "Trouble concentrating\n" +
                "Treatment for persistent depressive disorder often involves the use of medications and psychotherapy. \n" +
                "\n" +
                "According to the National Institute of Mental Health, 1.5% of adults in the United States had persistent depressive disorder in the past year. The disorder affects women (1.9%) more than men (1%), and researchers estimate that around 1.3% of all U.S. adults will have the disorder at some point during their lives."));
        clubs.add(new One.Club("Bipolar Disorder","Bipolar disorder is a mood disorder characterized by periods of abnormally elevated mood known as mania. These periods can be mild (hypomania) or they can be so extreme as to cause marked impairment with a person's life, require hospitalization, or affect a person's sense of reality. The vast majority of those with bipolar disorder also have episodes of major depression.\n" +
                "\n" +
                "In addition to depressed mood and markedly diminished interest in activities, people with depression often have a range of physical and emotional symptoms which may include:\n" +
                "\n" +
                "\n" +
                "\n" +
                "Fatigue, insomnia, and lethargy\n" +
                "Unexplained aches, pains, and psychomotor agitation\n" +
                "Hopelessness and loss of self-esteem\n" +
                "Irritability and anxiety\n" +
                "Indecision and disorganization\n\n" +
                "The risk of suicide in bipolar illness is about 15 times greater than in the general population. Psychosis (including hallucinations and delusions) can also occur in more extreme cases."));
        clubs.add(new One.Club("Postpartum Depression (PPD)","Pregnancy can bring about significant hormonal shifts that can often affect a woman's moods. Depression can have its onset during pregnancy or following the birth of a child.\n" +
                "\n" +
                "Currently classified as depression with peripartum onset, postpartum depression (PPD) is more than that just the \"baby blues." +
                "Mood changes, anxiety, irritability, and other symptoms are not uncommon after giving birth and often last up to two weeks. PPD symptoms are more severe and longer-lasting.\n" +
                "\n" +
                "Such symptoms can include:\n" +
                "\n" +
                "Low mood, feelings of sadness\n" +
                "Severe mood swings\n" +
                "Social withdrawal\n" +
                "Trouble bonding with your baby\n" +
                "Appetite changes\n" +
                "Feeling helpless and hopeless\n" +
                "Loss of interest in things you used to enjoy\n" +
                "Feeling inadequate or worthless\n" +
                "Anxiety and panic attacks\n" +
                "Thoughts of hurting yourself or your baby\n" +
                "Thoughts of suicide\n" +
                "PPD can range from a persistent lethargy and sadness that requires medical treatment all the way up to postpartum psychosis, a condition in which the mood episode is accompanied by confusion, hallucinations, or delusions. \n" +
                "\n" +
                "If left untreated, the condition can last up to a year. Fortunately, research has found that treatments such as antidepressants, counseling, and hormone therapy can be effective."));
        clubs.add(new One.Club("Premenstrual Dysphoric Disorder (PMDD)","Among the most common symptoms of premenstrual syndrome (PMS) are irritability, fatigue, anxiety, moodiness, bloating, increased appetite, food cravings, aches, and breast tenderness." +
                "Premenstrual dysphoric disorder (PMDD) produces similar symptoms, but those related to mood are more pronounced.\n" +
                "\n" +
                "PMDD symptoms may include:\n" +
                "\n" +
                "Extreme fatigue\n" +
                "Feeling sad, hopeless, or self-critical\n" +
                "Severe feelings of stress or anxiety\n" +
                "Mood swings, often with bouts of crying\n" +
                "Irritability\n" +
                "Inability to concentrate \n" +
                "Food cravings or binging"));
        clubs.add(new One.Club("Seasonal Affective Disorder (SAD)","If you experience depression, sleepiness, and weight gain during the winter months but feel perfectly fine in spring, you may have a condition known as seasonal affective disorder (SAD), currently called major depressive disorder with seasonal pattern.\n" +
                "\n" +
                "SAD is believed to be triggered by a disturbance in the normal circadian rhythm of the body.\n" +
                "\n" +
                "Light entering through the eyes influences this rhythm, and any seasonal variation in night/day pattern can cause a disruption leading to depression.\n" +
                "\n" +
                "Prevalence rates for SAD can be difficult to pinpoint because the condition often goes undiagnosed and unreported. It is more common in areas further from the equator. For example, estimates suggest that SAD impacts 1% of the population of Florida; that number increases to 9% in Alaska.\n" +
                "\n" +
                "SAD is more common in far northern or far southern regions of the planet and can often be treated with light therapy to offset the seasonal loss the daylight."));
        clubs.add(new One.Club("Atypical Depression","Do you experience signs of depression (such as overeating, sleeping too much, or extreme sensitivity to rejection) but find yourself suddenly perking up in face of a positive event?\n" +
                "\n" +
                "Based on these symptoms, you may be diagnosed with atypical depression (current terminology refers to this as depressive disorder with atypical features), a type of depression that doesn't follow what was thought to be the \"typical\" presentation of the disorder. Atypical depression is characterized by a specific set of symptoms related to:" +
                "Excessive eating or weight gain\n" +
                "Excessive sleep\n" +
                "Fatigue, weakness, and feeling \"weighed down\"\n" +
                "Intense sensitivity to rejection\n" +
                "Strongly reactive moods\n" +
                "Atypical depression is actually more common than the name might imply. Unlike other forms of depression, people with atypical depression may respond better to a type of antidepressant known as a monoamine oxidase inhibitor (MAOI)."));
    }

    class Club {

        String nameone,nametwo;
        public Club(String nameone, String nametwo) {


            this.nameone=nameone;
            this.nametwo=nametwo;

        }
    }


}
