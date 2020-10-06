package personajes

class Elfo(nombre:String,var flechas:Int) : Personaje(nombre,Estado.VIVO) {
    override fun toString(): String {
        return super.toString()+"Tipo=Elfo, flechas=$flechas)"
    }
}