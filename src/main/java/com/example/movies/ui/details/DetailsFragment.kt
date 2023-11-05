package com.example.movies.ui.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import com.example.movies.ui.base.BaseFragment
import com.example.movies.R
import com.example.movies.databinding.FragmentDetailsBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DetailsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailsFragment : BaseFragment<FragmentDetailsBinding, DetailViewModel>() {
    override var layoutId: Int
        get() = R.layout.fragment_details
        set(value) {}
    override val viewModel: DetailViewModel
        get() = DetailViewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.action?.setOnClickListener {
            NavHostFragment.findNavController(this).navigate(R.id.action_detailsFragment_to_home)
        }
    }

}