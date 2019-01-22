package com.md.pjatk.kidsvocabularygame


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.*
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.*
import android.content.Intent
import android.graphics.PorterDuff
import android.media.MediaPlayer
import android.view.MotionEvent
import android.view.MotionEvent.*
import kotlinx.android.synthetic.main.activity_main_menu.*


class MainMenu : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_menu)
        startService(Intent(this, MyService::class.java))
        buttonEffect(LearnButton)
        buttonEffect(QuizButton)
        buttonEffect(ParentsButton)



    }


    override fun onBackPressed() {
        stopService(Intent(this, MyService::class.java))
        finish()
    }



        fun buttonEffect(button: View) {
        button.setOnTouchListener { v, event ->
            when (event.action) {
                ACTION_DOWN -> {
                    v.background.setColorFilter(-0x1f0b8adf, PorterDuff.Mode.SRC_ATOP)
                    v.invalidate()
                }
                ACTION_UP -> {
                    v.background.clearColorFilter()
                    v.invalidate()
                }
            }
            false
        }
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
