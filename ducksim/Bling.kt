package ducksim

import java.awt.Color

abstract class Bling(val duck : Duck) : Duck(){

    override val defaultFlyBehavior: FlyBehavior = duck.defaultFlyBehavior

    override val color: Color = duck.color //supposed to be super.color, but you don't want to use default parent duck color which will be black, so use duck.color.

    override val defaultQuackBehavior: QuackBehavior = duck.defaultQuackBehavior

    override val quackText: String = duck.quackText

    init {
        flyBehavior = duck.flyBehavior
        quackBehavior = duck.quackBehavior
    }

    override fun display(): String {
        return duck.display()
    }

}

//fun main () {
//    val duck: Duck = DecoyDuck()
//    val duckBling : Duck = MoonBling(duck)
//