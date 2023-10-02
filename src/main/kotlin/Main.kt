fun main(){

    //Variável de leitura
    val name: String = "Rafael"


    //Variável de escrita
    var idade: Int?
    idade = 32

    println("Hello, $name, $idade")

    val rafa = Human()
    rafa.name = "Teste"

    val dog = Dog(rafa);
    dog.name = "Linux";

    println(dog.name)

    /* Quando uma função não tem um retorno, ela retorna um Unit. */
	dog.sayHi("Olá!")
}