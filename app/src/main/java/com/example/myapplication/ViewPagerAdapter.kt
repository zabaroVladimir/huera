package com.example.myapplication

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.ui.dashboard.DashboardFragment
import com.example.myapplication.ui.home.HomeFragment
import com.example.myapplication.ui.notifications.NotificationsFragment

class ViewPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment()
            1 -> DashboardFragment()
            2 -> NotificationsFragment()
            else -> HomeFragment()
        }
    }
}