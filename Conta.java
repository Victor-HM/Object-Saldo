//Classe
public class Conta {
double saldo;
int agencia;
int conta;
String titular;

//FUNÇÃO Q SEM RETORNO(void) MAS COM PARAMETRO
void depositar (double valor) {
	//calculo
	saldo = saldo + valor;
}

//FUNÇÃO 02 TEM RETORNO MAS NÃO TEM PARAMETRO
double extrato() {
	return saldo;
}

//FUNÇÃO 03 TEM RETORNO E TEM PARAMENTRO
String sacar (double valor) {
	if(saldo>=valor) {
		saldo = saldo - valor;
		return "Valor sacado com sucesso";
	}
	return "Valor insuficiente para sacar";
}
}
