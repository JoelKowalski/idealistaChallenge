package com.idealista.android.challenge.list.ui.list_vp

import com.idealista.android.challenge.list.ui.AdModel
import com.idealista.android.challenge.list.ui.ListModel

interface ListView {
    fun render(list: ListModel)
    fun open(ad: AdModel)
}