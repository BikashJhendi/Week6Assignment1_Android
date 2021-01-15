package com.bikash.week6assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.bikash.week6assignment1.adapter.ViewPagerAdapter
import com.bikash.week6assignment1.fragments.AboutFragment
import com.bikash.week6assignment1.fragments.HomeFragment
import com.bikash.week6assignment1.fragments.StudentFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class TabLayoutActivity : AppCompatActivity() {
    private lateinit var lstTitle: ArrayList<String>
    private lateinit var lstFragments: ArrayList<Fragment>
    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout)

        viewPager = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tabLayout)

        populateList()
        val adapter = ViewPagerAdapter(lstFragments, supportFragmentManager, lifecycle)
        viewPager.adapter = adapter
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = lstTitle[position]
        }.attach()
    }

    private fun populateList() {
        lstTitle = ArrayList<String>()
        lstTitle.add("Home")
        lstTitle.add("Add Student")
        lstTitle.add("About Us")
        lstFragments = ArrayList<Fragment>()
        lstFragments.add(HomeFragment())
        lstFragments.add(StudentFragment())
        lstFragments.add(AboutFragment())
    }
}