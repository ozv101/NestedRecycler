package com.nestedrecycler.nestedrecycler.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nestedrecycler.nestedrecycler.R;

/**
 * Created by osman on 4/4/2016.
 */
public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.ViewHolder> {

    private LayoutInflater inflater;
    private String word;

    public HorizontalAdapter(Context context, String word) {
        inflater = LayoutInflater.from(context);
        this.word = word;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.horizontal_row_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.letter.setText(String.valueOf(word.charAt(position)));
    }

    @Override
    public int getItemCount() {
        return word.length();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView letter;

        public ViewHolder(View itemView) {
            super(itemView);

            letter = (TextView) itemView.findViewById(R.id.letter);
        }
    }
}
