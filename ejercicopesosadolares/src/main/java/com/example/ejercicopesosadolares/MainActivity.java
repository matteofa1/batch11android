package com.example.ejercicopesosadolares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText inputPesos;
    private TextView tvDollares;
    private EditText tvDollares;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnPaD = (Button) findViewById(R.id.btn_PaD);
        inputPesos = (EditText) findViewById(R.id.input_pesos);
        tvDollares = (TextView) findViewById(R.id.tv_dollares);
        btnPaD.setOnClickListener(this);

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnDaP = (Button) findViewById(R.id.btn_DaP);
        in

    }

    }

    @Override
    public void onClick(View view) {
        log("Le dio clcik");
        if (inputPesos.getText().toString() != null) {
            String pesos = inputPesos.getText().toString();

            log(pesos);
            double pesosDouble = Double.parseDouble(pesos);
            double dollar = pesosDouble * 18.5894338;
            tvDolares.setText("" + dollar);
        } else {
            Toast.makeText(this, "no se puede realizar esta accion", Toast.LENGTH_LONG).show();
        }
    }

    public void log(String content) {
        Log.i("myLog", content);
    }


}




