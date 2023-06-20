package controle;

import java.util.ArrayList;

import modelo.Voo;

public class VooDAO {
	
	private static ArrayList<Voo> listaVoo;
	private static VooDAO instancia;

	public static VooDAO getInstacia() {

		if (instancia == null) {
			instancia = new VooDAO();
			listaVoo = new ArrayList<>();
		}

		return instancia;
	}
	
	public boolean inserir(Voo v) {
		if (v != null) {
			listaVoo.add(v);
			return true;
		}
		return false;
	}
	
	public boolean excluir(Voo v) {
	    if (v != null) {
	        if (listaVoo.contains(v)) {
	            listaVoo.remove(v);
	            return true;
	        }
	    }
	    return false;
	}

	
	public ArrayList<Voo> listaVoo() {
		return listaVoo;
	}
}
