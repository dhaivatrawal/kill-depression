package com.zedr.dhaivat.killdepression;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Six extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<Club> clubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.six);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapterSix adapter = new RecyclerViewAdapterSix(clubs);

        initializeData();
        initializeAdapter();
    }

    private void initializeAdapter() {

        RecyclerViewAdapterSix adapter = new RecyclerViewAdapterSix(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<>();
        clubs.add(new Six.Club("What Are Your Rights at Work When You're Depressed?","If you have a mental disorder such as major depression, you may wonder what your rights are when you apply for a job or are up for a promotion. Obviously, if you had a physical disability it wouldn't be legal for an employer to discriminate against you, thanks to the Americans With Disabilities Act (ADA), which came into effect in 1992 to prevent private employers, state and local governments, employment agencies, and labor unions from discriminating against people with disabilities. It applies to job application procedures, hiring, firing, advancement, compensation, job training, and more. Businesses or companies with 15 or more employees are required to comply with the ADA.\n" +
                "\n" +
                "\n" +
                "In 2008, important changes to the ADA expanded the definition of disability, making it possible for people with \"invisible\" conditions, such as depression, to be protected, even when their symptoms are controlled by medications, lifestyle changes, or therapy. If you're experiencing depression, knowing your rights in the workplace can make a substantial difference in how you cope."));
        clubs.add(new Six.Club("Are You Covered by the Americans With Disabilities Act?","The ADA , along with the 2008 amendment, states that persons qualify for disability if they:\n" +
                "\n" +
                "Have a physical or mental impairment that substantially limits one or more major life activities and/or bodily functions (the immune system, normal cell growth, digestive, bowel, bladder, neurological, brain, respiratory, circulatory, endocrine, and reproductive functions). Major life activities include, but are not limited to, caring for yourself, performing manual tasks, seeing, hearing, eating, sleeping, walking, standing, lifting, bending, speaking, breathing, learning, reading, concentrating, thinking, communicating, and working.\n" +
                "Have a history of such an impairment\n" +
                "Are regarded as having such an impairment"));
        clubs.add(new Six.Club("What Is a Mental Impairment?","In terms of the ADA, a mental impairment includes mental or psychological disorders (as defined by the DSM-V) such as major depressive disorder, bipolar disorder, anxiety disorders (panic disorder, obsessive-compulsive disorder, and post-traumatic stress disorder), schizophrenia, and personality disorders. Problems not covered by the ADA include adjustment disorders, relationship troubles, or illegal drug use. In addition, behavior \"traits\" such as irritability or stress are not included.\n" +
                "\n" +
                "\n" +
                "Even if these conditions aren't continual, but cause flare-ups of impairment, they qualify under the ADA as long as the disorder is considered a long-term problem.\n" +
                "\n" +
                "Usually a condition has to be present for several months before it qualifies as a long-term problem. Disorders that are included in the definition of disability are those that are permanent or have potentially long-term effects, not those that are temporary such as the break up of a relationship."));
        clubs.add(new Six.Club("How Is \"Substantial Limitation\" Determined?","A determination of substantial limitation does not always have to be made by an expert. Sometimes the credible testimony of the person seeking disability, his or her family, friends, or co-workers may be enough."));
        clubs.add(new Six.Club("Drug and Alcohol Abuse","Because self-medication with drugs and alcohol is so common among people with depression, it is important to note that the ADA does not cover those with a substance abuse problem. Any employee with a substance abuse problem can be held to the same standards as other employees. If your employer does not know about your depression and then later discovers a substance abuse problem, you will not be protected."));
        clubs.add(new Six.Club("Understanding Reasonable Accommodation: One of Your Rights","Under the ADA, employers are required to make what is called a \"reasonable accommodation\" for people with a known disability as long as it doesn't create an undue hardship such as significant difficulty or expense for the company." +
                "Examples of reasonable accommodation for an employee with depression include a flexible work schedule or job sharing; time off for therapy or support group meetings; a quiet or out-of-the way workspace; extended leave after a hospitalization; and allowing the worker to work at home periodically."));
        clubs.add(new Six.Club("Negotiating Reasonable Accommodations","If you need to negotiate reasonable accommodations for yourself, here are some questions to consider:\n" +
                "\n" +
                "What is your most difficult task at work? What would make it easier?\n" +
                "Does any part of your job make your depression symptoms better or worse?\n" +
                "Is there anything in your workplace that causes distraction?\n" +
                "Would a modified work week be helpful? For example, decreasing your hours?\n" +
                "Is telecommuting possible with your job, either full time or on certain days?"));
        clubs.add(new Six.Club("Disclosing Your Depression","Employers are forbidden by law to ask if someone has a disability, or even to ask questions about a known disability." +
                "If you've been diagnosed with depression, it's up to you to tell your boss or manager and to ask for whatever accommodations you need to be able to do your work.\n" +
                "\n" +
                "It may be hard to do this, given the stigma and misconceptions that surround mental illness. But it's much better to be upfront and to get what you need, rather than risk poor performance reviews or even losing your job because you've decided to tough it out. Keep in mind that the purpose of the ADA is to protect people just like you—people who wish to work at a job but are frightened about how their performance may be affected by their mental health disability."));
        clubs.add(new Six.Club("Dealing With Discrimination","If you suspect you've been discriminated against because of your depression, contact the U.S. Equal Employment Opportunity Commission (EEOC) to file a complaint. A charge of discrimination generally must be filed within 180 days. You may have up to 300 days to file a charge if there is a state or local law that provides relief for discrimination on the basis of disability.\n" +
                "\n" +
                "To file a charge of discrimination contact any EEOC Field Offices. These offices are located in cities throughout the United States.\n" +
                "\n" +
                "If it's found you've been discriminated against, you're entitled to a remedy that will place you in the position you would have been in if the discrimination had never occurred. You may be entitled to hiring, promotion, reinstatement, back pay, or reasonable accommodation, including reassignment. You may also be entitled to attorneys fees.\n" +
                "\n" +
                "As with disclosure, remember that the ADA is designed to help people like you. Not only are you standing up for your rights when you claim the protection of the disability act, you're setting an example that will help others with mental illness avoid discrimination due to an illness they never asked to have to cope with."));



    }

    class Club {

        String nameone,nametwo;
        public Club(String nameone, String nametwo) {


            this.nameone=nameone;
            this.nametwo=nametwo;

        }
    }


}
