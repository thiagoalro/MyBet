public class Main {
	public static void main(String[] args) {

		Usuario user1 = new Usuario("Thiago", "thi", "thiago.alves@ifce.edu.br", 10.0);
		Usuario user2 = new Usuario("Fulano", "fulaninho", "fulano@gmail.com", 100.0);

		Aposta aposta1 = new Aposta(5, 0.3, "FlaXFlu");

		Aposta aposta2 = new Aposta(3, 0.2, "FortalezaXCeara");

		System.out.printf("Saldo do user1: %.2f%n", user1.getSaldo());

		user1.fazAposta(aposta1);
		user1.fazAposta(aposta2);

		System.out.printf("Saldo do user1: %.2f%n", user1.getSaldo());



	}
}