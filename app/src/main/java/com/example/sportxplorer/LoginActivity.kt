package com.example.sportxplorer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.example.sportxplorer.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            signInButton.setOnClickListener {
                val signInBottomSheet = FragmentSignInDiyalog()
                signInBottomSheet.show(supportFragmentManager, signInBottomSheet.tag)

            }
            textViewSignUp.setOnClickListener {
                val signInBottomSheet = FragmentSignUpDiyalog()
                signInBottomSheet.show(supportFragmentManager, signInBottomSheet.tag)

            }



        }


    }

}