package com.example.kanner;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class TablaRes {
    private  BaseDatos dbSQlite;
    private SQLiteDatabase db;
    private Cursor fila;
    private Activity contexto;

    public TablaRes(Activity contexto){
        this.contexto=contexto;
        dbSQlite=new BaseDatos(contexto,"resultados",null, 3);
        db =dbSQlite.getWritableDatabase();

    }

    public void guardar(Resultados resultados){
        ContentValues registro = new ContentValues();
        registro.put("clave", resultados.getClave() );
        registro.put("nombreC", resultados.getNombreC() );
        registro.put("comunicacion", resultados.getComunicacion() );
        registro.put("expresivo", resultados.getExpresivo() );
        registro.put("simbolico", resultados.getSimbolico() );
        registro.put("fecha", resultados.getFecha());
        db.insert("resultados",null,registro);
    }

    public int eliminar(String clave){
        int cant = db.delete("resultados","clave="+clave, null);
        //actualizarCursor();
        return cant;
    }


    public Resultados generarResultados(Cursor fila){
        Resultados resultados = new Resultados();
        resultados.setClave(fila.getString(0));
        resultados.setNombreC(fila.getString(1));
        resultados.setComunicacion(fila.getString(2));
        resultados.setExpresivo(fila.getString(3));
        resultados.setSimbolico(fila.getString(4));
        resultados.setFecha(fila.getString(5));
        return resultados;
    }

    public List<Resultados> getResultados(){
        fila = db.rawQuery("select * from resultados",null);
        if(fila.getCount()>0){
            List<Resultados> resultados = new ArrayList<>();
            while (fila.moveToNext()){
                resultados.add(generarResultados(fila));
            }
            return resultados;
        }
        return null;
    }
}