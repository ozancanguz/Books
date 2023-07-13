package com.ozancanguz.books.ui.fragments.bookdetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozancanguz.books.R
import com.ozancanguz.books.databinding.FragmentBookDetailsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BookDetailsFragment : Fragment() {
    private var _binding: FragmentBookDetailsBinding? = null

    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentBookDetailsBinding.inflate(inflater, container, false)
        val view = binding.root

        return view

    }


}