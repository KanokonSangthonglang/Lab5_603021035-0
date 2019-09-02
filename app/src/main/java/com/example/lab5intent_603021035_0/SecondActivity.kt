package com.example.lab5intent_603021035_0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var data = intent.extras
        var newStudent = data?.getParcelable<Student>("stdData")
        idText.text = "รหัสนักศึกษา : ${newStudent?.id}"
        nameText.text = "ชื่อนักศึกษา : ${newStudent?.name}"
        ageText.text = "อายุนักศึกษา : ${newStudent?.age}"
    }

    fun onClickClose(View: View){
    finish()
    }


}
