package personajes

import Armas.Anillo

class Hobbit(nombre: String, var anillo: Anillo) : Personaje(nombre, Estado.VIVO) {
    fun ponerseAnillo() {
        anillo.isPuesto = true
    }

    fun quitarseAnillo() {
        anillo.isPuesto = false
    }

    override fun toString(): String {
        return super.toString() + "Hobbit, AnilloPuesto=${anillo.isPuesto})"
    }
}