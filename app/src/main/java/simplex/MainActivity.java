package simplex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast; // com.example.djamel.simplex

import simplexMethod.R;

public class MainActivity extends AppCompatActivity {
EditText variablText,contrentText ;
 public static int val,contrent=0;

    public static final String EXTRA_VARIABLE="com.example.djamel.simplex1";
    public static final String EXTRA_CONTRENT="com.example.djamel.simplex2";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        variablText=(EditText) findViewById(R.id.editText);
        contrentText=(EditText) findViewById(R.id.editText2);

    }

    public void next(View view) {
         if (!(variablText.getText().toString().trim().equals(""))&&!(contrentText.getText().toString().trim().equals(""))){
             val=Integer.parseInt(variablText.getText().toString());
             contrent=Integer.parseInt(contrentText.getText().toString());
             if (val>0&&contrent>0){

                 Toast.makeText(this,"good !",Toast.LENGTH_LONG).show();

                 Intent intent = new Intent(this, configActivity.class);
                 int val1 = val;

                 intent.putExtra(MainActivity.EXTRA_VARIABLE, ""+val);
                 intent.putExtra(MainActivity.EXTRA_CONTRENT, ""+contrent);

                 startActivity(intent);

              //  text.setText(Simplex .show());
             }else {
                 Toast.makeText(this,"Ajouter Numr des valer et des contrant svp !",Toast.LENGTH_LONG).show();
             }

         }else {
             Toast.makeText(this,"rempler les donneés svp !"+contrentText.getText().toString().trim()+"ll",Toast.LENGTH_LONG).show();

         }


    }
}
