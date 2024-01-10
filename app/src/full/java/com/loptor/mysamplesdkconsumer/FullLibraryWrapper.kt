package com.loptor.mysamplesdkconsumer

import com.loptor.dummylib.MyDummyLib
import javax.inject.Inject

class FullLibraryWrapper @Inject constructor() : Wrapper {
    override fun getGreeting(): String = MyDummyLib.getGreeting()
}