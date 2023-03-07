package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Conector;
import modelo.bean.Inscripcion;
import modelo.bean.Usuario;


public class AccesoBBDD extends Conector {
	PreparedStatement pst;

	public void insertarUsuario(Usuario usuario) throws SQLException {


		pst = con.prepareStatement("INSERT INTO usuarios (nombre_apellido,dni,codigo)VALUES (?,?,?)");

		pst.setString(1, usuario.getNombre_apellido());
		pst.setString(2, usuario.getDni());
		pst.setString(3, usuario.getCodigo());
		pst.execute();

	}

	public Usuario getUsuario(int id) {
		Usuario usuario = new Usuario();

		try {
			pst = con.prepareStatement("SELECT * FROM usuarios WHERE id= ?");
			ResultSet resultado = pst.executeQuery();
			resultado.next();
			usuario.setId(resultado.getInt("id"));
			usuario.setNombre_apellido(resultado.getString("nombre_apellido"));
			usuario.setDni(resultado.getString("dni"));
			usuario.setCodigo(resultado.getString("codigo"));


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return usuario;
	}

	public ArrayList<Usuario> getUsuarios(int id) {
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

		try {
			pst = con.prepareStatement("SELECT * FROM usuarios where id=?");
			ResultSet resultado = pst.executeQuery();
			while (resultado.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(resultado.getInt("id"));
				usuario.setNombre_apellido(resultado.getString("nombre_apellido"));
				usuario.setDni(resultado.getString("dni"));
				usuario.setCodigo(resultado.getString("codigo"));

				usuarios.add(usuario);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return usuarios;
	}

	public ArrayList<Usuario> listaUsuariosInscritos(int idAc) {
		ArrayList<Usuario> listaUsuariosInscritos = new ArrayList<Usuario>();
		try {
			pst = con.prepareStatement(
					"SELECT * FROM usuarios join inscripciones on usuarios.id=inscripciones.id_usuario where inscripciones.id_actividad=?");
			pst.setInt(1, idAc);

			ResultSet resultado = pst.executeQuery();

			while (resultado.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(resultado.getInt("id"));
				usuario.setNombre_apellido(resultado.getString("nombre_apellido"));
				usuario.setDni(resultado.getString("dni"));
				usuario.setCodigo(resultado.getString("codigo"));

				listaUsuariosInscritos.add(usuario);

			}

			super.con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listaUsuariosInscritos;
	}

	public ArrayList<Integer> getIdUsuarios(int id_actividad) {

		ArrayList<Integer> idUsuarios = new ArrayList<Integer>();
		try {
			pst = con.prepareStatement("select id_usuario from inscripciones where id_actividad=?");
			pst.setInt(1, id_actividad);
			ResultSet resultado = pst.executeQuery();

			while (resultado.next()) {
				idUsuarios.add(resultado.getInt("id_usuario"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return idUsuarios;
	}

	public Usuario getUsuarioId(int id) {

		Usuario usuario = new Usuario();

		try {
			pst = con.prepareStatement("Select * from usuarios where id=?");

			pst.setInt(1, id);

			ResultSet resultado = pst.executeQuery();
			resultado.next();
			usuario.setId(resultado.getInt("id"));
			usuario.setNombre_apellido(resultado.getString("nombre_apellido"));
			usuario.setDni(resultado.getString("dni"));
			usuario.setCodigo(resultado.getString("codigo"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return usuario;
	}

	public void consultarInscripciones(int id) throws SQLException {

		Inscripcion inscripcion = new Inscripcion();
		pst = con.prepareStatement("select* from usuarios join inscripciones where id_actividad=?");

		pst.setInt(1, inscripcion.getId());

		pst.execute();

	}

	public void modificarDiaSemana(int id, String dias_semana) throws SQLException {



		pst = con.prepareStatement("UPDATE actividades set dias_semana=? where id=?");

		pst.setString(1, dias_semana);
		pst.setInt(2, id);
		pst.executeUpdate();

	}

	public int getIdActividad(String nombreAc) {
		int id_actividad = 0;
		try {
			pst = con.prepareStatement("SELECT id from actividades where nombre=?");
			pst.setString(1, nombreAc);
			ResultSet resultado = pst.executeQuery();
			resultado.next();
			id_actividad = resultado.getInt("id");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return id_actividad;
	}

	
	public int getUsuarioId(String codigo) {
		int id_usuario = 0;
		try {
			pst = con.prepareStatement("select id from usuarios where codigo=?");
			pst.setString(1, codigo);
			ResultSet resultado = pst.executeQuery();
			resultado.next();
			id_usuario = resultado.getInt("id");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return id_usuario;
	}

	public void deleteUsuario(int id_usuario, int id_actividad) {
		try {
			pst = con.prepareStatement("DELETE from inscripciones where id_usuario=? AND id_actividad=?");
			
			pst.setInt(1, id_usuario);
			pst.setInt(2, id_actividad);
			
			pst.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
