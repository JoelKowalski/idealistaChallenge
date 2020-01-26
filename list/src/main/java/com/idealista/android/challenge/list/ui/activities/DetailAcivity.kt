package com.idealista.android.challenge.list.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.idealista.android.challenge.list.R
import com.idealista.android.challenge.list.ui.AdModel
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


        var data = intent.extras
        var item = data.getParcelable<AdModel>(ARG_ITEM)

        Picasso.with(this@DetailAcivity).load(item.thumbnail).into(IVpicture)
        TVtitle.text = item.title

    }
}
