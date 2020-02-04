package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;

import cs301.birthdaycake.CakeController;

public class MainActivity extends AppCompatActivity // {
implements View.OnClickListener, SeekBar.OnSeekBarChangeListener {

    private Button BLOW_OUTButton;
    private Button GOODBYEButton;
    private Switch FROSTINGSwitch;
    private Switch CANDLESwitch;
    private SeekBar CANDLESeekbar;
    private CakeController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        GOODBYEButton = (Button)findViewById(R.id.GOODBYE);
        GOODBYEButton.setOnClickListener(this);

        BLOW_OUTButton = (Button)findViewById(R.id.BLOW_OUT);
        BLOW_OUTButton.setOnClickListener(this);

        CANDLESwitch = (Switch)findViewById(R.id.candleswitch);

        FROSTINGSwitch = (Switch)findViewById(R.id.frostingswitch);

        CANDLESeekbar = (SeekBar)findViewById(R.id.candleseekBar);
        CANDLESeekbar.setOnSeekBarChangeListener(this);

        controller = new CakeController();
    }

    public void onClick(View v) {
        if (v == GOODBYEButton) {
            GOODBYEButton.setBackgroundColor(Color.BLUE);
            }
        }


    public void goodbye(View button) {
    //    System.out.println("Goodbye");
        Log.i("button", "Goodbye");
    }
    public void onProgressChanged(SeekBar s, int val, boolean b) {
        GOODBYEButton.setBackgroundColor(Color.rgb(val*10,val*10,val*10));
    }
    public void onStartTrackingTouch(SeekBar s){

        }
    public void onStopTrackingTouch (SeekBar s) {

        }
}
