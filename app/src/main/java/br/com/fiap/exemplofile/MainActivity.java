package br.com.fiap.exemplofile;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void criar(View view) {
        try {
            FileOutputStream fos = openFileOutput("teste.txt", MODE_PRIVATE);
            String texto = "Churros";

            fos.write(texto.getBytes());
            fos.close();
        } catch (Exception e){
            Toast.makeText(this, "Erro inesperado", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }

    }


    public void ler(View view) {
        try{
            FileInputStream fis = openFileInput("teste.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            // Lê o arquivo
            String texto = br.readLine();
            fis.close();
            Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();
        } catch (Exception e){

        }
    }
}
