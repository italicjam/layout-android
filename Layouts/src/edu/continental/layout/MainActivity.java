package edu.continental.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements android.view.View.OnClickListener {

	//Declaramos los 5 botones
	Button btnLinear;
	Button btnFrame;
	Button btnAbsolute;
	Button btnRelative;
	Button btnTable;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Instanciamos los botones
        btnLinear = (Button) findViewById(R.id.btnLinear);
        btnFrame = (Button) findViewById(R.id.btnFrame);
        btnAbsolute = (Button) findViewById(R.id.btnAbsolute);
        btnRelative = (Button) findViewById(R.id.btnRelative);
        btnTable = (Button) findViewById(R.id.btnTable);
        
        btnLinear.setOnClickListener(this);
        btnFrame.setOnClickListener(this);
        btnAbsolute.setOnClickListener(this);
        btnRelative.setOnClickListener(this);
        btnTable.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    //Metodo onclick
	@Override
	public void onClick(View v) {
		
		if ( v == btnRelative ) {
			startActivity(new Intent(this, RelativeLayout.class));
		} else if ( v == btnAbsolute ) {
			//Deprecated
			startActivity(new Intent(this, AbsoluteLayout.class));
		}
		
		
	}
    
}
