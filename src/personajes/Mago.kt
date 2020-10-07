package personajes

import Armas.Vara
import Fichero.file

/**
 * Objeto de tipo mago
 */
class Mago(nombre:String,var vara:Vara) : Personaje(nombre,Estado.VIVO){
    /**
     * Método para recargar la vara que da energia
     * energia: energia que se recarga a la vara
     */
    fun recargarVara(energia:Int){
        if(vara.poder>0) {
            file.escribir("Recargando la vara en $energia... ")
            vara.poder -= energia
            file.escribir("Vara recargada, quedan ${vara.poder} puntos de poder restante\n")
        }else{
            file.escribir("La vara ha agotado toda su energia y no puede ser recargada\n")
        }
    }

    /**
     * Método que devuelve el poder de la vara
     */
    fun poderVara():Int{
        return vara.poder
    }

    /**
     * Método toString
     */
    override fun toString(): String {

        return super.toString()+"Mago, poderVara=${vara.poder})"
    }
}