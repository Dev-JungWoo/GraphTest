package com.vincent.graphtest

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.vincent.graphtest.model.Bar
import com.vincent.graphtest.view.BarView

class GraphListAdapter : RecyclerView.Adapter<GraphListAdapter.ViewHolder>() {
    private val TAG = javaClass.simpleName

    var graphBars: List<Bar> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_bar, parent, false) as BarView
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = graphBars.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d(TAG, "onBindViewHolder")

        val bar = graphBars[position]
        val barView = holder.barView
    }

    class ViewHolder(val barView: BarView) : RecyclerView.ViewHolder(barView)
}
