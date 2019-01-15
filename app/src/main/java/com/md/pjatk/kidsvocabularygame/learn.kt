package com.md.pjatk.kidsvocabularygame

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class learn : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn)

    }
    fun learnAnimals(view: View){
        val learnAnimalsButton = Intent(this,learn2::class.java)
        startActivity(learnAnimalsButton)
    }
}
