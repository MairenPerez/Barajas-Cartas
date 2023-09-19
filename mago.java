package JuegoDeCartas;

public class mago extends cartas{
    private int mana;
    private int hechizo;
    private int curar;

    // Constructor (solo recibe de la superclase)
    public mago(int id, String nombre, int ataque, int defensa, int vida, int coste, String tipo) {
        super(id, nombre, ataque, defensa, vida, coste, tipo);
    }

    // Constructor
    public mago(int mana, int hechizo, int curar, int id, String nombre, int ataque, int defensa, int vida, int coste, String tipo) {
        super(id, nombre, ataque, defensa, vida, coste, tipo);
        this.mana = mana;
        this.hechizo = hechizo;
        this.curar = curar;
    }

    // Getters y setters
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getHechizo() {
        return hechizo;
    }
    
    public void setHechizo(int hechizo) {
        this.hechizo = hechizo;
    }

    public int getCurar() {
        return curar;
    }

    public void setCurar(int curar) {
        this.curar = curar;
    }

    /*MÉTODO DE LA CLASE MAGO */

    // Atacar (Mago)
    public void lanzarAtaqueMagico( int ataque, int mana){
        if (mana >= 10){
            System.out.println("Ataque mágico lanzado");
        } else {
            System.out.println("Maná insuficiente");
        }
    }

    // Curarse (Mago)
    public void curarse (int curar, int mana){
        if (mana >= 10){
            System.out.println("Curación lanzada");
        } else {
            System.out.println("Maná insuficiente");
        }
    }
 // toString
    @Override
    public String toString() {
        return "mago{" + "mana=" + mana + ", hechizo=" + hechizo + ", curar=" + curar + '}';
    }
}
