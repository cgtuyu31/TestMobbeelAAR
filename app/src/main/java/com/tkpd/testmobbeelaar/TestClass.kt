package com.tkpd.testmobbeelaar

import com.tkpd.internal_android_library.InternalAndroidLibrary

class TestClass {
    private val lib = InternalAndroidLibrary()

    fun printTest(): String{
        return "Test MainApp is Using Library :\n" +
                "${lib.getNested()}\n"
    }
}