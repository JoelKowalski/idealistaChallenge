package com.idealista.android.challenge.list.ui.activities

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.idealista.android.challenge.list.DetailAssembler
import com.idealista.android.challenge.list.R
import com.idealista.android.challenge.list.ui.AdModel
import com.idealista.android.challenge.list.ui.detail_vp.DetailPresenter
import com.idealista.android.challenge.list.ui.detail_vp.DetailView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail.*

class DetailAcivity  : AppCompatActivity(),DetailView{

    companion object {
        const val ARG_ITEM = "item"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        DetailAssembler.presenter = DetailPresenter(this)
        loadData()
    }

    private fun loadData(){
        DetailAssembler.presenter.initBundle(intent)
    }

    override fun renderDetail(ad: AdModel) {
        Picasso.with(this@DetailAcivity).load(ad.thumbnail).into(IVpicture)
        TVtitle.text = ad.title
    }
}
