package kr.ac.kumoh.s20180911.midterm_homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20180911.midterm_homework.databinding.ActivityFirstBinding

class MainActivity : AppCompatActivity() {
    // View Binding
    private lateinit var main: ActivityFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(main.root)

        // 이미지 클릭 처리
        main.imgGundam.setOnClickListener {
            val second = Intent(this, SecondActivity::class.java)
            startActivity(second)
        }
    }
}