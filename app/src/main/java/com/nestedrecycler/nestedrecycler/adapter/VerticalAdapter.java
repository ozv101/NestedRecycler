package com.nestedrecycler.nestedrecycler.adapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nestedrecycler.nestedrecycler.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by osman on 4/4/2016.
 */
public class VerticalAdapter extends RecyclerView.Adapter<VerticalAdapter.ViewHolder> {

    private List<String> data = new ArrayList<>();
    private Context context;

    public VerticalAdapter(Context context) {
        this.context = context;

        // Sample data
        data.add("hello");
        data.add("android");
        data.add("you");
        data.add("additionalGenericString");
        data.add("whatIsGoingOn");
        data.add("coolRecyclerViewBro");
        data.add("soYoureSayingTheresAChance");
        data.add("nestedRecyclerViewsAreTheBest");
        data.add("rightMeow");
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.vertical_row_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.header.setText(data.get(position));

        HorizontalAdapter horizontalAdapter = new HorizontalAdapter(context, data.get(position));
        LinearLayoutManager linearLayoutManager
                = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        holder.horizontalRecyclerView.setLayoutManager(linearLayoutManager);
        holder.horizontalRecyclerView.setAdapter(horizontalAdapter);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView header;
        private RecyclerView horizontalRecyclerView;

        public ViewHolder(View itemView) {
            super(itemView);

            header = (TextView) itemView.findViewById(R.id.header);
            horizontalRecyclerView = (RecyclerView) itemView.findViewById(R.id.horizontal_recycler);
        }
    }
}
