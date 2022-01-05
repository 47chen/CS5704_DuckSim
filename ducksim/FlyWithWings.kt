package ducksim

class FlyWithWings : FlyBehavior {
    override val state: State
        get() = State.FLYING

//    }
}


// class with argument shows below

//class FlyWithWings(val s: String) {
//    override val state: State
//        get() = State.FLYING
//
//    init {
//        println(s)
//    }
//
//}