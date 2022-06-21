package com.zedr.dhaivat.killdepression;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Two extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<Club> clubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapterTwo adapter = new RecyclerViewAdapterTwo(clubs);

        initializeData();
        initializeAdapter();
    }

    private void initializeAdapter() {

        RecyclerViewAdapterTwo adapter = new RecyclerViewAdapterTwo(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<>();
        clubs.add(new Two.Club("Signs & Symptoms","The DSM-5 recognizes several different types of depressive disorders. The two most common types include major depressive disorder (MDD) and persistent depressive disorder (PDD).\n" +
                "\n" +
                "If you recognize signs that you or someone you may know be depressed, professional help may be warranted. Depression is very treatable with medication, talk therapy, or a combination of the two playing an instrumental role in reducing the following depressive symptoms."));
        clubs.add(new Two.Club("Low Mood","Depressed mood is consistent with both major depression and persistent depressive disorder. In major depression, a person must feel depressed most of the day, nearly every day, as indicated by either subjective report or observations made by others. Children or adolescents, on the other hand, may appear more irritable than sad." +
                "A person with a depressed mood may report feeling \"sad\" or \"empty,\" or may cry frequently. Having a low mood is one of the two core symptoms which is used to diagnose depression.  \n" +
                "\n" +
                "People with persistent depressive disorder experience a depressed mood more days than not for at least two years. As with MDD, children may appear more irritable than depressed but for a PDD diagnosis, they must experience it more days than not for at least one year. It may be chronic and less severe than a full-blown major depression, but could also represent symptoms of a major depression that have persisted for more than two years."));
        clubs.add(new Two.Club("Decreased Interest or Pleasure","The second core symptom of major depressive disorder is a decreased interest or pleasure in things that were once enjoyed. A person exhibiting this symptom will show markedly diminished interest or pleasure in all, or almost all, daily activities such as favorite hobbies or sports or even sex."));
        clubs.add(new Two.Club("Changes in Appetite","Significant changes in weight (a gain or loss of 5% or more in a month) while not attempting to gain or lose may be indicative of MDD. In children, changes in appetite may also present as a failure to make expected weight gains.\n" +
                "\n" +
                "\n" +
                "Persistent depressive disorder may involve a poor appetite or overeating but there may not be the same marked change in weight that is present in MDD."));
        clubs.add(new Two.Club("Sleep Disturbances","Sleep disturbances including difficulty falling asleep, staying asleep, feeling sleepy despite a full night's rest, or daytime sleepiness can indicate either MDD or PDD. "));
        clubs.add(new Two.Club("Psychomotor Agitation or Retardation","Agitation, restlessness, or lethargy that affects a person's daily routine, behavior, or appearance is a symptom of MDD.\nThese symptoms can be evident in body movements, speech, and reaction time and must be observable by others. "));
        clubs.add(new Two.Club("Fatigue","A loss of energy and chronic feelings of fatigue can be symptoms of both persistent depressive disorder and major depressive disorder. Feeling tired most of the time can interfere with a person's ability to function normally. "));
        clubs.add(new Two.Club("Feelings of Worthlessness or Guilt","Excessive, inappropriate guilt, and feelings of worthlessness are common symptoms of major depressive disorder. The feelings of guilt may be so severe that the person becomes delusional. "));
        clubs.add(new Two.Club("Difficulty Concentrating","Both major depressive disorder and persistent depressive disorder involve difficulty concentrating and making decisions. People with depression may recognize this in themselves or others around them may notice that they're struggling to think clearly. "));
        clubs.add(new Two.Club("Recurrent Thoughts of Death","Recurrent thoughts of death that go beyond the fear of dying are associated with major depressive disorder. An individual with major depression may think about suicide, make a suicide attempt, or create a specific plan to kill themselves. "));
        clubs.add(new Two.Club("Complications & Comorbidities","Clinical depression is one of the most common complications reported by people with chronic diseases and conditions, including heart disease, cancer, diabetes, obesity, and arthritis. Often, the illness triggers depression, especially in people who are biologically vulnerable to the disorder. \n" +
                "\n" +
                "It's not uncommon for people with depression to live with two disorders or illnesses at once. This is known as a comorbidity. For instance, someone with chronic pain may become depressed (and vice versa). Similarly, substance use disorders and depression often coexist. For example, someone with depression may turn to alcohol to self-medicate and alcohol use disorder can also cause someone to experience symptoms of depression."));
        clubs.add(new Two.Club("Conditions","The following are some common co-occurring conditions in people with clinical depression:\n" +
                "\n" +
                "\n" +
                "Anxiety disorders\n" +
                "Attention deficient and hyperactivity disorder (ADHD)\n" +
                "Autism spectrum disorders\n" +
                "Chronic pain\n" +
                "Eating disorders and body dysmorphia\n" +
                "Fibromyalgia \n" +
                "Migraines\n" +
                "Multiple sclerosis (MS)\n" +
                "Irritable bowel syndrome (IBS)\n" +
                "Obsessive-compulsive disorder (OCD)\n" +
                "Phobias\n" +
                "Post-traumatic stress disorder (PTSD)\n" +
                "Sleep disorders\n" +
                "Substance use disorders"));
        clubs.add(new Two.Club("Common Myths or Misconceptions","Despite ongoing efforts by researchers, medical professionals, and patients, stigma continues to be a reality for people living with depression. This is partly because of the many damaging myths that exist. These misconceptions can prevent someone from recognizing the signs and symptoms of depression or from getting the help they need. Here we debunk some common depression myths."));
        clubs.add(new Two.Club("You Can Get Over It","Being diagnosed with depression does not mean that you are being crazy or weak—nor is it your fault or something you can simply snap out of on your own. Depression is caused by an imbalance of neurotransmitters (mood-regulating chemicals) in your brain. Just like people diagnosed with diabetes can’t will their pancreas to produce more insulin, you can’t “try harder” to overcome depression. It’s a real disease that requires proper treatment. "));
        clubs.add(new Two.Club("Depression Only Causes Mental Symptoms","Depression symptoms certainly include mental symptoms like sadness, anxiety, irritability, and hopelessness, but physical symptoms are also a reality for people living with depression. This can include fatigue, body aches, headaches, and digestive troubles."));
        clubs.add(new Two.Club("Only Women Get Depressed","Depression can occur in people of any race, ethnic, or economic group, and at any age. Women are almost twice as likely as men to be diagnosed with depression, but the jury is still out on how much of this is due to women reporting and seeking treatment more often than men.\n" +
                "\n" +
                "Children and adolescents can also be at risk for depression. Unfortunately, many children with depression go untreated because adults don't recognize the warning signs, which are often different for children compared to adults."));
        clubs.add(new Two.Club("Depression Is Untreatable","Although depression can make you feel hopeless, there is hope for those who seek a diagnosis and comply with treatment. In fact, depression is one of the most treatable types of mental illness, with 80% to 90% percent of people responding to treatment. What's more, treatment doesn't just involve taking medication for the rest of your life. Therapy and lifestyle modifications also play a key role in managing symptoms and preventing relapse."));


    }

    class Club {

        String nameone,nametwo;
        public Club(String nameone, String nametwo) {


            this.nameone=nameone;
            this.nametwo=nametwo;

        }
    }


}
