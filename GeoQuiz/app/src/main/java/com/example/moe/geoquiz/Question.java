package com.example.moe.geoquiz;

public class Question {
    //Two member variables
    private int mTextResId;

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    private boolean mAnswerTrue;

    //Constructor for Question class
    public Question(int textResId,boolean answerTrue){
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

}
