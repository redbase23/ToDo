package com.commonsware.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.commonsware.todo.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    private var _binding: ActivityAboutBinding?=null
    private val binding get()=_binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding=ActivityAboutBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.toolbarAbout.title=getString(R.string.app_name)
        binding.about.loadUrl("file:///android_asset/about.html")
    }
}