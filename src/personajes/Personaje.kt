package personajes

open class Personaje(var nombre:String,var estado:Estado) {
    override fun toString(): String {
        return "Personaje(nombre='$nombre', estado=$estado, Raza="
    }
}