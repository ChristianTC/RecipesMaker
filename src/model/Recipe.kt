package model

abstract class Recipe (var name: String ){

    override fun toString(): String {
        return "\nName: $name\n"
    }

}