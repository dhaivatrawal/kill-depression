package com.zedr.dhaivat.killdepression;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Seven extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<Club> clubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seven);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapterSeven adapter = new RecyclerViewAdapterSeven(clubs);

        initializeData();
        initializeAdapter();
    }

    private void initializeAdapter() {

        RecyclerViewAdapterSeven adapter = new RecyclerViewAdapterSeven(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<>();
        clubs.add(new Seven.Club("An Overview of Childhood Depression","Although most people think of depression as an adult illness, children and adolescents can develop depression as well. Unfortunately, many children with depression go untreated because adults don't recognize they're depressed.  \n" +
                "\n" +
                "\n" +
                "It's important for parents, teachers, and other adults to learn about childhood depression. When you understand the symptoms of depression in children and the reasons children develop it, you can intervene in a helpful manner."));
        clubs.add(new Seven.Club("Symptoms","Depression in children often presents differently than it does in adults. While adults with depression tend to look sad, children and teens with depression may look more irritable and angry.\n" +
                "\n" +
                "You might see changes in behavior, such as increased defiance or a decline in grades at school."));
        clubs.add(new Seven.Club("Signs of Depression in Children and Teens","Irritability\n" +
                "Anger\n" +
                "Defiant attitude\n" +
                "Declining grades\n" +
                "Physical complaints (stomachache, headache)\n" +
                "Your child might insist that they're fine or they may deny that they're experiencing any problems. Many parents pass off their child's irritability as a phase or they assume it's part of normal development. But, irritability that lasts longer than two weeks may be a sign of depression.\n" +
                "\n" +
                "Some children with depression have physical complaints. They may report more stomachaches and headaches than their peers. "));
        clubs.add(new Seven.Club("Children Are Not Immune to Depression","Sometimes adults assume kids shouldn't be depressed since they don't have to worry about adult issues, like paying bills or running a household." +
                "But kids experience stress, too. And even children who live relatively stress-free lives may develop depression. Children who are raised in good homes with loving parents can become depressed. "));
        clubs.add(new Seven.Club("Causes","Anyone can develop depression and it isn't a sign of weakness. It also isn't your fault if your child is depressed. \n" +
                "\n" +
                "While stressful life events, like divorce, may contribute to depression, it's only a small piece of the puzzle. Many other factors, including genetics, also play a role in its development. \n" +
                "\n" +
                "There are a number of different factors that can contribute to childhood depression. Some potential risk factors include:\n" +
                "\n" +
                "Brain chemistry: Imbalances in certain neurotransmitters and hormones may play a role in how the brain works, which can affect moods and emotions and increase the risk of experiencing depression.\n" +
                "Family history: Children with family members who also have mood disorders such as depression are at a greater risk for also experiencing symptoms of depressive disorders.\n" +
                "Stress or trauma: Sudden changes such as moving or divorce, or traumatic events such as abuse or assault can also contribute to feelings of depression.\n" +
                "Environmental factors: A stressful, chaotic, or unstable home environment can also make children more likely to experience depression. Rejection and bullying at school may also be a contributing factor."));
        clubs.add(new Seven.Club("Diagnosis","If you suspect your child is depressed, the pediatrician is a good place to start. Schedule an appointment with the physician and talk about your concerns.\n" +
                "\n" +
                "In order to be diagnosed with depression, children and adolescents must exhibit five or more symptoms for at least two weeks. These symptoms must include a depressed or irritable mood, loss of interest or pleasure in previously enjoyed activities, and three or more of the following symptoms:\n" +
                "\n" +
                "Insomnia or excessive sleeping\n" +
                "A decrease in appetite or significant weight loss\n" +
                "Lack of energy or fatigue\n" +
                "Restlessness or decrease in physical movement\n" +
                "Difficulty concentrating or making decisions\n" +
                "Feelings of guilt or worthlessness\n" +
                "Thoughts of death or suicide\n" +
                "In addition to the above symptoms, children may also show increases in physical complaints, anger, substance use, poor school performance, and reckless behavior.\n" +
                "\n" +
                "The pediatrician can rule out potential physical health issues that may be contributing to the symptoms you are seeing. A mental health evaluation may involve your doctor speaking to your child without you present.\n" +
                "\n" +
                "While there is no specific test for depression, a doctor may use psychological assessments to further evaluate the type and severity of the symptoms your child is experiencing.\n" +
                "\n" +
                "If warranted, your child may be referred to a mental health professional. "));
        clubs.add(new Seven.Club("Children May Resist Talking About Mental Health","Younger children often lack the language skills to verbalize their mood. They may not be able to describe how they're feeling or what they're experiencing. \n" +
                "\n" +
                "Older children who have a better understanding of what depression means may feel embarrassed or they may worry that they're different.\n" +
                "\n" +
                "It's usually best not to ask lots of questions. Instead, keep a diary that tracks the changes in mood or behavior that you're seeing. Then, you'll have a clear record to show a physician so you can address your concerns."));
        clubs.add(new Seven.Club("Treatment","Treatment options often involve medications, psychotherapy, lifestyle changes, or a combination. Sometimes parents fear that depression treatment will involve heavy-duty medications with serious side effects. But, medication isn't always needed to treat depression. Talk therapy is another viable treatment option that can be used with or without medication. \n" +
                "\n" +
                "The treatment plan your child's doctor or psychiatrist recommends will depend on the nature and severity of your child's depression."));
        clubs.add(new Seven.Club("Medications","Antidepressants can be an effective way to treat childhood depression. However, their use must be carefully monitored in order to minimize the risk of severe side effects. All antidepressants carry an FDA black box warning of an increased risk in suicidal thinking for those under the age of 25, particularly in the first few weeks after the initiation of treatment. " +
                "This does not mean that antidepressants should not be used by children; it simply means that doctors and parents should be aware of the potential and be sure to monitor their child's behavior carefully for signs of suicidal ideation.\n" +
                "\n" +
                "Some of the antidepressants that have been approved for children and teens include Cymbalta (duloxetine), Prozac (fluoxetine), and Zoloft (sertraline)."));
        clubs.add(new Seven.Club("Therapy","Cognitive-behavioral therapy (CBT) is an approach that is frequently used in the treatment of depression. This process involves helping your child identify unhelpful or negative thoughts and replacing them with more positive and effective thoughts. Behavioral therapy may also be used to help children overcome fears or address specific problematic behaviors."));
        clubs.add(new Seven.Club("Lifestyle Changes","For mild cases of depression, lifestyle changes can often be an effective way to address feelings of depression. Things like finding ways to manage stress, getting regular physical exercise, using relaxation techniques, and building a stronger social support system can help improve how a child feels.\n" +
                "\n" +
                "You can't always prevent depression in children. But, you can be proactive in improving your child's mental health, regardless of whether there is a diagnosed mental health issue.\n" +
                "\n" +
                "The following are some proactive steps you can take to encourage healthy coping skills and support mental health:\n" +
                "\n" +
                "Talk about how caring for the body also helps the mind. Explain how eating nutritious food, getting plenty of exercise, and sleeping the recommended number of hours each night is good for their mental health.\n" +
                "Make sure your child has a consistent sleep schedule. Turn off devices before bedtime and make sure your child goes to bed and wakes up at the same time each day.\n" +
                "Help your child develop a rich social life without over-scheduling their time. Assign responsibilities and reward them for being responsible. \n" +
                "Teach your child how to solve problems, manage their emotions in healthy ways, and develop strategies that will help them cope with failure and setbacks. Talk about your mental health too and make staying healthy a priority in your family. \n" +
                "Ultimately, it's up to the guardians to decide what treatment options to employ. It's important for parents and children to educate themselves about treatment and the potential risks and benefits of each option. "));
    }

    class Club {

        String nameone,nametwo;
        public Club(String nameone, String nametwo) {


            this.nameone=nameone;
            this.nametwo=nametwo;

        }
    }


}
