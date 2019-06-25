package model

class Fruta(name: String, var cantidad: Int?, var precio: Double?, var medida: String?):
    Recipe( name ){

    override fun toString(): String {
        return super.toString() + """
            Cantidad: $cantidad
            Precio: $precio
            Tipo de medida: $medida
        """.trimIndent()
    }

}