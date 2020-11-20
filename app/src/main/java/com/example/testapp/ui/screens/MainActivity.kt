package com.example.testapp.ui.screens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        btnEnter.setOnClickListener {
            mainViewModel.signIng(etLogin.text.toString(), etPassword.text.toString())
        }
    }
}