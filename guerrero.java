package JuegoDeCartas;

public class guerrero extends cartas{
    private int ataqueFisico;
    private int resistencia;
    private int armadura;

    // Constructor (solo recibe de la superclase)
    public guerrero( int id, String nombre, int ataque, int defensa, int vida, int coste, String tipo) {
        super(id, nombre, ataque, defensa, vida, coste, tipo);
    }

    // Constructor
    public guerrero(int ataqueFisico, int resistencia, int armadura, int id, String nombre, int ataque, int defensa, int vida, int coste, String tipo) {
        super(id, nombre, ataque, defensa, vida, coste, tipo);
        this.ataqueFisico = ataqueFisico;
        this.resistencia = resistencia;
        this.armadura = armadura;
    }

    // getters y setters
    public int getAtaqueFisico() {
        return ataqueFisico;
    }

    public void setAtaqueFisico(int ataqueFisico) {
        this.ataqueFisico = ataqueFisico;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    /*MÉTODO DE LA CLASE GUERRERO */

    // Atacar (Guerrero)
    public void realizarAtaque(int ataqueFisico, int resistencia){
        if (resistencia >= 10){
            System.out.println("Ataque físico lanzado");
        } else {
            System.out.println("Resistencia insuficiente");
        }
    }
    
    // Defender (Guerrero)
    public void defender (int armadura, int resistencia){
        if (resistencia >= 10){
            System.out.println("Defensa lanzada");
        } else {
            System.out.println("Resistencia insuficiente");
        }
    }

    // toString
    @Override
    public String toString() {
        return "guerrero{" + "ataqueFisico=" + ataqueFisico + ", resistencia=" + resistencia + ", armadura=" + armadura + '}';
    }
}
