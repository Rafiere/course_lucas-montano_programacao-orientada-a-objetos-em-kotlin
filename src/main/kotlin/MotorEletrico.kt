/* Estamos herdando da classe "Motor" */

class MotorEletrico: Motor() {

    private var nivelBateria: Int = 1;

    fun temEnergia(): Boolean {
        return this.nivelBateria > 0
    }

    fun gastandoEnergia(){
        this.nivelBateria - 1
    }

    override fun temAutonomia(): Boolean {
        return this.nivelBateria > 0
    }

    override fun gastando() {
        this.nivelBateria - 1
    }
}