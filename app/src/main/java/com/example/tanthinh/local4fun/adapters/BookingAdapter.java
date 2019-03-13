package com.example.tanthinh.local4fun.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tanthinh.local4fun.R;
import com.example.tanthinh.local4fun.models.Post;

import java.util.List;

import me.relex.circleindicator.CircleIndicator;

public class BookingAdapter extends RecyclerView.Adapter {

    private List<Post> postList; // Temporary List
    private Context context;
    private ViewPagerAdapter viewPagerAdapter;
    private CircleIndicator indicator;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public ViewPager viewPager; // for slider
        public TextView postTitle;
        public TextView postHour;
        public TextView postTour;
        public TextView postPrice;
        public TextView postLocation;


        public MyViewHolder(View v) {
            super(v);
            viewPager = v.findViewById(R.id.viewPager);
            postTitle = v.findViewById(R.id.explore_post_title);
            postHour = v.findViewById(R.id.explore_post_hour);
            postTour = v.findViewById(R.id.explore_tour);
            postPrice = v.findViewById(R.id.explore_price_person);
            postLocation = v.findViewById(R.id.explore_location);
        }

    }
    public BookingAdapter(Context context, List postList)
    {
        this.postList = postList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.post_block, parent, false);

        MyViewHolder vh = new MyViewHolder(v);
        View userPro = v.findViewById(R.id.explore_user_area);
        userPro.bringToFront();
        userPro.requestLayout();
        indicator = (CircleIndicator) v.findViewById(R.id.viewPagerIndicator);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

}
