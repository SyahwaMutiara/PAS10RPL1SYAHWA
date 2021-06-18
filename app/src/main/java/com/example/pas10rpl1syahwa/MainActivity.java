 package com.example.pas10rpl1syahwa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvClub;
    private ArrayList<Club> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvClub = findViewById(R.id.rv_club);
        rvClub.setHasFixedSize(true);

        list.addAll(ClubData.getLisData());
        showRecylerList();
    }

    private void showRecylerList() {
        rvClub.setLayoutManager(new LinearLayoutManager(this));
        ListClubAdapter listClubAdapter = new ListClubAdapter(list, new ListClubAdapter.Callback() {
            @Override
            public void onClick(int position) {
                Intent moveIntent = new Intent(MainActivity.this, DetailClubActivity.class);
//                moveIntent.putExtra(DetailClubActivity.ITEM_EXTRA, "club");
                Club club= list.get(position);
                moveIntent.putExtra("name",club.getName());
                moveIntent.putExtra("detail",club.getDetail());
                moveIntent.putExtra("photo",club.getPhoto());

                startActivity(moveIntent);
            }
        });
        rvClub.setAdapter(listClubAdapter);
    }


} 