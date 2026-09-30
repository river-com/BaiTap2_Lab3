package com.example.baitap2_lab3

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.baitap2_lab3.databinding.ActivitySecondBinding
import com.example.baitap2_lab3.model.Student

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Using scope function: apply for view binding initialization
        binding = ActivitySecondBinding.inflate(layoutInflater).apply {
            setContentView(root)
        }

        ViewCompat.setOnApplyWindowInsetsListener(binding.secondLayout) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Using scope function: let to receive and handle Intent extra safely
        val student = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getSerializableExtra("STUDENT_DATA", Student::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getSerializableExtra("STUDENT_DATA") as? Student
        }

        student?.let {
            // Using scope function: with for working with student properties
            with(it) {
                binding.tvDetailInfo.text = "Đã nhận dữ liệu sinh viên qua Intent:\n\n" +
                        "Họ và tên: $fullName\n" +
                        "Mã sinh viên: $msv\n" +
                        "Lớp: $studentClass\n" +
                        "Tuổi: $age\n" +
                        "Email: $email"
            }
        } ?: run {
            binding.tvDetailInfo.text = "Không nhận được dữ liệu sinh viên."
        }

        // Using scope function: run for setting up button click listener
        binding.btnBack.run {
            setOnClickListener {
                // Using Intent to navigate back to MainActivity (Screen 1)
                Intent(this@SecondActivity, MainActivity::class.java).apply {
                    flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
                }.let { intent ->
                    startActivity(intent)
                    finish()
                }
            }
        }
    }
}
