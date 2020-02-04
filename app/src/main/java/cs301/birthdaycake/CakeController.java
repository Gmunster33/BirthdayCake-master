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


import cs301.birthdaycake.CakeView;

public class CakeController
        implements View.OnClickListener, SeekBar.OnSeekBarChangeListener {

    private CakeView cakeView;
    private CakeModel cakeModel;
    private Button BLOW_OUTButton;
    private Button GOODBYEButton;
    private Switch FROSTINGSwitch;
    private Switch CANDLESwitch;
    private SeekBar CANDLESeekbar;

     CakeController(CakeView view) {
         cakeView = view;
         cakeModel = view.getCakeModel();
         GOODBYEButton.setOnClickListener(this);
         BLOW_OUTButton.setOnClickListener(this);
         CANDLESeekbar.setOnSeekBarChangeListener(this);
     }

         public void onClick (View v){
             if (v == GOODBYEButton) {
                 GOODBYEButton.setBackgroundColor(Color.BLUE);
             }
             if (v == BLOW_OUTButton) {
                 Log.i("BLOW_OUTButton", "BLOW_OUTButton is working!");

             }
         }

         public void onProgressChanged (SeekBar s,int val, boolean b){
             GOODBYEButton.setBackgroundColor(Color.rgb(val * 10, val * 10, val * 10));
         }
         public void onStartTrackingTouch (SeekBar s){

         }
         public void onStopTrackingTouch (SeekBar s){

         }
     }


