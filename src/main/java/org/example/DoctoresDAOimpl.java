package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

    public class DoctoresDAOimpl implements DoctoresDAO {
        private Connection connection;

        public void DoctoresDAOImpl(String url, String usuario, String contraseña) throws SQLException {
            connection = DriverManager.getConnection(url, usuario, contraseña);
        }

        @Override
        public void crear(Doctores doctores) {
            String sql = "INSERT INTO Doctores (Id_tarjeta, nombre, apellido, telefono, direccion, Especialidad, Universidad) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)){
                statement.setInt(1, doctores.getId_tarjeta());
                statement.setString(2, doctores.getNombre());
                statement.setString(3, doctores.getApellido());
                statement.setString(4, doctores.getTelefono());
                statement.setString(6, doctores.getDireccion());
                statement.setString(7, doctores.getEspecialidad());
                statement.setString(8, doctores.getUniversidad());
                statement.executeUpdate();


            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
}
