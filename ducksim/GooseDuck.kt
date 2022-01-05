package ducksim

class GooseDuck : Duck() {
    private val goose : Goose = Goose()
    override fun display(): String = goose.name
    override val quackText: String = goose.honkText
    override val defaultFlyBehavior: FlyBehavior
        get() = FlyWithWings()
    }