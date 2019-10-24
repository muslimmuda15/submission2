package com.dicoding.picodiploma.mybottomnavigation.movie;


import android.content.Intent;
import android.graphics.ColorSpace;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dicoding.picodiploma.mybottomnavigation.CustomItemClickSupport;
import com.dicoding.picodiploma.mybottomnavigation.DetailItem;
import com.dicoding.picodiploma.mybottomnavigation.ItemListAdapter;
import com.dicoding.picodiploma.mybottomnavigation.ModelData;
import com.dicoding.picodiploma.mybottomnavigation.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MovieFragment extends Fragment {

    private RecyclerView rvMovie;
    private ArrayList<ModelData> listModelData = new ArrayList<>();

    public MovieFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvMovie = view.findViewById(R.id.rv_movie);
        rvMovie.setHasFixedSize(true);

        listModelData = new ArrayList<>();
        listModelData.addAll(MovieData.getListMovie());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvMovie.setLayoutManager(new LinearLayoutManager(getContext()));
        ItemListAdapter itemListAdapter = new ItemListAdapter(getContext());
        itemListAdapter.setListModelData(listModelData);
        rvMovie.setAdapter(itemListAdapter);

        CustomItemClickSupport.addTo(rvMovie).setOnItemClickListener(new CustomItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedMovie(listModelData.get(position));
            }
        });
    }

    private void showSelectedMovie(ModelData modelData){
        DetailItem detailItem = new DetailItem();
        Bundle bundle = new Bundle();
        bundle.putParcelable("DetailItem", modelData);
        detailItem.setArguments(bundle);


    }

}
