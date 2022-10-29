package com.hasanali.hiltkotlin

import com.google.gson.Gson
import javax.inject.Inject

class ClassExample
    @Inject constructor(@FirstImplementor private val myInterfaceImplementor: MyInterface,
                        private val gson: Gson,
                        @SecondImplementor private val secondInterfaceImplementor: MyInterface) {

    fun myFunction() : String {
        return myInterfaceImplementor.myPrintFunction()
    }

    fun secondFunction() : String {
        return secondInterfaceImplementor.myPrintFunction()
    }

}


