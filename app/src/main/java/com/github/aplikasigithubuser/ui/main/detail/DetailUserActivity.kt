package com.github.aplikasigithubuser.ui.main.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.aplikasigithubuser.R
import com.github.aplikasigithubuser.databinding.ActivityDetailUserBinding
import com.github.aplikasigithubuser.databinding.ItemUserBinding

class DetailUserActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityDetailUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}