package com.md.pjatk.kidsvocabularygame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_parent.*
import android.view.View

class parents : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parent)
        //languageSwichHandling()
       // musicSwichHandling()
        val language_swich_state = findViewById<Switch>(R.id.LanguageSwich)
        val music_swich_state = findViewById<Switch>(R.id.MusicSwich)
        language_swich_state.setOnClickListener{
            if (language_swich_state.isChecked){

                changeLanguageToPolish()

            }
            else{
                changeLanguageToEnglish()
            }
        }
        music_swich_state.setOnClickListener{
            if (music_swich_state.isChecked){
                turnOnMusic()

            }
            else{
                turnOffMusic()
            }
        }




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

    }

    fun changeLanguageToEnglish(){
        val myToast = Toast.makeText(this,"You have changed language to English",Toast.LENGTH_SHORT)
        myToast.show()

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
    fun turnOnMusic(){
        val myToast = Toast.makeText(this,"Music On",Toast.LENGTH_SHORT)
        myToast.show()

    }

    fun turnOffMusic(){
        val myToast = Toast.makeText(this,"Music Off",Toast.LENGTH_SHORT)
        myToast.show()

    }

}
