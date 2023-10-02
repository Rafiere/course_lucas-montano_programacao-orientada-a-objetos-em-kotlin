abstract class Motor {

    private var ligado: Boolean = false

    fun ligar() {
        this.ligado = true
    }

    fun desligar() {
        this.ligado = false
    }

    fun estaLigado(): Boolean {
        println(this.ligado)
        return this.ligado
    }

    /* Funções abstratas devem ser implementadas pela subclasse */
    abstract fun temAutonomia(): Boolean

    abstract fun gastando();
}