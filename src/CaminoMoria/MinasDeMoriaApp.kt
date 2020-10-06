package CaminoMoria

import jdk.swing.interop.SwingInterOpUtils
import personajes.*
import kotlin.random.Random

fun main(args: Array<String>) {
    val SALAS = 36
    val MAXPODER=30
    val MAXFLECHAS=20
    val salas = arrayListOf<Sala>()
    var gandalf = Mago("Gandalf",Random.nextInt(MAXPODER)+1)
    var legolas = Elfo("Légolas",Random.nextInt(MAXFLECHAS)+1)
    var frodo = Hobbit("Frodo")
    generaSalas(salas, SALAS)

    println(gandalf.toString())
    println(legolas.toString())
    println(frodo.toString())
    caminoMoria(salas,gandalf,legolas,frodo)
}
fun caminoMoria(salas:ArrayList<Sala>,gandalf:Mago,legolas:Elfo,frodo:Hobbit){
    for(i in 0..(salas.size-1)){
        println("Entrando en la sala ${i+1}...")
    }
}
fun generaSalas(salas: ArrayList<Sala>,SALAS:Int) {
    var pel: Peligro = Peligro.MAGICO
    for (i in 0..(SALAS - 1)) {
        var rd = Random.nextInt(3) + 1
        if (rd == 1) {
            pel = Peligro.HABILIDAD
        } else if (rd == 2) {
            pel = Peligro.ACCION
        } else if (rd == 3) {
            pel = Peligro.MAGICO
        }
        salas.add(Sala(i + 1, pel))
        println(salas[i].toString())
    }
}
