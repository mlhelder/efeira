package usuarios;

public class Admin extends Cadastro {

	// Atributos do usuário do sistema
	String username;
	private String password;
	String tipoDeUsuario = "admin";

	public Admin(String login, String senha) {
		this.username = login;
		this.password = senha;
	}

	/**
	 * @return the tipoDeUsuario
	 */
	public String getTipoDeUsuario() {
		return tipoDeUsuario;
	}

	// determina password do usuario
	public String getPassword() {
		return password;
	}

	// retorna password do usuario
	public void setPassword(String passwd) {
		this.password = passwd;
	}

	// retorna nome do usuario
	public String getUsername() {
		return username;
	}

	// determina username do usuario
	public void setUsername(String name) {
		this.username = name;
	}

}
