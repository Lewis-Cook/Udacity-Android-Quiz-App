package uk.co.lewiscook.quizapp20;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView enter = findViewById(R.id.checkAnswers);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                questionOne();
                questionTwo();
                questionThree();
                questionFour();
                questionFive();
                questionSix();
                displayAnswers(answerMessage());
            }
        });
    }

    public String answerMessage() {
        return "You scored: ";
    }

    public void questionOne() {
        RadioButton checkboxNumOne = findViewById(R.id.checkBoxQ1);
        boolean numOneIsChecked = checkboxNumOne.isChecked();


        if (numOneIsChecked) {
            score += +1;
            checkboxNumOne.setText(R.string.Q1Answer_3);
            setCorrectAnswer(checkboxNumOne);

        } else {
            score += +0;
            setCorrectAnswerVisibility(checkboxNumOne);
        }
    }

    public void questionTwo() {
        RadioButton checkboxNumTwo = findViewById(R.id.checkBoxQ2);
        boolean numTwoIsChecked = checkboxNumTwo.isChecked();


        if (numTwoIsChecked) {
            score += +1;
            checkboxNumTwo.setText(R.string.Q2Answer_1);
            setCorrectAnswer(checkboxNumTwo);

        } else {
            score += +0;
            setCorrectAnswerVisibility(checkboxNumTwo);
        }
    }

    public void questionThree() {
        RadioButton checkboxNumThree = findViewById(R.id.checkBoxQ3);
        boolean numThreeIsChecked = checkboxNumThree.isChecked();

        if (numThreeIsChecked) {
            score += +1;
            checkboxNumThree.setText(R.string.Q3Answer_3);
            setCorrectAnswer(checkboxNumThree);

        } else {
            score += +0;
            setCorrectAnswerVisibility(checkboxNumThree);
        }
    }

    public void questionFour() {
        RadioButton checkboxNumFour = findViewById(R.id.checkBoxQ4);
        boolean numFourIsChecked = checkboxNumFour.isChecked();


        if (numFourIsChecked) {
            score += +1;
            checkboxNumFour.setText(R.string.Q4Answer_2);
            setCorrectAnswer(checkboxNumFour);

        } else {
            score += +0;
            setCorrectAnswerVisibility(checkboxNumFour);
        }
    }

    public void questionFive() {
        RadioButton checkboxNumFive = findViewById(R.id.checkBoxQ5);
        boolean numFiveIsChecked = checkboxNumFive.isChecked();

        if (numFiveIsChecked) {
            score += +1;

            checkboxNumFive.setText(R.string.Q5Answer_3);
            setCorrectAnswer(checkboxNumFive);

        } else {
            score += +0;
            setCorrectAnswerVisibility(checkboxNumFive);
        }
    }

    public void questionSix() {
        RadioButton checkboxNumSix = findViewById(R.id.checkBoxQ6);
        boolean numSixIsChecked = checkboxNumSix.isChecked();


        if (numSixIsChecked) {
            score += +1;

            checkboxNumSix.setText(R.string.Q6Answer_3);
            setCorrectAnswer(checkboxNumSix);

        } else {
            score += +0;
            setCorrectAnswerVisibility(checkboxNumSix);
        }
    }

    //Removes correct tick if user happens to change answer
    private void setCorrectAnswerVisibility(RadioButton checkBox) {
        checkBox.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
    }

    //Add's correct tick next to answer if correct
    private void setCorrectAnswer(RadioButton checkBox) {
        Drawable draw = checkBox.getContext().getResources().getDrawable(R.drawable.green_tick);
        checkBox.setCompoundDrawablesWithIntrinsicBounds(null, null, draw, null);
    }

    @SuppressLint("SetTextI18n")
    private void displayAnswers(String finalMessage) {
        TextView answers = findViewById(R.id.results);
        answers.setText(finalMessage + score + "/6");

        Toast.makeText(this, finalMessage + score + "/6", Toast.LENGTH_SHORT).show();

        score = 0;
    }
}