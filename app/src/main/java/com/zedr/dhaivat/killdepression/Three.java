package com.zedr.dhaivat.killdepression;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Three extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<Club> clubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapterThree adapter = new RecyclerViewAdapterThree(clubs);

        initializeData();
        initializeAdapter();
    }

    private void initializeAdapter() {

        RecyclerViewAdapterThree adapter = new RecyclerViewAdapterThree(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<>();
        clubs.add(new Three.Club("Root Cause","Depression is one of the most common mental disorders in the United States. It can affect anyone at almost any age, but the reasons some people become depressed are not always known. Researchers suspect there are actually many different causes of depression and that it is not always preventable. Factors that can contribute to depression include genetics, brain chemistry, certain medical conditions, substance use, stress, and poor nutrition." +
                "It is estimated that 10% to 15% of the general population will experience clinical depression in their lifetime. The World Health Organization estimates 5% of men and 9% of women experience depressive disorders in any given year."));
        clubs.add(new Three.Club("Brain & Body Risk Factors","There are a number of different things that can cause depression including factors related to the brain and body. Some things that can raise your risk for depression include the following."));
        clubs.add(new Three.Club("Brain Chemistry Imbalances","One potential biological cause of depression is an imbalance in the neurotransmitters which are involved in mood regulation.\n Certain neurotransmitters, including dopamine, serotonin, and norepinephrine, play an important role in mood.\n" +
                "\n" +
                "\n" +
                "Neurotransmitters are chemical substances that help different areas of the brain communicate with each other. When certain neurotransmitters are in short supply, it may lead to the symptoms we recognize as clinical depression." +
                "This theory of depression suggests that having too much or too little of certain neurotransmitters causes, or at least contributes to, depression. While this explanation is often cited as a major cause of depression, it remains unproven and many experts believe that it doesn't paint a complete picture of the complex factors that contribute to depression.\n" +
                "\n" +
                "\n" +
                "Medications to treat depression often focus on altering the levels of certain chemicals in the brain. Some of these treatments include selective serotonin reuptake inhibitors (SSRIs), serotonin-norepinephrine reuptake inhibitors (SNRIs), monoamine oxidase inhibitors (MAOIs), and tricyclic antidepressants (TCAs)."));
        clubs.add(new Three.Club("Physical Health & Certain Medical Conditions","You may be more likely to experience symptoms of depression if you have a chronic illness, sleep disorder, or thyroid condition. Depression rates also tend to be higher among people who have chronic pain, diabetes, multiple sclerosis, and cancer.\n" +
                "\n" +
                "The mind and the body are clearly linked. If you are experiencing a physical health problem, you may discover changes in your mental health as well. \n" +
                "\n" +
                "Illness is related to depression in two ways. The stress of having a chronic illness may trigger an episode of major depression. In addition, certain illnesses, such as thyroid disorders, Addison's disease, and liver disease, can cause depression symptoms."));
        clubs.add(new Three.Club("Female Sex Hormones","It has been widely documented that women experience major depression about twice as often as men. Because of the incidence of depressive disorders peaks during women's reproductive years, it is believed that hormonal risk factors may be at play.\n" +
                "\n" +
                "Women are especially prone to depressive disorders during times when their hormones are in flux, such as around the time of their menstrual period, pregnancy, childbirth, and perimenopause.\n" +
                "\n" +
                "Hormone fluctuations caused by childbirth and thyroid conditions can also contribute to depression. Postpartum depression may occur after a woman has given birth and is believed to result from the rapid hormonal changes that take place immediately after giving birth.\n" +
                "\n" +
                "In addition, a woman's depression risk declines after she goes through menopause."));
        clubs.add(new Three.Club("Family History & Genetics","A family history of depression is another significant risk factor. You are more likely to experience symptoms of depression if others in your family also have depression or another type of mood disorder. Estimates suggest that depression is approximately 40% determined by genetics.\n" +
                "\n" +
                "Twin, adoption, and family studies have linked depression to genetics. While studies suggest that there is a strong genetic component, researchers are not yet certain about all the genetic risk factors for depression.\n" +
                "\n" +
                "Researchers have found that having a parent and grandparent with depression doubles the risk of depression.2\uFEFF\n" +
                "\n" +
                "It is still unclear exactly which genes play a role in depression and other mood disorders, but researchers do know that there are many different genes that can play a role. By better understanding how they function, gene researchers hope to be able to create more effective treatments.\n" +
                "\n" +
                "It is important to remember that no single cause of depression acts in isolation. Genetic factors may be a major risk factor, but scientists also believe that genes and the environment interact to control exactly how these genes are expressed."));
        clubs.add(new Three.Club("Lifestyle Risk Factors","There are also a number of lifestyle factors that can play a role in causing depression. While many of the risk factors for depression, such as your sex or your family history, cannot be changed, people have much more personal control over lifestyle factors."));
        clubs.add(new Three.Club("Circadian Rhythm Disturbances","One type of depression, called seasonal affective disorder (officially known as major depressive disorder with seasonal pattern) is believed to be caused by a disturbance in the normal circadian rhythm of the body." +
                "Light entering the eye influences this rhythm, and, during the shorter days of winter, when people may spend limited time outdoors, this rhythm may become disrupted.\n" +
                "\n" +
                "People who reside in colder climates where there are short, dark days may be at the highest risk. \n" +
                "\n" +
                "In addition to disruptions in circadian rhythm, reduced sunlight can also lead to a drop in serotonin levels in the brain, which may influence mood. Seasonal changes can also alter melatonin levels in the body, which can disrupt sleep and contribute to mood changes.\n" +
                "\n" +
                "While you cannot control seasonal shifts, there are steps you can take to minimize the effect these changes have on your mental health."));
        clubs.add(new Three.Club("Poor Nutrition","A poor diet can contribute to depression in several ways. A variety of vitamin and mineral deficiencies are known to cause symptoms of depression.\n" +
                "\n" +
                "Some studies have found that diets either low in omega-3 fatty acids or with an imbalanced ratio of omega-6 to omega-3 are associated with increased rates of depression."));
        clubs.add(new Three.Club("Stress","Stressful life events, which overwhelm a person's ability to cope, can also be a cause of depression.\n" +
                "\n" +
                "Researchers suspect high levels of the hormone cortisol, which are secreted during periods of stress, may affect the neurotransmitter serotonin and contribute to depression."));
        clubs.add(new Three.Club("Grief and Loss","Following the loss of a loved one, grieving individuals experience many of the same symptoms of depression. Trouble sleeping, poor appetite, and a loss of pleasure or interest in activities are a normal response to loss.\n" +
                "\n" +
                "The symptoms of grief are expected to subside over time. But when symptoms get worse, grief may turn into depression."));
        clubs.add(new Three.Club("Substance Use","Drugs and alcohol can contribute to depressive disorders.\n But, even some prescription drugs have been linked to depression.\n" +
                "\n" +
                "Some drugs that have been found to be associated with depression include anticonvulsants, statins, stimulants, benzodiazepines, corticosteroids, and beta-blockers." +
                "It's important to review any medications that you've been prescribed and to speak with your physician if you are feeling depressed." +
                "No matter the cause, there are effective treatments available. Talk to your doctor if you have symptoms of depression in order to come up with a treatment plan that works for you."));


    }

    class Club {

        String nameone,nametwo;
        public Club(String nameone, String nametwo) {


            this.nameone=nameone;
            this.nametwo=nametwo;

        }
    }


}
