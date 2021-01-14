package com.example.kotlin_examples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dice_roller)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
//            secRollDice()
            rollDiceSec()
            rollDice()
        }
    }

    private fun rollDiceSec() {
        val diceSec = SecDice(6)
        val diceSecRoll = diceSec.secDiceRoll()
        val diceImageSec: ImageView = findViewById(R.id.imageSec)
        val drawableImageSec = when (diceSecRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImageSec.setImageResource(drawableImageSec)
    }
//
//    private fun secRollDice() {
//        val diceSec = SecDice(9)
//        val secRand = diceSec.secDice()
//
//        val resultSecDice: TextView = findViewById(R.id.secDice)
//        resultSecDice.text = secRand.toString()
//    }
//

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()
        // Update the screen with the dice roll
        val diceImage: ImageView = findViewById(R.id.imageView)
        val drawableSource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableSource)
//        Update the content description
//        diceImage.contentDescription = diceRoll.toString()
    }
}

//
class Dice(private val numSide: Int) {
    fun roll(): Int {
        return (1..numSide).random()
    }
}

class SecDice(private val number: Int) {
    fun secDiceRoll(): Int {
        return (1..number).random()
    }
}