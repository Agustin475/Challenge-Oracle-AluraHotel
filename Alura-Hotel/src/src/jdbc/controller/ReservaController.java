package src.jdbc.controller;

import java.sql.Date;
import java.util.List;

import src.jdbc.dao.ReservaDAO;
import src.jdbc.factory.ConnectionFactory;
import src.jdbc.modelo.Reserva;

public class ReservaController {
	
	private ReservaDAO reservaDAO;

	public ReservaController() {
		this.reservaDAO = new ReservaDAO(new ConnectionFactory().conectar());
	}

	public void crear(Reserva reserva) {
		reservaDAO.crear(reserva);

	}

	public List<Reserva> listar() {
		return reservaDAO.listar();
	}
	
	public List<Reserva> listar(int id) {
		return reservaDAO.listar(id);
	} 

	public int modificar(Integer id, Date fechaEntrada, Date fechaSalida, double valor, String formaPago, String tipoHabitacion) {
		return reservaDAO.modificar(id, fechaEntrada, fechaSalida, valor, formaPago, tipoHabitacion);
	}
	
	public int eliminar(Integer id) {
		return reservaDAO.eliminar(id);
	}
}
