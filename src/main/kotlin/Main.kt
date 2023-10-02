fun main(){

    val motorCombustao = MotorCombustao()
    val carro = Carro(motorCombustao)
    motorCombustao.desligar()
    motorCombustao.estaLigado()
    motorCombustao.ligar()
    motorCombustao.estaLigado()


    carro.andar()

    val tesla = Carro(motorCombustao)
    tesla.partida()
    tesla.andar()
}