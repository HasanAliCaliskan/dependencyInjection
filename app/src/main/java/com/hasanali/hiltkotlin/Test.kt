package com.hasanali.hiltkotlin

interface Car {

    fun drive()
}

interface Engine {

    fun start(): String
}


public class AutoCar(val engine: Engine) : Car{

    val enginee = engine

    override fun drive() {
        val string = enginee.start()
    }
}


public class DieselEngine() : Engine{

    override fun start(): String {
        return "Diesel engine started"
    }
}

public class ElectricEngine() : Engine{

    override fun start(): String {
        return "Electric engine started"
    }
}

public class GasolineEngine() : Engine{

    override fun start(): String {
        return "Gasoline engine started"
    }
}