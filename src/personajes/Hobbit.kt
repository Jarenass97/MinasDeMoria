package personajes

import Armas.Anillo
import Fichero.file

/**
 * Objetos de tipo hobbit
 */
class Hobbit(nombre: String, var anillo: Anillo) : Personaje(nombre, Estado.VIVO) {
    /**
     * Metodo para poner el anillo al hobbit
     */
    fun ponerseAnillo() {
        anillo.isPuesto = true
        file.escribir("${this.nombre} se ha puesto el anillo.\n")
    }

    /**
     * Método para quitar el anillo al hobbit
     */
    fun quitarseAnillo() {
        anillo.isPuesto = false
    }

    /**
     * Método toString
     */
    override fun toString(): String {
        return super.toString() + "Hobbit, AnilloPuesto=${anillo.isPuesto})"
    }
}