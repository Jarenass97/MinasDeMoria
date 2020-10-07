package CaminoMoria

import kotlin.random.Random

class Sala {
    var numSala:Int
    var peligro:Peligro=Peligro.MAGICO
    var poderMaligno:Int=0
    var flechas:Int=0
    var enemigos:Int=0
    constructor(numSala:Int){
        this.numSala=numSala
        var rd = Random.nextInt(3) + 1
        if (rd == 1) {
            this.peligro = Peligro.HABILIDAD
        } else if (rd == 2) {
            this.peligro = Peligro.ACCION
            this.enemigos= Random.nextInt(10)+1
            this.flechas=Random.nextInt(10)+1
        } else if (rd == 3) {
            this.peligro = Peligro.MAGICO
            this.poderMaligno=Random.nextInt(10)+1
        }
    }

    override fun toString(): String {
        return "Sala(numSala=$numSala, peligro=$peligro, poderMaligno=$poderMaligno, flechas=$flechas)"
    }

}