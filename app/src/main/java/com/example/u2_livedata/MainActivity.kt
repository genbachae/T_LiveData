package com.example.u2_livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.annotation.Nullable
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val liveData = DataController.getData()

        liveData?.observe(this, Observer<String>() {
            @Override
            fun onChanged(@Nullable value:String) {
                textView.text = value
            }
        });
    }

    fun refresh(view: View) {
        DataController.refresh()
    }
}
