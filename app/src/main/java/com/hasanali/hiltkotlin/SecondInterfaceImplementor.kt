package com.hasanali.hiltkotlin

import javax.inject.Inject


class SecondInterfaceImplementor
    @Inject constructor(): MyInterface{

    override fun myPrintFunction(): String {
        return "second interface implementor"
    }
}