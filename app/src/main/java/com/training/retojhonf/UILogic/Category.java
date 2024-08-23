package com.training.retojhonf.UILogic;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.training.retojhonf.Model.RecyclingAdapter;
import com.training.retojhonf.Model.RecyclingType;
import com.training.retojhonf.R;

import java.util.ArrayList;
import java.util.List;

public class Category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        List<RecyclingType> recyclingTypes = new ArrayList<>();
        //recyclingTypes.add(new RecyclingType("Plástico", "Botellas, envases, etc.", R.drawable.plastic));
        //recyclingTypes.add(new RecyclingType("Papel", "Periódicos, revistas, etc.", R.drawable.paper));
        //recyclingTypes.add(new RecyclingType("Vidrio", "Botellas, frascos, etc.", R.drawable.glass));
        //recyclingTypes.add(new RecyclingType("Metal", "Latas, objetos metálicos, etc.", R.drawable.metal));

        RecyclingAdapter adapter = new RecyclingAdapter(recyclingTypes, this);
    }
}