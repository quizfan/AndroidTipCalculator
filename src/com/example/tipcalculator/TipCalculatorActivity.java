package com.example.tipcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TipCalculatorActivity extends Activity {

	private double result = 0;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tip_calculator, menu);
        return true;
    }
        

	public void resultTip(View view) {
           if(((EditText)findViewById(R.id.CheckAmt)).getText().toString().trim().length() > 0)
             {	
                                    double billValue = Double.valueOf(((EditText)findViewById(R.id.CheckAmt)).getText().toString());
                                    switch(view.getId()) {
                                    case R.id.Tenbutton:
                                           result = 0.1 * billValue;
                                        break;
                                    case R.id.Fifteenbutton:
                                           result = 0.15 * billValue;
                                        break;
                                    case R.id.Twentybutton:
                                           result = 0.2 * billValue;
                                        break;
                                         }
                                } else
                                           result = 0;
                                       setText(result);
                  }

              public void setText(double value) {
                TextView tip = (TextView)findViewById(R.id.result);
                tip.setText("Tip is: $ "+value);
           }
}
