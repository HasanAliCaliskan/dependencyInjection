package com.hasanali.hiltkotlin

import javax.inject.Inject

class InterfaceImplementor
    @Inject constructor() : MyInterface{

    override fun myPrintFunction(): String {
        return "it worked"
    }
}