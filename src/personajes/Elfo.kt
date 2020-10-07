package personajes

import Armas.Carcaj
import Fichero.file

class Elfo(nombre:String,var carcaj:Carcaj) : Personaje(nombre,Estado.VIVO) {
    fun lanzarFlecha(){
        carcaj.flechas--
    }
    fun recargarCarcaj(flechas:Int){
        carcaj.flechas=flechas
    }
    fun flechas():Int{
        return carcaj.flechas
    }
    override fun toString(): String {
        return super.toString()+"Elfo, flechas=${carcaj.flechas})"
    }
}