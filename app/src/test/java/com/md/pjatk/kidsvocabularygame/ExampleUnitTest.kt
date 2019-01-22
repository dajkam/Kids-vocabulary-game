package com.md.pjatk.kidsvocabularygame

import android.content.Context
import org.junit.Test

import org.junit.Assert.*

import kotlinx.android.synthetic.main.activity_parent.*
import org.mockito.Mock
import android.widget.Toast
import org.junit.Ignore
import org.mockito.Mockito.mock


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
@Ignore
class ExampleUnitTest {
    @Mock
    var con: Context? = null
    val toast = mock(Toast::class.java)

    @Test
    fun addition_isCorrect() {
        assertEquals(4, (2 + 2).toLong())
    }

    @Test
    fun emptyTest(){
        assertEquals(false,parents().isMusicOn)


    }
    @Ignore
    @Test



    @Ignore
    @Test
    fun isLanguageSwichWorking(){
        var rodzic = parents()
        rodzic.changeLanguageToPolish()
        assertEquals(true,rodzic.isLanduagePolish)

        rodzic.changeLanguageToEnglish()
        assertEquals(false,rodzic.isLanduagePolish)

    }


}