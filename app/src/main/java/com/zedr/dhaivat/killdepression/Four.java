package com.zedr.dhaivat.killdepression;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Four extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<Club> clubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapterFour adapter = new RecyclerViewAdapterFour(clubs);

        initializeData();
        initializeAdapter();
    }

    private void initializeAdapter() {

        RecyclerViewAdapterFour adapter = new RecyclerViewAdapterFour(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<>();
        clubs.add(new Four.Club("How Depression Is Diagnosed","The Diagnostic and Statistical Manual of Mental Disorders (DSM) is a handbook that provides guidelines for clinicians who diagnose psychiatric illnesses. Each condition is categorized and given a clear set of criteria that must be met for a diagnosis to be made. " +
                "As is the case with each new edition of the DSM, there were some changes made to the diagnostic criteria for certain disorders from the DSM-IV to DSM-5, including depression. Some disorders have been removed, while others have been modified or added. \n" +
                "\n" +
                "The following is a look at how depression is diagnosed including an overview of the changes that came with the DSM-5 and what those changes mean for healthcare providers and patients."));
        clubs.add(new Four.Club("Self-Checks/At-Home Testing","If you are concerned that you may be experiencing symptoms of depression, it's essential that you reach out to a medical or mental health professional.\n" +
                "\n" +
                "While there are online resources, screenings, and quizzes, they do not always come from reliable sources and cannot definitively diagnose any medical or mental health condition." +
                "However, you may find it helpful to use an online quiz or screening tool to assess your symptoms and organize them to take to your doctor or therapist. Having this information on hand can help you broach the topic of depression." +
                "The online questionnaires will ask you about your life and your feelings. Often, they take the form of a checklist with many \"Yes\" or \"No\" questions that you check off if they apply to you.\n" +
                "\n" +
                "\n" +
                "For example, you may be asked to check a box if the following questions are true for you:\n" +
                "\n" +
                "I feel hopeless, sad, and guilty.\n" +
                "I have trouble falling and staying asleep.\n" +
                "I have been eating more or less than usual and have noticed changes in my weight.\n" +
                "While there is an abundance of self-tests for depression on the internet, they don't all come from reputable sources. You will not be able to self-diagnose a medical or mental health condition with a quiz or checklist, but these online tools can help you initiate a conversation with your doctor or therapist.\n" +
                "\n" +
                "Some questionnaires will ask you to rate your responses to a statement on a numerical scale. At one end, a 0 might indicate that a statement does not apply to you at all, and at the other end, a 10 might indicate that the statement applies to you all the time.\n" +
                "\n" +
                "For example, you might be asked to rate how much you identify with the following statements by selecting a number from 0 to 10, where 0 means \"Never\" and 10 means \"Always.\"\n" +
                "\n" +
                "I have trouble focusing or concentrating.\n" +
                "I spend time with people that I care about.\n" +
                "I have felt like the people in my life would be \"better off without me.\"\n" +
                "Screening tools may also ask personal questions about your habits and lifestyle, such as whether you are married, go to work or school, or use substances.\n" +
                "\n" +
                "A medical or mental health professional will also ask you these types of questions to help assess for possible contributions to depression, such as the loss of a spouse or job or the use of alcohol or drugs."));
        clubs.add(new Four.Club("Tests and Scales","Medical and mental health professionals use established, research-backed guidelines, screening tools, checklists, and other criteria to help them make a diagnosis of depression.\n" +
                "\n" +
                "A provider can use these tools to guide them through observing and talking to a person who might be experiencing symptoms of depression. For example, taking note of whether a person is showered and appropriately dressed, the tone and speed of their speech, and other aspects of their appearance and demeanor can provide clues.\n" +
                "\n" +
                "Asking direct questions about a person's day-to-day life and their feelings can also provide valuable insight into the cause of a person's depressive symptoms. In some cases, a person may have symptoms of depression but not have a major depressive disorder.\n" +
                "\n" +
                "Providers also use these guidelines to go through a list of other possible causes for a person's symptoms that might be easily overlooked. Certain medical conditions and medications can cause symptoms of depression that will generally improve once the underlying cause is addressed.\n" +
                "\n" +
                "In these cases, the guidelines may suggest that a provider refers the person to a colleague for additional testing or examinations. For example, if a doctor thinks a person's symptoms could be stemming from a brain lesion, they may want them to see a neurologist or have an MRI scan." +
                "A person who is using alcohol or illicit drugs may have depressive symptoms that are related to their substance use. In this case, a screening tool may alert a doctor to test their blood or urine for certain drugs or refer them to an addiction treatment center."));
        clubs.add(new Four.Club("Changes in the DSM-5","While the DSM-5 doesn't introduce any new diagnostic tests for depression, it does promote a new “integrated” approach for clinicians to diagnose mental health disorders.\n" +
                "\n" +
                "Clinicians who were used to using the older methods for diagnosing depression didn't have to completely change how they approached the process with the DSM-5, as the new integrated approach is compatible with previous assessment tools. "));
        clubs.add(new Four.Club("Common Depression Tests and Scales","Patient Health Questionnaire-9 (PHQ-9)\n" +
                "Adolescent PHQ-9\n" +
                "Beck Depression Inventory\n" +
                "Major Depression Inventory \n" +
                "Rome Depression Inventory\n" +
                "Children’s Depression Inventory \n" +
                "Zung Self-Rating Depression Scale\n" +
                "Hamilton Rating Scale for Depression\n" +
                "Center for Epidemiological Studies Depression\n" +
                "Geriatric Depression Scale"));
        clubs.add(new Four.Club("New Tools for Assessing Suicide Risk","The DSM-5 does include new scales for assessing suicide risk: one for adults and one for adolescents. These scales are intended to help clinicians identify suicide risk in patients as they are developing treatment plans. " +
                "The tools are included in the new Section III of the DSM-5 and are intended to better support clinicians in identifying risk factors for suicide as well as scales for assessing suicidal behaviors (which includes differentiating self-harm from suicide attempts)."));
        clubs.add(new Four.Club("DSM-5 Diagnostic Criteria","To be diagnosed with major depression, a person's symptoms must fit the criteria outlined in the DSM-5." +
                "Feelings of sadness, low mood, and loss of interest in their usual activities must mark a change from a person's previous level of functioning and have persisted for at least two weeks.\n" +
                "\n" +
                "These feelings must also be accompanied by at least five other common symptoms of depression, including:\n" +
                "\n" +
                "Change in appetite, losing or gaining weight\n" +
                "Sleeping too much or not sleeping well (insomnia)\n" +
                "Fatigue and low energy most days\n" +
                "Feeling worthless, guilty, and hopeless\n" +
                "An inability to focus and concentrate that may interfere with daily tasks at home, work, or school\n" +
                "Movements that are unusually slow or agitated (a change which is often noticeable to others)\n" +
                "Thinking about death and dying; suicidal ideation or suicide attempts\n" +
                "These symptoms must cause the individual clinically significant distress or impairment in social, occupational, or other important areas of functioning.\n" +
                "\n" +
                "The symptoms must not be a result of substance abuse or another medical condition. Doctors must rule out other mental health conditions that can have a depression component but are not strictly a major depressive disorder (e.g., bipolar disorder and schizoaffective disorder).\n" +
                "\n" +
                "To be diagnosed with major depression, a person must not have had a manic or hypomanic episode, which would then warrant a diagnosis of bipolar disorder." +
                "Finally, to be diagnosed with major depression, a medical professional must determine that the person's symptoms don't have another cause, such as a medical condition, a side effect from a medication, or related to the use of illicit substances.\n" +
                "\n" +
                "No significant changes were made to the diagnostic criteria for major depressive disorder with the introduction of the DSM-5. The core symptoms, as well as the requirement for the symptoms to have lasted for at least two weeks, remain the same from previous editions. \n" +
                "\n" +
                "The DSM-5 reminds clinicians to assess patients with depression for symptoms of mania and hypomania. The presence of these symptoms may indicate the new specifier for depression, “with mixed features,” should be added."));
        clubs.add(new Four.Club("Diagnostic Changes From DSM-IV to DSM-5","In addition to the diagnostic criteria for major depressive disorder, the changes published in the DSM-5 included the addition of new depressive mood disorders and specifiers."));
        clubs.add(new Four.Club("New Mood Disorders Added","One major area of change in the DSM-5 was the addition of two new depressive disorders: disruptive mood dysregulation disorder (DMDD) and premenstrual dysphoric disorder (PMDD)." +
                "The diagnosis of DMDD is reserved for children between the ages of 6 and 18 who demonstrate persistent irritability and frequent episodes of out-of-control behavior. The age of onset must be before the age of 10. The diagnosis was added to address concerns that bipolar disorder in children was being overdiagnosed." +
                "PMDD is a more severe form of premenstrual syndrome (PMS). The conditions are characterized by intense depression, anxiety, moodiness, and irritability related to the hormonal fluctuations throughout the menstrual cycle.\n" +
                "\n" +
                "PMDD previously appeared in Appendix B of the DSM-IV under \"Criteria Sets and Axes Provided for Further Study.\" In the DSM-5, PMDD appears in the depressive disorders section."));
        clubs.add(new Four.Club("Dysthymia Removed","Another change addresses the way chronic depression is conceptualized and distinguished from episodic depression. Dysthymia (or dysthymic disorder) is now included under the umbrella of persistent depressive disorder (PDD). \n" +
                "\n" +
                "Persistent depressive disorder also includes chronic major depression, which was added because researchers did not find a significant difference between dysthymia and chronic major depression."));
        clubs.add(new Four.Club("New Specifiers for Depression","The DSM-5 added new specifiers to further clarify depression diagnoses when applicable: with mixed features and with anxious distress." +
                "With mixed features: This new specifier allows for the presence of manic symptoms within a diagnosis of depression for patients who do not meet the full criteria for a hypomanic or manic episode (as in bipolar disorder).\n" +
                "With anxious distress: This specifier was added to account for the presence of anxiety, tension, or restlessness with the potential to impact prognosis and treatment choices."));
        clubs.add(new Four.Club("Bereavement Exclusion Removed","The DSM-5 removed what was known as the bereavement exclusion for major depressive episodes.\n In the past, depression symptoms lasting less than two months following the death of a loved one would not have been classified as a major depressive episode. \n" +
                "\n" +
                "The new edition of the DSM acknowledges that there is no scientifically valid reason for treating the grieving process any differently from other stressors that can trigger a depressive episode.\n" +
                "\n" +
                "Additionally, it acknowledges that symptoms of bereavement may last much longer than two months. In fact, losing a loved one can lead to depressive symptoms that last for years. \n" +
                "\n" +
                "A major depressive episode triggered by bereavement may respond to the same treatment used for other forms of depression, including medication, therapy, or a combination of the two interventions. "));
        clubs.add(new Four.Club("How It All Fits Together","Getting a diagnosis of depression is a multi-step process that often begins when someone notices they do not feel quite like themselves. In some cases, a person's friends and family may notice the subtle signs of depression first and encourage them to seek treatment.\n" +
                "\n" +
                "While it's vital to work with a qualified medical and mental health professionals who can diagnose and treat depression, you might find it helpful to use patient-friendly online screening tools or quizzes to help assess your symptoms. Having this information on hand when you go to your doctor might make it easier to talk about how you're feeling.\n" +
                "\n" +
                "Clinicians also use screening tools, questionnaires, and other tests to assess someone for depression. Many of these scales and checklists are similar, if not the same, as those patients can access online. What's important to remember is that doctors and mental health professionals are specially trained to administer and interpret the results.\n" +
                "\n" +
                "After evaluating someone's symptoms and comparing them to the diagnostic criteria for major depression laid out by the DSM-5, a provider might decide a person needs additional testing to rule out other possible causes for their symptoms (such as a medical condition or use of certain medications or substances).\n" +
                "\n" +
                "The updated DSM-5 introduced several subtle, but important, changes to the way doctors, mental health providers, and researchers approach depression.\n" +
                "\n" +
                "The updates were intended to help healthcare professionals make more timely and accurate diagnoses of depression, as well as inform their decisions about treatment. \n" +
                "\n" +
                "The shift toward patient-centered approaches in health care, but especially mental health care, will also influence how the diagnostic process feels for patients. Ideally, the updates to the DSM-5 that support doctors and mental health professionals with diagnosis and treatment will have a positive impact on patient experience.\n" +
                "\n" +
                "Overall, these changes reflect the desire to improve outcomes for people with mental health disorders. A person needs a timely and accurate diagnosis, support, and access resources and treatment to manage depression effectively."));

    }

    class Club {

        String nameone,nametwo;
        public Club(String nameone, String nametwo) {


            this.nameone=nameone;
            this.nametwo=nametwo;

        }
    }


}
