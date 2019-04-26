package com.example.charlesprovatti.cursossenac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TITULO = "com.example.cardapio.MENSSAGEMTITULO";
    public String tituloDeActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirArquitetura (View view)
    {
        tituloDeActivity = "Arquitetura";
        Intent intent = new Intent(this, GradeDeCursos.class);
        intent.putExtra(TITULO, tituloDeActivity);
        startActivity(intent);
    }

    public void abrirComunicacao (View view)
    {
        tituloDeActivity = "Comunicação";
        Intent intent = new Intent(this, GradeDeCursos.class);
        intent.putExtra(TITULO, tituloDeActivity);
        startActivity(intent);
    }

    public void abrirDesign (View view)
    {
        tituloDeActivity = "Design";
        Intent intent = new Intent(this, GradeDeCursos.class);
        intent.putExtra(TITULO, tituloDeActivity);
        startActivity(intent);
    }

    public void abrirGastronomia (View view)
    {
        tituloDeActivity = "Gastronomia";
        Intent intent = new Intent(this, GradeDeCursos.class);
        intent.putExtra(TITULO, tituloDeActivity);
        startActivity(intent);
    }

    public void abrirIdiomas (View view)
    {
        tituloDeActivity = "Idiomas";
        Intent intent = new Intent(this, GradeDeCursos.class);
        intent.putExtra(TITULO, tituloDeActivity);
        startActivity(intent);
    }

    public void abrirModa (View view)
    {
        tituloDeActivity = "Moda";
        Intent intent = new Intent(this, GradeDeCursos.class);
        intent.putExtra(TITULO, tituloDeActivity);
        startActivity(intent);
    }

    public void abrirSaude (View view)
    {
        tituloDeActivity = "Saúde";
        Intent intent = new Intent(this, GradeDeCursos.class);
        intent.putExtra(TITULO, tituloDeActivity);
        startActivity(intent);
    }

    public void abrirTecnologia (View view)
    {
        tituloDeActivity = "Técnologia";
        Intent intent = new Intent(this, GradeDeCursos.class);
        intent.putExtra(TITULO, tituloDeActivity);
        startActivity(intent);
    }

}
