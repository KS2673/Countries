package com.example.countries

import android.database.Cursor
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class RecyclerViewAdapter(listData: Array<MyList>) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    private var listData: Array<MyList>
    init {
        this.listData=listData
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ):RecyclerViewAdapter.ViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val listItem: View = layoutInflater.inflate(R.layout.recyclerviewlayouy,
            parent, false)
        return ViewHolder(listItem)
    }
    override fun onBindViewHolder(holder: RecyclerViewAdapter.ViewHolder,
                                  position: Int) {
        val data: MyList = listData[position]
        holder.textView.text = listData[position].getName()
        holder.imageView.setImageResource(listData[position].getImgId())
        holder.relativeLayout.setOnClickListener(View.OnClickListener {
            Toast.makeText(it.context, "Click on item: ${data.getName()}",
                Toast.LENGTH_SHORT).show()

        })
    }
    override fun getItemCount(): Int {
        return listData.size
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView
        var textView: TextView
        var relativeLayout: RelativeLayout
        init {
            imageView = itemView.findViewById<View>(R.id.myImgViewRV) as
                    ImageView
            textView = itemView.findViewById<View>(R.id.myTextViewRV) as TextView
            textView = itemView.findViewById<View>(R.id.myTextViewpV) as TextView
            relativeLayout = itemView.findViewById<View>(R.id.relativeLayout) as
                    RelativeLayout

        }
    }
}
