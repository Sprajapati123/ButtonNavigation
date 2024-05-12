package com.example.splashandbutton.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.splashandbutton.R
import de.hdodenhof.circleimageview.CircleImageView

class FruitsAdapter(var titleList: ArrayList<String>,
                    var imageList: ArrayList<Int>) : RecyclerView.Adapter<FruitsAdapter.FruitsViewHolder>() {

    class FruitsViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var title : TextView = view.findViewById(R.id.textView)
        var image : CircleImageView = view.findViewById(R.id.profile_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitsViewHolder {
        var view : View = LayoutInflater.from(parent.context)
            .inflate(R.layout.sample_recycler_view,parent,false)

        return FruitsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return titleList.size
    }

    override fun onBindViewHolder(holder: FruitsViewHolder, position: Int) {
        holder.title.text = titleList[position]
        holder.image.setImageResource(imageList[position])
    }
}