package com.example.movies.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider

abstract class BaseFragment<T : ViewDataBinding, V : BaseViewModel>:Fragment() {
   abstract var layoutId: Int
   abstract val viewModel: V

    private  var _binding:T?=null

    protected val binding
        get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = DataBindingUtil.inflate(inflater, layoutId, container, false)
       binding?. lifecycleOwner =viewLifecycleOwner
        return _binding!!.root
    }


}