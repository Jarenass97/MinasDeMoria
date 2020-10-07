package personajes

import Armas.Vara
import Fichero.file

class Mago(nombre:String,var vara:Vara) : Personaje(nombre,Estado.VIVO){
    fun recargarVara(energia:Int){
        if(vara.poder>0) {
            file.escribir("Recargando la vara en $energia... ")
            vara.poder -= energia
            file.escribir("Vara recargada, quedan ${vara.poder} puntos de poder restante\n")
        }else{
            file.escribir("La vara ha agotado toda su energia y no puede ser recargada\n")
        }
    }
    fun poderVara():Int{
        return vara.poder
    }

    override fun toString(): String {

        return super.toString()+"Mago, poderVara=${vara.poder})"
    }
}