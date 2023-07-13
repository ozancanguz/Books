package com.ozancanguz.books.ui.fragments.booklist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.ozancanguz.books.data.adapter.BookListAdapter
import com.ozancanguz.books.databinding.FragmentBookListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BookListFragment : Fragment() {
    private var _binding: FragmentBookListBinding? = null

    private val binding get() = _binding!!

    // init adapter
    private val adapter=BookListAdapter()

    // init viewmodel
    private val bookListViewModel:BookListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentBookListBinding.inflate(inflater, container, false)


        // setting up recyclerview
        setupRv()

        // observe live data and update ui
        observeLiveData()

        return binding.root

    }

    private fun observeLiveData() {
        bookListViewModel.getBookList()
        bookListViewModel.booklist.observe(viewLifecycleOwner, Observer {
            adapter.setData(it)
        })
    }

    private fun setupRv() {
        binding.recyclerView.layoutManager=LinearLayoutManager(requireContext())
        binding.recyclerView.adapter=adapter
    }


}