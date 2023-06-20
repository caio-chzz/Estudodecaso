package controle;

import java.util.ArrayList;

import modelo.Passagem;

public class PassagemDAO {
	
	private static ArrayList<Passagem> listaPassagem;
	private static PassagemDAO instancia;

	public static PassagemDAO getInstacia() {

		if (instancia == null) {
			instancia = new PassagemDAO();
			listaPassagem = new ArrayList<>();
		}

		return instancia;
	}

	public boolean inserir(Passagem p) {
		if (p != null) {
			listaPassagem.add(p);
			return true;
		}
		return false;
	}

}
