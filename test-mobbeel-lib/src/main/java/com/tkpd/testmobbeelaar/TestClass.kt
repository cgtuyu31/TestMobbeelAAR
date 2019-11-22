package com.tkpd.testmobbeelaar

import com.tkpd.internal_android_library.InternalAndroidLibrary
import com.tkpd.testlibraryaar.ExternalMobbeelAndroidLibrary

class TestClass {
    val lib = InternalAndroidLibrary()
    val extLib = ExternalMobbeelAndroidLibrary()

    private fun printLib(): String{
        return "Test MainApp is Using Library :\n" +
                "${lib.getNested()}\n"+
                "[${extLib.TAG}]"
    }
}