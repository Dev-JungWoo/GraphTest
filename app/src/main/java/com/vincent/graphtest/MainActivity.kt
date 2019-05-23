package com.vincent.graphtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.HORIZONTAL
import com.vincent.graphtest.model.Bar
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        graphView.layoutManager = LinearLayoutManager(this, HORIZONTAL, false)
        val dividerItemDecoration = DividerItemDecoration(
            graphView.context,
            HORIZONTAL
        )
        graphView.addItemDecoration(dividerItemDecoration)

        val graphListAdapter = GraphListAdapter()
        graphListAdapter.graphBars = (1..100).map { Bar(it) }
        graphView.adapter = graphListAdapter

    }
}
