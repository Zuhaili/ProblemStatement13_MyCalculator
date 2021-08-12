package sg.edu.rp.c346.id19004781.problemstatement13_mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    var minusNumber = 0.0
    var isMinus = false
    var divideNumber = 0.0
    var isDivide = false
    var timesNumber = 0.0
    var isTimes = false
    var addNumber = 0.0
    var isAdd = false
    var btnMessage = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMinus.setOnClickListener {
            minusNumber = tvNumber.text.toString().toDouble()
            isMinus = true
            btnMessage = ""
            tvNumber.text = ""
        }

        btnAddition.setOnClickListener {
            addNumber = tvNumber.text.toString().toDouble()
            isAdd = true
            btnMessage = ""
            tvNumber.text = ""
        }

        btnDivide.setOnClickListener {
            divideNumber = tvNumber.text.toString().toDouble()
            isDivide = true
            btnMessage = ""
            tvNumber.text = ""
        }

        btnTimes.setOnClickListener {
            timesNumber = tvNumber.text.toString().toDouble()
            isTimes = true
            btnMessage = ""
            tvNumber.text = ""
        }

        btnEqual.setOnClickListener {
            if (isMinus) {
                var minusFinalResult = minusNumber - tvNumber.text.toString().toDouble()
                tvNumber.text = minusFinalResult.toString()
                isMinus = false
            } else if (isAdd) {
                var additionFinalResult = addNumber + tvNumber.text.toString().toDouble()
                tvNumber.text = additionFinalResult.toString()
                isAdd = false
            } else if (isDivide) {
                var divideFinalResult = divideNumber / tvNumber.text.toString().toDouble()
                tvNumber.text = divideFinalResult.toString()
                isDivide = false
            } else if (isTimes) {
                var timesFinalResult = timesNumber * tvNumber.text.toString().toDouble()
                tvNumber.text = timesFinalResult.toString()
                isTimes = false
            }
        }
    }

    fun btnAcOnClick(view: View) {
        tvNumber.text = "0"
        btnMessage = ""
    }

    fun btnOnClick(view: View) {

        val btnSelected = view as Button
        when (btnSelected.id) {
            btn0.id -> btnMessage += "0"
            btn1.id -> btnMessage += "1"
            btn2.id -> btnMessage += "2"
            btn3.id -> btnMessage += "3"
            btn4.id -> btnMessage += "4"
            btn5.id -> btnMessage += "5"
            btn6.id -> btnMessage += "6"
            btn7.id -> btnMessage += "7"
            btn8.id -> btnMessage += "8"
            btn9.id -> btnMessage += "9"
            btnDot.id -> btnMessage += "."
        }
        tvNumber.text = btnMessage
    }


}