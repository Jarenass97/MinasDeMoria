package CaminoMoria

import Armas.*
import Fichero.file
import personajes.*
import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random

/**
 * método ejecutable
 */
fun main(args: Array<String>) {
    var date: Date = Date()
    val SALAS = 36
    val MAXPODER = 50
    val MAXFLECHAS = 30
    val salas = arrayListOf<Sala>()
    var vara = Vara(Random.nextInt(MAXPODER) + 1)
    var carcaj = Carcaj(Random.nextInt(MAXFLECHAS) + 1)
    var anillo = Anillo()
    var gandalf = Mago("Gandalf", vara)
    var legolas = Elfo("Légolas", carcaj)
    var frodo = Hobbit("Frodo", anillo)
    generaSalas(salas, SALAS)
    file.escribir("****************************************************\n")
    file.escribir("****************************************************\n")
    file.escribir(date.toString() + "\n")
    caminoMoria(salas, gandalf, legolas, frodo)
    file.escribir(date.toString() + "\n")
    file.cerrar()
}

/**
 * Funcion que simula el paso de los personajes por todas las salas
 * salas: Lista de las salas.
 * gandalf: personaje tipo mago.
 * legolas: personaje tipo elfo.
 * frodo: personaje tipo hobbit.
 */
fun caminoMoria(salas: ArrayList<Sala>, gandalf: Mago, legolas: Elfo, frodo: Hobbit) {
    var victoria: Boolean = true
    for (i in 0..(salas.size - 1)) {
        if (gandalf.estado == Estado.VIVO && legolas.estado == Estado.VIVO && frodo.estado == Estado.VIVO) {
            file.escribir("=================================================================\n")
            file.escribir("Entrando en la sala ${i + 1}. Tipo de sala: ${salas[i].peligro}...\n")
            if (salas[i].peligro.equals(Peligro.MAGICO)) {
                salaMagica(gandalf, salas[i])
            } else if (salas[i].peligro.equals(Peligro.ACCION)) {
                salaAccion(legolas, salas[i])
            } else if (salas[i].peligro.equals((Peligro.HABILIDAD))) {
                salaHabilidad(frodo, salas[i])
            }
        } else {
            file.escribir("======================================================\n")
            file.escribir("El equipo ha sufrido bajas antes de llegar al destino.\n")
            file.escribir("Finalizando simulación....\n")
            file.escribir("======================================================\n")
            victoria = false
            break
        }
    }
    if (victoria) {
        file.escribir("========================================================\n")
        file.escribir("El equipo ha llegado a Moria sin problemas. Enhorabuena!\n")
        file.escribir("Finalizando simulación....\n")
        file.escribir("========================================================\n")
    }

}

/**
 * Funcion que simula el paso por una sala de habilidad
 * frodo: personaje del tipo Hobbit
 * sala: objeto del tipo sala en la que están actualmente.
 */
fun salaHabilidad(frodo: Hobbit, sala: Sala) {
    if (Random.nextInt(100) + 1 <= 50) {
        frodo.ponerseAnillo()
        if (Random.nextInt(100) + 1 <= 90) {
            file.escribir("Han ganado...\n")
        } else {
            file.escribir("Tratando de huir...\n")
            if (Random.nextInt(100) + 1 <= 80) {
                file.escribir("Han huido con exito!\n")
            } else {
                frodo.estado = Estado.MUERTO
                file.escribir("${frodo.nombre} ha muerto\n")
            }
        }
    } else {
        frodo.quitarseAnillo()
        if (Random.nextInt(100) + 1 <= 20) {
            file.escribir("Han ganado...\n")
        } else {
            file.escribir("Tratando de huir...\n")
            if (Random.nextInt(100) + 1 <= 80) {
                file.escribir("Han huido con exito!\n")
            } else {
                frodo.estado = Estado.MUERTO
                file.escribir("${frodo.nombre} ha muerto\n")
            }
        }
    }
}

/** Funcion que simula el paso por una sala de accion
 * legolas: personaje del tipo elfo
 * sala: objeto del tipo sala en la que están actualmente.
 */
fun salaAccion(legolas: Elfo, sala: Sala) {
    var flechas: Int = 0
    for (i in 1..sala.enemigos) {
        if (legolas.flechas() > 0) {
            legolas.lanzarFlecha()
        } else {
            file.escribir("Tratando de huir...\n")
            if ((Random.nextInt(100) + 1) <= 80) {
                file.escribir("Han huido con exito!\n")
            } else {
                legolas.estado = Estado.MUERTO
                file.escribir("${legolas.nombre} ha muerto\n")
            }
            break
        }
        if (i == sala.enemigos) file.escribir("Han ganado...\n")
        flechas = i
    }
    file.escribir("${legolas.nombre} ha disparado $flechas flecha(s), quedan ${legolas.flechas()} en el carcaj.\n")
    if (legolas.estado == Estado.VIVO) {
        file.escribir("${legolas.nombre} ha recogido ${sala.flechas} flechas.\n")
        legolas.recargarCarcaj(sala.flechas)
    }
}

/** Funcion que simula el paso por una sala de magia
 * gandalf: personaje del tipo mago
 * sala: objeto del tipo sala en la que están actualmente.
 */
fun salaMagica(gandalf: Mago, sala: Sala) {
    gandalf.recargarVara(Random.nextInt(10) + 1)
    if (gandalf.poderVara() > sala.poderMaligno) {
        file.escribir("Han ganado...\n")
    } else if (gandalf.poderVara() == sala.poderMaligno) {
        if ((Random.nextInt(100) + 1) <= 60) {
            file.escribir("Han ganado...\n")
        } else {
            file.escribir("Tratando de huir...\n")
            if ((Random.nextInt(100) + 1) <= 80) {
                file.escribir("Han huido con exito!\n")
            } else {
                gandalf.estado = Estado.MUERTO
                file.escribir("${gandalf.nombre} ha muerto\n")
            }
        }
    } else {
        if ((Random.nextInt(100) + 1) <= 30) {
            file.escribir("Han ganado...\n")
        } else {
            file.escribir("Tratando de huir...\n")
            if ((Random.nextInt(100) + 1) <= 80) {
                file.escribir("Han huido con exito!\n")
            } else {
                gandalf.estado = Estado.MUERTO
                file.escribir("${gandalf.nombre} ha muerto\n")
            }
        }
    }
}

/**
 * Método que genera el array de salas.
 */
fun generaSalas(salas: ArrayList<Sala>, SALAS: Int) {
    for (i in 0..(SALAS - 1)) {
        salas.add(Sala(i + 1))
    }
}
