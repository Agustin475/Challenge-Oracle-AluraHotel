package src.jdbc.controller;

import src.jdbc.dao.UserDAO;
import src.jdbc.factory.ConnectionFactory;

public class UserController {
	
	private UserDAO userDAO;
	
	public UserController() {
		this.userDAO = new UserDAO(new ConnectionFactory().conectar());
	}
	
	public boolean validarUsuario(String nombreUsuario, String password) {
		return userDAO.existeUsuario(nombreUsuario, password);
	}

}
