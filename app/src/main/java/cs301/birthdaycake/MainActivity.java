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

public class MainActivity extends AppCompatActivity {

    public CakeView Cake;
    private CakeController controller;
    private Button BLOW_OUTButton;
    private Button GOODBYEButton;
    private Switch FROSTINGSwitch;
    private Switch CANDLESwitch;
    private SeekBar CANDLESeekbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        Cake = findViewById(R.id.cakeview);
        controller = new CakeController(Cake);
        GOODBYEButton = (Button) findViewById(R.id.GOODBYE);
        BLOW_OUTButton = (Button) findViewById(R.id.BLOW_OUT);
        CANDLESwitch = (Switch) findViewById(R.id.candleswitch);
        FROSTINGSwitch = (Switch) findViewById(R.id.frostingswitch);
        CANDLESeekbar = (SeekBar) findViewById(R.id.candleseekBar);
    }
}
