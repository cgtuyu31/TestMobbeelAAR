package com.tkpd.testmobbeelaar

import com.tkpd.internal_android_library.InternalAndroidLibrary

class TestClass {
    val lib = InternalAndroidLibrary()

    fun printLib(): String{
        return "Test MainApp is Using Library :\n" +
                "${lib.getNested()}\n"
    }
}