package com.example.charlesprovatti.cursossenac;

import android.content.Intent;
import android.support.annotation.StyleRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class GradeDeCursos extends AppCompatActivity {

    public ArrayList<Cursos> cursos = new ArrayList<>();
    LinearLayout layoutLinear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_de_cursos);

        Intent intent = getIntent();
        String curso = intent.getStringExtra(MainActivity.TITULO);
        TextView textViewTitulo = findViewById(R.id.tvGrade);
        textViewTitulo.setText(curso);

        if (curso.equals("Arquitetura"))
        {
            cursos.add(new Cursos("Design de Interiores", 999.99, "Arquitetura", "Faz alguma coisa"));
            cursos.add(new Cursos("Paisagismo e Jardinagem", 799.99, "Arquitetura", "Faz alguma coisa diferente do outro"));
            cursos.add(new Cursos("Vitrinismo", 1199.99, "Arquitetura", "Faz alguma coisa diferente dos outros dois"));
        }
        else if (curso.equals("Comunicação"))
        {
            cursos.add(new Cursos("Arte e Cultura", 999.99, "Comunicação", "Se Comunica"));
            cursos.add(new Cursos("Audiovisual", 799.99, "Comunicação", "Não faço idéia"));
            cursos.add(new Cursos("Fotografia", 449.99, "Comunicação", "Tira fotos"));
            cursos.add(new Cursos("Rádio", 599.99, "Comunicação", "Faz algo no rádio"));
        }
        else if (curso.equals("Design"))
        {
            cursos.add(new Cursos("Design Digital", 999.99, "Design", "Cria design digital"));
            cursos.add(new Cursos("Design Gráfico", 899.99, "Design", "Cria design gráfico"));
            cursos.add(new Cursos("Design de Produtos", 799.99, "Design", "Cria design de produtos"));
        }
        else if (curso.equals("Gastronomia"))
        {
            cursos.add(new Cursos("Confeitaria", 499.99, "Gastronomia", "Faz doces"));
            cursos.add(new Cursos("Cozinha", 799.99, "Gastronomia", "Pratos em geral"));
            cursos.add(new Cursos("Paníficação", 499.99, "Gastronomia", "Faz pães"));
            cursos.add(new Cursos("Nutrição", 999.99, "Gastronomia", "Diz que os outros não devem comer tudo que é gostoso"));
        }
        else if (curso.equals("Idiomas"))
        {
            cursos.add(new Cursos("Espanhol", 399.99, "Idiomas", "Fala espanhol"));
            cursos.add(new Cursos("Francês", 599.99, "Idiomas", "Fala francês"));
            cursos.add(new Cursos("Inglês", 799.99, "Idiomas", "Fala inglês"));
            cursos.add(new Cursos("Português", 499.99, "Idiomas", "Fala Português"));
            cursos.add(new Cursos("Libras", 599.99, "Idiomas", "Fala com as Mãos"));
        }
        else if (curso.equals("Moda"))
        {
            cursos.add(new Cursos("Criação e Desenv. de Produtos", 999.99, "Moda", "Cria e desenvolve produtos"));
            cursos.add(new Cursos("Cultura e Comportamento", 799.99, "Moda", "Estuda a cultura e o comportamento"));
            cursos.add(new Cursos("Modelagem", 799.99, "Moda", "Modela"));
            cursos.add(new Cursos("Negócios da Moda", 899.99, "Moda", "Negocia no mercado da Moda"));

        }
        else if (curso.equals("Saúde"))
        {
            cursos.add(new Cursos("Enfermagem", 899.99, "Saúde", "Vira enfermeiro"));
            cursos.add(new Cursos("Farmácia", 799.99, "Saúde", "Vira farmaceutico"));
            cursos.add(new Cursos("Nutrição", 699.99, "Saúde", "Regula o que os outros comem"));
        }
        else if (curso.equals("Técnologia"))
        {
            cursos.add(new Cursos("Desenvolvimento de Sistemas", 999.99, "Técnologia", "Desenvolve sistemas"));
            cursos.add(new Cursos("Gestão em TI", 799.99, "Técnologia", "Faz algo que eu não sei"));
            cursos.add(new Cursos("Internet", 599.99, "Técnologia", "Alguma coisa também"));
            cursos.add(new Cursos("Redes e Infraestrutura", 999.99, "Técnologia", "Sofre muito"));

        }

        listaCursos(cursos);

    }

    public void listaCursos(ArrayList<Cursos> lista)
    {
        layoutLinear = findViewById(R.id.lVertical);
        for (int i = 0; i < lista.size(); i++) {
            TextView textViewItem1 = new TextView(this);
            TextView textViewDesc1 = new TextView(this);
            TextView textViewPreco1 = new TextView(this);

            textViewItem1.setText(lista.get(i).getNome());
            textViewItem1.setTextSize(20);
            textViewItem1.setTypeface(textViewItem1.getTypeface(). DEFAULT_BOLD);
            textViewItem1.setTextColor(getResources().getColor(R.color.colorAccent));
            textViewDesc1.setText(lista.get(i).getDescricao());
            textViewDesc1.setTextSize(16);
            textViewDesc1.setTextColor(getResources().getColor(R.color.colorBlack));
            textViewPreco1.setText("R$ " + lista.get(i).getPreco().toString());
            textViewPreco1.setTextSize(16);
            textViewPreco1.setTextColor(getResources().getColor(R.color.colorBlack));

            layoutLinear.addView(textViewItem1);
            layoutLinear.addView(textViewDesc1);
            layoutLinear.addView(textViewPreco1);
        }
    }

}
