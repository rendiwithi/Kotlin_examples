package com.example.kotlin_examples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dice_roller)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            secRollDice()
            rollDice()
        }
    }

    private fun secRollDice() {
        val diceSec = SecDice(9)
        val secRand = diceSec.secDice()

        val resultSecDice: TextView = findViewById(R.id.secDice)
        resultSecDice.text = secRand.toString()
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()
        // Update the screen with the dice roll
        val resultTextView: TextView = findViewById(R.id.diceNumber)
        resultTextView.text = diceRoll.toString()
    }
}

class Dice(private val numSide: Int) {
    fun roll(): Int {
        return (1..numSide).random()
    }
}

class SecDice(private val number: Int) {
    fun secDice(): Int {
        return (6..number).random()
    }
}