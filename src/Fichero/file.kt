package Fichero

import java.io.*

/**
 * Objeto utilizado para llamar y escribir en el fichero
 */
object file {
    val fichero: File = File("Resultado.txt")
    val f: FileWriter = FileWriter(fichero,true)
    fun escribir(string: String){
        f.write(string)
    }
    fun cerrar(){
        f.close()
    }
}