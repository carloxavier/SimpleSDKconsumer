package com.loptor.mysamplesdkconsumer

import javax.inject.Inject

class DemoLibraryWrapper @Inject constructor() : Wrapper {
    override fun getGreeting(): String = "Dummy"
}