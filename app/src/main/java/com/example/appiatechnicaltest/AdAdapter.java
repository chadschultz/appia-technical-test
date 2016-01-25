package com.example.appiatechnicaltest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Chad Schultz on 1/24/2016.
 */
public class AdAdapter extends RecyclerView.Adapter<AdAdapter.ViewHolder> {
    private List<Ad> mAds;

    static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView mThumbnail;
        public TextView mTitle;
        public TextView mDescription;
        public TextView mRating;
        public TextView mCategory;

        public ViewHolder(final View v) {
            super(v);
            mThumbnail = (ImageView) v.findViewById(R.id.thumbnail);
            mTitle = (TextView) v.findViewById(R.id.title);
            mDescription = (TextView) v.findViewById(R.id.description);
            mRating = (TextView) v.findViewById(R.id.rating);
            mCategory = (TextView) v.findViewById(R.id.category);
        }
    }

    public AdAdapter(List<Ad> ads) {
        mAds = ads;
    }

    @Override
    public int getItemCount() {
        return mAds.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_ad, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Ad ad = mAds.get(position);

        Context context = holder.mThumbnail.getContext();
        Picasso.with(context).load(ad.getProductThumbnail()).into(holder.mThumbnail);
        holder.mTitle.setText(ad.getProductName());
        holder.mDescription.setText(ad.getProductDescription());
        holder.mRating.setText(String.valueOf(ad.getRating()));
        holder.mCategory.setText(ad.getCategoryName());
    }
}
