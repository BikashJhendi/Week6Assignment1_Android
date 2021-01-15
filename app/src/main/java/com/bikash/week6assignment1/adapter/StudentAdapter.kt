package com.bikash.week6assignment1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bikash.week6assignment1.R
import com.bikash.week6assignment1.fragments.HomeFragment
import com.bikash.week6assignment1.model.Students
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class StudentAdapter(
    val lstStudent: ArrayList<Students>,
    val context: HomeFragment
) : RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {

    class StudentViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgStudentPic: CircleImageView
        val tvStudentName: TextView
        val tvStudentAge: TextView
        val tvStudentAddress: TextView
        val tvStudentGender: TextView

        init {
            imgStudentPic = view.findViewById(R.id.imgStudentPic)
            tvStudentName = view.findViewById(R.id.tvStudentName)
            tvStudentAge = view.findViewById(R.id.tvStudentAge)
            tvStudentAddress = view.findViewById(R.id.tvStudentAddress)
            tvStudentGender = view.findViewById(R.id.tvStudentGender)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StudentAdapter.StudentViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.student_layout, parent, false)
        return StudentViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lstStudent.size
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val student = lstStudent[position]
        holder.tvStudentName.text = student.studentFullName
        holder.tvStudentAge.text = student.studentAge.toString()
        holder.tvStudentAddress.text = student.studentAddress
        holder.tvStudentGender.text = student.studentGender

        Glide.with(context)
            .load(student.studentImage)
            .into(holder.imgStudentPic)
    }

}