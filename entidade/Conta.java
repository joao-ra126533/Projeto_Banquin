import java.util.Scanner;
public class Conta {

  private int numero;
  private double saldo;
  private int tipo;
  public Conta(int numero) {
    this.saldo = 0;
    this.numero = numero;
    this.tipo = 1;
  }

  public int getNumero(){
  
    return this.numero;
  }

  public double getSaldo(){

    return this.saldo;
  }

  public void creditar (double v) {
    
    this.saldo = this.saldo + v;

  }

  public void debitar (double v) {
    
    double saldo = this.getSaldo();

    this.saldo = this.saldo - v;
    if (this.saldo < 0) {
      int x = -10;
      this.saldo = this.saldo + x;
    }
  }
}