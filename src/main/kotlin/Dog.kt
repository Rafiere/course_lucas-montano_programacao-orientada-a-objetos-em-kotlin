class Dog constructor(
    private val owner: Human
){

    /* No Kotlin, não temos os getters/setters por padrão. */
    var name: String = "Rex"

	fun sayHi(ownerName: String){

        println("Hi, $ownerName")
    }
}