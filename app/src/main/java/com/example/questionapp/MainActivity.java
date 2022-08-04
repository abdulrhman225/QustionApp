package com.example.questionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv_question;
    RadioButton rb_answer1, rb_answer2 , rb_answer3;
    Button btn_next;
    Dialog dialog;
    first_second_third_Activity_DataBase db = new first_second_third_Activity_DataBase(this);


    //radioButton1
    String Question1 = "ما اسم عاصمة ألبانيا؟";
    String Q1_answer1 ="تيرانا";
    String Q1_2 ="كتمندو";
    String Q1_3 ="ساوتومي";

    //radioButton3
    String Question2 = "ما اسم الشعب الذي وضع الحروف الهجائية؟";
    String Q2_answer1 ="الأغريق ";
    String Q2_2 ="العرب ";
    String Q2_3 ="الفينيقيين";

    //radioButton2
    String Question3 = "في أي مكان اخترع فيه البارود لأول مرة؟";
    String Q3_answer1 ="العرب ";
    String Q3_2 ="الصين ";
    String Q3_3 ="الروم";

    //radioButton1
    String Question4 = "ما اسم الدولة التي شاهدت التلفزيون لأول مرة في التاريخ؟";
    String Q4_answer1 ="أمريكا ";
    String Q4_2 ="أوروبا ";
    String Q4_3 ="مصر";

    //radioButton2
    String Question5 = "ما اسم عاصمة السنغال؟";
    String Q5_answer1 ="أبيدجان";
    String Q5_2 ="داكار";
    String Q5_3 ="سكوبيا";

    //radioButton3
    String Question6 = "ما اسم المدينة الأوروبية التي يطلق عليها اسم مدينة الضباب؟";
    String Q6_answer1 ="باريس ";
    String Q6_2 ="نيويورك ";
    String Q6_3 ="لندن";

    //radioButton2
    String Question7 = "ما هو اسم أكبر دولة من حيث المساحة بداخل  أفريقيا؟";
    String Q7_answer1 ="مصر";
    String Q7_2 ="السودان";
    String Q7_3 ="موريتانيا";

    //radioButton1
    String Question8 = "أي بلد تحد فلسطين من جهة الشرق؟";
    String Q8_answer1 ="الأردن ";
    String Q8_2 ="لبنان ";
    String Q8_3 ="مصر";

    //radioButton2
    String Question9 = "في أي مكان توجد صخرة إيرس؟";
    String Q9_answer1 ="البرازيل ";
    String Q9_2 ="استراليا ";
    String Q9_3 ="روسيا";

    //radioButton1
    String Question10 = "ما معنى اسم لوس أنجلوس؟";
    String Q10_answer1 ="مدينة الملائكة";
    String Q10_2 ="مدينة الحدائق";
    String Q10_3 ="مدينة الكنوز";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_question = findViewById(R.id.firstView_tv_question);
        rb_answer1 = findViewById(R.id.firstView_rb_answer1);
        rb_answer2 = findViewById(R.id.firstView_rb_answer2);
        rb_answer3 = findViewById(R.id.firstView_rb_answer3);
        btn_next = findViewById(R.id.First_View_btn_next);

        Intent intent = getIntent();

        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.custom_dialog);
        dialog.setCancelable(true);

        Button button_finish = dialog.findViewById(R.id.Custom_dialog_finish);
        Button button_tryAgain = dialog.findViewById(R.id.Custom_dialog_tryAgain);


        button_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });

        button_tryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
                getAllQuestion();

            }
        });


        First_Second_Third_View_Quiz q1 = new First_Second_Third_View_Quiz(Question1 , Q1_answer1 , Q1_2 , Q1_3);
        First_Second_Third_View_Quiz q2 = new First_Second_Third_View_Quiz(Question2 , Q2_answer1 , Q2_2 , Q2_3);
        First_Second_Third_View_Quiz q3 = new First_Second_Third_View_Quiz(Question3 , Q3_answer1 , Q3_2 , Q3_3);
        First_Second_Third_View_Quiz q4 = new First_Second_Third_View_Quiz(Question4 , Q4_answer1 , Q4_2 , Q4_3);
        First_Second_Third_View_Quiz q5 = new First_Second_Third_View_Quiz(Question5 , Q5_answer1 , Q5_2 , Q5_3);
        First_Second_Third_View_Quiz q6 = new First_Second_Third_View_Quiz(Question6 , Q6_answer1 , Q6_2 , Q6_3);
        First_Second_Third_View_Quiz q7 = new First_Second_Third_View_Quiz(Question7 , Q7_answer1 , Q7_2 , Q7_3);
        First_Second_Third_View_Quiz q8 = new First_Second_Third_View_Quiz(Question8 , Q8_answer1 , Q8_2 , Q8_3);
        First_Second_Third_View_Quiz q9 = new First_Second_Third_View_Quiz(Question9 , Q9_answer1 , Q9_2 , Q9_3);
        First_Second_Third_View_Quiz q10= new First_Second_Third_View_Quiz(Question10,Q10_answer1 ,Q10_2 ,Q10_3);

        db.insert1(q1);
        db.insert1(q2);
        db.insert1(q3);
        db.insert1(q4);
        db.insert1(q5);
        db.insert1(q6);
        db.insert1(q7);
        db.insert1(q8);
        db.insert1(q9);
        db.insert1(q10);

        getAllQuestion();

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (tv_question.getText().equals(Question1) && rb_answer1.isChecked()) {
                    rb_answer1.setChecked(false);
                    getAllQuestion();
                }


                else
                if(tv_question.getText().equals(Question4) && rb_answer1.isChecked()){
                    rb_answer1.setChecked(false);

                    getAllQuestion();
                }


                else
                if (tv_question.getText().equals(Question8) && rb_answer1.isChecked()){
                    rb_answer1.setChecked(false);

                    getAllQuestion();
                }

                else
                if (tv_question.getText().equals(Question10) && rb_answer1.isChecked()){
                    rb_answer1.setChecked(false);

                    getAllQuestion();
                }

                if (tv_question.getText().equals(Question3) && rb_answer2.isChecked() ){
                    rb_answer2.setChecked(false);
                    getAllQuestion();
                }


                else
                if (tv_question.getText().equals(Question5) && rb_answer2.isChecked()){
                    rb_answer2.setChecked(false);
                    getAllQuestion();
                }

                else
                if (tv_question.getText().equals(Question7) && rb_answer2.isChecked()){
                    rb_answer2.setChecked(false);
                    getAllQuestion();
                }

                else
                if (tv_question.getText().equals(Question9) && rb_answer2.isChecked()) {
                    rb_answer2.setChecked(false);
                getAllQuestion();
                }


                if (tv_question.getText().equals(Question2) && rb_answer3.isChecked() ){
                    rb_answer3.setChecked(false);
                    getAllQuestion();
                }


                else
                if (tv_question.getText().equals(Question6) && rb_answer3.isChecked()){
                    rb_answer3.setChecked(false);
                    getAllQuestion();
                }






            }
        });

    }
    public void getAllQuestion (){
    ArrayList<First_Second_Third_View_Quiz> firstView = db.getAllQuestion();
    for (First_Second_Third_View_Quiz quiz : firstView){
        tv_question.setText(quiz.getQuestion());
        rb_answer1.setText(quiz.getFirstAnswer());
        rb_answer2.setText(quiz.getSecondAnswer());
        rb_answer3.setText(quiz.getThirdAnswer());
    }
    }
}