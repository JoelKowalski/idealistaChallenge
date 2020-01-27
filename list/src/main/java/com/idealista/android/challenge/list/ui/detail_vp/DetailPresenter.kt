package com.idealista.android.challenge.list.ui.detail_vp

import android.content.Intent
import com.idealista.android.challenge.list.ui.AdModel
import com.idealista.android.challenge.list.ui.activities.DetailAcivity

class DetailPresenter(private val view: DetailView) {

    fun initBundle(intent: Intent){
        view.renderDetail(intent.extras.getParcelable<AdModel>(DetailAcivity.ARG_ITEM))
    }
}
