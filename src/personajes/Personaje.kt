package personajes

class Personaje {
    private var nombre: String
    private var estado: Estado

    constructor(nombre:String){
        this.nombre=nombre;
        this.estado=Estado.VIVO
    }
}