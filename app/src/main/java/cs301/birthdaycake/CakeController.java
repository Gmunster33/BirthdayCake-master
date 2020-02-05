package cs301.birthdaycake;


import android.graphics.Color;

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

     CakeController(CakeView view) {
         cakeView = view;
         cakeModel = view.getCakeModel();
     }

         public void onClick (View v){
         int id = v.getId();
             if (id == R.id.BLOW_OUT) {
                 Log.i("BLOW_OUTButton", "BLOW_OUTButton is working!");
                 v.setBackgroundColor(Color.BLUE);
                 cakeModel.candlesLit = false;
                 cakeView.invalidate();

             }
             if (id == R.id.GOODBYE) {

             }
         }

         public void onProgressChanged (SeekBar s,int val, boolean b){
             cakeView.setBackgroundColor(Color.rgb(val * 10, val * 10, val * 10));
         }
         public void onStartTrackingTouch (SeekBar s){

         }
         public void onStopTrackingTouch (SeekBar s){

         }
     }


