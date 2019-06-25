import model.Fruta

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

    println("\nIngrese el numero de la categoria :")
    val response: String? = readLine()
    val resp = response?.toInt()

    when(resp!!){
        5 -> makeFruta()
    }

}

fun viewRecipe(){
    println("Ver mis recetas")
}

fun makeFruta(){
    val lista = arrayListOf<String>("Fresa","Platano","Uvas","Manzana","Naranja","Pera","Cereza")
    lista.forEachIndexed() { index, s -> println("${index+1}. $s") }
    println("\nIngrese el numero de la fruta :")
    val response: String? = readLine()
    val resp = response?.toInt()
    verFruta(lista[resp!!])
}
fun verFruta( name: String){
    println("Ingrese la cantidad : ")
    val cantidad: String? = readLine()
    println("Ingrese el precio : ")
    val precio: String? = readLine()
    println("Ingrese el tipo de medida : ")
    val medida: String? = readLine()
    val fruta = Fruta(name, cantidad?.toInt(),precio?.toDouble(),medida)
    println("fruta : ${fruta}")

}