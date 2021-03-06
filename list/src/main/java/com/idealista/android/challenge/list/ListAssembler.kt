package com.idealista.android.challenge.list.model


import com.idealista.android.challenge.core.CoreAssembler
import com.idealista.android.challenge.ListDataSource
import com.idealista.android.challenge.core.api.model.ListRepository
import com.idealista.android.challenge.list.ListPresenter


object ListAssembler {

    private val listDataSource: ListDataSource by lazy { ListDataSource(CoreAssembler.listApi) }

    lateinit var presenter: ListPresenter

    val listRepository: ListRepository by lazy { ListRepository(listDataSource) }

}