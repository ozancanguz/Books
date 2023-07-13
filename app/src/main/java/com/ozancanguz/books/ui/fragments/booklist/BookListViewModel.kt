package com.ozancanguz.books.ui.fragments.booklist

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ozancanguz.books.data.Repository.Repository
import com.ozancanguz.books.data.model.Book
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BookListViewModel@Inject constructor(private val repository: Repository, application: Application):AndroidViewModel(application) {


    val booklist=MutableLiveData<Book>()


   fun getBookList(){
       viewModelScope.launch {
           val response=repository.remote.getBooKList()
           if(response.isSuccessful){

             booklist.postValue(response.body())
           }
           else{
               Log.d("viewmodel","no data fetched")
           }
       }
   }




}