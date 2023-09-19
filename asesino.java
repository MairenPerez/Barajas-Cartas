package JuegoDeCartas;

public class asesino extends cartas {
    
    private int ataqueDagas;
    private int ataqueArco;

    // Constructor (solo recibe de la superclase)
    public asesino(int id, String nombre, int ataque, int defensa, int vida, int coste, String tipo) {
        super(id, nombre, ataque, defensa, vida, coste, tipo);
    }

    // Constructor
    public asesino(int ataqueDagas, int ataqueArco, int id, String nombre, int ataque, int defensa, int vida, int coste, String tipo) {
        super(id, nombre, ataque, defensa, vida, coste, tipo);
        this.ataqueDagas = ataqueDagas;
        this.ataqueArco = ataqueArco;
    }

    // getters y setters
    public int getAtaqueDagas() {
        return ataqueDagas;
    }

    public void setAtaqueDagas(int ataqueDagas) {
        this.ataqueDagas = ataqueDagas;
    }

    public int getAtaqueArco() {
        return ataqueArco;
    }

    public void setAtaqueArco(int ataqueArco) {
        this.ataqueArco = ataqueArco;
    }

    
    /*MÉTODO DE LA CLASE ASESINO */

    // Atacar (Asesino)
    public void  ataqueDagas( int dagas) {
        if (dagas >= 10) {
            System.out.println("Ataque con dagas lanzado");
        } else {
            System.out.println("Dagas insuficientes");
        }
    }

    public void ataqueArco(int arco, int flechas) {
       //  Si hay flechas disponible lanzamos ataque, si no , no nada
        if (flechas >= 10) {
            System.out.println("Ataque con arco lanzado");
        } else {
            System.out.println("Flechas insuficientes");
        }
    }
}