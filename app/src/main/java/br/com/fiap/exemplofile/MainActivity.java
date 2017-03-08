package br.com.fiap.exemplofile;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ler(View view) {

    }


    public void criar(View view) {
        try {
            FileOutputStream fos = openFileOutput("texte.txt", MODE_PRIVATE);
            String texto = "Churros";

            fos.write(texto.getBytes());
            fos.close();
        } catch (Exception e){
            Toast.makeText(this, "Erro inesperado", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }

    }
}
