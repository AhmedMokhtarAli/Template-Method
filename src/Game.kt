abstract class Game {
    fun play(){
        initPlay()
        startPlay()
        endPlay()
    }
    abstract fun initPlay()
    abstract fun startPlay()
    abstract fun endPlay()
}