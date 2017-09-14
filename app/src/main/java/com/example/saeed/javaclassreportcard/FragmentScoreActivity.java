package com.example.saeed.javaclassreportcard;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentScoreActivity extends Fragment {


    private static final String LOG_TAG = FragmentScoreActivity.class.getSimpleName();

    public FragmentScoreActivity() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_fragment_score, container, false);

        TextView textView = (TextView) rootView.findViewById(R.id.textview);

        ReportCard reportCard = new ReportCard(100, 100, 100, 100, 100, "Saeed Darvish", 123456789);
        reportCard.setChemistryGrade(90);
        reportCard.setMathGrad(90);
        reportCard.setEnglishMarks(91);
        reportCard.setHistoryGrade(85);
        reportCard.setBiologyGrade(99);

        Log.d(LOG_TAG, reportCard.toString());

        textView.setText(reportCard.displayResult());

        return rootView;
    }
}
