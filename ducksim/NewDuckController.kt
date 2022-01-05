package ducksim

class NewDuckController(val duckPond: DuckPond, val view: DuckSimView) {

    fun createNewDuck() {

        if (duckPond.noSelectedDucks()) {
            val makeDuckDialog = MakeDuckDialog(duckPond, view)
            makeDuckDialog.setSize(300, 200)
            makeDuckDialog.isVisible = true
        } else {
            val ducks = duckPond.selectedDucks.filterNot { it is Flock }
            // get the selected ducks from the model
            // filter the selected ducks by removing any flocks
            // if there is more than one duck after removing flocks,
            // create a new flock with the selected ducks
            //            ducks.filterNot { duck -> duck is Flock } //
            if(ducks.size < 1) return
            val flock = Flock(ducks)
            duckPond.addNewDuck(flock)
            view.repaint()
        }
    }
}