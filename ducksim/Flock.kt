package ducksim

class Flock(val children: List<Duck>): Duck() {
    override fun display(): String {
        var displayText = "Flock"
        children.forEach {
            displayText += ":" + it.display().substring(0,1)
        }
       return displayText
    }
    override var quackText: String = "Noise!"

    override val defaultFlyBehavior: FlyBehavior
        get() = FlyWithWings()

    override val defaultQuackBehavior: QuackBehavior
        get() = QuackNoise()

    override val capture = object: DuckMenuItem {
        override fun invoke() {
            children.forEach {
                it.doCapture()
            }
            doCapture()
        }
    }

    override val joinDSCW = object: DuckMenuItem {
        override fun invoke() {
            children.forEach {
                it.doJoinDSCW()
                DuckFactory.registerObserver(it)
            }
            doJoinDSCW()
        }
    }



    override val quitDSCW = object: DuckMenuItem {
        override fun invoke() {
            children.forEach {
                it.doQuitDSCW()
                DuckFactory.removeObserver(it)
            }
            doQuitDSCW()
        }
    }

    override val release = object: DuckMenuItem {
        override fun invoke() {
            children.forEach {
                it.doRelease()
            }
            doRelease()
        }
    }



}