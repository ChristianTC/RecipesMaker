package model

interface IFruta {
    fun recipe(cantidad: Int, precio: Double){
        println("""
            Cantidad: $cantidad
            Precio: $precio
        """.trimIndent())
    }
}