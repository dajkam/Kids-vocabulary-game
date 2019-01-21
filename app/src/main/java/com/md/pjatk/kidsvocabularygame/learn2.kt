package com.md.pjatk.kidsvocabularygame

import android.media.MediaPlayer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_learn2.*

class learn2 : AppCompatActivity() {
    companion object {
        var inUse = false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn2)

        var bird_sound: MediaPlayer = MediaPlayer.create(this, R.raw.bird)
         // no need to call prepare(); create() does that for you
        var pinguin_sound: MediaPlayer = MediaPlayer.create(this, R.raw.pingwin)
        var mice_sound: MediaPlayer = MediaPlayer.create(this, R.raw.mice)
        var flower_sound: MediaPlayer = MediaPlayer.create(this, R.raw.flower)



        val bird_button = findViewById<ImageView>(R.id.birdButton)
        val mice_button = findViewById<ImageView>(R.id.miceButton)
        val pinguin_button = findViewById<ImageView>(R.id.piguinButton)


        bird_button.setOnClickListener{

           // Toast.makeText(this,"Kliknołes ptaka",Toast.LENGTH_SHORT).show()
            //  bird_sound.start()
            if(inUse){
            mice_button.isEnabled = false
            bird_button.isEnabled =false
            piguinButton.isEnabled = false}

          /*  pinguin_button.isEnabled = false
            bird_button.isEnabled = false
            mice_button.isEnabled =false*/

            if(!inUse) {
                play_music(bird_sound)

                mice_button.isEnabled = true
                bird_button.isEnabled = true
                piguinButton.isEnabled = true

            }


    }


        mice_button.setOnClickListener{

           // Toast.makeText(this,"Kliknołes mysz",Toast.LENGTH_SHORT).show()
           // mice_sound.start()
            if(inUse){
            mice_button.isEnabled = false
            bird_button.isEnabled =false
            piguinButton.isEnabled = false}




            if(!inUse) {
                play_music(mice_sound)




                mice_button.isEnabled = true
                bird_button.isEnabled = true
                piguinButton.isEnabled = true
            }




        }


        pinguin_button.setOnClickListener{
            //Toast.makeText(this,"Kliknołes pingwina",Toast.LENGTH_SHORT).show()
            //pinguin_sound.start()
            if(inUse){
            mice_button.isEnabled = false
            bird_button.isEnabled =false
            piguinButton.isEnabled = false}

            if(!inUse) {
                play_music(pinguin_sound)


                mice_button.isEnabled = true
                bird_button.isEnabled = true
                piguinButton.isEnabled = true
            }


        }



        }
    fun play_music(sound: MediaPlayer){

        var n =0

        inUse = true

        if (!sound.isPlaying)
            sound.start()
        while (sound.isPlaying){
            n++

        }

        inUse = false





    }

      //  val flower_button = findViewById<ImageView>(R.id.flowerButton)
      //  flower_button.setOnClickListener{
      //      Toast.makeText(this,"Kliknołes kwiat",Toast.LENGTH_SHORT).show()
       //     flower_sound.start()


       // }




    }




