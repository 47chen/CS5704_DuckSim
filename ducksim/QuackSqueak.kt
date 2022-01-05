package ducksim

class QuackSqueak:QuackBehavior {
    override val state: State
    get() = State.QUACKING

//    override val quackText: String = "Squeak!"
//
//    private fun quackText(s: String): String {
//        return s;
//    }
}