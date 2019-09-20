public class Program {
	public static void main(String args[]) {
		Carta card1, card2, card3;
		Jugador jug1;
		card1 = new Carta("Ocho", "diamantes", 8);
		card2 = new Carta("Seis", "trébol", 6);
		card3 = new Carta("Cuatro", "pica", 4);
		jug1 = new Jugador();
		
		jug1.darCarta(card1);
		System.out.println("El jugador " + jug1.getNombre() + " recibe " + card1.toString() + ".");
		jug1.darCarta(card2);
		System.out.println("El jugador " + jug1.getNombre() + " recibe " + card2.toString() + ".");
		System.out.println("El jugador " + jug1.getNombre() + " retira la carta " + jug1.retirarCarta(0) + ".");
		jug1.darCarta(card3);
		System.out.println("El jugador " + jug1.getNombre() + " recibe " + card3.toString() + ".");
		System.out.println("Las cartas que tiene " + jug1.getNombre() + " son:");
		System.out.println(jug1.juego());
	}
}
