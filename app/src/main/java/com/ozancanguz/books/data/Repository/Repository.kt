package com.ozancanguz.books.data.Repository

import com.ozancanguz.books.data.remote.RemoteDataSource
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class Repository@Inject constructor(private val remoteDataSource: RemoteDataSource) {

    val remote=remoteDataSource
}