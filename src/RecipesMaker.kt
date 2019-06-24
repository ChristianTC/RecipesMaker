
fun main(args: Array<String>){
    val menu: String = """ 
        Selecciona la opcion deseada
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
        
        Ingrese la opcion
    """.trimIndent()

    do {
        println(menu)
        val response: String? = readLine()
        println(response)
        when (response?.toInt()){
            1 -> println("Escogiste la opcion 1\n")
            2 -> println("Escogiste la opcion 2\n")
        }
    }while (response?.toInt()!=3)

}