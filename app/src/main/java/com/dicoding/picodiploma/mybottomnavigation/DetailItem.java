package com.dicoding.picodiploma.mybottomnavigation;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailItem extends Fragment {

    public ModelData modelData;

    public DetailItem() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_item, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView tvTitle = view.findViewById(R.id.tv_title),
                tvRelease = view.findViewById(R.id.tv_release),
                tvCast = view.findViewById(R.id.tv_cast),
                tvDirector = view.findViewById(R.id.tv_director),
                tvOverview = view.findViewById(R.id.tv_overview);

        ImageView imgPoster = view.findViewById(R.id.img_poster);

        Bundle bundle = this.getArguments();
        if (bundle != null){
            modelData = bundle.getParcelable("DetailItem");

        }

        if (modelData != null) {
            tvTitle.setText(modelData.getTitle());
            tvRelease.setText(modelData.getRelease());
            tvCast.setText(modelData.getCast());
            tvDirector.setText(modelData.getDirector());
            tvOverview.setText(modelData.getOverview());
            Glide.with(this)
                    .load(modelData.getPoster())
                    .into(imgPoster);
        }

    }
}
