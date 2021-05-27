class Main {
  public static void main(String[] args) {

   Cliente c = new Cliente();
		c.nome = "João";

		System.out.println("O nome é " + c.nome);

    Conta conta = new Conta(1234);
    System.out.println("Conta: " + conta.getNumero() + " = " + conta.getSaldo());

    conta.creditar(1000);
    System.out.println(conta.getSaldo());

    conta.debitar(1300);
    System.out.println(conta.getSaldo());

    conta.debitar(200);
    System.out.println(conta.getSaldo());
  }
}