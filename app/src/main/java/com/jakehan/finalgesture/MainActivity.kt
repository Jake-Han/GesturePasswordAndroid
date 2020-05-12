package com.jakehan.finalgesture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.jakehan.jakecustomgesture.listener.OnGestureLockListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnGestureLockListener {
var pwd = "0123"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gestureLock.setGestureLockListener(this)
        gestureLock.setShowPath(false)
    }

    override fun onComplete(result: String?) {
        if (result!=pwd){
            gestureLock.showErrorStatus()
        }
        Toast.makeText(this,result,Toast.LENGTH_SHORT).show()
    }

    override fun onStarted() {

    }

    override fun onProgress(progress: String?) {

    }
}
