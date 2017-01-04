package com.androidgeek.expandablepanel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private ExpandablePanel expandablePanel;
    private LinearLayout value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        value= (LinearLayout) findViewById(R.id.value);
        expandablePanel= (ExpandablePanel) findViewById(R.id.foo);
        TextView textView=new TextView(this);
        textView.setText("Expanded");
        textView.setTextSize(25);
        value.addView(textView);
        expandablePanel.setOnExpandListener(new ExpandablePanel.OnExpandListener() {
            @Override
            public void onExpand(View handle, View content) {
                Toast.makeText(MainActivity.this,"Expanded",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCollapse(View handle, View content) {
                Toast.makeText(MainActivity.this,"Collapsed",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
