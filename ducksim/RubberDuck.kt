package ducksim

import java.awt.Color

class RubberDuck : Duck() {

    override val color: Color = Color.YELLOW
    // since val cannot be reassigned, but we declare color as open: which can be overridden

    override var quackText: String = "Squeak!"

//    override fun fly() {
//        // do nothing
//    }

    override val defaultFlyBehavior: FlyBehavior
        get() = FlyNoWay()

    override val defaultQuackBehavior: QuackBehavior
        get() = QuackSqueak()

    override fun display() = "Rubber"
         
//    override val defaultFlyBehavior: FlyBehavior
//        get() = super.defaultFlyBehavior


}