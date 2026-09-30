package com.example.baitap2_lab3

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.baitap2_lab3.databinding.ActivityMainBinding
import com.example.baitap2_lab3.model.Student

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Using scope function: apply to initialize binding and set content view
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
        }

        ViewCompat.setOnApplyWindowInsetsListener(binding.mainLayout) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Using scope function: run to create and display student info
        val student = Student(
            fullName = "Nguyễn Ngọc Huy",
            msv = "2415053122119",
            studentClass = "24T1",
            age = 20,
            email = "huy@gmail.com"
        ).also {
            // Using scope function: also for logging or side effect
            println("Student initialized: ${it.fullName}")
        }

        // Using scope function: with to bind student data to views
        with(binding) {
            tvFullName.text = "Họ và tên: ${student.fullName}"
            tvMsv.text = "MSV: ${student.msv}"
            tvClass.text = "Lớp: ${student.studentClass}"
            tvAge.text = "Tuổi: ${student.age}"
            tvEmail.text = "Email: ${student.email}"
        }

        // Using scope function: let and apply for Intent navigation
        binding.btnNext.setOnClickListener {
            Intent(this, SecondActivity::class.java).let { intent ->
                intent.putExtra("STUDENT_DATA", student)
                startActivity(intent)
            }
        }
    }
}
