package com.md.pjatk.kidsvocabularygame

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast

class quiz : AppCompatActivity() {
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        
        var mice_sound: MediaPlayer = MediaPlayer.create(this, R.raw.mice)

        val play_button = findViewById<ImageView>(R.id.playButton)
        play_button.setOnClickListener{

            mice_sound.start()


        }

        val mice_button = findViewById<ImageButton>(R.id.miceButton)
        mice_button.setOnClickListener{
            Toast.makeText(this,"Dobra odpowiedz",Toast.LENGTH_SHORT).show()



        }

        val bird_button = findViewById<ImageButton>(R.id.birdButton)
        bird_button.setOnClickListener{
            Toast.makeText(this,"Zła odpowiedz",Toast.LENGTH_SHORT).show()



        }
    }
}
