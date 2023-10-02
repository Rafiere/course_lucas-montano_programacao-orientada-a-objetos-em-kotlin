class Motor {

    private var ligado: Boolean = false
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

    fun temCombustivel(): Boolean {
        return this.nivelCombustivel > 0
    }

    fun gastandoCombustivel(){
        this.nivelCombustivel - 1
    }
}