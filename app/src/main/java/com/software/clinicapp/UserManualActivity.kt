package com.software.clinicapp

import android.content.Intent

import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.software.clinicapp.databinding.ActivityUserManualBinding
import android.widget.TextView

class UserManualActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val togoToManual = findViewById<TextView>(R.id.UserManual)
        togoToManual.setOnClickListener{
            goHome()
        }
    }
    private fun goHome(){
        val i = Intent(this,MainActivity::class.java)
        startActivity(i)

    }

}