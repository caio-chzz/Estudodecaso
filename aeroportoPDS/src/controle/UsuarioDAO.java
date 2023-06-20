package controle;

import java.util.ArrayList;
import java.util.List;

import modelo.Usuario;

public class UsuarioDAO {
	
	private static ArrayList<Usuario> listaUsuario;
	private static UsuarioDAO instancia;

	public static UsuarioDAO getInstacia() {

		if (instancia == null) {
			instancia = new UsuarioDAO();
			listaUsuario = new ArrayList<>();
		}

		return instancia;
	}

	public boolean inserir(Usuario u) {
		if (u != null) {
			listaUsuario.add(u);
			return true;
		}
		return false;
	}
	
	public int login(String email, String senha, Integer confirm) {
	    for (Usuario usuario : listaUsuario) {
	        if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
	            return confirm = 1; // Successful login
	        }
	    }
	    return confirm; // Login failed
	}
}
