package com.example.kanner;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDatos extends SQLiteOpenHelper {
    public BaseDatos(Context contexto, String nombre, SQLiteDatabase.CursorFactory factoria, int vercion){
        super(contexto, nombre, factoria, vercion);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table resultados(clave INTEGER primary key AUTOINCREMENT, nombreC text, comunicacion text, expresivo text, simbolico text, fecha text) ");

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("drop table if exists resultados");


        onCreate(db);

    }
}
