package com.example.kotlin_examples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.widget.Button
//import android.widget.ImageView
import com.example.kotlin_examples.databinding.TipAppBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.theme_page)
    }
}
//    private lateinit var binding: TipAppBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = TipAppBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        binding.calculateButton.setOnClickListener{calculateTip()}
//    }
//    private fun calculateTip() {
//        val stringInTextField = binding.costOfService.text.toString()
//        val cost = stringInTextField.toDoubleOrNull()
//        if (cost == null){
//            binding.tipResult.text = ""
//            return
//        }
//        val tipPercentage = when(binding.tipOptions.checkedRadioButtonId){
//            R.id.option_twenty_percent -> 0.20
//            R.id.option_eighten_percent -> 0.18
//            else -> 0.15
//        }
//        var tip = tipPercentage * cost
//        if (binding.roundUpSwich.isChecked){
//            tip = kotlin.math.ceil(tip)
//        }
//        displayTip(tip)
//    }
//    private fun displayTip(tip: Double){
//        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
//        binding.tipResult.text = getString(R.string.tip_amount, formattedTip)
//    }
//}

//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.tip_app)
//
//        val rollButton: Button = findViewById(R.id.button)
//        rollButton.setOnClickListener {
////            secRollDice()
//
//            rollDice()
//        }
//    }
//
//    private fun secRollDice() {
//        val diceSec = SecDice(9)
//        val secRand = diceSec.secDice()
//
//        val resultSecDice: TextView = findViewById(R.id.secDice)
//        resultSecDice.text = secRand.toString()
//    }
//
//
//    /**
//     * Roll the dice and update the screen with the result.
//     */
//    private fun rollDice() {
//        // Create new Dice object with 6 sides and roll it
//        val dice = Dice(6)
//        // Update the screen with the dice roll
//        val drawableSourceSec = when (dice.roll()) {
//            1 -> R.drawable.dice_1
//            2 -> R.drawable.dice_2
//            3 -> R.drawable.dice_3
//            4 -> R.drawable.dice_4
//            5 -> R.drawable.dice_5
//            else -> R.drawable.dice_6
//        }
//        val diceImageSec: ImageView = findViewById(R.id.imageSec)
//        diceImageSec.setImageResource(drawableSourceSec)
//
//        // Function
//        val diceImage: ImageView = findViewById(R.id.imageView)
//        val drawableSource = dice.rollDiceImage()
//        diceImage.setImageResource(drawableSource)
//
//    }
//}
//
//
//class Dice(private val numSide: Int) {
//    fun roll(): Int {
//        return (1..numSide).random()
//    }
//
//    fun rollDiceImage(): Int {
//        return when (Dice(6).roll()) {
//            1 -> R.drawable.dice_1
//            2 -> R.drawable.dice_2
//            3 -> R.drawable.dice_3
//            4 -> R.drawable.dice_4
//            5 -> R.drawable.dice_5
//            else -> R.drawable.dice_6
//        }
//    }
//}
