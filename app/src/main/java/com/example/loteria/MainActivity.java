package com.example.loteria;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.EventListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onClick(View v) {
        ImageButton uno = findViewById(R.id.ib1);
        ImageButton dos =  findViewById(R.id.ib2);
        ImageButton tres = findViewById(R.id.ib3);
        ImageButton cuatro =  findViewById(R.id.ib4);
        ImageButton cinco = findViewById(R.id.ib5);
        ImageButton seis =  findViewById(R.id.ib6);
        ImageButton siete =  findViewById(R.id.ib7);
        ImageButton ocho =  findViewById(R.id.ib8);
        ImageButton nueve =  findViewById(R.id.ib9);
        ImageButton diez =  findViewById(R.id.ib10);
        ImageButton once =  findViewById(R.id.ib11);
        ImageButton doce =  findViewById(R.id.ib12);
        ImageButton trece = findViewById(R.id.ib13);
        ImageButton catorce = findViewById(R.id.ib14);
        ImageButton quince = findViewById(R.id.ib15);
        ImageButton diseis = findViewById(R.id.ib16);

        switch(v.getId()){
            case R.id.ib1:
                uno.setImageResource(R.drawable.peso);
                break;
            case R.id.ib2:
                dos.setImageResource(R.drawable.peso);
                break;
            case R.id.ib3:
                tres.setImageResource(R.drawable.peso);
                break;
            case R.id.ib4:
                cuatro.setImageResource(R.drawable.peso);
                break;
            case R.id.ib5:
                cinco.setImageResource(R.drawable.peso);
                break;
            case R.id.ib6:
                seis.setImageResource(R.drawable.peso);
                break;
            case R.id.ib7:
                siete.setImageResource(R.drawable.peso);
                break;
            case R.id.ib8:
                ocho.setImageResource(R.drawable.peso);
                break;
            case R.id.ib9:
                nueve.setImageResource(R.drawable.peso);
                break;
            case R.id.ib10:
                diez.setImageResource(R.drawable.peso);
                break;
            case R.id.ib11:
                once.setImageResource(R.drawable.peso);
                break;
            case R.id.ib12:
                doce.setImageResource(R.drawable.peso);
                break;
            case R.id.ib13:
                trece.setImageResource(R.drawable.peso);
                break;
            case R.id.ib14:
                catorce.setImageResource(R.drawable.peso);
                break;
            case R.id.ib15:
                quince.setImageResource(R.drawable.peso);
                break;
            case R.id.ib16:
                diseis.setImageResource(R.drawable.peso);
                break;
            case R.id.reiniciar:
                uno.setImageResource(0);
                dos.setImageResource(0);
                tres.setImageResource(0);
                cuatro.setImageResource(0);
                cinco.setImageResource(0);
                seis.setImageResource(0);
                siete.setImageResource(0);
                ocho.setImageResource(0);
                nueve.setImageResource(0);
                diez.setImageResource(0);
                once.setImageResource(0);
                doce.setImageResource(0);
                trece.setImageResource(0);
                catorce.setImageResource(0);
                quince.setImageResource(0);
                diseis.setImageResource(0);
                break;
                default:
                    Toast.makeText(this, "Incorrecto", Toast.LENGTH_SHORT).show();
                    break;
        }
    }
}
