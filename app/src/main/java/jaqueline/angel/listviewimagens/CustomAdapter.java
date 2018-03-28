package jaqueline.angel.listviewimagens;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by Alunos on 28/03/2018.
 */

public class CustomAdapter  extends BaseAdapter {
    Integer [] imgs;
    Context context;

    private static LayoutInflater inflater = null;

    public CustomAdapter(MainActivity mainActivity, Integer[] imagens){
        context = mainActivity;
        imgs = imagens;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return imgs.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
    public class Holder{
        ImageView im;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Holder holder = new Holder();
        View rowView;

        rowView = inflater.inflate(R.layout.custom_layout, null);
        holder.im = (ImageView) rowView.findViewById(R.id.img);
        holder.im.setImageResource(imgs[i]);

        return rowView;
    }
}
