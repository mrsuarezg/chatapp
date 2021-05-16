package com.example.chatappandroid.ViewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chatappandroid.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class UserViewHolder extends RecyclerView.ViewHolder{

    @BindView(R.id.img_avatar)
    public ImageView img_avatar;
    @BindView(R.id.txt_name)
    public TextView txt_name;
    @BindView(R.id.txt_bio)
    public TextView txt_bio;

    private Unbinder unbider;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        unbider = ButterKnife.bind(this,itemView);
    }
}
