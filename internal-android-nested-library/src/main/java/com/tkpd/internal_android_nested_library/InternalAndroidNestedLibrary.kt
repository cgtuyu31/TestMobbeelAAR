package com.tkpd.internal_android_nested_library

import com.tkpd.internal_android_double_nested_library.InternalAndroidDoubleNestedLibrary

class InternalAndroidNestedLibrary{

    val TAG: String
        get() = "Internal Mobbeel 2 Android Nested Library"

    fun getNested(): String{
        val lib = InternalAndroidDoubleNestedLibrary()
        return "[${TAG}]\n {CHANGED 2}" +
                "\t\t--> [${lib.newTagChanged()}]"
    }
}