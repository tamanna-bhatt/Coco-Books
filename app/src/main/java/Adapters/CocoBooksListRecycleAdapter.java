package Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import Models.CocoBooksListModelClass;
import wolfsoft1.cocobooks.CocoBookAuthorActivity;
import wolfsoft1.cocobooks.CocoBookCatagoriesActivity;
import wolfsoft1.cocobooks.CocoBookDetailActivity;
import wolfsoft1.cocobooks.CocoBookFictionActivity;
import wolfsoft1.cocobooks.CocoBookGerneActivity;
import wolfsoft1.cocobooks.CocoBookHome2Activity;
import wolfsoft1.cocobooks.CocoBooksCollectionActivity;
import wolfsoft1.cocobooks.CocoBooksHome1Activity;
import wolfsoft1.cocobooks.CocoBooksHomeActivity;
import wolfsoft1.cocobooks.CocoBooksLibraryActivity;
import wolfsoft1.cocobooks.CocoBooksReadActivity;
import wolfsoft1.cocobooks.R;


public class CocoBooksListRecycleAdapter extends RecyclerView.Adapter<CocoBooksListRecycleAdapter.MyViewHolder>{

    Context context;


    private List<CocoBooksListModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {



        TextView title;


        public MyViewHolder(View view) {
            super(view);

            title=(TextView)view.findViewById(R.id.title);




        }

    }


    public CocoBooksListRecycleAdapter(Context context, List<CocoBooksListModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public CocoBooksListRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_coco_books_list, parent, false);


        return new CocoBooksListRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final  int position) {
        CocoBooksListModelClass lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());



        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (position == 0) {
                    Intent i = new Intent(context, CocoBookGerneActivity.class);
                    context.startActivity(i);
                }else if(position == 1){
                    Intent i = new Intent(context, CocoBooksHomeActivity.class);
                    context.startActivity(i);
                }else if(position == 2){
                    Intent i = new Intent(context, CocoBooksHome1Activity.class);
                    context.startActivity(i);
                }else if(position == 3){
                    Intent i = new Intent(context, CocoBookHome2Activity.class);
                    context.startActivity(i);
                }else if(position == 4){
                    Intent i = new Intent(context, CocoBooksLibraryActivity.class);
                    context.startActivity(i);
                }else if(position == 5){
                    Intent i = new Intent(context, CocoBookCatagoriesActivity.class);
                    context.startActivity(i);
                }else if(position == 6){
                    Intent i = new Intent(context, CocoBookDetailActivity.class);
                    context.startActivity(i);
                }else if(position == 7){
                    Intent i = new Intent(context, CocoBookAuthorActivity.class);
                    context.startActivity(i);
                }else if(position == 8){
                    Intent i = new Intent(context, CocoBooksReadActivity.class);
                    context.startActivity(i);
                }else if(position == 9){
                    Intent i = new Intent(context, CocoBooksCollectionActivity.class);
                    context.startActivity(i);
                }else if(position == 10){
                    Intent i = new Intent(context, CocoBookFictionActivity.class);
                    context.startActivity(i);
                }
            }

        });



    }



    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


