package com.hasanali.hiltkotlin

import javax.inject.Inject

class Musician
    @Inject constructor(band: Band, instrument: Instrument){

    fun sign() {
        println("sign")
    }
}