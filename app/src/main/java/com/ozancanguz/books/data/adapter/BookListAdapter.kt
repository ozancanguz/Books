package com.ozancanguz.books.data.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ozancanguz.books.R
import com.ozancanguz.books.data.model.Book
import com.ozancanguz.books.databinding.BooklistrvlayoutBinding

class BookListAdapter : RecyclerView.Adapter<BookListAdapter.BookListViewHolder>() {

    inner class BookListViewHolder(private val binding: BooklistrvlayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(book: com.ozancanguz.books.data.model.Result) {
            binding.titleTextView.text = book.title
            binding.priceTextView.text = book.fiyat
            binding.authorNameTextView.text = book.yazar
        }
    }

    private var bookList: List<com.ozancanguz.books.data.model.Result> = emptyList()

    fun setData(newData: Book) {
        bookList = newData.result
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = BooklistrvlayoutBinding.inflate(inflater, parent, false)
        return BookListViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return bookList.size
    }

    override fun onBindViewHolder(holder: BookListViewHolder, position: Int) {
        val currentBook = bookList[position]
        holder.bind(currentBook)
    }
}
