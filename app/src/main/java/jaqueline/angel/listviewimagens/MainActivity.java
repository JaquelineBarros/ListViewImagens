package jaqueline.angel.listviewimagens;

import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    Context context;
    Integer[] imagens = {
            R.drawable.foto6, R.drawable.foto6,
            R.drawable.foto6, R.drawable.foto6,
            R.drawable.foto6, R.drawable.foto6,
            R.drawable.foto6, R.drawable.foto6,
            R.drawable.foto6, R.drawable.foto6,
            R.drawable.foto6, R.drawable.foto6,
            R.drawable.foto6, R.drawable.foto6,
            R.drawable.foto6, R.drawable.foto6
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;

        lv = (ListView) findViewById(R.id.list_imagens);
        lv.setAdapter((ListAdapter) new CustomAdapter(this, imagens));
    }
}
