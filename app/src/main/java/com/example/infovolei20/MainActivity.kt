package com.example.infovolei20

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.infovolei20.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
        private lateinit var binding : ActivityMainBinding
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.classificacaobtn.setOnClickListener{
            openUrl("https://www.portugalvoleibol.com/classificacao/index")
        }
        binding.noticiasbtn.setOnClickListener{
            openUrl("https://fpvoleibol.pt/fpv/2024/")
        }
        binding.fpvbtn.setOnClickListener{
            openUrl("https://fpvoleibol.pt/fpv/")
        }
        binding.youtubefpv.setOnClickListener{
            openUrl("https://www.youtube.com/@VoleiTVPortugal")
        }
        binding.facebookfpv.setOnClickListener{
            openUrl("https://www.facebook.com/fpvoleibol")
        }
        binding.shopingfpv.setOnClickListener{
            openUrl("https://portugalvoleibol.com/store/")
        }
        binding.instagramfpv.setOnClickListener{
            openUrl("https://www.instagram.com/portugalvoleibol/")
        }

    }

    private fun openUrl(link: String) {

        val uri = Uri.parse(link)
        val inte = Intent(Intent.ACTION_VIEW, uri)

        startActivity(inte)

    }
}

