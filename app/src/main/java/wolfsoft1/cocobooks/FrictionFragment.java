package wolfsoft1.cocobooks;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import Adapters.BookCatgorieAdapter;
import Adapters.FictionAdapter;
import Models.FictionModel;
import Models.GridModel;

public class FrictionFragment extends Fragment {


    private ArrayList<FictionModel> homeListModelClassArrayList1;
    private RecyclerView recyclerView;
    private FictionAdapter bAdapter;

    Integer image[]={R.drawable.lord,R.drawable.the_world,R.drawable.brain};
    String bookName[]={"Hugo Huesca\n" +
            "Dungeon Lord","The World Of\n" +
            "Abstract Art","Mind and\n" +
            "Pieces of Light"};
    String author[]={"O. Henry","Create Media","Charles"};
    String price[]={"USD22","USD22","USD22"};


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_friction, container, false);



        recyclerView = view.findViewById(R.id.fictionRecycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        homeListModelClassArrayList1 = new ArrayList<>();

        for (int i = 0; i < image.length; i++) {
            FictionModel beanClassForRecyclerView_contacts = new FictionModel(image[i],bookName[i],author[i],price[i]);
            homeListModelClassArrayList1.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new FictionAdapter(getActivity(),homeListModelClassArrayList1);
        recyclerView.setAdapter(bAdapter);


        recyclerView = view.findViewById(R.id.fictionRecycler2);
        RecyclerView.LayoutManager mlayoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(mlayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        homeListModelClassArrayList1 = new ArrayList<>();

        for (int i = 0; i < image.length; i++) {
            FictionModel beanClassForRecyclerView_contacts = new FictionModel(image[i],bookName[i],author[i],price[i]);
            homeListModelClassArrayList1.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new FictionAdapter(getActivity(),homeListModelClassArrayList1);
        recyclerView.setAdapter(bAdapter);

        return  view;

    }

}