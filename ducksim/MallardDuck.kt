package ducksim

import java.awt.Color

class MallardDuck : Duck() {

    override val color: Color = Color.GREEN

    override val quackText: String = "Quack!"

    override val defaultFlyBehavior: FlyBehavior
        get() = FlyWithWings()

    override val defaultQuackBehavior: QuackBehavior
        get() = QuackNormal()

    override fun display() = "Mallard"
}
