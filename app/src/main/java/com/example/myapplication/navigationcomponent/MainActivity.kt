package com.example.myapplication.navigationcomponent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.myapplication.navigationcomponent.ui.theme.NavigationComponentTheme

class MainActivity : AppCompatActivity(){
    private  lateinit var navController:NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onSupportNavigateUp(): Boolean {
        navController=findNavController(R.id.navHostFragmentContainer)
        return navController.navigateUp()|| super.onSupportNavigateUp()
    }
}