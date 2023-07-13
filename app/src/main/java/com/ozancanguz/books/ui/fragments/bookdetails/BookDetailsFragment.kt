package com.ozancanguz.books.ui.fragments.bookdetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.ozancanguz.books.R
import com.ozancanguz.books.databinding.FragmentBookDetailsBinding
import com.ozancanguz.books.utils.Util.Companion.loadImage
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BookDetailsFragment : Fragment() {
    private var _binding: FragmentBookDetailsBinding? = null

    private val binding get() = _binding!!

    private val args:BookDetailsFragmentArgs by navArgs()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentBookDetailsBinding.inflate(inflater, container, false)
        val view = binding.root


        setDetails()


        return view

    }

    private fun setDetails() {
        binding.detailsprice.text=args.currentBook.fiyat
        binding.detailsAuthor.text=args.currentBook.yazar
        binding.imageView2.loadImage(args.currentBook.image)
        binding.detailsTitle.text=args.currentBook.title
    }


}