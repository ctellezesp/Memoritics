package talentics.memoritics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
// incluir lirberias para cada widget que vayas a utilizar

public class MainActivity extends AppCompatActivity implements OnClickListener {

    //declarar cada widget que vas a utilizar
    TextView txt_entrada;
    Button btn_1;
    Button btn_2;
    Button btn_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_entrada = (TextView) findViewById(R.id.txt_entrada);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);

        //hacer que los botones escuchen asignandole un set
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
    }

    @Override
    public void onClick(View V)
    {

        switch (V.getId())
        {
            case R.id.btn_1:
                txt_entrada.setText("Oprimiste la opcion 1");
            break;
            case R.id.btn_2:
                txt_entrada.setText("Oprimiste la opcion 2");
            break;
            case R.id.btn_3:
                txt_entrada.setText("Oprimiste la opcion 3");
            break;
        }
    }
}


