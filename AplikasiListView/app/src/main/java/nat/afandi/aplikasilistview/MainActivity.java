package nat.afandi.aplikasilistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private final String[] namanegara = new String[]{
            "Indonesia", "Malaysia", "Singapura", "Brazil",
            "Italia", "Inggris", "Belanda", "Belanda",
            "Argentina", "Chile", "China",
            "Mesir", "Uganda",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).setTitle("ListView Sederhana");

        ListView lvItem = findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,
                android.R.id.text1, namanegara);

        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener((parent, view, position, id) -> Toast.makeText(MainActivity.this, "Memilih : "+namanegara[position], Toast.LENGTH_LONG).show());
    }
}