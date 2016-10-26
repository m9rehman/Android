package com.example.moe.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private Button mTrueButton;
    private Button mFalseButton;
    private Button mNextButton;
    private TextView mQuestionTextView;
    //Creating an array of Question Objects
    private Question[] mQuestionTextBank = new Question[] {
            new Question(R.string.question_africa,false),
            new Question(R.string.question_asia,true),
            new Question(R.string.question_americas,true),
            new Question(R.string.question_mideast,false),
            new Question(R.string.question_oceans,true)
    };

    private int mCurrentIndex = 0;

    private void updateQuestion(){
        int question = mQuestionTextBank[mCurrentIndex].getTextResId();
        mQuestionTextView.setText(question);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        //Getting Reference and Casting
        mTrueButton = (Button) findViewById(R.id.true_button);
        mFalseButton = (Button) findViewById(R.id.false_button);
        mNextButton = (Button) findViewById(R.id.next_button);
        mQuestionTextView = (TextView) findViewById(R.id.question_textview);

        //Setting the textView by indexing our array of Questions
        updateQuestion();

        //Setting up listeners
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        QuizActivity.this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();

            }
        });

        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        QuizActivity.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });

        //Setting up listener for Next button which increments our id
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentIndex++;
                updateQuestion();
            }
        });
    }
}
