package com.example.emptyapple

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.emptyapple.adapters.mainAdapter
import com.example.emptyapple.databinding.FragmentFirstBinding

// TODO добавить на гитхаб!!

class FirstFragment: Fragment() {
    private var binding: FragmentFirstBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding?.root ?: super.onCreateView(inflater, container, savedInstanceState)
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.buttonSearch?.setOnClickListener {
        Log.i("A_TAG", "You pressed a button")
        }

    binding?.mainList?.layoutManager = LinearLayoutManager(binding?.mainList?.context ?: requireContext())
    val myAdapter: mainAdapter = mainAdapter()
        binding?.mainList?.adapter = myAdapter

        myAdapter.setData(listOf("Note1", "Note2", "Note3", "Note1", "Note2", "Note3", "Note1", "Note2", "Note3", "Note1", "Note2", "Note3", "Note1", "Note2", "Note3", ))
    }

    }
