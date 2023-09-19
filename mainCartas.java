package JuegoDeCartas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class mainCartas {
    public static void main(String[] args) {

        // Crearemos una baraja de cartas
        List<cartas> baraja = barajaCartasAleatorias(15);

        // Mostramos su información
        System.out.println("Baraja de cartas: ");
        for (cartas carta : baraja) {
            System.out.println(carta.toString());
        }

        // Elegimos dos cartas para la batalla
        cartas cartaJugador = baraja.get(0); // carta del jugador1
        cartas cartaEnemigo = baraja.get(1); // carta del enemigo

        // Llamamos al método para iniciar el combate entre dos cartas
        realizarBatalla(cartaJugador, cartaEnemigo);
    }

    public static void realizarBatalla(cartas cartaJugador, cartas cartaEnemigo) {
        System.out.println("¡Que empieze el combate!");
        System.out.println("Carta del jugador: " + cartaJugador.toString());
        System.out.println("Carta del enemigo: " + cartaEnemigo.toString());

        // Simulación del combate
        int danioJugador = cartaJugador.getAtaque() - cartaEnemigo.getDefensa();
        int danioEnemigo = cartaEnemigo.getAtaque() - cartaJugador.getDefensa();

        if (danioJugador > 0) {
            cartaEnemigo.quitarVida(danioEnemigo);
            System.out.println("El jugador ha inflingido " + danioJugador + " puntos de daño");
        } else {
            System.out.println("Ataque del jugador fallido");
        }

        if (danioEnemigo > 0) {
            cartaJugador.quitarVida(danioJugador);
            System.out.println("El enemigo ha inflingido " + danioEnemigo + " puntos de daño");
        } else {
            System.out.println("Ataque del enemigo fallido");
        }

        // Mostramos los resultados del combate
        System.out.println("Vida del jugador después de la batalla: " + cartaJugador.getVida());
        System.out.println("Vida del enemigo después de la batalla: " + cartaEnemigo.getVida());
    }

    private static List<cartas> barajaCartasAleatorias(int cantidadMaxima) {
        // Crearemos una baraja de cartas aleatorias
        List<cartas> baraja = new ArrayList<cartas>();
        Random random = new Random();

        // Añadimos cartas aleatorias a la baraja hasta que lleguemos a la cantidad
        // máxima de cartas
        while (baraja.size() < cantidadMaxima) {
            // Generamos un número aleatorio entre 0 y 2 (incluidos)
            int tipoCarta = random.nextInt(3); // 0: Asesino, 1: Guerrero, 2: Mago

            if (tipoCarta == 0) {
                baraja.add(crearCartasAsesino(random)); // Añadimos un asesino
            } else if (tipoCarta == 1) {
                baraja.add(crearCartasGuerrero(random)); // Añadimos un guerrero
            } else {
                baraja.add(crearCartasMago(random)); // Añadimos un mago
            }
        }

        return baraja;
    }

    public static cartas crearCartasAsesino(Random random) {

        // Creamos un asesino aleatorio
        int id = random.nextInt(1000) + 1;
        String nombre = "Asesino" + id;
        int ataque = random.nextInt(20) + 5;
        int defensa = random.nextInt(10) + 1;
        int vida = random.nextInt(30) + 10;
        int coste = random.nextInt(5) + 1;
        int danioDagas = random.nextInt(5) + 3;
        int danioArco = random.nextInt(3) + 1;
        String tipo = "Asesino";

        return new asesino(danioDagas, danioArco, id, nombre, ataque, defensa, vida, coste, tipo);
    }

    public static cartas crearCartasGuerrero(Random random) {

        // Creamos un guerrero aleatorio
        int id = random.nextInt(1000) + 1;
        String nombre = "Guerrero" + id;
        int ataque = random.nextInt(20) + 5;
        int defensa = random.nextInt(10) + 1;
        int vida = random.nextInt(30) + 10;
        int coste = random.nextInt(5) + 1;
        int ataqueFisico = random.nextInt(15) + 5;
        int resistencia = random.nextInt(8) + 2;
        int armadura = random.nextInt(10) + 1;
        String tipo = "Guerrero";

        return new guerrero(ataqueFisico, resistencia, armadura, id, nombre, ataque, defensa, vida, coste, tipo);
    }

    public static cartas crearCartasMago(Random random) {

        // Creamos un mago aleatorio
        int id = random.nextInt(1000) + 1;
        String nombre = "Mago" + id;
        int ataque = random.nextInt(20) + 5;
        int defensa = random.nextInt(10) + 1;
        int vida = random.nextInt(30) + 10;
        int coste = random.nextInt(5) + 1;
        int ataqueMagico = random.nextInt(10) + 5;
        int poderCura = random.nextInt(5) + 2;
        int mana = random.nextInt(20) + 10;
        String tipo = "Mago";

        // Crear una carta de mago con los atributos generados
        return new mago(mana, ataqueMagico, poderCura, id, nombre, ataque, defensa, vida, coste, tipo);

    }
}
