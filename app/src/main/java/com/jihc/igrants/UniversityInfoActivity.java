package com.jihc.igrants;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class UniversityInfoActivity extends AppCompatActivity {

    ImageView universityPhoto;
    TextView universityName, universityId, universityCity, universityNumber, sunbjectName;
    LinearLayout subjectLayout, mamandyktarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university_info);
        initViews();
        onClicked();
    }

    public void initViews(){
        universityPhoto = findViewById(R.id.universityPhoto);

        universityName = findViewById(R.id.universityName);
        universityId = findViewById(R.id.universityId);
        universityCity = findViewById(R.id.universityCity);
        universityNumber = findViewById(R.id.universityNumber);

        sunbjectName = findViewById(R.id.subjectName);

        subjectLayout = findViewById(R.id.subjectLayout);
        mamandyktarLayout = findViewById(R.id.mamandyktarLayout);
    }

    public void onClicked(){
        subjectLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mamandyktarLayout.setVisibility(View.VISIBLE);
            }
        });
    }

}