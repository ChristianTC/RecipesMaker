
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
            1 -> makeRecipe()
            2 -> viewRecipe()
        }
    }while (response?.toInt()!=3)

}

fun makeRecipe() {
    val menu = arrayListOf<String>("Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceites")
    println("Hacer receta\nSelecciona por categoria el ingrediente que buscas")
    menu.forEachIndexed() { index, s -> println("${index+1}. $s") }
}

fun viewRecipe(){
    println("Ver mis recetas")
}