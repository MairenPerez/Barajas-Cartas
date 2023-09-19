package JuegoDeCartas;

public class cartas{
    // Guardremos los atributos de las cartas (juego rol)
    protected int id;
    protected String nombre;
    protected int ataque;
    protected int defensa;
    protected int vida;
    protected int coste;
    protected String tipo;

    // Constructor por defecto
    public cartas() {
    }

    // Constructor con todos los atributos
    public cartas(int id, String nombre2, int ataque, int defensa, int vida, int coste, String tipo2) {
        this.id = id;
        this.nombre = nombre2;
        this.ataque = ataque;
        this.defensa = defensa;
        this.vida = vida;
        this.coste = coste;
        this.tipo = tipo2;
    }

    // Getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Métodos de la clase 
    public void mostrarCarta(){
        System.out.println("ID: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Ataque: " + this.ataque);
        System.out.println("Defensa: " + this.defensa);
        System.out.println("Vida: " + this.vida);
        System.out.println("Coste: " + this.coste);
        System.out.println("Tipo: " + this.tipo);
    }

    // Aumentar ataque
    public void aumentarAtaque(int cantidad){
        ataque += cantidad;
    }

    // Aumentar defensa
    public void aumentarDefensa(int cantidad){
        defensa += cantidad;
    }

    // Aumentar vida
    public void aumentarVida(int cantidad){
        vida += cantidad;
    }

    // Quitar vida
    public void quitarVida(int cantidad){
        vida -= cantidad;
    }

     // toString
    @Override
    public String toString() {
        return "cartas{" + "id=" + id + ", nombre=" + nombre + ", ataque=" + ataque + ", defensa=" + defensa + ", vida=" + vida + ", coste=" + coste + ", tipo=" + tipo + '}';
    }
}




