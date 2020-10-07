package personajes

import Armas.Carcaj

/**
 * Objeto Elfo
 */
class Elfo(nombre:String,var carcaj:Carcaj) : Personaje(nombre,Estado.VIVO) {
    /**
     * Método para lanzar flecha, resta una flecha del carcaj
     */
    fun lanzarFlecha(){
        carcaj.flechas--
    }

    /**
     * Método para recargar el carcaj con un numero de flechas introducido
     * flechas: numero de flechas a recargar
     */
    fun recargarCarcaj(flechas:Int){
        carcaj.flechas=flechas
    }

    /**
     * Método que devuelve las flechas del carcaj
     */
    fun flechas():Int{
        return carcaj.flechas
    }

    /**
     * Método toString.
     */
    override fun toString(): String {
        return super.toString()+"Elfo, flechas=${carcaj.flechas})"
    }
}