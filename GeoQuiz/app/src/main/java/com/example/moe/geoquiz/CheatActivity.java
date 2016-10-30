package com.example.moe.geoquiz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CheatActivity extends AppCompatActivity {

    private static final String EXTRA_ANSWER_IS_TRUE = "com.example.moe.geoquiz.answer_is_true";
    private boolean mAnswerTrue;

    public static Intent newIntent(Context packageContent,boolean answerIsTrue){
        Intent i = new Intent(packageContent,CheatActivity.class);
        i.putExtra(EXTRA_ANSWER_IS_TRUE,answerIsTrue);
        return i;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);

        mAnswerTrue = Bun
    }
}
