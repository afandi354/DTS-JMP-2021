package nat.afandi.aplikasimobile;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText TextNama;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextNama = findViewById(R.id.TxtNama);
        Hasil = findViewById(R.id.TxtHasil);
    }

    @SuppressLint("SetTextI18n")
    public void tampilNama(View view) {
        Hasil.setText("Nama Anda : " + TextNama.getText());
        TextNama.getText().clear();
    }
}