package personajes

import Armas.Anillo
import Fichero.file

class Hobbit(nombre: String, var anillo: Anillo) : Personaje(nombre, Estado.VIVO) {
    fun ponerseAnillo() {
        anillo.isPuesto = true
        file.escribir("${this.nombre} se ha puesto el anillo.\n")
    }

    fun quitarseAnillo() {
        anillo.isPuesto = false
    }

    override fun toString(): String {
        return super.toString() + "Hobbit, AnilloPuesto=${anillo.isPuesto})"
    }
}