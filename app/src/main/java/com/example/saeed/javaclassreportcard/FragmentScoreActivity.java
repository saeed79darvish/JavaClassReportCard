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

        ScoreCard scoreCard = new ScoreCard(100, 100, 100, 100, 100, "Saeed Darvish", 123456789);
        scoreCard.setChemistryGrade(90);
        scoreCard.setMathGrad(90);
        scoreCard.setEnglishMarks(91);
        scoreCard.setHistoryGrade(85);
        scoreCard.setBiologyGrade(99);

        Log.d(LOG_TAG, scoreCard.toString());

        textView.setText(scoreCard.displayResult());

        return rootView;
    }
}
