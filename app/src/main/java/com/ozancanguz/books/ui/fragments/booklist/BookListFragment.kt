package com.ozancanguz.books.ui.fragments.booklist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozancanguz.books.databinding.FragmentBookListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BookListFragment : Fragment() {
    private var _binding: FragmentBookListBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentBookListBinding.inflate(inflater, container, false)

        return binding.root

    }


}