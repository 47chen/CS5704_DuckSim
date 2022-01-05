package ducksim

import java.awt.Color


// parent duck class -> like default, since it's a default, you should declare as val
abstract class Duck: Observer {

    // values that can be overridden ( declare : open )
    // *The whole point for strategy pattern is that you change behavior just by reassignments


    open val defaultFlyBehavior : FlyBehavior = FlyWithWings()
    open val defaultQuackBehavior : QuackBehavior = QuackNormal()
    open val color: Color = Color.BLACK // property = java的field, val cannot be reassigned
    open val quackText: String = "Quack!"





    var quackBehavior: QuackBehavior = defaultQuackBehavior
        protected set

//    var quackText = quackBehavior.quackText
//        protected set

    var flyBehavior: FlyBehavior = defaultFlyBehavior
        protected set
    var state = State.SWIMMING
        private set
    var isFree = true
        private set
    var isOnDSWC = false
        private set


    // function for setting the state back to its default (swimming)

    fun swim() {
        state = State.SWIMMING
    }

    // functions from the context menu
    open fun fly() {
        state = flyBehavior.state
//  or using if(isFree) {
//            state = defaultFlyBehavior.state // defaultFlyState
//        }else{
//            state = FlyNoWay().state
//        }
    }

    open fun quack() {
        state = quackBehavior.state
//        quackText = quackBehavior.quackText
    }

    open val joinDSCW = object : DuckMenuItem {
        override fun invoke() {
            doJoinDSCW()
        }
    }

    fun doJoinDSCW() {
        isOnDSWC = true
    }

    open val quitDSCW = object : DuckMenuItem {
        override fun invoke() {
            doQuitDSCW()
        }
    }

    fun doQuitDSCW() {
        isOnDSWC = false
    }

    open val capture = object : DuckMenuItem {
        override fun invoke() {
            doCapture()
        }
    }

    fun doCapture() {
        isFree = false
        flyBehavior = FlyNoWay()
        quackBehavior = QuackNoWay()
    }

    open val release = object : DuckMenuItem {
        override fun invoke() {
            doRelease()
        }
    }

    fun doRelease() {
        isFree = true
        flyBehavior = defaultFlyBehavior
        quackBehavior = defaultQuackBehavior
    }

    // abstract display function that must be implemented by concrete classes

    abstract fun display(): String

    override fun update() {
        state = State.WELCOMING
    }
}


