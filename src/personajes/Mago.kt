package personajes

import Armas.Vara

class Mago(nombre:String,var vara:Vara) : Personaje(nombre,Estado.VIVO){
    fun recargarVara(energia:Int){
        print("Recargando la vara en $energia")
        vara.poder-=energia
        println("Vara recargada, quedan ${vara.poder} puntos de poder restante")
    }
    fun poderVara():Int{
        return vara.poder
    }

    override fun toString(): String {

        return super.toString()+"Mago, poderVara=${vara.poder})"
    }
}