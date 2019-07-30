package space.diantama.menghitungbangunruang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
int req_code = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnkubusA = findViewById(R.id.btnkubus);
        btnkubusA.setOnClickListener(this);

        Button btnbalokA = findViewById(R.id.btnbalok);
        btnbalokA.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnkubus:
                Intent kubusIntent = new Intent(MainActivity.this, KubusActivity.class);
                startActivityForResult(kubusIntent, req_code);
                break;
            case R.id.btnbalok:
                Intent balokIntent = new Intent(MainActivity.this, BalokActivity.class);
                startActivity(balokIntent);
                break;

        }
    }
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == req_code) {
            if (resultCode == RESULT_OK) {
                TextView hasilnama = findViewById(R.id.view1);
                hasilnama.setText(data.getData().toString());
                //Toast.makeText(this,data.getData().toString(), Toast.LENGTH_LONG.show();
            }
        }
    }
}
