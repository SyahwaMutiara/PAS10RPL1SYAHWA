package com.example.pas10rpl1syahwa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailClubActivity extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";
    private Bundle bundle;

    private String name, desc;
    private int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_club2);

        ImageView imgClub = findViewById(R.id.imgclub);
        TextView tvClubName = findViewById(R.id.tvClubName);
        TextView tvClubDetail = findViewById(R.id.tvClubDetail);

//        Club club = getIntent().getParcelableExtra(ITEM_EXTRA);
        bundle = getIntent().getExtras();
        if (bundle != null){
            name = bundle.getString("name");
            desc = bundle.getString("detail");
            image = bundle.getInt("photo");

            Glide.with(this)
                    .load(image)
                    .into(imgClub);
            tvClubName.setText(name);
            tvClubDetail.setText(desc);
        }
        if (getSupportActionBar() !=null){
               getSupportActionBar().setTitle("Detail Club");
               getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;

    }
}