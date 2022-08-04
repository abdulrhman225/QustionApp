package com.example.questionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.util.ArrayList;

public class SecondView extends AppCompatActivity {




    TextView tv_question;
    RadioButton rb_answer1, rb_answer2 , rb_answer3;
    RadioGroup rg;
    Dialog dialog ;
    first_second_third_Activity_DataBase db = new first_second_third_Activity_DataBase(this);


    //radioButton1
    public static String Question1 = "ما اسم عاصمة ألبانيا؟";
    String Q1_answer1 ="تيرانا";
    String Q1_2 ="كتمندو";
    String Q1_3 ="ساوتومي";

    //radioButton3
    public static String Question2 = "ما اسم الشعب الذي وضع الحروف الهجائية؟";
    String Q2_answer1 ="الأغريق ";
    String Q2_2 ="العرب ";
    String Q2_3 ="الفينيقيين";

    //radioButton2
    public static String Question3 = "في أي مكان اخترع فيه البارود لأول مرة؟";
    String Q3_answer1 ="العرب ";
    String Q3_2 ="الصين ";
    String Q3_3 ="الروم";

    //radioButton1
    public static String Question4 = "ما اسم الدولة التي شاهدت التلفزيون لأول مرة في التاريخ؟";
    String Q4_answer1 ="أمريكا ";
    String Q4_2 ="أوروبا ";
    String Q4_3 ="مصر";

    //radioButton2
    public static String Question5 = "ما اسم عاصمة السنغال؟";
    String Q5_answer1 ="أبيدجان";
    String Q5_2 ="داكار";
    String Q5_3 ="سكوبيا";

    //radioButton3
    public static String Question6 = "ما اسم المدينة الأوروبية التي يطلق عليها اسم مدينة الضباب؟";
    String Q6_answer1 ="باريس ";
    String Q6_2 ="نيويورك ";
    String Q6_3 ="لندن";

    //radioButton2
    public static String Question7 = "ما هو اسم أكبر دولة من حيث المساحة بداخل  أفريقيا؟";
    String Q7_answer1 ="مصر";
    String Q7_2 ="السودان";
    String Q7_3 ="موريتانيا";

    //radioButton1
    public static String Question8 = "أي بلد تحد فلسطين من جهة الشرق؟";
    String Q8_answer1 ="الأردن ";
    String Q8_2 ="لبنان ";
    String Q8_3 ="مصر";

    //radioButton2
    public static  String Question9 = "في أي مكان توجد صخرة إيرس؟";
    String Q9_answer1 ="البرازيل ";
    String Q9_2 ="استراليا ";
    String Q9_3 ="روسيا";

