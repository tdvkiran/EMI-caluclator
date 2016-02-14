package com.example.app1_13mse0427;

import android.os.Bundle;
import static java.lang.Math.pow;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	SeekBar s1,s2,s3;
	int sv1,sv2,sv3;
	EditText e1,e2,e3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1=(SeekBar) findViewById(R.id.seekBar1);
        s2=(SeekBar) findViewById(R.id.seekBar2);
        s3=(SeekBar) findViewById(R.id.seekBar3);
        e1=(EditText) findViewById(R.id.editText1);
        e2=(EditText) findViewById(R.id.editText2);
        e3=(EditText) findViewById(R.id.editText3);
       s1.setMax(500000);
        s1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				// TODO Auto-generated method stub
				sv1=progress;
				e1.setText(String.valueOf(progress));
			}
		});
s3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				// TODO Auto-generated method stub
				sv3=progress;
				e3.setText(String.valueOf(progress));
			}
		});
s2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
	
	@Override
	public void onStopTrackingTouch(SeekBar seekBar) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onStartTrackingTouch(SeekBar seekBar) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onProgressChanged(SeekBar seekBar, int progress,
			boolean fromUser) {
		// TODO Auto-generated method stub
		sv2=progress;
		e2.setText(String.valueOf(progress));
	}
});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void calculate(View v)
    {
    	double e,p1;
    	double d1 = (double)sv1;
    	double d2 = (double)sv2;
    	double d3 = (double)sv3;
    	d2=d2/12/100;
    	d3=d3*12;
    	p1=pow(1+d2,d3);
    	
    	e=d1*d2*p1/(p1-1);
    	int e1=(int)e;
    	
    	int interest=sv3*e1;
    	int total=interest+sv1;
    	TextView t4,t5,t6;
    	t4=(TextView) findViewById(R.id.textView4);
    	t5=(TextView) findViewById(R.id.textView5);
    	t6=(TextView) findViewById(R.id.textView6);
    	t4.setText("EMI :"+e1);
    	t5.setText("Interest :"+interest);
    	t6.setText("Total Amount Payable:"+total);
    	//Toast.makeText(getApplicationContext(), String.valueOf(e1), Toast.LENGTH_LONG).show();
    }



    
}
