package com.example.retrofitdemo4;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.retrofitdemo4.netsubscribe.MovieSubscribe;
import com.example.retrofitdemo4.netutils.OnSuccessAndFaultListener;
import com.example.retrofitdemo4.netutils.OnSuccessAndFaultSub;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.btn1)
    Button btn1;
    @BindView(R.id.btn2)
    Button btn2;
    @BindView(R.id.btn3)
    Button btn3;
    private int start = 0;
    private int count = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    private void getData() {
        OnSuccessAndFaultListener l = new OnSuccessAndFaultListener() {
            @Override
            public void onSuccess(String result) {
                Log.d("panzqww", "onSuccess === " + result);
            }

            @Override
            public void onFault(String errorMsg) {
                Log.d("panzqww", "onSuccess === " + errorMsg);
            }
        };
        MovieSubscribe.getDouBanMovie(new OnSuccessAndFaultSub(l), start, count);

    }

    @OnClick({R.id.btn1, R.id.btn2, R.id.btn3})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                break;
            case R.id.btn2:
                getData();
                break;
            case R.id.btn3:
                break;
        }
    }
}
