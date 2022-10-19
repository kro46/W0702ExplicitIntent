package kr.ac.kumoh.s20170187com.example.w0702explicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kr.ac.kumoh.s20170187com.example.w0702explicitintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnExplicitIntent.setOnClickListener{
       //     Toast.makeText(this,"눌렸습니다.",Toast.LENGTH_SHORT).show()
        val intent = Intent(this, ImageActivity::class.java)
            startActivity(intent)
        }

        binding.btnImplicitIntent.setOnClickListener{
            //     Toast.makeText(this,"눌렸습니다.",Toast.LENGTH_SHORT).show()
            val uri = Uri.parse("https://www.youtube.com/results?search_query=" +
                     binding.editText.text)
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        }
    }
}