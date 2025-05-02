package com.example.myrecyclerview;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHeroes;
    private ArrayList<Hero> list = new ArrayList<>();
    private ListHeroAdapter listHeroAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Atur Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        rvHeroes = findViewById(R.id.rv_heroes);
        rvHeroes.setHasFixedSize(true);
        list.addAll(HeroesData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList() {
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        listHeroAdapter = new ListHeroAdapter(list,
                ListHeroAdapter.MODE_LIST);
        rvHeroes.setAdapter(listHeroAdapter);
    }
    private void showRecyclerGrid() {
        rvHeroes.setLayoutManager(new GridLayoutManager(this, 2)); // 2 kolom
        listHeroAdapter.setMode(ListHeroAdapter.MODE_GRID);
    }
    private void showRecyclerCardView() {
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        listHeroAdapter.setMode(ListHeroAdapter.MODE_CARDVIEW);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_list) {
            Toast.makeText(this, "Mode List Dipilih",
                    Toast.LENGTH_SHORT).show();
            showRecyclerList();
            return true;
        } else if (id == R.id.action_grid) {
            Toast.makeText(this, "Mode Grid Dipilih",
                    Toast.LENGTH_SHORT).show();
            showRecyclerGrid();
            return true;
        } else if (id == R.id.action_cardview) {
            Toast.makeText(this, "Mode CardView Dipilih",
                    Toast.LENGTH_SHORT).show();
            showRecyclerCardView();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
