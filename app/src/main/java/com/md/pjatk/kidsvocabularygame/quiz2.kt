
package com.md.pjatk.kidsvocabularygame

import android.media.MediaPlayer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.Toast
import java.util.*
import kotlin.concurrent.schedule



class quiz2 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz2)

        var pinguin_sound: MediaPlayer = MediaPlayer.create(this, R.raw.pingwin)
        var mice_sound: MediaPlayer = MediaPlayer.create(this, R.raw.mice)
        var position = 0



        val play_button = findViewById<ImageView>(R.id.playButton)
        play_button.setOnClickListener{

            if (pinguin_sound.isPlaying()){
                pinguin_sound.pause()
                pinguin_sound.seekTo(0)
            }

            Timer().schedule(500){
                pinguin_sound.start()
            }







        }

        val mice_button = findViewById<ImageView>(R.id.miceButton)
        mice_button.setOnClickListener{
            Toast.makeText(this,"Zła odpowiedz",Toast.LENGTH_SHORT).show()



        }

        val pinguin_button = findViewById<ImageView>(R.id.piguinButton)
        pinguin_button.setOnClickListener{
            Toast.makeText(this,"Dobra odpowiedz",Toast.LENGTH_SHORT).show()



        }
    }
}

