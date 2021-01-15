package com.bikash.week6assignment1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bikash.week6assignment1.MainActivity
import com.bikash.week6assignment1.R
import com.bikash.week6assignment1.TabLayoutActivity
import com.bikash.week6assignment1.adapter.StudentAdapter
import com.bikash.week6assignment1.model.Students

class HomeFragment : Fragment() {
    private lateinit var studentRecyclerView: RecyclerView
    private var lstStudent = ArrayList<Students>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        studentRecyclerView =view.findViewById(R.id.homeRecyclerView)

        loadStudents()
        val adapter = StudentAdapter(lstStudent, this)
        studentRecyclerView.layoutManager = LinearLayoutManager(context)
        studentRecyclerView.adapter = adapter

        return view
    }

    private fun loadStudents() {
        lstStudent.add(
            Students(
                "Robert Downey, Jr.", 20,
                "Male", "US",
                "https://static.toiimg.com/photo/msid-75805310/75805310.jpg?135092"
            )
        )
        lstStudent.add(
            Students(
                "Tom Holland", 22,
                "Male", "UK",
                "https://www.biography.com/.image/t_share/MTQ4MTUwOTQyMDE1OTU2Nzk4/tom-holland-photo-jason-kempin-getty-images-801510482-profile.jpg"
            )
        )
        lstStudent.add(
            Students(
                "Andrew Garfield", 21, "Male", "US",
                "https://i.guim.co.uk/img/media/a0a8d72956931a50e29fed5631069a97ff94eabb/1025_221_3239_1944/master/3239.jpg?width=1200&height=1200&quality=85&auto=format&fit=crop&s=71521568c81a48246f0647db16adf205"
            )
        )
    }
}