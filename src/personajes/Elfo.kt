package personajes

import Armas.Carcaj

class Elfo(nombre:String,var carcaj:Carcaj) : Personaje(nombre,Estado.VIVO) {
    fun lanzarFlecha(){
        carcaj.flechas--
        println("${this.nombre} ha disparado una flecha, quedan ${carcaj.flechas} en el carcaj.")
    }
    fun recargarCarcaj(flechas:Int){
        carcaj.flechas=flechas
    }
    override fun toString(): String {
        return super.toString()+"Elfo, flechas=${carcaj.flechas})"
    }
}