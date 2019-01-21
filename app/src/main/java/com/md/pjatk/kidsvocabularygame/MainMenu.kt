package com.md.pjatk.kidsvocabularygame


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.*
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.*
import android.content.Intent
import android.media.MediaPlayer


class MainMenu : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_menu)
        startService(Intent(this, MyService::class.java))

    }
    fun learn( view: View){
        val learnButton = Intent(this,learn::class.java)
        startActivity(learnButton)
    }

    fun quiz (view: View){

        val quizButton = Intent(this,quiz::class.java)
        startActivity(quizButton)
    }

    fun parents (view: View){
        val parentButton = Intent(
                this,
                parents::class.java
        )
        startActivity(parentButton)
    }
}
