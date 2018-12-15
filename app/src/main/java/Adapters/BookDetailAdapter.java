package Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import Models.BookDetailModelClass;
import Models.HomeRecycleModelClass;
import wolfsoft1.cocobooks.R;

public class BookDetailAdapter extends RecyclerView.Adapter<BookDetailAdapter.MyViewHolder>{

    Context context;


    private List<BookDetailModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {



        TextView bookName,authorName;
        ImageView bookImage;

        public MyViewHolder(View view) {
            super(view);

            bookName=(TextView)view.findViewById(R.id.bookType);
            authorName=(TextView)view.findViewById(R.id.NoOfBooks);
            bookImage=(ImageView)view.findViewById(R.id.iconImage);


        }

    }


    public BookDetailAdapter(Context context, List<BookDetailModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public BookDetailAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_book_collection, parent, false);


        return new BookDetailAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        BookDetailModelClass lists = OfferList.get(position);


        holder.bookImage.setImageResource(lists.getImage());

    }





    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}
