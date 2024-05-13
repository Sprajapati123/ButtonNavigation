package com.example.splashandbutton.adapter

import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabAdapter(var fragmentManager: FragmentManager,
                 var lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

}