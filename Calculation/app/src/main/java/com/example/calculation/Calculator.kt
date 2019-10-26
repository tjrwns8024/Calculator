package com.example.calculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculator.*

class Calculator : AppCompatActivity() {
    var a:String = ""
    var list = mutableListOf<String>()
    var b:Long = 0L
    var c:Long = 1L
    var d:Double = 1.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        editText.setEnabled(false)

        button1.setOnClickListener {
            editText.setText(editText.getText().append("1"))
            a = editText.getText().toString()
        }
        button2.setOnClickListener {
            editText.setText(editText.getText().append("2"))
            a = editText.getText().toString()
        }
        button3.setOnClickListener {
            editText.setText(editText.getText().append("3"))
            a = editText.getText().toString()
        }
        button4.setOnClickListener {
            editText.setText(editText.getText().append("4"))
            a = editText.getText().toString()
        }
        button5.setOnClickListener {
            editText.setText(editText.getText().append("5"))
            a = editText.getText().toString()
        }
        button6.setOnClickListener {
            editText.setText(editText.getText().append("6"))
            a = editText.getText().toString()
        }
        button7.setOnClickListener {
            editText.setText(editText.getText().append("7"))
            a = editText.getText().toString()
        }
        button8.setOnClickListener {
            editText.setText(editText.getText().append("8"))
            a = editText.getText().toString()
        }
        button9.setOnClickListener {
            editText.setText(editText.getText().append("9"))
            a = editText.getText().toString()
        }
        button0.setOnClickListener {
            editText.setText(editText.getText().append("0"))
            a = editText.getText().toString()
        }
        mul_btn.setOnClickListener {
            editText.setText(editText.getText().append("*"))
            a = editText.getText().toString()
        }
        div_btn.setOnClickListener {
            editText.setText(editText.getText().append("/"))
            a = editText.getText().toString()
        }
        sum_btn.setOnClickListener {
            editText.setText(editText.getText().append("+"))
            a = editText.getText().toString()
        }
        sub_btn.setOnClickListener {
            editText.setText(editText.getText().append("-"))
            a = editText.getText().toString()
        }
        reset_btn.setOnClickListener{
            editText.setText("")
        }

        result_btn.setOnClickListener {
            b = 0
            c = 1
            d = 1.0
            if(list.size != 0){
                list = mutableListOf<String>()
            }

            if(editText.getText().contains("+")){
                val str = editText.getText().split("+")
                val a = str[0].toDouble()
                val z = a.toInt()
                for(i in 0 ..str.size -1){
                    if(i==0){
                        list.add(z.toString())
                        b+=list.get(i).toInt()
                    }
                    else{
                        list.add(str[i])
                        b+=list.get(i).toInt()
                    }
                }

                editText.setText(String.format("%d",b))
            }

            if(editText.getText().contains("-")) {
                val str = editText.getText().split("-")
                val a = str[0].toDouble()
                val z = a.toInt()
                for(i in 0..str.size -1){
                    list.add(str[i])
                    if(i!=0) {
                        b -= list.get(i).toInt()
                    }
                }
                editText.setText(String.format("%d",b))
            }

            if(editText.getText().contains("*")){
                val str = editText.getText().split("*")
                val a = str[0].toDouble()
                val z = a.toInt()
                for(i in 0..str.size -1){
                    if(i==0) {
                        list.add(z.toString())
                        c *= list.get(i).toInt()
                    }
                    else{
                        list.add(str[i])
                        c *= list.get(i).toInt()
                    }
                }
                editText.setText(String.format("%d",c))
            }
            if( editText.getText().contains("/")){
                val str = editText.text.split("/")
                val a = str[0].toDouble()
                val z = a.toInt()
                for(i in 0..str.size -1){
                    list.add(str[i])
                    if(i!=0){
                        d/=list.get(i).toDouble()
                    }
                }
                editText.setText(String.format("%.2f",d))
            }
        }

    }
}
