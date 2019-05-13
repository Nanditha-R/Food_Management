package com.example.foodwastemanagement;


import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {

    Context context;
    ArrayList<Item> list;

    public ListAdapter(Context context, ArrayList list)
    {
        this.context = context;
        this.list = list;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if(convertView == null)
        {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_view_row, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Item object = (Item) list.get(position) ;
        Log.d("item",""+object);
        viewHolder.itemName.setText(object.itemName);
        viewHolder.itemQuantity.setText(object.itemQuantity);
        viewHolder.itemPrice.setText(object.itemPrice);
        return convertView;


    }

    public class ViewHolder
    {
        TextView itemName,itemQuantity,itemPrice;

        public ViewHolder(View view)
        {
            itemName = view.findViewById(R.id.itemNameTextView);
            itemQuantity = view.findViewById(R.id.itemQuantityTextView);
            itemPrice = view.findViewById(R.id.itemPriceTextView);
        }
    }
}
