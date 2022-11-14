package com.example.a2050531200222_levanlong_baiktth1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListCaSi extends AppCompatActivity {

    private ListView listView;
    ArrayList<CaSi> items = new ArrayList<>();
    CaSiAdapter adapter;
    Boolean kt=false;
    int j=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_ca_si);

        listView = (ListView) findViewById(R.id.lvCaSi);
        items.add(new CaSi("Nguyễn Thanh Tùng","Sơn Tùng M-TP", "Việt Nam",1234,R.drawable.sontungmtp)) ;
        items.add(new CaSi("Park Chae-young","Rosé", "Hàn Quốc",2345,R.drawable.rose)) ;
        items.add(new CaSi("Justin Drew Bieber","Justin Bieber", "Canada",4567,R.drawable.justinbieber));
        items.add(new CaSi("Taylor Alison Swift","Taylor Swift", "Hoa Kỳ",5678,R.drawable.taylorswift));

        adapter = new CaSiAdapter(ListCaSi.this,items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                kt=true;
                Xacnhanxoa(i);
                return false;
            }
        });
    }
    public void Xacnhanxoa(final int pos){
        AlertDialog.Builder alertDiaLog = new AlertDialog.Builder(ListCaSi.this);
        alertDiaLog.setTitle("Thông báo");
        alertDiaLog.setIcon(R.mipmap.ic_launcher);
        alertDiaLog.setMessage("Bạn có muốn xóa");
        alertDiaLog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                items.remove(pos);
                adapter.notifyDataSetChanged();
            }
        });
        alertDiaLog.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertDiaLog.show();

    }
}