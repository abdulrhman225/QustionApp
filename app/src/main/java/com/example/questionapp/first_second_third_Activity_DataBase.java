package com.example.questionapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class first_second_third_Activity_DataBase extends SQLiteOpenHelper {
    public static final String DataBaseName = "Quiz";
    public static final int  VERSION = 18;
    public static final String TABLE_NAME2 = "QUIZ1";
    public static final String ID_CLN_NAME_TABLE2 = "ID";
    public static final String Question_CLN_NAME_TABLE2 = "QUESTION1";
    public static final String BUTTON1 = "BUTTON1";
    public static final String BUTTON2 = "BUTTON2";
    public static final String BUTTON3 = "BUTTON3";
    public static final String BUTTON4 = "BUTTON4";
    public static final String BUTTON5 = "BUTTON5";
    public static final String BUTTON6 = "BUTTON6";
    public static final String BUTTON7 = "BUTTON7";
    public static final String BUTTON8 = "BUTTON8";

    public static final String ID_CLN_NAME = "ID";
    public static final String TABLE_NAME1 = "QUIZ";
    public static final String Question_CLN_NAME = "QUESTION";
    public static final String F_ANSWER_CLN_NAME = "FIRST_ANSWER";
    public static final String S_ANSWER_CLN_NAME = "SECOND_ANSWER";
    public static final String T_ANSWER_CLN_NAME = "THIRD_ANSWER";

    @Override
    public SQLiteDatabase getReadableDatabase() {
        return super.getReadableDatabase();
    }

    public first_second_third_Activity_DataBase(Context context) {
        super(context, DataBaseName, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE " +TABLE_NAME1  +"("+ID_CLN_NAME+" INTEGER PRIMARY KEY AUTOINCREMENT ,"
        +Question_CLN_NAME  +" TEXT , " +F_ANSWER_CLN_NAME +" TEXT , " +S_ANSWER_CLN_NAME  + " TEXT ," +T_ANSWER_CLN_NAME +
                " TEXT )");

        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_NAME2 + "("+ID_CLN_NAME_TABLE2+" INTEGER PRIMARY KEY AUTOINCREMENT , "+
                Question_CLN_NAME_TABLE2+" TEXT , " +BUTTON1+" TEXT , " +BUTTON2 +" TEXT , " + BUTTON3 +" TEXT , " +BUTTON4 +" TEXT   , "
                +BUTTON5    + " TEXT ,  " + BUTTON6 +" TEXT , "+BUTTON7  + " TEXT , " + BUTTON8 +" TEXT )");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS  "+TABLE_NAME1);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS  "+TABLE_NAME2);
        onCreate(sqLiteDatabase);
    }


    public boolean insert1 (First_Second_Third_View_Quiz quiz){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Question_CLN_NAME , quiz.getQuestion());
        values.put(F_ANSWER_CLN_NAME , quiz.getFirstAnswer());
        values.put(S_ANSWER_CLN_NAME , quiz.getSecondAnswer());
        values.put(T_ANSWER_CLN_NAME , quiz.getThirdAnswer());
      long res =   db.insert(TABLE_NAME1 , null , values);
      return res!= -1;
    }


    public ArrayList<First_Second_Third_View_Quiz> getAllQuestion(){
        SQLiteDatabase db = getReadableDatabase();
        ArrayList<First_Second_Third_View_Quiz> quizzes = new ArrayList<>();

       Cursor c =  db.rawQuery("SELECT * FROM " +TABLE_NAME1 + " ORDER BY RANDOM() LIMIT 1 " , null);
       if (c.moveToFirst()){
           do {
               String question = c.getString(1);
               String first_answer = c.getString(2);
               String second_answer = c.getString(3);
               String third_answer = c.getString(4);

               First_Second_Third_View_Quiz q = new First_Second_Third_View_Quiz(question , first_answer , second_answer , third_answer);
               quizzes.add(q);

           }while(c.moveToNext());
           c.close();
       }
        return quizzes ;
    }


    public boolean insert2 (First_Second_Third_View_Quiz quiz){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Question_CLN_NAME_TABLE2 , quiz.getQuestion2());
        values.put(BUTTON1 , quiz.getButton1());
        values.put(BUTTON2 , quiz.getButton2());
        values.put(BUTTON3 , quiz.getButton3());
        values.put(BUTTON4 , quiz.getButton4());
        values.put(BUTTON5 , quiz.getButton5());
        values.put(BUTTON6 , quiz.getButton6());
        values.put(BUTTON7 , quiz.getButton7());
        values.put(BUTTON8 , quiz.getButton8());

        long res =   db.insert(TABLE_NAME2 , null , values);
        return res!= -1;
    }


    public ArrayList<First_Second_Third_View_Quiz> getAllQuestion2(){
        SQLiteDatabase db = getReadableDatabase();
        ArrayList<First_Second_Third_View_Quiz> quizzes = new ArrayList<>();

        Cursor c =  db.rawQuery("SELECT * FROM " +TABLE_NAME2 + " ORDER BY RANDOM() LIMIT 1  " , null);
        if (c.moveToFirst()){
            do {
                String question = c.getString(1);
                String Button1 = c.getString(2);
                String Button2 = c.getString(3);
                String Button3 = c.getString(4);
                String Button4 = c.getString(5);
                String Button5 = c.getString(6);
                String Button6 = c.getString(7);
                String Button7 = c.getString(8);
                String Button8 = c.getString(9);

                First_Second_Third_View_Quiz q = new First_Second_Third_View_Quiz(question , Button1 , Button2 ,
                        Button3, Button4, Button5 , Button6 , Button7, Button8);
                quizzes.add(q);

            }while(c.moveToNext());
            c.close();
        }
        return quizzes ;
    }








}