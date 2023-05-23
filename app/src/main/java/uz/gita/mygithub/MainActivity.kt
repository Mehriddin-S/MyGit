package uz.gita.mygithub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("kkk", "onCreate: ")
    }

    fun simple(){
        Toast.makeText(this, "Nima gap", Toast.LENGTH_SHORT).show()
    }

    fun simple2(){

    }

}