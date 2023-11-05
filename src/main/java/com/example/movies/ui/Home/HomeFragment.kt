package com.example.movies.ui.Home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.NavHostFragment
import com.example.movies.ui.base.BaseFragment
import com.example.movies.ImagePagerAdapter
import com.example.movies.R
import com.example.movies.databinding.FragmentHomeBinding


class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {
    override var layoutId: Int
        get() = R.layout.fragment_home
        set(value) {}
    override val viewModel: HomeViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = ImagePagerAdapter()
   /*  binding?.viewPager2?.adapter = adapter
        viewModel.imageUrls.observe(viewLifecycleOwner, { urls ->
                adapter.setImageUrls(urls!!)
        })*/

       viewModel.fetchPopularMovies()
        binding?.btnAction?.setOnClickListener {
            NavHostFragment.findNavController(this).navigate(R.id.action_home_to_detailsFragment)
        }
    }

}