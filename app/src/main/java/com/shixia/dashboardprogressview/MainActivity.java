package com.shixia.dashboardprogressview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.shixia.dashboardprogressview.view.DashBoardProgressView;

public class MainActivity extends AppCompatActivity {

    private Button btnRefreshTo550;
    private Button btnRefreshTo650;
    private DashBoardProgressView wpbView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wpbView = (DashBoardProgressView) findViewById(R.id.wpb_progress_view);

        btnRefreshTo550 = (Button) findViewById(R.id.btn_refresh_to550);
        btnRefreshTo650 = (Button) findViewById(R.id.btn_refresh_to650);

        wpbView.refreshScore(800);

        btnRefreshTo550.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wpbView.refreshScore(550);
            }
        });

        btnRefreshTo650.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wpbView.refreshScore(650);
            }
        });

    }
}
