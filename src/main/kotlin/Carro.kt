class Carro constructor(private val motor: Motor){

    var cor: String? = null


    fun andar(){

        if(motor.estaLigado() && motor.temCombustivel()){
            println("Vrum, vrum...")
            motor.gastandoCombustivel()
        } else if(!motor.temCombustivel()){
            println("O motor não tem combustível")
        } else {
            println("O motor está desligado")
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