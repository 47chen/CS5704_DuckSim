package ducksim

import java.awt.Color

class RedheadDuck : Duck() {

    override val color: Color = Color.RED

    override val defaultQuackBehavior: QuackBehavior
        get() = QuackNoWay()

    override val defaultFlyBehavior: FlyBehavior
        get() = FlyWithWings()

    override fun display() = "Redhead"

}