package ducksim

interface FlyBehavior {

    //set the state, like when state=fly then behave fly, state = swim, then cannot behave fly
    //    fun fly(){
    //        //duck.state = State.FLYING
    //    }
    val state: State // don't need to put open, since interface default can be overridden


}