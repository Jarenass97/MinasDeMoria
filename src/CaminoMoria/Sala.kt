package CaminoMoria

import kotlin.random.Random

class Sala {
    var numSala:Int
    var peligro:Peligro
    var poderMaligno:Int=0
    var flechas:Int=0
    constructor(numSala:Int, peligro:Peligro){
        this.numSala=numSala
        this.peligro=peligro
        if(peligro.equals(Peligro.MAGICO)) {
            this.poderMaligno= Random.nextInt(10)
        }else if(peligro.equals(Peligro.ACCION)){
            this.poderMaligno=Random.nextInt(15)
            this.flechas=Random.nextInt(20)
        }else if(peligro.equals(Peligro.HABILIDAD)){
            this.poderMaligno=Random.nextInt(5)
        }
    }

    override fun toString(): String {
        return "Sala(numSala=$numSala, peligro=$peligro, poderMaligno=$poderMaligno, flechas=$flechas)"
    }

}