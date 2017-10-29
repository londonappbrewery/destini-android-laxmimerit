package com.londonappbrewery.destini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyTextView;
    Button buttonTop, buttonBottom;

    int storyLineIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = (TextView) findViewById(R.id.storyTextView);
        buttonTop = (Button) findViewById(R.id.buttonTop);
        buttonBottom = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateStoryLine(1);
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateStoryLine(2);
            }
        });
    }

    private void updateStoryLine(int button) {
        if (button == 1) {
            if (storyLineIndex == 0) {
                storyTextView.setText(R.string.T3_Story);
                buttonTop.setText(R.string.T3_Ans1);
                buttonBottom.setText(R.string.T3_Ans2);
                storyLineIndex = 2;
            } else if (storyLineIndex == 1) {
                storyTextView.setText(R.string.T3_Story);
                buttonTop.setText(R.string.T3_Ans1);
                buttonBottom.setText(R.string.T3_Ans2);
                storyLineIndex = 2;
            } else if (storyLineIndex == 2) {
                storyTextView.setText(R.string.T6_End);
                buttonTop.setVisibility(View.GONE);
                buttonBottom.setVisibility(View.GONE);
            }
        } else {
            if (storyLineIndex == 0) {
                storyTextView.setText(R.string.T2_Story);
                buttonTop.setText(R.string.T2_Ans1);
                buttonBottom.setText(R.string.T2_Ans2);
                storyLineIndex = 1;
            } else if (storyLineIndex == 1) {
                storyTextView.setText(R.string.T4_End);
                buttonTop.setVisibility(View.GONE);
                buttonBottom.setVisibility(View.GONE);
            } else if (storyLineIndex == 2) {
                storyTextView.setText(R.string.T5_End);
                buttonTop.setVisibility(View.GONE);
                buttonBottom.setVisibility(View.GONE);
            }
        }
    }
}
