package personajes

class Hobbit(nombre:String) : Personaje(nombre,Estado.VIVO) {
    var isAnilloPuesto:Boolean=false
    override fun toString(): String {
        return super.toString()+"Tipo=Hobbit, AnilloPuesto=$isAnilloPuesto)"
    }
}