package com.egco428.ex13_actionbar

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var flag = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        val item = menu!!.add(Menu.NONE,Menu.NONE,104,"New Item")
        item.setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER)
        item.setOnMenuItemClickListener(object : MenuItem.OnMenuItemClickListener{
            override fun onMenuItemClick(item: MenuItem?): Boolean {
                Toast.makeText(this@MainActivity,"New Item",Toast.LENGTH_SHORT).show()
                return true
            }
        })
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return super.onOptionsItemSelected(item)
    }

    fun actionImageChange(item: MenuItem){
        if(flag){
            imageView.setImageResource(R.drawable.abc_ic_arrow_drop_right_black_24dp)
        } else{
            imageView.setImageResource(R.drawable.abc_btn_check_material)
        }
        flag = !flag
    }

    fun actionTextSend(item: MenuItem){
        val intent = Intent(this,Detail::class.java)
        intent.putExtra("Text1", editText.text.toString())
        startActivity(intent)
    }
}
