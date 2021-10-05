package es.iesnervion.juanjomz.ejercicio1boletin3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioGroup rdGroupColor;
    RadioGroup rdGroupSize;
    TextView txtExample;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdGroupColor = (RadioGroup) findViewById(R.id.rdGroupColor);
        rdGroupSize = (RadioGroup) findViewById(R.id.rdGroupSize);
        txtExample=findViewById(R.id.txtExample);
        rdGroupSize.setOnCheckedChangeListener((x,y)->checkedSize());
        rdGroupColor.setOnCheckedChangeListener((x,y)->checkedColor());
    }

    public void checkedSize(){
        int reducirOAumentar=-10;
            if(rdGroupSize.getCheckedRadioButtonId()==R.id.rBtnBigFont) {
                reducirOAumentar=35;
            }
        txtExample.setTextSize(TypedValue.COMPLEX_UNIT_PX,txtExample.getTextSize()+reducirOAumentar);
    }

    public void checkedColor(){
        int color=Color.BLACK;
        if(rdGroupColor.getCheckedRadioButtonId()==R.id.rBtnRed){
            color=Color.RED;
            txtExample.setTypeface(null, Typeface.NORMAL);

        }else{
            txtExample.setTypeface(null, Typeface.BOLD);
        }
        txtExample.setTextColor(color);
    }


}