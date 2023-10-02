fun main(){

    val motor = Motor()
    val carro = Carro(motor)
    motor.desligar()
    motor.estaLigado()
    motor.ligar()
    motor.estaLigado()


    carro.andar()
}