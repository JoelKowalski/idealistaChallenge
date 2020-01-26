package com.idealista.android.challenge.list.domain

import com.idealista.android.challenge.core.api.model.CommonError
import com.idealista.android.challenge.core.api.model.ListRepository
import com.idealista.android.challenge.core.wrench.type.Either

fun list(repository: ListRepository): () -> Either<CommonError, List> = {
    repository.list()
}