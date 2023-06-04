package com.example.tarifuyg;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper( Context context) {
        super(context, "namedata.db", null, 1);

    }


    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("create Table Tarifdetails(name TEXT primary key, tarif TEXT)");

    }


    @Override
    public void onUpgrade(SQLiteDatabase DB, int i, int ii) {
        DB.execSQL("drop Table if exists Tarifdetails");

    }
    public Boolean inserttarifdata(String name,String tarif){
        SQLiteDatabase DB=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("name",name);
        contentValues.put("tarif",tarif);
        long result =DB.insert("Tarifdetails",null,contentValues);
        if (result==-1){
            return false;
        }
        else{
            return true;
        }
    }
    public Cursor getData(){
        SQLiteDatabase DB=this.getWritableDatabase();
        Cursor cursor= DB.rawQuery("Select * from Tarifdetails",null);
        return cursor;
    }
}