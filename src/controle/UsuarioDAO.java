package controle;

import java.util.ArrayList;

import modelo.Usuario;

public class UsuarioDAO {

	private static ArrayList<Usuario> TUser;
	
	private static UsuarioDAO FUsuarioDAO;
	
	//Instacia
	public static UsuarioDAO getFUsuarioDAO() {
		if (FUsuarioDAO == null) {
			FUsuarioDAO = new UsuarioDAO();
			TUser    = new ArrayList<>();
		}
		return FUsuarioDAO;
	}
	
	//Insert
	public Boolean insert(Usuario prModel) {
		if(prModel != null) {
			this.TUser.add(prModel);
			return true;
		}
		return false;
	}
	
	
	
	//Select
	public ArrayList<Usuario> getList(){
		return TUser;
	}
	
}