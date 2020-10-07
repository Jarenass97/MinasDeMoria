package Fichero

import java.io.*

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