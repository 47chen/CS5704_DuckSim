package ducksim

class FlyNoWay : FlyBehavior { //: implement context
    override val state: State
        get() = State.SWIMMING


}