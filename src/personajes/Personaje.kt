package personajes

open class Personaje(private var nombre:String,private var estado:Estado) {
    override fun toString(): String {
        return "Personaje(nombre='$nombre', estado=$estado, "
    }
}