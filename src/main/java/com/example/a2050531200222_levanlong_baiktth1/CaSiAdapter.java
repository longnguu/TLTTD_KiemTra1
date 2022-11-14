package com.example.a2050531200222_levanlong_baiktth1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import java.util.List;

public class CaSiAdapter extends BaseAdapter {
    private Activity activity;
    private List<CaSi> items;

    public CaSiAdapter(Activity activity, List<CaSi> items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = activity.getLayoutInflater();
        view = inflater.inflate(R.layout.layout_casi, null);
        LinearLayout constraintLayout = (LinearLayout) view.findViewById(R.id.itembackground);
        if (i%2==0) constraintLayout.setBackgroundColor(ContextCompat.getColor(activity,R.color.teal_200));
        else    constraintLayout.setBackgroundColor(ContextCompat.getColor(activity,R.color.white));
        TextView tvName = (TextView) view.findViewById(R.id.tencasi);
        TextView tvNgheDanh = (TextView) view.findViewById(R.id.nghedanhcasi);
        TextView tvLuotThich = (TextView) view.findViewById(R.id.soluotthich);
        ImageView imageView = (ImageView) view.findViewById(R.id.hinhcasi);
        tvName.setText(items.get(i).getTen());
        tvNgheDanh.setText(items.get(i).getNgheDanh()+" - "+items.get(i).getQuocGia());
        tvLuotThich.setText(String.valueOf(items.get(i).getSoSaoBinhChon()));
        imageView.setImageResource(items.get(i).getHinhAnh());
        return view;
    }
}
