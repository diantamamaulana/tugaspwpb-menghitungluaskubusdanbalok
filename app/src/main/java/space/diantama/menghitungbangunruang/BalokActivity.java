package space.diantama.menghitungbangunruang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BalokActivity extends AppCompatActivity implements View.OnClickListener {

private Button eHasilbalok;
private EditText epl;
private EditText ept;
private EditText elt;
private TextView tothasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        eHasilbalok  = findViewById(R.id.hasilbalok);
        epl = findViewById(R.id.p_l);
        ept = findViewById(R.id.p_t);
        elt = findViewById(R.id.l_t);
        tothasil = findViewById(R.id.tothasil);
        eHasilbalok.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()== R.id.hasilbalok) {
        String pl = epl.getText().toString().trim();
        String pt = ept.getText().toString().trim();
        String lt = elt.getText().toString().trim();

        Double dpl = toDouble(pl);
        Double dpt = toDouble(pt);
        Double dlt = toDouble(lt);
        Double hasil = 2*(dpl+dpt+dlt);

        tothasil.setText(String.valueOf(hasil));

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
