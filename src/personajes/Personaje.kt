package personajes

/**
 * Clase padre personaje, de la que heredan mago, elfo y hobbit
 */
open class Personaje(var nombre:String,var estado:Estado) {
    override fun toString(): String {
        return "Personaje(nombre='$nombre', estado=$estado, Raza="
    }
}