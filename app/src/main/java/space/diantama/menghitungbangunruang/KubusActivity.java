package space.diantama.menghitungbangunruang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KubusActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText eSisi;
    private Button eHitung;
    private TextView eTothasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);

        eSisi = findViewById(R.id.sisi);
        eHitung = findViewById(R.id.hitungkubus);
        eTothasil = findViewById(R.id.tothasil);

        eHitung.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()== R.id.hitungkubus) {
            String ss = eSisi.getText().toString().trim();
            String hitung = eHitung.getText().toString().trim();
            String total = eTothasil.getText().toString().trim();

            Double dss = toDouble(ss);
            Double dhitung = toDouble(hitung);
            Double dtotal = 6*(dss*dss);

            eTothasil.setText(String.valueOf(dtotal));
        }

    }

    private Double toDouble(String str) {
        try {
            return Double.valueOf(str);
        }catch (NumberFormatException e){
            return null;
        }
    }
}
