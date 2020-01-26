package com.idealista.android.challenge.list.ui.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.idealista.android.challenge.list.ListPresenter
import com.idealista.android.challenge.list.R
import com.idealista.android.challenge.list.model.ListAssembler
import com.idealista.android.challenge.list.ui.AdModel
import com.idealista.android.challenge.list.ui.ListAdapter
import com.idealista.android.challenge.list.ui.ListModel
import com.idealista.android.challenge.list.ui.list_vp.ListView

class ListActivity : AppCompatActivity(), ListView {


    private lateinit var listAdapter: ListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        ListAssembler.presenter = ListPresenter(this)
        listAdapter = ListAdapter()
        findViewById<RecyclerView>(R.id.recycler).apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@ListActivity)
            adapter = listAdapter
        }
        ListAssembler.presenter.onListNeeded()
    }

    override fun render(list: ListModel) {
        listAdapter.set(list)
        listAdapter.listener(object :
            ListAdapter.AdListener {
            override fun onAdClicked(ad: AdModel) {
                ListAssembler.presenter.onAdClicked(ad)
            }
        })
    }

    override fun open(ad: AdModel) {
        startActivity(Intent(this,
            DetailAcivity::class.java).putExtra(
            DetailAcivity.ARG_ITEM,ad))
    }
}