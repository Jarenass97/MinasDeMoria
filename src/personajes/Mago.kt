package personajes

class Mago(nombre:String,var poderVara:Int) : Personaje(nombre,Estado.VIVO){
    fun recargarVara(energia:Int){
        this.poderVara-=energia
    }

    override fun toString(): String {

        return super.toString()+"Tipo=Mago, poderVara=$poderVara)"
    }
}