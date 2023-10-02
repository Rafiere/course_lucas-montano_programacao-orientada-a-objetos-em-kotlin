class MotorCombustao: Motor() {

    private var nivelCombustivel: Int = 2;

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

    override fun temAutonomia(): Boolean {
        return this.nivelCombustivel > 0
    }

    override fun gastando() {
		this.nivelCombustivel - 1
    }
}