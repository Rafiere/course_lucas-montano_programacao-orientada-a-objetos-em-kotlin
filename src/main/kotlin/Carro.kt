class Carro constructor(private val motor: Motor){

    var cor: String? = null


    fun andar(){

		when {
            !motor.estaLigado() -> println("Ligue o carro primeiro!")
            !motor.temAutonomia() -> println("Coloque o combustível primeiro!")
            else -> {
                motor.gastar()
                println("Carro andando...")
            }
        }

        /* O "is" verifica o tipo da superclasse. */
        when(motor){
            is MotorCombustao -> println("Combustão")
            is MotorEletrico -> println("Elétrico")
        }
    }

    fun buzinar(){
        println("Biii")
    }

    fun freiar(){
        println("Freiando...")
    }

    fun partida(){
        println("Carro dando a partida...")
    }
}