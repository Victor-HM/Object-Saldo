
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta primeiro = new Conta();
		primeiro.saldo = 200;
		
		System.out.println("Saldo na conta inicial = " + primeiro.saldo);
		
		primeiro.depositar(200);
		System.out.println("Saldo após o depósito = " + primeiro.extrato());
		
		System.out.println(primeiro.sacar(300));
		System.out.println("Saldo final da conta = " + primeiro.saldo);
		System.out.println(primeiro.extrato());
	}

}

/*o saldo é 200 e colocamos mais 200 com a função depositar, depois colocamos
200 do valor do saque chamando a função sacar dentro do system*/