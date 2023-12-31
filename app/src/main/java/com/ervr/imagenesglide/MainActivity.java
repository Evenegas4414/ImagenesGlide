package com.ervr.imagenesglide;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Item> itemList = returnItemList();
        itemAdapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(itemAdapter);
    }

    private List<Item> returnItemList() {
        List<Item> listItem = new ArrayList<>();

        Item item01 = new Item("Zhuo Chengyou", "https://unsplash.com/photos/UBvtBr_FmrY/download?force=true&w=640");
        listItem.add(item01);

        Item item02 = new Item("billow926", "https://unsplash.com/photos/pNoP-qVwBFQ/download?force=true&w=640");
        listItem.add(item02);

        Item item03 = new Item("Philipp Deiß", "https://unsplash.com/photos/LfJx0gqqiEc/download?force=true&w=640");
        listItem.add(item03);

        Item item04 = new Item("Huper by Joshua Earle", "https://unsplash.com/photos/_p8gVNNsWw4/download?force=true&w=640");
        listItem.add(item04);

        Item item05 = new Item("Melnychuk Nataliya", "https://unsplash.com/photos/rnPGCe7LsQo/download?force=true&w=640");
        listItem.add(item05);

        Item item06 = new Item("Teagan Maddux", "https://unsplash.com/photos/k2DbTXQ0yrQ/download?force=true&w=640");
        listItem.add(item06);

        Item item07 = new Item("Chen Liu", "https://unsplash.com/photos/kZH8X0q4Nvo/download?force=true&w=640");
        listItem.add(item07);

        Item item08 = new Item("John Fornander", "https://unsplash.com/photos/iNqJx-VOceI/download?force=true&w=640");
        listItem.add(item08);

        Item item09 = new Item("Parker Coffman", "https://unsplash.com/photos/mNWrQ9O6KZw/download?force=true&w=640");
        listItem.add(item09);

        Item item10 = new Item("XPS", "https://unsplash.com/photos/8pb7Hq539Zw/download?force=true&w=640");
        listItem.add(item10);

        Item item11 = new Item("Daniel J. Schwarz", "https://unsplash.com/photos/l8BvDmt8Ac4/download?force=true&w=640");
        listItem.add(item11);

        Item item12 = new Item("Wesley Armstrong", "https://unsplash.com/photos/q0wqYpyWDpc/download?force=true&w=640");
        listItem.add(item12);

        return listItem;
    }


}
