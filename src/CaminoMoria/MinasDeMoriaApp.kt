package CaminoMoria

import Armas.Anillo
import Armas.Carcaj
import Armas.Vara
import personajes.*
import kotlin.random.Random

fun main(args: Array<String>) {
    val SALAS = 36
    val MAXPODER = 30
    val MAXFLECHAS = 20
    val salas = arrayListOf<Sala>()
    var vara = Vara(Random.nextInt(MAXPODER) + 1)
    var carcaj = Carcaj(Random.nextInt(MAXFLECHAS) + 1)
    var anillo = Anillo()
    var gandalf = Mago("Gandalf", vara)
    var legolas = Elfo("Légolas", carcaj)
    var frodo = Hobbit("Frodo", anillo)
    generaSalas(salas, SALAS)
    println(gandalf.toString())
    println(legolas.toString())
    println(frodo.toString())
    caminoMoria(salas, gandalf, legolas, frodo)
}

fun caminoMoria(salas: ArrayList<Sala>, gandalf: Mago, legolas: Elfo, frodo: Hobbit) {
    for (i in 0..(salas.size - 1)) {
        println("Entrando en la sala ${i + 1}...")
        
    }
}

fun generaSalas(salas: ArrayList<Sala>, SALAS: Int) {
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
