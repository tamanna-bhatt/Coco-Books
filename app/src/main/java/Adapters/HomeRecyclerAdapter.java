package Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import Models.HomeRecycleModelClass;
import wolfsoft1.cocobooks.R;

public class HomeRecyclerAdapter extends RecyclerView.Adapter<HomeRecyclerAdapter.MyViewHolder>{

    Context context;


    private List<HomeRecycleModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {



        TextView bookName,authorName;
        ImageView bookImage;

        public MyViewHolder(View view) {
            super(view);

            bookName=(TextView)view.findViewById(R.id.bookName);
            authorName=(TextView)view.findViewById(R.id.authorName);
            bookImage=(ImageView)view.findViewById(R.id.bookImage);


        }

    }


    public HomeRecyclerAdapter(Context mainActivityContacts, List<HomeRecycleModelClass> offerList) {
        this.OfferList = offerList;
        this.context = mainActivityContacts;
    }

    @Override
    public HomeRecyclerAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_home_recycler, parent, false);


        return new HomeRecyclerAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(HomeRecyclerAdapter.MyViewHolder holder, int position) {
        HomeRecycleModelClass lists = OfferList.get(position);

        holder.bookName.setText(lists.getBookName());
        holder.authorName.setText(lists.getAuthorName());
        holder.bookImage.setImageResource(lists.getBookImage());

    }



    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}
