package model

class Cereal( name: String, var marca: String , var cantidad: Int, var precio: Double, var medida: String):
    Recipe( name ){

    override fun toString(): String {
        return super.toString() + """
            Marca: $marca
            Cantidad: $cantidad
            Precio: $precio
            Tipo de medida: $medida
        """.trimIndent()
    }
}