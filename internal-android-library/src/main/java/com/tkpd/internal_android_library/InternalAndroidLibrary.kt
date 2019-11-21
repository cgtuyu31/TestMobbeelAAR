package com.tkpd.internal_android_library

import com.tkpd.internal_android_nested_library.InternalAndroidNestedLibrary

class InternalAndroidLibrary {
    
    val TAG: String
        get() = "Internal Android Library"

    fun getNested(): String{
        val lib = InternalAndroidNestedLibrary()
        return "[${TAG}]\n" +
                "\t-> ${lib.getNested()}"
    }
}