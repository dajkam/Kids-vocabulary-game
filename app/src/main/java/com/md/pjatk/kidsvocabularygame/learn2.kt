package com.md.pjatk.kidsvocabularygame

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import com.md.pjatk.kidsvocabularygame.R.raw.bird

class learn2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn2)

        var bird_sound: MediaPlayer = MediaPlayer.create(this, R.raw.bird)
         // no need to call prepare(); create() does that for you
        var pinguin_sound: MediaPlayer = MediaPlayer.create(this, R.raw.pingwin)
        var mice_sound: MediaPlayer = MediaPlayer.create(this, R.raw.mice)
        var flower_sound: MediaPlayer = MediaPlayer.create(this, R.raw.flower)



        val bird_button = findViewById<ImageView>(R.id.birdButton)
        bird_button.setOnClickListener{
            Toast.makeText(this,"Kliknołes ptaka",Toast.LENGTH_SHORT).show()
            bird_sound.start()


    }

        val mice_button = findViewById<ImageView>(R.id.miceButton)
        mice_button.setOnClickListener{
            Toast.makeText(this,"Kliknołes mysz",Toast.LENGTH_SHORT).show()
            mice_sound.start()


        }

        val pinguin_button = findViewById<ImageView>(R.id.piguinButton)
        pinguin_button.setOnClickListener{
            Toast.makeText(this,"Kliknołes pingwina",Toast.LENGTH_SHORT).show()
            pinguin_sound.start()


        }

        val flower_button = findViewById<ImageView>(R.id.flowerButton)
        flower_button.setOnClickListener{
            Toast.makeText(this,"Kliknołes kwiat",Toast.LENGTH_SHORT).show()
            flower_sound.start()


        }




    }


}

