package com.egco428.ex13_actionbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class Detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val bundle = intent.extras
        var text: String = ""
        if (bundle != null){
            text = bundle.getString("Text1")
            textxx.text = text
        }
    }
}