    //radioButton1
    public static String Question10 = "ما معنى اسم لوس أنجلوس؟";
    String Q10_answer1 ="مدينة الملائكة";
    String Q10_2 ="مدينة الحدائق";
    String Q10_3 ="مدينة الكنوز";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_view);

        tv_question = findViewById(R.id.Second_View_tv_question);
        rb_answer1 = findViewById(R.id.Second_View_rb_answer1);
        rb_answer2 = findViewById(R.id.Second_View_rb_answer2);
        rb_answer3 = findViewById(R.id.Second_View_rb_answer3);
        rg = findViewById(R.id.Second_View_rg);

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

       rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.Second_View_rb_answer1:
                        rb_answer1.setChecked(false);
                        if (tv_question.getText().equals(Question1)) {
                            Thread thread = new Thread(new Runnable() {
                                @Override
                                public void run() {
                                    for (int i = 0 ; i<= 7 ; i++){
                                        try {
                                            Thread.sleep(1000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }

                                        int finalI = i;
                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {
                                                if (finalI == 0 ){
                                                    rb_answer1.setBackgroundColor(getResources().getColor(R.color.Red));
                                                }

                                                else
                                                    if (finalI == 1 ){
                                                    rb_answer1.setBackgroundColor(getResources().getColor(R.color.Green));
                                                }
                                                else
                                                    if (finalI == 2 ){
                                                    rb_answer1.setBackgroundColor(getResources().getColor(R.color.Red));
                                                }
                                                else if (finalI == 3 ){
                                                    rb_answer1.setBackgroundColor(getResources().getColor(R.color.Green));
                                                }

                                                else if (finalI == 4 ){
                                                    rb_answer1.setBackgroundColor(getResources().getColor(R.color.Red));
                                                }
                                                else if (finalI == 5 ){
                                                    rb_answer1.setBackgroundColor(getResources().getColor(R.color.Green));
                                                }
                                                else if (finalI == 6 ){
                                                   getAllQuestion();
                                                   rb_answer1.setChecked(false);
                                                   rb_answer1.setBackgroundColor(getResources().getColor(R.color.white));
                                                }

                                            }
                                        });
                                    }
                                }
                            });thread.start();
                        }
                            else
                                if(tv_question.getText().equals(Question4)){
                                    Thread thread = new Thread(new Runnable() {
                                        @Override
                                        public void run() {
                                            for (int i = 0 ; i<= 7 ; i++){
                                                try {
                                                    Thread.sleep(1000);
                                                } catch (InterruptedException e) {
                                                    e.printStackTrace();
                                                }

                                                int finalI = i;
                                                runOnUiThread(new Runnable() {
                                                    @Override
                                                    public void run() {
                                                        if (finalI == 0 ){
                                                            rb_answer1.setBackgroundColor(getResources().getColor(R.color.Red));
                                                        }

                                                        else
                                                        if (finalI == 1 ){
                                                            rb_answer1.setBackgroundColor(getResources().getColor(R.color.Green));
                                                        }
                                                        else
                                                        if (finalI == 2 ){
                                                            rb_answer1.setBackgroundColor(getResources().getColor(R.color.Red));
                                                        }
                                                        else if (finalI == 3 ){
                                                            rb_answer1.setBackgroundColor(getResources().getColor(R.color.Green));
                                                        }

                                                        else if (finalI == 4 ){
                                                            rb_answer1.setBackgroundColor(getResources().getColor(R.color.Red));
                                                        }
                                                        else if (finalI == 5 ){
                                                            rb_answer1.setBackgroundColor(getResources().getColor(R.color.Green));
                                                        }
                                                        else if (finalI == 6 ){
                                                            getAllQuestion();
                                                            rb_answer1.setChecked(false);
                                                            rb_answer1.setBackgroundColor(getResources().getColor(R.color.white));
                                                        }

                                                    }
                                                });
                                            }
                                        }
                                    });thread.start();
                            }


                            else
                                if (tv_question.getText().equals(Question8)){
                                    Thread thread = new Thread(new Runnable() {
                                        @Override
                                        public void run() {
                                            for (int i = 0 ; i<= 7 ; i++){
                                                try {
                                                    Thread.sleep(1000);
                                                } catch (InterruptedException e) {
                                                    e.printStackTrace();
                                                }

                                                int finalI = i;
                                                runOnUiThread(new Runnable() {
                                                    @Override
                                                    public void run() {
                                                        if (finalI == 0 ){
                                                            rb_answer1.setBackgroundColor(getResources().getColor(R.color.Red));
                                                        }

                                                        else
                                                        if (finalI == 1 ){
                                                            rb_answer1.setBackgroundColor(getResources().getColor(R.color.Green));
                                                        }
                                                        else
                                                        if (finalI == 2 ){
                                                            rb_answer1.setBackgroundColor(getResources().getColor(R.color.Red));
                                                        }
                                                        else if (finalI == 3 ){
                                                            rb_answer1.setBackgroundColor(getResources().getColor(R.color.Green));
                                                        }

                                                        else if (finalI == 4 ){
                                                            rb_answer1.setBackgroundColor(getResources().getColor(R.color.Red));
                                                        }
                                                        else if (finalI == 5 ){
                                                            rb_answer1.setBackgroundColor(getResources().getColor(R.color.Green));
                                                        }
                                                        else if (finalI == 6 ){
                                                            getAllQuestion();
                                                            rb_answer1.setChecked(false);
                                                            rb_answer1.setBackgroundColor(getResources().getColor(R.color.white));
                                                        }

                                                    }
                                                });
                                            }
                                        }
                                    });     thread.start();                   }

                            else
                                if (tv_question.getText().equals(Question10)){
                                    Thread thread = new Thread(new Runnable() {
                                        @Override
                                        public void run() {
                                            for (int i = 0 ; i<= 7 ; i++){
                                                try {
                                                    Thread.sleep(1000);
                                                } catch (InterruptedException e) {
                                                    e.printStackTrace();
                                                }

                                                int finalI = i;
                                                runOnUiThread(new Runnable() {
                                                    @Override
                                                    public void run() {
                                                        if (finalI == 0 ){
                                                            rb_answer1.setBackgroundColor(getResources().getColor(R.color.Red));
                                                        }

                                                        else
                                                        if (finalI == 1 ){
                                                            rb_answer1.setBackgroundColor(getResources().getColor(R.color.Green));
                                                        }
                                                        else
                                                        if (finalI == 2 ){
                                                            rb_answer1.setBackgroundColor(getResources().getColor(R.color.Red));
                                                        }
                                                        else if (finalI == 3 ){
                                                            rb_answer1.setBackgroundColor(getResources().getColor(R.color.Green));
                                                        }

                                                        else if (finalI == 4 ){
                                                            rb_answer1.setBackgroundColor(getResources().getColor(R.color.Red));
                                                        }
                                                        else if (finalI == 5 ){
                                                            rb_answer1.setBackgroundColor(getResources().getColor(R.color.Green));
                                                        }
                                                        else if (finalI == 6 ){
                                                            getAllQuestion();
                                                            rb_answer1.setChecked(false);
                                                            rb_answer1.setBackgroundColor(getResources().getColor(R.color.white));
                                                        }

                                                    }
                                                });
                                            }
                                        }
                                    });thread.start();
                        }


                                else{
                                    Thread thread = new Thread(new Runnable() {
                                        @Override
                                        public void run() {
                                            for (int i = 0 ; i<= 7 ; i++){
                                                try {
                                                    Thread.sleep(1000);
                                                } catch (InterruptedException e) {
                                                    e.printStackTrace();
                                                }

                                                int finalI = i;
                                                runOnUiThread(new Runnable() {
                                                    @Override
                                                    public void run() {
                                                        if (finalI == 0 ){
                                                            rb_answer1.setBackgroundColor(getResources().getColor(R.color.Red));
                                                        }

                                                        else
                                                        if (finalI == 1 ){
                                                            rb_answer1.setBackgroundColor(getResources().getColor(R.color.Green));
                                                        }
                                                        else
                                                        if (finalI == 2 ){
                                                            rb_answer1.setBackgroundColor(getResources().getColor(R.color.Red));
                                                        }
                                                        else if (finalI == 3 ){
                                                            rb_answer1.setBackgroundColor(getResources().getColor(R.color.Green));
                                                        }

                                                        else if (finalI == 4 ){
                                                            rb_answer1.setBackgroundColor(getResources().getColor(R.color.Red));
                                                        }
                                                        else if (finalI == 5 ){
                                                            rb_answer1.setBackgroundColor(getResources().getColor(R.color.Red));
                                                        }
                                                        else if (finalI == 6 ){
                                                            rb_answer1.setBackgroundColor(getResources().getColor(R.color.white));
                                                            dialog.show();

                                                        }

                                                    }
                                                });
                                            }
                                        }
                                    });thread.start();
                                }


                        break;


                                case R.id.Second_View_rb_answer2:
                                    rb_answer2.setChecked(false);

                        if (tv_question.getText().equals(Question3) ){
                            Thread thread = new Thread(new Runnable() {
                                @Override
                                public void run() {
                                    for (int i = 0 ; i<= 7 ; i++){
                                        try {
                                            Thread.sleep(1000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }

                                        int finalI = i;
                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {
                                                if (finalI == 0 ){
                                                    rb_answer2.setBackgroundColor(getResources().getColor(R.color.Red));
                                                }

                                                else
                                                if (finalI == 1 ){
                                                    rb_answer2.setBackgroundColor(getResources().getColor(R.color.Green));
                                                }
                                                else
                                                if (finalI == 2 ){
                                                    rb_answer2.setBackgroundColor(getResources().getColor(R.color.Red));
                                                }
                                                else if (finalI == 3 ){
                                                    rb_answer2.setBackgroundColor(getResources().getColor(R.color.Green));
                                                }

                                                else if (finalI == 4 ){
                                                    rb_answer2.setBackgroundColor(getResources().getColor(R.color.Red));
                                                }
                                                else if (finalI == 5 ){
                                                    rb_answer2.setBackgroundColor(getResources().getColor(R.color.Green));
                                                }
                                                else if (finalI == 6 ){
                                                    getAllQuestion();
                                                    rb_answer2.setChecked(false);
                                                    rb_answer2.setBackgroundColor(getResources().getColor(R.color.white));

                                                }

                                            }
                                        });
                                    }
                                }
                            });thread.start();
                        }


                        else
                            if (tv_question.getText().equals(Question5)){
                                Thread thread = new Thread(new Runnable() {
                                    @Override
                                    public void run() {
                                        for (int i = 0 ; i<= 7 ; i++){
                                            try {
                                                Thread.sleep(1000);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }

                                            int finalI = i;
                                            runOnUiThread(new Runnable() {
                                                @Override
                                                public void run() {
                                                    if (finalI == 0 ){
                                                        rb_answer2.setBackgroundColor(getResources().getColor(R.color.Red));
                                                    }

                                                    else
                                                    if (finalI == 1 ){
                                                        rb_answer2.setBackgroundColor(getResources().getColor(R.color.Green));
                                                    }
                                                    else
                                                    if (finalI == 2 ){
                                                        rb_answer2.setBackgroundColor(getResources().getColor(R.color.Red));
                                                    }
                                                    else if (finalI == 3 ){
                                                        rb_answer2.setBackgroundColor(getResources().getColor(R.color.Green));
                                                    }

                                                    else if (finalI == 4 ){
                                                        rb_answer2.setBackgroundColor(getResources().getColor(R.color.Red));
                                                    }
                                                    else if (finalI == 5 ){
                                                        rb_answer2.setBackgroundColor(getResources().getColor(R.color.Green));
                                                    }
                                                    else if (finalI == 6 ){
                                                        getAllQuestion();
                                                        rb_answer2.setChecked(false);
                                                        rb_answer2.setBackgroundColor(getResources().getColor(R.color.white));
                                                    }

                                                }
                                            });
                                        }
                                    }
                                }); thread.start();                       }


                        else
                            if (tv_question.getText().equals(Question7)){
                                Thread thread = new Thread(new Runnable() {
                                    @Override
                                    public void run() {
                                        for (int i = 0 ; i<= 7 ; i++){
                                            try {
                                                Thread.sleep(1000);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }

                                            int finalI = i;
                                            runOnUiThread(new Runnable() {
                                                @Override
                                                public void run() {
                                                    if (finalI == 0 ){
                                                        rb_answer2.setBackgroundColor(getResources().getColor(R.color.Red));
                                                    }

                                                    else
                                                    if (finalI == 1 ){
                                                        rb_answer2.setBackgroundColor(getResources().getColor(R.color.Green));
                                                    }
                                                    else
                                                    if (finalI == 2 ){
                                                        rb_answer2.setBackgroundColor(getResources().getColor(R.color.Red));
                                                    }
                                                    else if (finalI == 3 ){
                                                        rb_answer2.setBackgroundColor(getResources().getColor(R.color.Green));
                                                    }

                                                    else if (finalI == 4 ){
                                                        rb_answer2.setBackgroundColor(getResources().getColor(R.color.Red));
                                                    }
                                                    else if (finalI == 5 ){
                                                        rb_answer2.setBackgroundColor(getResources().getColor(R.color.Green));
                                                    }
                                                    else if (finalI == 6 ){
                                                        getAllQuestion();
                                                        rb_answer2.setChecked(false);
                                                        rb_answer2.setBackgroundColor(getResources().getColor(R.color.white));
                                                    }

                                                }
                                            });
                                        }
                                    }
                                });    thread.start();                    }


                            else
                            if (tv_question.getText().equals(Question9)){
                                Thread thread = new Thread(new Runnable() {
                                    @Override
                                    public void run() {
                                        for (int i = 0 ; i<= 7 ; i++){
                                            try {
                                                Thread.sleep(1000);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }

                                            int finalI = i;
                                            runOnUiThread(new Runnable() {
                                                @Override
                                                public void run() {
                                                    if (finalI == 0 ){
                                                        rb_answer2.setBackgroundColor(getResources().getColor(R.color.Red));
                                                    }

                                                    else
                                                    if (finalI == 1 ){
                                                        rb_answer2.setBackgroundColor(getResources().getColor(R.color.Green));
                                                    }
                                                    else
                                                    if (finalI == 2 ){
                                                        rb_answer2.setBackgroundColor(getResources().getColor(R.color.Red));
                                                    }
                                                    else if (finalI == 3 ){
                                                        rb_answer2.setBackgroundColor(getResources().getColor(R.color.Green));
                                                    }

                                                    else if (finalI == 4 ){
                                                        rb_answer2.setBackgroundColor(getResources().getColor(R.color.Red));
                                                    }
                                                    else if (finalI == 5 ){
                                                        rb_answer2.setBackgroundColor(getResources().getColor(R.color.Green));
                                                    }
                                                    else if (finalI == 6 ){
                                                        getAllQuestion();
                                                        rb_answer2.setChecked(false);
                                                        rb_answer2.setBackgroundColor(getResources().getColor(R.color.white));
                                                    }

                                                }
                                            });
                                        }
                                    }
                                });      thread.start();                      }


                            else {
                                Thread thread = new Thread(new Runnable() {
                                    @Override
                                    public void run() {
                                        for (int i = 0 ; i<= 7 ; i++){
                                            try {
                                                Thread.sleep(1000);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }

                                            int finalI = i;
                                            runOnUiThread(new Runnable() {
                                                @Override
                                                public void run() {
                                                    if (finalI == 0 ){
                                                        rb_answer2.setBackgroundColor(getResources().getColor(R.color.Red));
                                                    }

                                                    else
                                                    if (finalI == 1 ){
                                                        rb_answer2.setBackgroundColor(getResources().getColor(R.color.Green));
                                                    }
                                                    else
                                                    if (finalI == 2 ){
                                                        rb_answer2.setBackgroundColor(getResources().getColor(R.color.Red));
                                                    }
                                                    else if (finalI == 3 ){
                                                        rb_answer2.setBackgroundColor(getResources().getColor(R.color.Green));
                                                    }

                                                    else if (finalI == 4 ){
                                                        rb_answer2.setBackgroundColor(getResources().getColor(R.color.Red));
                                                    }
                                                    else if (finalI == 5 ){
                                                        rb_answer2.setBackgroundColor(getResources().getColor(R.color.Red));
                                                    }
                                                    else if (finalI == 6 ){
                                                        rb_answer2.setBackgroundColor(getResources().getColor(R.color.white));
                                                        dialog.show();
                                                    }

                                                }
                                            });
                                        }
                                    }
                                });      thread.start();
                            }

                            break;


                    case R.id.Second_View_rb_answer3:
                        rb_answer3.setChecked(false);

                        if (tv_question.getText().equals(Question2) ){
                            Thread thread = new Thread(new Runnable() {
                                @Override
                                public void run() {
                                    for (int i = 0 ; i<= 7 ; i++){
                                        try {
                                            Thread.sleep(1000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }

                                        int finalI = i;
                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {
                                                if (finalI == 0 ){
                                                    rb_answer3.setBackgroundColor(getResources().getColor(R.color.Red));
                                                }

                                                else
                                                if (finalI == 1 ){
                                                    rb_answer3.setBackgroundColor(getResources().getColor(R.color.Green));
                                                }
                                                else
                                                if (finalI == 2 ){
                                                    rb_answer3.setBackgroundColor(getResources().getColor(R.color.Red));
                                                }
                                                else if (finalI == 3 ){
                                                    rb_answer3.setBackgroundColor(getResources().getColor(R.color.Green));
                                                }

                                                else if (finalI == 4 ){
                                                    rb_answer3.setBackgroundColor(getResources().getColor(R.color.Red));
                                                }
                                                else if (finalI == 5 ){
                                                    rb_answer3.setBackgroundColor(getResources().getColor(R.color.Green));
                                                }
                                                else if (finalI == 6 ){
                                                    getAllQuestion();
                                                    rb_answer3.setChecked(false);
                                                    rb_answer3.setBackgroundColor(getResources().getColor(R.color.white));
                                                }

                                            }
                                        });
                                    }
                                }
                            });     thread.start();                  }



                        else
                            if (tv_question.getText().equals(Question6)){
                                Thread thread = new Thread(new Runnable() {
                                    @Override
                                    public void run() {
                                        for (int i = 0 ; i<= 7 ; i++){
                                            try {
                                                Thread.sleep(1000);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }

                                            int finalI = i;
                                            runOnUiThread(new Runnable() {
                                                @Override
                                                public void run() {
                                                    if (finalI == 0 ){
                                                        rb_answer3.setBackgroundColor(getResources().getColor(R.color.Red));
                                                    }

                                                    else
                                                    if (finalI == 1 ){
                                                        rb_answer3.setBackgroundColor(getResources().getColor(R.color.Green));
                                                    }
                                                    else
                                                    if (finalI == 2 ){
                                                        rb_answer3.setBackgroundColor(getResources().getColor(R.color.Red));
                                                    }
                                                    else if (finalI == 3 ){
                                                        rb_answer3.setBackgroundColor(getResources().getColor(R.color.Green));
                                                    }

                                                    else if (finalI == 4 ){
                                                        rb_answer3.setBackgroundColor(getResources().getColor(R.color.Red));
                                                    }
                                                    else if (finalI == 5 ){
                                                        rb_answer3.setBackgroundColor(getResources().getColor(R.color.Green));
                                                    }
                                                    else if (finalI == 6 ){
                                                        getAllQuestion();
                                                        rb_answer3.setChecked(false);
                                                        rb_answer3.setBackgroundColor(getResources().getColor(R.color.white));
                                                    }

                                                }
                                            });
                                        }
                                    }
                                }); thread.start();
                            }
                            else{
                                Thread thread = new Thread(new Runnable() {
                                    @Override
                                    public void run() {
                                        for (int i = 0 ; i<= 7 ; i++){
                                            try {
                                                Thread.sleep(1000);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }

                                            int finalI = i;
                                            runOnUiThread(new Runnable() {
                                                @Override
                                                public void run() {
                                                    if (finalI == 0 ){
                                                        rb_answer3.setBackgroundColor(getResources().getColor(R.color.Red));
                                                    }

                                                    else
                                                    if (finalI == 1 ){
                                                        rb_answer3.setBackgroundColor(getResources().getColor(R.color.Green));
                                                    }
                                                    else
                                                    if (finalI == 2 ){
                                                        rb_answer3.setBackgroundColor(getResources().getColor(R.color.Red));
                                                    }
                                                    else if (finalI == 3 ){
                                                        rb_answer3.setBackgroundColor(getResources().getColor(R.color.Green));
                                                    }

                                                    else if (finalI == 4 ){
                                                        rb_answer3.setBackgroundColor(getResources().getColor(R.color.Red));
                                                    }
                                                    else if (finalI == 5 ){
                                                        rb_answer3.setBackgroundColor(getResources().getColor(R.color.Red));
                                                    }
                                                    else if (finalI == 6 ){
                                                        rb_answer3.setBackgroundColor(getResources().getColor(R.color.white));
                                                       dialog.show();
                                                    }

                                                }
                                            });
                                        }
                                    }
                                }); thread.start();

                            }

                }

            }
        });



    }

    public void getAllQuestion() {
        ArrayList<First_Second_Third_View_Quiz> quiz = db.getAllQuestion();
        for (First_Second_Third_View_Quiz SecondView : quiz) {
            tv_question.setText(  SecondView.getQuestion() );
            rb_answer1.setText( SecondView.getFirstAnswer());
            rb_answer2.setText(SecondView.getSecondAnswer());
            rb_answer3.setText( SecondView.getThirdAnswer());
        }
    }

}
