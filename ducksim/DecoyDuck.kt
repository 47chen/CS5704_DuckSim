package ducksim

import java.awt.Color

class DecoyDuck : Duck() {

    override val color: Color = Color.ORANGE
    override val quackText: String = ""

//    override fun fly() {
//        // do nothing
//    }

    override val defaultFlyBehavior: FlyBehavior
        get() = FlyNoWay()

//    override fun quack() {
//        // do nothing
//    }

    override val defaultQuackBehavior: QuackBehavior
        get() = QuackNoWay()

    override fun display() = "Decoy"
}
