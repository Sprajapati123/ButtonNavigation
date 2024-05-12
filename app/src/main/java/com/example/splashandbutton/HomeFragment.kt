package com.example.splashandbutton

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.splashandbutton.adapter.FruitsAdapter
import com.example.splashandbutton.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    lateinit var homeBinding : FragmentHomeBinding
    var titleList = ArrayList<String>()
    var imageList = ArrayList<Int>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        homeBinding = FragmentHomeBinding.inflate(inflater,container,false)
        titleList.add("Apple")
        imageList.add(R.drawable.fruits)
        titleList.add("Apple 2")
        imageList.add(R.drawable.fruits)
        titleList.add("Apple 3")
        imageList.add(R.drawable.fruits)

        var adapter = FruitsAdapter(titleList,imageList)

        homeBinding.recyclerView.layoutManager = LinearLayoutManager(context)
        homeBinding.recyclerView.adapter = adapter


        return homeBinding.root
    }




}