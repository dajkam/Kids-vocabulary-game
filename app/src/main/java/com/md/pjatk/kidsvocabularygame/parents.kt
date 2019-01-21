package com.md.pjatk.kidsvocabularygame


import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Switch
import android.widget.Toast





class parents : AppCompatActivity() {
    companion object {
        //var isMusicOn = false
        //var isLanduagePolish = false
    }


    var isMusicOn = true
    var isLanduagePolish = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parent)



        var music: MediaPlayer = MediaPlayer.create(this, R.raw.ac)
        music.isLooping = true

        //languageSwichHandling()
       // musicSwichHandling() // to jest alternatywne podejscie



        val music_switch_state = findViewById<Switch>(R.id.MusicSwich)








      music_switch_state.setOnClickListener{
          if (music_switch_state.isChecked){
              startService(Intent(this, MyService::class.java))

              isMusicOn = true


          }
          else{
              stopService(Intent(this, MyService::class.java))

              isMusicOn = false

          }


      }


        music_switch_state.isChecked = isMusicOn




    }



   override fun onStop(){
       super.onStop()
      // isMusicOn = this.MusicSwich.isChecked

       



    }

    override  fun onResume(){
        super.onResume()
       // this.MusicSwich.isChecked = isMusicOn
    }

   /* fun onClick(view: View){




    }*/

   /* fun languageSwichHandling( ) {
        language_swich_state.setOnClickListener{
            if (language_swich_state.isChecked){

                changeLanguageToPolish()

            }
            else{
                changeLanguageToEnglish()
            }
        }


    }*/

    fun changeLanguageToPolish(){
        val myToast = Toast.makeText(this,"Zmieniłeś język na Polski",Toast.LENGTH_SHORT)
        myToast.show()
        isLanduagePolish = true

    }

    fun changeLanguageToEnglish(){
        val myToast = Toast.makeText(this,"You have changed language to English",Toast.LENGTH_SHORT)
        myToast.show()
        isLanduagePolish = false

    }

  /*  fun musicSwichHandling(){
        music_swich_state.setOnClickListener{
            if (music_swich_state.isChecked){
                turnOnMusic()

            }
            else{
                turnOffMusic()
            }
        }
}*/
    }
/* var music: MediaPlayer = MediaPlayer.create(this, R.raw.ac)


  fun turnOnMusic(){

      music.seekTo(0)

      music.start()

      val myToast = Toast.makeText(this,"Music On",Toast.LENGTH_SHORT)
      myToast.show()

      isMusicOn = true

  }


  fun turnOffMusic(){

      music.stop()
      music.seekTo(0)
      val myToast = Toast.makeText(this,"Music Off",Toast.LENGTH_SHORT)
      myToast.show()
      isMusicOn = false


  }


}
   }*/