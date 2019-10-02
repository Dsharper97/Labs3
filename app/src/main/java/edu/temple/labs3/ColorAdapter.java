package edu.temple.labs3;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {

    Context context;
    String colors[];
    public ColorAdapter (Context context, String colors []){
        this.context = context;
        this.colors = colors;
    }

    @Override
    public int getCount() {

        return colors.length;
    }

    @Override
    public Object getItem(int i) {

        return colors[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = new TextView(context);
        String colorValue = colors[i];
        textView.setText(colorValue);
        if (colorValue.equals("Red")) {
            textView.setBackgroundColor(Color.RED);
        } else if (colorValue.equals("Green")) {
            textView.setBackgroundColor(Color.GREEN);
        } else if (colorValue.equals("Blue")) {
            textView.setBackgroundColor(Color.BLUE);
        } else if (colorValue.equals("Yellow")) {
            textView.setBackgroundColor(Color.YELLOW);
        } else if (colorValue.equals("Purple")) {
            textView.setBackgroundColor(Color.parseColor("Purple"));
        }else if(colorValue.equals("Gray")) {
            textView.setBackgroundColor(Color.GRAY);
        }else if(colorValue.equals("Orange")) {
            textView.setBackgroundColor(Color.rgb(255, 165, 0));
        }else if(colorValue.equals("Brown")) {
            textView.setBackgroundColor(Color.rgb(139, 69, 19));
        } else if(colorValue.equals("Pink")) {
            textView.setBackgroundColor(Color.rgb(255,105,180));
        }else if(colorValue.equals("Teal")){
            textView.setBackgroundColor(Color.parseColor("Teal"));
        }
        return textView;
    }
}
