package com.rk.pt;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toast RotiPanggang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view) {
        switch (view.getId()) {
            case R.id.B_SimpleToast_IDXML:
                RotiPanggang = Toast.makeText(this, "Simple Toast", Toast.LENGTH_SHORT);
                break;
            case R.id.B_TopToast_IDXML:
                RotiPanggang = Toast.makeText(this, "Top Toast", Toast.LENGTH_SHORT);
                RotiPanggang.setGravity(Gravity.TOP, 0, 0);
                break;
            case R.id.B_BottomToast_IDXML:
                RotiPanggang = Toast.makeText(this, "Bottom Toast", Toast.LENGTH_SHORT);
                RotiPanggang.setGravity(Gravity.BOTTOM, 0, 0);
                break;
            case R.id.B_CenterToast_IDXML:
                RotiPanggang = Toast.makeText(this, "Center Toast", Toast.LENGTH_SHORT);
                RotiPanggang.setGravity(Gravity.CENTER, 0, 0);
                break;
            case R.id.B_LeftToast_IDXML:
                RotiPanggang = Toast.makeText(this, "Left Toast", Toast.LENGTH_SHORT);
                RotiPanggang.setGravity(Gravity.LEFT, 0, 0);
                break;
            case R.id.B_RightToast_IDXML:
                RotiPanggang = Toast.makeText(this, "Right Toast", Toast.LENGTH_SHORT);
                RotiPanggang.setGravity(Gravity.RIGHT, 0, 0);
                break;
            case R.id.B_TopLeftToast_IDXML:
                RotiPanggang = Toast.makeText(this, "TopLeft Toast", Toast.LENGTH_SHORT);
                RotiPanggang.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);
                break;
            case R.id.B_TopRightToast_IDXML:
                RotiPanggang = Toast.makeText(this, "TopRight Toast", Toast.LENGTH_SHORT);
                RotiPanggang.setGravity(Gravity.TOP | Gravity.RIGHT, 0, 0);
                break;
            case R.id.B_BottomLeftToast_IDXML:
                RotiPanggang = Toast.makeText(this, "BottomLeft Toast", Toast.LENGTH_SHORT);
                RotiPanggang.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 0);
                break;
            case R.id.B_BottomRightToast_IDXML:
                RotiPanggang = Toast.makeText(this, "BottomRight Toast", Toast.LENGTH_SHORT);
                RotiPanggang.setGravity(Gravity.BOTTOM | Gravity.RIGHT, 0, 0);
                break;
        }
        RotiPanggang.show();
    }
}
