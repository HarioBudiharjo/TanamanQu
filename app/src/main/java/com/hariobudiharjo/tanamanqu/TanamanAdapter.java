package com.hariobudiharjo.tanamanqu;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class TanamanAdapter extends RecyclerView.Adapter<TanamanAdapter.ViewHolder> {

    private ArrayList<TanamanModel> tanamanModels;
    private Context context;

    public TanamanAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<TanamanModel> getTanamanModels() {
        return tanamanModels;
    }

    public void setTanamanModels(ArrayList<TanamanModel> tanamanModels) {
        this.tanamanModels = tanamanModels;
    }

    @NonNull
    @Override
    public TanamanAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item_tanaman, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TanamanAdapter.ViewHolder holder, final int position) {
        final TanamanModel tanaman = getTanamanModels().get(position);

        holder.nama.setText(tanaman.getNama());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "posisi ke " + position, Toast.LENGTH_LONG).show();
                Intent intent = new Intent(context, DetailTanamanActivity.class);
                intent.putExtra("nama", tanaman.getNama());
                intent.putExtra("deskripsi", tanaman.getDeskripsi());
                intent.putExtra("gambar", tanaman.getGambar());
                context.startActivity(intent);
            }
        });
        int gambarId = context.getResources().getIdentifier(tanaman.getGambar(), "drawable", context.getPackageName());
        holder.imageView.setImageResource(gambarId);
    }

    @Override
    public int getItemCount() {
        return tanamanModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView nama;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.gambarTanaman);
            nama = itemView.findViewById(R.id.namaTanaman);
        }
    }
}
