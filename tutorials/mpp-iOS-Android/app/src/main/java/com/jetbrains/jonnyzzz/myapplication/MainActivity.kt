package com.jetbrains.jonnyzzz.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.kotlin.mpp.mobile.createApplicationScreenMessage

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    findViewById<TextView>(R.id.main_text).text = createApplicationScreenMessage()
  }
  
  private fun updatePosts() {
        // empty list, need to specify the type argument explicitly
        val myList = mutableListOf<String>()

        arrayOf(myList);
    }
}
