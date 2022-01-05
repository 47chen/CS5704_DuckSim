package ducksim

class QuackNoise: QuackBehavior {

    override val state: State
        get() = State.QUACKING
}