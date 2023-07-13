package com.ozancanguz.books.data.remote

import com.ozancanguz.books.api.BookListApi
import com.ozancanguz.books.data.model.Book
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource@Inject constructor(private val bookListApi: BookListApi ) {



    suspend fun getBooKList(): Response<Book> {
        return bookListApi.getBookList()
    }
}