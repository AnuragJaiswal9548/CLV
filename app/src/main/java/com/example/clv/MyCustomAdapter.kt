package com.example.clv

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView


class MyCustomAdapter(val ctx:Context,val myDataList:List<MyData>):BaseAdapter() {
    override fun getCount(): Int {
        return myDataList.size
    }

    override fun getItem(position: Int): MyData {
        return myDataList[position]
    }

    override fun getItemId(position:  Int): Long {
        return position.toLong()
    }

    override fun getView(position:  Int, convertView: View?, parent: ViewGroup?): View {
        var myConvertView=convertView
        if(myConvertView==null){
            myConvertView=LayoutInflater.from(ctx).inflate(R.layout.my_list_view,parent,false)
        }
        val  currentItem=getItem(position)
        val imageItem=myConvertView?.findViewById<ImageView>(R.id.list_item_image)
        val  titleItem=myConvertView?.findViewById<TextView>(R.id.list_item_title)
        val descItem=myConvertView?.findViewById<TextView>(R.id.list_item_desc)

        imageItem?.setImageResource(currentItem.image)
        titleItem?.text=currentItem.title
        descItem?.text=currentItem.desc

        return myConvertView!!
    }
}