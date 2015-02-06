package edu.css.cis3334.buttonclickexamples;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    TextView status;            // textview displaying the status
    Button btn2;                // link to button 2
    Button btn3;                // link to button 3

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // link variables to XML widgets
        status = (TextView) findViewById(R.id.tvStatus);

        // Nothing is needed here for Button 1. The button1Click method is below and it is linked to the button in the layout XML

        // for Button 2, we create an anonymous class and set the OnClickListener here.
        // All code for the button is right here
        btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                status.setText("Status: Button 2 Clicked");
            }
        });

        // Button 3 implements OnClickListener. This expects a method named onClick()
        //          which is defined below and added implementss to the mainActvitiy class above
        btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(this);

    }

    /**
     * Called when Button 1 is click. Link created in XML layout using onClick attribute
     * @param view - link to the budget widget
     */
    public void button1Click(View view) {
        // Do something in response to button click
        status.setText("Status: Button 1 Clicked");
    }

    /**
     * Called when Button 3 is click. Link created in onCreate above
     * @param view - link to the budget widget
     */
    public void onClick(View view) {
        // Do something in response to button click
        status.setText("Status: Button 3 Clicked");
    }


}
