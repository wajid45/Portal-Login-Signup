package com.example.portallogin_signup

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter


class ViewPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return Chat_tab()
            1 -> return Community_tab()
            2 -> return Logs_tab()
            else -> return Chat_tab()
        }
    }

    override fun getItemCount(): Int {
        return 3
    }
}
