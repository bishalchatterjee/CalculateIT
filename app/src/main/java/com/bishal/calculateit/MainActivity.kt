package com.bishal.calculateit

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.widget.EditText
import javax.script.ScriptEngine
import javax.script.ScriptEngineManager
import javax.script.ScriptException
import android.os.Vibrator as Vibrator1

class MainActivity : AppCompatActivity() {

    lateinit var button1: android.widget.Button
    lateinit var button2: android.widget.Button
    lateinit var button3: android.widget.Button
    lateinit var button4: android.widget.Button
    lateinit var button5: android.widget.Button
    lateinit var button6: android.widget.Button
    lateinit var button7: android.widget.Button
    lateinit var button8: android.widget.Button
    lateinit var button9: android.widget.Button
    lateinit var button0: android.widget.Button
    lateinit var button00: android.widget.Button
    lateinit var buttondivide: android.widget.Button
    lateinit var buttonadd: android.widget.Button
    lateinit var buttonmultiply: android.widget.Button
    lateinit var buttonsubstract: android.widget.Button
    lateinit var buttonequals: android.widget.Button
    lateinit var buttondot: android.widget.Button
    lateinit var buttonbackspace: android.widget.Button
    lateinit var buttonpercentage: android.widget.Button
    lateinit var buttonclear: android.widget.Button

    lateinit var inputtext: EditText
    lateinit var resulttext: EditText
    var check =0




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        //";" is not necessary in kotlin
        button0 = findViewById(R.id.button0)
        button00 = findViewById(R.id.button00)
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        button8 = findViewById(R.id.button8)
        button9 = findViewById(R.id.button9)
        buttonpercentage = findViewById(R.id.buttonpercent)
        buttonclear = findViewById(R.id.buttonC)
        buttondot = findViewById(R.id.buttondot)
        buttondivide = findViewById(R.id.buttondivide)
        buttonadd = findViewById(R.id.buttonadd)
        buttonsubstract = findViewById(R.id.buttonsubstract)
        buttonequals = findViewById(R.id.buttonequals)
        buttonmultiply = findViewById(R.id.buttonmultiply)
        buttonbackspace = findViewById(R.id.buttonbackspace)
        resulttext = findViewById(R.id.result)
        inputtext = findViewById(R.id.inputnumber)



        inputtext.movementMethod = ScrollingMovementMethod()
        inputtext.setActivated(true)
        inputtext.setPressed(true)


        var text: String
        val vibe: Vibrator1 =getSystemService(Context.VIBRATOR_SERVICE) as Vibrator1



        button0.setOnClickListener {
            vibe.vibrate(80)
            text = inputtext.text.toString() + "0"
            inputtext.setText(text)
            result(text)


        }

        button00.setOnClickListener {
            vibe.vibrate(80)
            text = inputtext.text.toString() + "00"
            inputtext.setText(text)
            result(text)


        }


        button1.setOnClickListener {
            vibe.vibrate(80)
            text = inputtext.text.toString() + "1"
            inputtext.setText(text)
            result(text)


        }
        button2.setOnClickListener {
            vibe.vibrate(80)
            text = inputtext.text.toString() + "2"
            inputtext.setText(text)
            result(text)


        }
        button3.setOnClickListener {
            vibe.vibrate(80)
            text = inputtext.text.toString() + "3"
            inputtext.setText(text)
            result(text)


        }

        button4.setOnClickListener {
            vibe.vibrate(80)
            text = inputtext.text.toString() + "4"
            inputtext.setText(text)
            result(text)


        }


        button5.setOnClickListener {
            vibe.vibrate(80)
            text = inputtext.text.toString() + "5"
            inputtext.setText(text)
            result(text)


        }
        button6.setOnClickListener {
            vibe.vibrate(80)
            text = inputtext.text.toString() + "6"
            inputtext.setText(text)
            result(text)


        }
        button7.setOnClickListener {
            vibe.vibrate(80)
            text = inputtext.text.toString() + "7"
            inputtext.setText(text)
            result(text)


        }

        button8.setOnClickListener {
            vibe.vibrate(80)
            text = inputtext.text.toString() + "8"
            inputtext.setText(text)
            result(text)


        }


        button9.setOnClickListener {
            vibe.vibrate(80)
            text = inputtext.text.toString() + "9"
            inputtext.setText(text)
            result(text)


        }
        buttondot.setOnClickListener {
            vibe.vibrate(80)
            text = inputtext.text.toString() + "."
            inputtext.setText(text)
            result(text)


        }
        buttonadd.setOnClickListener {
            vibe.vibrate(80)
            text = inputtext.text.toString() + "+"
            inputtext.setText(text)
            check=check+1
        }
        buttonmultiply.setOnClickListener {
            vibe.vibrate(80)
            text = inputtext.text.toString() + "*"
            inputtext.setText(text)
            check=check+1
        }

        buttondivide.setOnClickListener {
            vibe.vibrate(80)
            text = inputtext.text.toString() + "/"
            inputtext.setText(text)
            check=check+1
        }

        buttonsubstract.setOnClickListener {
            vibe.vibrate(80)
            text = inputtext.text.toString() + "-"
            inputtext.setText(text)
            check=check+1
        }

        buttonpercentage.setOnClickListener {
            vibe.vibrate(80)
            text = inputtext.text.toString() + "%"
            inputtext.setText(text)
            check=check+1
        }

        buttonequals.setOnClickListener {
            vibe.vibrate(80)
            text = resulttext.text.toString()
            inputtext.setText(text)
            resulttext.setText(null)
        }

        buttonclear.setOnClickListener {
            vibe.vibrate(80)
            inputtext.setText(null)
            resulttext.setText(null)
        }

        buttonbackspace.setOnClickListener {
            vibe.vibrate(80)
            var BackSpace: String? = null

            if(inputtext.text.length>0){
                val stringBuilder: StringBuilder = StringBuilder(inputtext.text)
                val find=inputtext.text.toString()
                val find2=find.last()

                if(find2.equals('+') || find2.equals('-') || find2.equals('*') || find2.equals('/') || find2.equals('%') ){
                    check=check-1;
                }
                stringBuilder.deleteCharAt(inputtext.text.length - 1)
                BackSpace=stringBuilder.toString()
                inputtext.setText(BackSpace)
                result(BackSpace)
            }
        }


    }
    private fun result(text: String) {

        val engine: ScriptEngine = ScriptEngineManager().getEngineByName("rhino")
        try {
            val result: Any = engine.eval(text)
            Log.d("Calculator", "Operation: $text result: $result")
            var mainr = result.toString()
            Log.d("TAG", "not $check")

            if (check == 0) {
                resulttext.setText(null)
            } else {
                resulttext.setText(mainr)
            }
        } catch (e: ScriptException) {
            Log.d("Calculator", "ScriptEngine error: " + e.message)
        }

    }
}