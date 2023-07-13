package com.ozancanguz.books.api

import com.ozancanguz.books.data.model.Book
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface BookListApi {

    @GET("newBook")
    @Headers("authorization: apikey  4IWVc8vvEENxHXHg65H4zj:1R6sWAoD9X50qZ8fvdFzPP", "content-type: application/json")
    suspend fun getBookList(): Response<Book>


}