package com.example.tictactoegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class GameActivity : AppCompatActivity() {
    var flag = 0
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
    }

    fun check(view: View){

        val crrntbt = view as Button
        if(crrntbt.text == "") {
            count++

            if (flag == 0) {
                crrntbt.text = "X"
                flag = 1
            } else {
                crrntbt.text = "O"
                flag = 0
            }
            val b1 = findViewById<Button>(R.id.bt1).text.toString()
            val b2 = findViewById<Button>(R.id.bt2).text.toString()
            val b3 = findViewById<Button>(R.id.bt3).text.toString()
            val b4 = findViewById<Button>(R.id.bt4).text.toString()
            val b5 = findViewById<Button>(R.id.bt5).text.toString()
            val b6 = findViewById<Button>(R.id.bt6).text.toString()
            val b7 = findViewById<Button>(R.id.bt7).text.toString()
            val b8 = findViewById<Button>(R.id.bt8).text.toString()
            val b9 = findViewById<Button>(R.id.bt9).text.toString()

            if (b1 == b2 && b2 == b3 && b3 != "") {
                Toast.makeText(this, "Winner is $b1", Toast.LENGTH_LONG).show()
                newGame()
            } else if (b4 == b5 && b5 == b6 && b6 != "") {
                Toast.makeText(this, "Winner is $b4", Toast.LENGTH_LONG).show()
                newGame()
            } else if (b7 == b8 && b8 == b9 && b9 != "") {
                Toast.makeText(this, "Winner is $b7", Toast.LENGTH_LONG).show()
                newGame()
            } else if (b1 == b4 && b4 == b7 && b7 != "") {
                Toast.makeText(this, "Winner is $b4", Toast.LENGTH_LONG).show()
                newGame()
            } else if (b2 == b5 && b5 == b8 && b8 != "") {
                Toast.makeText(this, "Winner is $b2", Toast.LENGTH_LONG).show()
                newGame()
            } else if (b3 == b6 && b6 == b9 && b9 != "") {
                Toast.makeText(this, "Winner is $b3", Toast.LENGTH_LONG).show()
                newGame()
            } else if (b1 == b5 && b5 == b9 && b9 != "") {
                Toast.makeText(this, "Winner is $b1", Toast.LENGTH_LONG).show()
                newGame()
            } else if (b3 == b5 && b5 == b7 && b7 != "") {
                Toast.makeText(this, "Winner is $b3", Toast.LENGTH_LONG).show()
                newGame()
            } else if (count==9){
                Toast.makeText(this, "Draw", Toast.LENGTH_LONG).show()
                newGame()
            }
        }

    }

    fun newGame(){
        findViewById<Button>(R.id.bt1).text = ""
        findViewById<Button>(R.id.bt2).text = ""
        findViewById<Button>(R.id.bt3).text = ""
        findViewById<Button>(R.id.bt4).text = ""
        findViewById<Button>(R.id.bt5).text = ""
        findViewById<Button>(R.id.bt6).text = ""
        findViewById<Button>(R.id.bt7).text = ""
        findViewById<Button>(R.id.bt8).text = ""
        findViewById<Button>(R.id.bt9).text = ""
        flag = 0
        count = 0

    }
}