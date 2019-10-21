package com.example.daftar_makanan;

import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;
import android.view.ViewGroup;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class Adaptor extends RecyclerView.Adapter<Adaptor.ViewHolder>
{

    private static final String TAG="Adaptor";
    private ArrayList<daftar> listdaftar;
    private Context context;

//    private OnItemClickCallback onItemClickCallback;
//
//    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback)
//    {
//        this.onItemClickCallback = onItemClickCallback;
//    }
//
//    public interface OnItemClickCallback
//    {
//        void onItemClicked(daftar data);
//    }

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        private TextView TextView1,TextView2;
        private ImageView Maeman;

        ViewHolder(View itemview)
        {
            super (itemview);
            TextView1 = itemview.findViewById(R.id.makanan1);
            TextView2 = itemview.findViewById(R.id.harga1);
            Maeman = itemview.findViewById(R.id.thumbnail);
        }
    }

    public Adaptor(ArrayList<daftar> list,Context cont)
    {
        this.context=cont;
        this.listdaftar = list;
    }
    public Adaptor(ArrayList<daftar> list){
        this.listdaftar=list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType)
    {
        View view  = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_view, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int position)
    {
        final daftar daftar = listdaftar.get(position);
        viewHolder.TextView1.setText(daftar.getMakanan());
        viewHolder.TextView2.setText(daftar.getHarga());
        Glide.with(viewHolder.itemView.getContext())
                .load(daftar.getGambar())
                .apply(new RequestOptions().override(28,28))
                .into(viewHolder.Maeman);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                daftar dataku = listdaftar.get((viewHolder.getAdapterPosition()));
                Intent intn = new Intent(context,Masuk.class);
                intn.putExtra("makanan",dataku);
                context.startActivity(intn);
//                onItemClickCallback.onItemClicked(listdaftar.get(viewHolder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount()

    {
        return listdaftar.size();
    }

}