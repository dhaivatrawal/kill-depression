package com.zedr.dhaivat.killdepression;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Five extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<Club> clubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.five);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapterFive adapter = new RecyclerViewAdapterFive(clubs);

        initializeData();
        initializeAdapter();
    }

    private void initializeAdapter() {

        RecyclerViewAdapterFive adapter = new RecyclerViewAdapterFive(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<>();
        clubs.add(new Five.Club("Treatments for Depression","Depression is treatable and most people see improvements in their symptoms when treated with medication, psychotherapy, or a combination of the two.\n" +
                "\n" +
                "But treatment should be individualized. What works for one person might not necessarily work for another. It's important to talk to your physician and treatment team about which options may be most effective in reducing your depression."));
        clubs.add(new Five.Club("7 Types of Psychotherapy That Are Effective for Depression","The word \"therapy\" is used to describe many different types of treatments. Psychotherapists often use a specific type of therapy to treat depression. Some of them use an eclectic approach, based on a client's treatment needs. \n" +
                "\n" +
                "While there are many different types of therapy, a 2013 study examined which therapies are most effective for depression. Researchers found that the following therapies were equally effective in reducing depression.\n" +
                "\n" +
                "Interpersonal therapy is relatively short in duration. Sessions are highly structured. It's based on the idea that your relationships are at the forefront of depression. The goal of treatment is to help patients improve skills, such as communication skills and conflict-resolution skills. \n" +
                "Cognitive behavioral therapy focuses on helping people identify and replace cognitive distortions and behavioral patterns that reinforce depressive feelings. It is usually short-term and it focuses on present problems and skills teaching. \n" +
                "Social skills therapy teaches patients how to establish healthy relationships. The goal is for patients to improve communication and learn how to build a strong social network with individuals based on honesty and respect. \n" +
                "Psychodynamic therapy is often featured in movies or pop culture. It involves helping patients explore their unconscious and unhealed emotional wounds from the past. The goal is to help people learn how their depression is related to past experiences and unresolved conflicts. The therapist helps patients address those issues so they can move forward in a productive manner. \n" +
                "Supportive counseling is unstructured and focuses on listening to the patient. Patients are invited to address whatever issues they want to talk about and the therapist uses empathy to provide understanding and support.\n" +
                "Behavioral activation raises awareness of pleasant activities. The therapist seeks to increase positive interactions between the patient and the environment. By getting active and engaging in more pleasurable activities, symptoms of depression may be reduced.\n" +
                "Problem-solving therapy aims to define a patient's problems. Then, multiple solutions are offered. The therapist helps the patient evaluate options and choose a solution."));
        clubs.add(new Five.Club("Family or Couple Therapy","Family or couple therapy may be considered when depression affects others in the household. Therapy that involves other family members focuses on the interpersonal relationships.\n" +
                "\n" +
                "\n" +
                "The roles played by various family members in a patient's depression may be examined. Education about depression in a general way may also be a part of family therapy."));
        clubs.add(new Five.Club("Hospitalization","Hospitalization may become necessary when it is deemed that a patient has become a danger to himself or others. A patient who is seriously considering suicide, for example, may require inpatient hospitalization.\n" +
                "\n" +
                "\n" +
                "Hospitalization may involve individual therapy, family therapy, and group therapy. A patient may also be prescribed medication. Once a patient is safe to leave the hospital, an intensive outpatient program, such as a partial hospital may be recommended. These services take place for several hours each day to help support a person's recovery from their depression. "));
        clubs.add(new Five.Club("Medications","There are many different medications that can help reduce the symptoms of depression.\n" +
                "\n" +
                "Most studies have found medication is most effective when it is used in conjunction with therapy.\n" +
                "\n" +
                "Here are some classes of medication that are commonly used to treat depression: \n" +
                "\n" +
                "Tricyclic antidepressants (TCAs) — were among the first developed antidepressants. They have more side effects than newer antidepressants but can be more effective for certain patients. These include Elavil (amitriptyline), Tofranil (imipramine) and Pamelor (nortriptyline). \n" +
                "Monoamine oxidase inhibitors (MAOIs) — are another older type of antidepressant. If you are taking an MAOI, you will have to follow certain dietary restrictions to prevent a reaction that can cause high blood pressure. You will also have to be careful about interactions with certain other medications. Like tricyclics, these are not generally used first line, but can sometimes be helpful for more difficult to treat depressions. MAOIs include Marplan (isocarboxazid), Nardil (phenelzine) and Parnate (tranylcypromine).\n" +
                "Selective serotonin reuptake inhibitors (SSRIs) — are the most commonly prescribed medication for depression today. Prozac (fluoxetine), Paxil (paroxetine), Zoloft (sertraline) Celexa (citalopram) and Luvox (fluvoxamine) are commonly prescribed brand names. Compared to other antidepressant types, SSRIs tend to have fewer side effects. SSRIs should not be prescribed in conjunction with the older MAOIs due to the potential for a dangerously high level of serotonin to build up, which can cause serotonin syndrome. \n" +
                "Serotonin and norepinephrine reuptake inhibitors (SNRIs) — are a newer type of antidepressant that works similarly to SSRIs only they also block the reuptake of norepinephrine along with serotonin. Common medications in this class are Effexor (venlafaxine), Cymbalta (duloxetine) and Pristiq (deslavenfaxine).\n" +
                "Norepinephrine and dopamine reuptake inhibitors (NDRIs) — Wellbutrin (bupropion) is in a class all by itself. Wellbutrin is less likely to have the sexual side effects that are common in the other antidepressants.\n" +
                "Esketamine — Sold under the brand name Spravato, esketamine was FDA approved in March 2019. It is approved for adults with treatment-resistant depression, meaning other medication options have not worked for them, and needs to be prescribed together with an oral antidepressant. The medication itself is a nasal spray that works quickly in the body—within hours, compared to the weeks or months other medications take to work. However, there are risks associated with it. Esketamine is a variant of the hallucinogenic drug ketamine and may cause sedation and out-of-body experiences. Patients receiving the drug are monitored for several hours after taking it, and can only receive the drug at a certified location."));
        clubs.add(new Five.Club("Self-Help Strategies","Self-help methods for the treatment of depression may be helpful for someone who is unable to access professional resources or to someone with mild symptoms. Self-help strategies may include the following:\n" +
                "\n" +
                "Support groups — They allow you to talk to other people who can relate to the issues and symptoms you are experiencing. Many people report support groups to reassure them that they're not alone and provide them with ideas and resources.\n" +
                "Online resources — There are many websites, newsletters, and online programs that specifically help people with depression. \n" +
                "Self-help books — Books can offer many of the same skills that people gain in therapy but it requires readers to be able to apply the information to their own lives. Many self-help books are available for free through local libraries."));

    }

    class Club {

        String nameone,nametwo;
        public Club(String nameone, String nametwo) {


            this.nameone=nameone;
            this.nametwo=nametwo;

        }
    }


}
