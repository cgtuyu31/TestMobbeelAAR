package com.tkpd.testmobbeelaar

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tkpd.internal_android_library.InternalAndroidLibrary
import com.tkpd.testlibraryaar.ExternalMobbeelAndroidLibrary
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lib = InternalAndroidLibrary()
        val extLib = ExternalMobbeelAndroidLibrary()

        tv_usage?.text = "MainApp is Using Library :\n" +
                "${lib.getNested()}\n"+
                "[${extLib.TAG}]"
    }
}
