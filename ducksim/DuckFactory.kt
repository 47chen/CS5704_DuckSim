package ducksim



object DuckFactory: Subject {

    private val observers : MutableList<Observer> = mutableListOf()
    fun createDuck(baseDuck: Duck, starCount: Int, moonCount: Int, crossCount: Int): Duck {

        var duck = baseDuck
        for(i in 1..starCount) {
            duck = StarBling(duck)
        }

        for(i in 1..moonCount) {
            duck = MoonBling(duck)
        }

        for(i in 1..crossCount) {
            duck = CrossBling(duck)
        }

        for(i in observers) {
            notifyObserver(i)
        }
        return duck
    }

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObserver(observer: Observer) {
        observer.update()
    }

}
