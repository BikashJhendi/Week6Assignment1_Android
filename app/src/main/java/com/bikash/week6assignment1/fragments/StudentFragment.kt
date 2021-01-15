package com.bikash.week6assignment1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import com.bikash.week6assignment1.R
import com.bikash.week6assignment1.model.Students
import java.util.ArrayList

class StudentFragment : Fragment() {
    private lateinit var etFullName: EditText
    private lateinit var etAge: EditText
    private lateinit var rbGender: RadioGroup
    private lateinit var etAddress: EditText
    private lateinit var btnSave: Button
    private var lstStudent = ArrayList<Students>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_student, container, false)

        etFullName = view.findViewById(R.id.etFullName)
        etAge = view.findViewById(R.id.etAge)
        rbGender = view.findViewById(R.id.rbGender)
        etAddress = view.findViewById(R.id.etAddress)
        btnSave = view.findViewById(R.id.btnSave)

        btnSave.setOnClickListener {
            val etFullName = etFullName.text.toString()
            val etAge = etAge.text.toString().toInt()
            val rbGender = rbGender.toString()
            val etAddress = etAddress.text.toString()

//            lstStudent.add(Students(etFullName, etAge, rbGender, etAddress, ""))
            lstStudent.add(Students("nnn", 12, "Male", "come",
                "https://static.toiimg.com/photo/msid-75805310/75805310.jpg?135092"))
        }

        return view
    }

}