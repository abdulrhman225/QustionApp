package com.example.questionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ThirdView extends AppCompatActivity {
    TextView tv_Question;
    TextView tv_answer;
    Button btn1, btn2, btn3 ,btn4 , btn5 , btn6 , btn7 , btn8 , btn_next , btn_empty;
    first_second_third_Activity_DataBase db = new first_second_third_Activity_DataBase(this);
    Dialog dialog;
    ArrayList<String> withOutRepeat = new ArrayList<>();


    String Question1 = "يضرب به المثل في الحفظ فيقال أحفظ من";
    String button_Q1_1 = "ش";  String button_Q1_2 = "ع"; String button_Q1_3 = "ا"; String button_Q1_4= "غ";
    String button_Q1_5 = "ل";  String button_Q1_6 = "ي"; String button_Q1_7 = "ب"; String button_Q1_8= "ت";
    String Answer1 = "الشعبي";



    String Question2 = "قال تعالى(وفرعون ذي الأوتاد)سورة الفجر (10) المقصود بـ (الأوتاد) هي";
    String button_Q2_1 = "ا";  String button_Q2_2 = "ه"; String button_Q2_3 = "ا"; String button_Q2_4= "ا";
    String button_Q2_5 = "ى";  String button_Q2_6 = "ل"; String button_Q2_7 = "ر"; String button_Q2_8= "م";
    String Answer2 = "الاهرام";


    String Question3 = "الغزوة التي تسمى غزوة أوطاس أيضاَ هي غزوة";
    String button_Q3_1 = "ب";  String button_Q3_2 = "ي"; String button_Q3_3 = "ن"; String button_Q3_4= "ى";
    String button_Q3_5 = "ح";  String button_Q3_6 = "ن"; String button_Q3_7 = "و"; String button_Q3_8= "ت";
    String Answer3 = "حنين";


    String Question4 = "اللون الذي لا يمكن للنحل رؤيته هو اللون";
    String button_Q4_1 = "ت";  String button_Q4_2 = "ب"; String button_Q4_3 = "ع"; String button_Q4_4= "ض";
    String button_Q4_5 = "ل";  String button_Q4_6 = "ا"; String button_Q4_7 = "ي"; String button_Q4_8= "ا";
    String Answer4 = "الابيض";


    String Question5 = "في أي دولة تم أفتتاح أول مترو أنفاق في العالم";
    String button_Q5_1 = "ن";  String button_Q5_2 = "ج"; String button_Q5_3 = "ت"; String button_Q5_4= "ل";
    String button_Q5_5 = "ا";  String button_Q5_6 = "ر"; String button_Q5_7 = "و"; String button_Q5_8= "ا";
    String Answer5 = "انجلترا";


    String Question6 = "حيوان يضرب به المثل في الخيانة فيقال أخون من";
    String button_Q6_1 = "ذ";  String button_Q6_2 = "ب"; String button_Q6_3 = "ت"; String button_Q6_4= "ز";
    String button_Q6_5 = "س";  String button_Q6_6 = "ئ"; String button_Q6_7 = "و"; String button_Q6_8= "غ";
    String Answer6 = "ذئب";


    String Question7 = "أول دول العالم إنتاجاً للصمغ هي";
    String button_Q7_1 = "ا";  String button_Q7_2 = "ل"; String button_Q7_3 = "ق"; String button_Q7_4= "س";
    String button_Q7_5 = "و";  String button_Q7_6 = "ن"; String button_Q7_7 = "د"; String button_Q7_8= "ا";
    String Answer7 = "السودان";


    String Question8 = "حيوان يضرب به في الروى فيقال أروى من";
    String button_Q8_1 = "ع";  String button_Q8_2 = "ض"; String button_Q8_3 = "غ"; String button_Q8_4= "و";
    String button_Q8_5 = "ب";  String button_Q8_6 = "ى"; String button_Q8_7 = "ئ"; String button_Q8_8= "د";
    String Answer8 = "ضب";


    String Question9 = "ما هي جنسية العالم الفيزيائي جورج أوهم الذي أكتشف القوانين الأساسية للتيار الكهربائي";
    String button_Q9_1 = "ا";  String button_Q9_2 = "ل"; String button_Q9_3 = "ي"; String button_Q9_4= "س";
    String button_Q9_5 = "ا";  String button_Q9_6 = "ط"; String button_Q9_7 = "م"; String button_Q9_8= "ن";
    String Answer9 = "الماني";


    String Question10 = "من الولاة الذين حكموا الدول العربية في القرن العشرين منصف باي بن الناصر باي فقد حكم من عام 1942م وحتى عام 1943م دولة";
    String button_Q10_1 = "ي";  String button_Q10_2 = "ب"; String button_Q10_3 = "ت"; String button_Q10_4= "غ";
    String button_Q10_5 = "و";  String button_Q10_6 = "س"; String button_Q10_7 = "خ"; String button_Q10_8= "ن";
    String Answer10 = "تونس";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_view);

        tv_Question = findViewById(R.id.Third_View_tv_question);
        tv_answer = findViewById(R.id.third_view_tv_answer);
        btn1  = findViewById(R.id.third_View_btn1);
        btn2  = findViewById(R.id.third_View_btn2);
        btn3  = findViewById(R.id.third_View_btn3);
        btn4  = findViewById(R.id.third_View_btn4);
        btn5  = findViewById(R.id.third_View_btn5);
        btn6  = findViewById(R.id.third_View_btn6);
        btn7  = findViewById(R.id.third_View_btn7);
        btn8  = findViewById(R.id.third_View_btn8);
        btn_next = findViewById(R.id.third_View_btn_next);
        btn_empty =  findViewById(R.id.third_View_btn_empty);

        Intent intent = getIntent();



        First_Second_Third_View_Quiz q1 = new First_Second_Third_View_Quiz(Question1 , button_Q1_1 , button_Q1_2 , button_Q1_3 , button_Q1_4,
                button_Q1_5, button_Q1_6, button_Q1_7 , button_Q1_8);

        First_Second_Third_View_Quiz q2 = new First_Second_Third_View_Quiz(Question2 , button_Q2_1 , button_Q2_2 , button_Q2_3 , button_Q2_4,
                button_Q2_5, button_Q2_6, button_Q2_7 , button_Q2_8);

        First_Second_Third_View_Quiz q3 = new First_Second_Third_View_Quiz(Question3 , button_Q3_1 , button_Q3_2 , button_Q3_3 , button_Q3_4,
                button_Q3_5, button_Q3_6, button_Q3_7 , button_Q3_8);

        First_Second_Third_View_Quiz q4 = new First_Second_Third_View_Quiz(Question4 , button_Q4_1 , button_Q4_2 , button_Q4_3 , button_Q4_4,
                button_Q4_5, button_Q4_6, button_Q4_7 , button_Q4_8);

        First_Second_Third_View_Quiz q5 = new First_Second_Third_View_Quiz(Question5 , button_Q5_1 , button_Q5_2 , button_Q5_3 , button_Q5_4,
                button_Q5_5, button_Q5_6, button_Q5_7 , button_Q5_8);

        First_Second_Third_View_Quiz q6 = new First_Second_Third_View_Quiz(Question6 , button_Q6_1 , button_Q6_2 , button_Q6_3 , button_Q6_4,
                button_Q6_5, button_Q6_6, button_Q6_7 , button_Q6_8);

        First_Second_Third_View_Quiz q7 = new First_Second_Third_View_Quiz(Question7 , button_Q7_1 , button_Q7_2 , button_Q7_3 , button_Q7_4,
                button_Q7_5, button_Q7_6, button_Q7_7 , button_Q7_8);

        First_Second_Third_View_Quiz q8 = new First_Second_Third_View_Quiz(Question8 , button_Q8_1 , button_Q8_2 , button_Q8_3 , button_Q8_4,
                button_Q8_5, button_Q8_6, button_Q8_7 , button_Q8_8);

        First_Second_Third_View_Quiz q9 = new First_Second_Third_View_Quiz(Question9 , button_Q9_1 , button_Q9_2 , button_Q9_3 , button_Q9_4,
                button_Q9_5, button_Q9_6, button_Q9_7 , button_Q9_8);

        First_Second_Third_View_Quiz q10 = new First_Second_Third_View_Quiz(Question10 , button_Q10_1 , button_Q10_2 , button_Q10_3 , button_Q10_4,
                button_Q10_5, button_Q10_6, button_Q10_7 , button_Q10_8);

        db.insert2(q1);
        db.insert2(q2);
        db.insert2(q3);
        db.insert2(q4);
        db.insert2(q5);
        db.insert2(q6);
        db.insert2(q7);
        db.insert2(q8);
        db.insert2(q9);
        db.insert2(q10);

        getAllQuestion();


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String yourAnswer = tv_answer.getText().toString();
                tv_answer.setText(yourAnswer + btn1.getText());
                btn1.setVisibility(View.INVISIBLE);
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String yourAnswer = tv_answer.getText().toString();
                tv_answer.setText(yourAnswer + btn2.getText());
                btn2.setVisibility(View.INVISIBLE);

            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String yourAnswer = tv_answer.getText().toString();
                tv_answer.setText(yourAnswer + btn3.getText());
                btn3.setVisibility(View.INVISIBLE);
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String yourAnswer = tv_answer.getText().toString();
                tv_answer.setText(yourAnswer + btn4.getText());
                btn4.setVisibility(View.INVISIBLE);
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String yourAnswer = tv_answer.getText().toString();
                tv_answer.setText(yourAnswer + btn5.getText());
                btn5.setVisibility(View.INVISIBLE);
            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String yourAnswer = tv_answer.getText().toString();
                tv_answer.setText(yourAnswer + btn6.getText());
                btn6.setVisibility(View.INVISIBLE);
            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String yourAnswer = tv_answer.getText().toString();
                tv_answer.setText(yourAnswer + btn7.getText());
                btn7.setVisibility(View.INVISIBLE);
            }
        });


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String yourAnswer = tv_answer.getText().toString();
                tv_answer.setText(yourAnswer + btn8.getText());
                btn8.setVisibility(View.INVISIBLE);
            }
        });


        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (tv_Question.getText().equals(Question1) && tv_answer.getText().equals(Answer1)){
                    getAllQuestion();
                    tv_answer.setText("");
                    btn1.setVisibility(View.VISIBLE);
                    btn2.setVisibility(View.VISIBLE);
                    btn3.setVisibility(View.VISIBLE);
                    btn4.setVisibility(View.VISIBLE);
                    btn5.setVisibility(View.VISIBLE);
                    btn6.setVisibility(View.VISIBLE);
                    btn7.setVisibility(View.VISIBLE);
                    btn8.setVisibility(View.VISIBLE);
                }

               else if (tv_Question.getText().equals(Question2) && tv_answer.getText().equals(Answer2)){
                    getAllQuestion();
                    tv_answer.setText("");
                    btn1.setVisibility(View.VISIBLE);
                    btn2.setVisibility(View.VISIBLE);
                    btn3.setVisibility(View.VISIBLE);
                    btn4.setVisibility(View.VISIBLE);
                    btn5.setVisibility(View.VISIBLE);
                    btn6.setVisibility(View.VISIBLE);
                    btn7.setVisibility(View.VISIBLE);
                    btn8.setVisibility(View.VISIBLE);
                }

               else if (tv_Question.getText().equals(Question3) && tv_answer.getText().equals(Answer3)){
                    getAllQuestion();
                    tv_answer.setText("");
                    btn1.setVisibility(View.VISIBLE);
                    btn2.setVisibility(View.VISIBLE);
                    btn3.setVisibility(View.VISIBLE);
                    btn4.setVisibility(View.VISIBLE);
                    btn5.setVisibility(View.VISIBLE);
                    btn6.setVisibility(View.VISIBLE);
                    btn7.setVisibility(View.VISIBLE);
                    btn8.setVisibility(View.VISIBLE);
                }

               else if (tv_Question.getText().equals(Question4) && tv_answer.getText().equals(Answer4)){
                    getAllQuestion();
                    tv_answer.setText("");
                    btn1.setVisibility(View.VISIBLE);
                    btn2.setVisibility(View.VISIBLE);
                    btn3.setVisibility(View.VISIBLE);
                    btn4.setVisibility(View.VISIBLE);
                    btn5.setVisibility(View.VISIBLE);
                    btn6.setVisibility(View.VISIBLE);
                    btn7.setVisibility(View.VISIBLE);
                    btn8.setVisibility(View.VISIBLE);
                }

               else  if (tv_Question.getText().equals(Question5) && tv_answer.getText().equals(Answer5)){
                    getAllQuestion();
                    tv_answer.setText("");
                    btn1.setVisibility(View.VISIBLE);
                    btn2.setVisibility(View.VISIBLE);
                    btn3.setVisibility(View.VISIBLE);
                    btn4.setVisibility(View.VISIBLE);
                    btn5.setVisibility(View.VISIBLE);
                    btn6.setVisibility(View.VISIBLE);
                    btn7.setVisibility(View.VISIBLE);
                    btn8.setVisibility(View.VISIBLE);
                }

               else  if (tv_Question.getText().equals(Question6) && tv_answer.getText().equals(Answer6)){
                    getAllQuestion();
                    tv_answer.setText("");
                    btn1.setVisibility(View.VISIBLE);
                    btn2.setVisibility(View.VISIBLE);
                    btn3.setVisibility(View.VISIBLE);
                    btn4.setVisibility(View.VISIBLE);
                    btn5.setVisibility(View.VISIBLE);
                    btn6.setVisibility(View.VISIBLE);
                    btn7.setVisibility(View.VISIBLE);
                    btn8.setVisibility(View.VISIBLE);
                }

               else  if (tv_Question.getText().equals(Question7) && tv_answer.getText().equals(Answer7)){
                    getAllQuestion();
                    tv_answer.setText("");
                    btn1.setVisibility(View.VISIBLE);
                    btn2.setVisibility(View.VISIBLE);
                    btn3.setVisibility(View.VISIBLE);
                    btn4.setVisibility(View.VISIBLE);
                    btn5.setVisibility(View.VISIBLE);
                    btn6.setVisibility(View.VISIBLE);
                    btn7.setVisibility(View.VISIBLE);
                    btn8.setVisibility(View.VISIBLE);
                }

               else  if (tv_Question.getText().equals(Question8) && tv_answer.getText().equals(Answer8)){
                    getAllQuestion();
                    tv_answer.setText("");
                    btn1.setVisibility(View.VISIBLE);
                    btn2.setVisibility(View.VISIBLE);
                    btn3.setVisibility(View.VISIBLE);
                    btn4.setVisibility(View.VISIBLE);
                    btn5.setVisibility(View.VISIBLE);
                    btn6.setVisibility(View.VISIBLE);
                    btn7.setVisibility(View.VISIBLE);
                    btn8.setVisibility(View.VISIBLE);
                }

               else  if (tv_Question.getText().equals(Question9) && tv_answer.getText().equals(Answer9)){
                    getAllQuestion();
                    tv_answer.setText("");
                    btn1.setVisibility(View.VISIBLE);
                    btn2.setVisibility(View.VISIBLE);
                    btn3.setVisibility(View.VISIBLE);
                    btn4.setVisibility(View.VISIBLE);
                    btn5.setVisibility(View.VISIBLE);
                    btn6.setVisibility(View.VISIBLE);
                    btn7.setVisibility(View.VISIBLE);
                    btn8.setVisibility(View.VISIBLE);
                }

               else  if (tv_Question.getText().equals(Question10) && tv_answer.getText().equals(Answer10)){
                    getAllQuestion();
                    tv_answer.setText("");
                    btn1.setVisibility(View.VISIBLE);
                    btn2.setVisibility(View.VISIBLE);
                    btn3.setVisibility(View.VISIBLE);
                    btn4.setVisibility(View.VISIBLE);
                    btn5.setVisibility(View.VISIBLE);
                    btn6.setVisibility(View.VISIBLE);
                    btn7.setVisibility(View.VISIBLE);
                    btn8.setVisibility(View.VISIBLE);
                }
            }
        });

        btn_empty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_answer.setText("");
                btn1.setVisibility(View.VISIBLE);
                btn2.setVisibility(View.VISIBLE);
                btn3.setVisibility(View.VISIBLE);
                btn4.setVisibility(View.VISIBLE);
                btn5.setVisibility(View.VISIBLE);
                btn6.setVisibility(View.VISIBLE);
                btn7.setVisibility(View.VISIBLE);
                btn8.setVisibility(View.VISIBLE);
            }
        });
    }



    public void getAllQuestion() {
        ArrayList<First_Second_Third_View_Quiz> thirdViewQuiz = db.getAllQuestion2();
        for (First_Second_Third_View_Quiz quiz : thirdViewQuiz) {
            if (!(withOutRepeat.contains(quiz.getQuestion2()))){
                withOutRepeat.add(quiz.getQuestion2());
                tv_Question.setText(quiz.getQuestion2());
                btn1.setText(quiz.getButton1());
                btn2.setText(quiz.getButton2());
                btn3.setText(quiz.getButton3());
                btn4.setText(quiz.getButton4());
                btn5.setText(quiz.getButton5());
                btn6.setText(quiz.getButton6());
                btn7.setText(quiz.getButton7());
                btn8.setText(quiz.getButton8());
            }
            else if(withOutRepeat.size() < 10) {
                getAllQuestion();
            }
            else{
                dialog = new Dialog(this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.win_dialog);
                dialog.setCancelable(true);

                Button button_finish = dialog.findViewById(R.id.Custom_win_dialog_finish);
                Button button_tryAgain = dialog.findViewById(R.id.Custom_win_dialog_tryAgain);



                button_finish.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        withOutRepeat.clear();
                        finish();

                    }
                });

                button_tryAgain.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        withOutRepeat.clear();
                        dialog.cancel();
                        getAllQuestion();

                    }
                });
                dialog.show();
            }
        }
    }
}