package Interfaces_Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Conection_BD {

       public static final String registro = "CREATE TABLE IF NOT EXISTS REGISTRO("
	 + "id_registro integer primary key autoincrement,"
	 + "nombreCientifico VARCHAR2(30),"
	 + "familia VARCHAR2 (30),"
	 + "orden VARCHAR2 (30),"
	 + "fecha VARCHAR2 (30),"
	 + "lugarObservacion VARCHAR2 (30),"
	 + "localidad VARCHAR2 (30),"
	 + "provincia VARCHAR2 (30),"
	 + "coordenadas VARCHAR2 (30),"
	 + "URLImagen VARCHAR2 (300))";

       private final String ruta = ".//observacionesBD.sqlite";
       public static Connection bd;
       private static int contador = 0;
       public static ArrayList<String> listadoURLS = null;

       public void connect() {
	try {

	       bd = DriverManager.getConnection("jdbc:sqlite:" + ruta);
	       JOptionPane.showMessageDialog(null, "Te has conectado a la base de datos", "SQLITE", JOptionPane.INFORMATION_MESSAGE);
	} catch (SQLException ex) {
	       JOptionPane.showMessageDialog(null, "Ha habido algun error", "SQLITE", JOptionPane.ERROR_MESSAGE);
	}
       }

       public void close() {

	try {
	       bd.close();
	       JOptionPane.showMessageDialog(null, "Te has desconectado de la base de datos", "SQLITE", JOptionPane.INFORMATION_MESSAGE);
	} catch (SQLException ex) {
	       Logger.getLogger(Conection_BD.class.getName()).log(Level.SEVERE, null, ex);
	}
       }

       public void createTable() {

	Statement stmt = null;
	try {
	       stmt = bd.createStatement();
	       stmt.executeUpdate(registro);

	} catch (SQLException ex) {
	       Logger.getLogger(Conection_BD.class.getName()).log(Level.SEVERE, null, ex);
	}
       }

       public void saveRecord(Registros registro) {
	PreparedStatement st = null;
	try {
	       st = bd.prepareStatement("insert into REGISTRO (nombreCientifico,familia,orden,fecha,lugarObservacion,localidad,provincia,"
		 + "coordenadas,URLImagen) VALUES (?,?,?,?,?,?,?,?,?)");
	       st.setString(1, registro.getNombreCientifico());
	       st.setString(2, registro.getFamilia());
	       st.setString(3, registro.getOrden());
	       st.setString(4, registro.getFecha());
	       st.setString(5, registro.getLugarObservacion());
	       st.setString(6, registro.getLocalidad());
	       st.setString(7, registro.getProvincia());
	       st.setString(8, registro.getCoordenadas());
	       st.setString(9, registro.getURLImagen());

	       st.execute();
	} catch (SQLException ex) {
	       Logger.getLogger(Conection_BD.class.getName()).log(Level.SEVERE, null, ex);
	}
       }

       public String showImage(JTable tableRecords) {
	ResultSet result = null;
	String url = "";
	try {
	       String idRecord = String.valueOf(tableRecords.getValueAt(tableRecords.getSelectedRow(), 0));
	       int integerIdRecord = Integer.parseInt(idRecord);
	       PreparedStatement st = bd.prepareStatement("Select * from REGISTRO WHERE id_registro=?");
	       st.setInt(1, integerIdRecord);
	       result = st.executeQuery();
	       while (result.next()) {
		url = result.getString("URLImagen");
		return url;
	       }

	} catch (SQLException ex) {
	       Logger.getLogger(Conection_BD.class.getName()).log(Level.SEVERE, null, ex);
	}
	return url;

       }

       public ArrayList<String> scrollImage() {
	return listadoURLS;
       }

       public int realSizeAL() {
	return getContador();
       }

       public int showRecords(JTable tableRecords, String nombreCientifico, String familia, String orden, String localidad, String provincia, String fecha) {

	int numberRecords = 0;
	PreparedStatement st = null;
	PreparedStatement ps = null;
	ResultSet result = null;
	ResultSet result1 = null;
	String url;
	try {

	       DefaultTableModel modelo = (DefaultTableModel) tableRecords.getModel();

	       if (nombreCientifico.equalsIgnoreCase("") && familia.equalsIgnoreCase("") && orden.equalsIgnoreCase("") && localidad.equalsIgnoreCase("") && provincia.equalsIgnoreCase("") && fecha.equalsIgnoreCase("")) {
		st = bd.prepareStatement("Select * from REGISTRO");
		ps = bd.prepareStatement("Select * from REGISTRO");
	       } else if (!nombreCientifico.equalsIgnoreCase("")) {
		st = bd.prepareStatement("Select * from REGISTRO WHERE nombreCientifico=?");
		st.setString(1, nombreCientifico);
		ps = bd.prepareStatement("Select URLImagen from REGISTRO WHERE nombreCientifico=?");
		ps.setString(1, nombreCientifico);
	       } else if (!familia.equalsIgnoreCase("")) {
		st = bd.prepareStatement("Select * from REGISTRO WHERE familia=?");
		st.setString(1, familia);
		ps = bd.prepareStatement("Select URLImagen from REGISTRO WHERE familia=?");
		ps.setString(1, familia);
	       } else if (!orden.equalsIgnoreCase("")) {
		st = bd.prepareStatement("Select * from REGISTRO WHERE orden=?");
		st.setString(1, orden);
		ps = bd.prepareStatement("Select URLImagen from REGISTRO WHERE orden=?");
		ps.setString(1, orden);
	       } else if (!fecha.equalsIgnoreCase("")) {
		st = bd.prepareStatement("Select * from REGISTRO WHERE fecha=?");
		st.setString(1, fecha);
		ps = bd.prepareStatement("Select URLImagen from REGISTRO WHERE fecha=?");
		ps.setString(1, fecha);
	       } else if (!localidad.equalsIgnoreCase("")) {
		st = bd.prepareStatement("Select * from REGISTRO WHERE localidad=?");
		st.setString(1, localidad);
		ps = bd.prepareStatement("Select URLImagen from REGISTRO WHERE localidad=?");
		ps.setString(1, localidad);
	       } else if (!provincia.equalsIgnoreCase("")) {
		st = bd.prepareStatement("Select * from REGISTRO WHERE provincia=?");
		st.setString(1, provincia);
		ps = bd.prepareStatement("Select URLImagen from REGISTRO WHERE provincia=?");
		ps.setString(1, provincia);
	       }
	       //fecha
	       if (!nombreCientifico.equalsIgnoreCase("") && !fecha.equalsIgnoreCase("")) {
		st = bd.prepareStatement("Select * from REGISTRO WHERE nombreCientifico=? AND fecha=?");
		ps = bd.prepareStatement("Select URLImagen from REGISTRO WHERE nombreCientifico=? AND fecha=?");
		st.setString(1, nombreCientifico);
		st.setString(2, fecha);
		ps.setString(1, nombreCientifico);
		ps.setString(2, fecha);
	       } else if (!familia.equalsIgnoreCase("") && !fecha.equalsIgnoreCase("")) {
		st = bd.prepareStatement("Select * from REGISTRO WHERE familia=? AND fecha=?");
		ps = bd.prepareStatement("Select URLImagen from REGISTRO WHERE familia=? AND fecha=?");
		st.setString(1, familia);
		st.setString(2, fecha);
		ps.setString(1, familia);
		ps.setString(2, fecha);
	       } else if (!orden.equalsIgnoreCase("") && !fecha.equalsIgnoreCase("")) {
		st = bd.prepareStatement("Select * from REGISTRO WHERE orden=? AND fecha=?");
		ps = bd.prepareStatement("Select URLImagen from REGISTRO WHERE orden=? AND fecha=?");
		st.setString(1, orden);
		st.setString(2, fecha);
		ps.setString(1, orden);
		ps.setString(2, fecha);
	       } else if (!localidad.equalsIgnoreCase("") && !fecha.equalsIgnoreCase("")) {
		st = bd.prepareStatement("Select * from REGISTRO WHERE localidad=? AND fecha=?");
		ps = bd.prepareStatement("Select URLImagen from REGISTRO WHERE localidad=? AND fecha=?");
		st.setString(1, localidad);
		st.setString(2, fecha);
		ps.setString(1, localidad);
		ps.setString(2, fecha);
	       } else if (!provincia.equalsIgnoreCase("") && !fecha.equalsIgnoreCase("")) {
		st = bd.prepareStatement("Select * from REGISTRO WHERE provincia=? AND fecha=?");
		ps = bd.prepareStatement("Select URLImagen from REGISTRO WHERE provincia=? AND fecha=?");
		st.setString(1, provincia);
		st.setString(2, fecha);
		ps.setString(1, provincia);
		ps.setString(2, fecha);
	       }
	       //localidad
	       if (!nombreCientifico.equalsIgnoreCase("") && !localidad.equalsIgnoreCase("")) {
		st = bd.prepareStatement("Select * from REGISTRO WHERE nombreCientifico=? AND localidad=?");
		ps = bd.prepareStatement("Select URLImagen from REGISTRO WHERE nombreCientifico=? AND localidad=?");
		st.setString(1, nombreCientifico);
		st.setString(2, localidad);
		ps.setString(1, nombreCientifico);
		ps.setString(2, localidad);
	       } else if (!familia.equalsIgnoreCase("") && !localidad.equalsIgnoreCase("")) {
		st = bd.prepareStatement("Select * from REGISTRO WHERE familia=? AND localidad=?");
		ps = bd.prepareStatement("Select URLImagen from REGISTRO WHERE familia=? AND localidad=?");
		st.setString(1, familia);
		st.setString(2, localidad);
		ps.setString(1, familia);
		ps.setString(2, localidad);
	       } else if (!orden.equalsIgnoreCase("") && !localidad.equalsIgnoreCase("")) {
		st = bd.prepareStatement("Select * from REGISTRO WHERE orden=? AND localidad=?");
		ps = bd.prepareStatement("Select URLImagen from REGISTRO WHERE orden=? AND localidad=?");
		st.setString(1, orden);
		st.setString(2, localidad);
		ps.setString(1, orden);
		ps.setString(2, localidad);
	       } else if (!provincia.equalsIgnoreCase("") && !localidad.equalsIgnoreCase("")) {
		st = bd.prepareStatement("Select * from REGISTRO WHERE provincia=? AND localidad=?");
		ps = bd.prepareStatement("Select URLImagen from REGISTRO WHERE provincia=? AND localidad=?");
		st.setString(1, provincia);
		st.setString(2, localidad);
		ps.setString(1, provincia);
		ps.setString(2, localidad);
	       }
	       //provincia
	       if (!nombreCientifico.equalsIgnoreCase("") && !provincia.equalsIgnoreCase("")) {
		st = bd.prepareStatement("Select * from REGISTRO WHERE nombreCientifico=? AND provincia=?");
		ps = bd.prepareStatement("Select URLImagen from REGISTRO WHERE nombreCientifico=? AND provincia=?");
		st.setString(1, nombreCientifico);
		st.setString(2, provincia);
		ps.setString(1, nombreCientifico);
		ps.setString(2, provincia);
	       } else if (!familia.equalsIgnoreCase("") && !provincia.equalsIgnoreCase("")) {
		st = bd.prepareStatement("Select * from REGISTRO WHERE familia=? AND provincia=?");
		ps = bd.prepareStatement("Select URLImagen from REGISTRO WHERE familia=? AND provincia=?");
		st.setString(1, familia);
		st.setString(2, provincia);
		ps.setString(1, familia);
		ps.setString(2, provincia);
	       } else if (!orden.equalsIgnoreCase("") && !provincia.equalsIgnoreCase("")) {
		st = bd.prepareStatement("Select * from REGISTRO WHERE orden=? AND provincia=?");
		ps = bd.prepareStatement("Select URLImagen from REGISTRO WHERE orden=? AND provincia=?");
		st.setString(1, orden);
		st.setString(2, provincia);
		ps.setString(1, orden);
		ps.setString(2, provincia);
	       }
	       //familia
	       if (!nombreCientifico.equalsIgnoreCase("") && !familia.equalsIgnoreCase("")) {
		st = bd.prepareStatement("Select * from REGISTRO WHERE nombreCientifico=? AND familia=?");
		ps = bd.prepareStatement("Select URLImagen from REGISTRO WHERE nombreCientifico=? AND familia=?");
		st.setString(1, nombreCientifico);
		st.setString(2, familia);
		ps.setString(1, nombreCientifico);
		ps.setString(2, familia);
	       } else if (!orden.equalsIgnoreCase("") && !familia.equalsIgnoreCase("")) {
		st = bd.prepareStatement("Select * from REGISTRO WHERE orden=? AND familia=?");
		ps = bd.prepareStatement("Select URLImagen from REGISTRO WHERE orden=? AND familia=?");
		st.setString(1, orden);
		st.setString(2, familia);
		ps.setString(1, orden);
		ps.setString(2, familia);
	       }
	       //orden
	       if (!nombreCientifico.equalsIgnoreCase("") && !orden.equalsIgnoreCase("")) {
		st = bd.prepareStatement("Select * from REGISTRO WHERE nombreCientifico=? AND orden=?");
		ps = bd.prepareStatement("Select URLImagen from REGISTRO WHERE nombreCientifico=? AND orden=?");
		st.setString(1, nombreCientifico);
		st.setString(2, orden);
		ps.setString(1, nombreCientifico);
		ps.setString(2, orden);
	       }

	       result = st.executeQuery();
	       result1 = ps.executeQuery();

	       while (result.next()) {

		String vid = Integer.toString(result.getInt("id_registro"));
		String vnombreCientifico = result.getString("nombreCientifico");
		String vfamilia = result.getString("familia");
		String vorden = result.getString("orden");
		String vfecha = result.getString("fecha");
		String vlugarObservacion = result.getString("lugarObservacion");
		String vlocalidad = result.getString("localidad");
		String vprovincia = result.getString("provincia");
		String vcoordenadas = result.getString("coordenadas");

		String[] array = {vid, vnombreCientifico, vfamilia, vorden, vfecha, vlugarObservacion, vlocalidad, vprovincia, vcoordenadas};
		modelo.addRow(array);
		numberRecords++;
	       }
	       listadoURLS = new ArrayList<>();
	       setContador(0);
	       while (result1.next()) {
		setContador(getContador() + 1);
		url = result1.getString("URLImagen");
		listadoURLS.add(url);
	       }

	} catch (SQLException ex) {
	       Logger.getLogger(Conection_BD.class.getName()).log(Level.SEVERE, null, ex);
	}
	return numberRecords;
       }

       public void removeSelectedRow(JTable tableRecords) {

	try {

	       String idRecord = String.valueOf(tableRecords.getValueAt(tableRecords.getSelectedRow(), 0));
	       int integerIdRecord = Integer.parseInt(idRecord);
	       System.out.println(integerIdRecord);
	       PreparedStatement st = bd.prepareStatement("DELETE FROM REGISTRO WHERE id_registro ='" + integerIdRecord + "'");
//	       st.setInt(1, integerIdRecord);
	       int rowsDeleted = st.executeUpdate();
	       if (rowsDeleted > 0) {
		JOptionPane.showMessageDialog(null, "El registro ha sido eliminado correctamente", "SQLITE", JOptionPane.INFORMATION_MESSAGE);
	       }
	} catch (SQLException ex) {
	       Logger.getLogger(Conection_BD.class.getName()).log(Level.SEVERE, null, ex);
	}

       }

       public void updateSelectedRow(JTable tableRecords) {
	DefaultTableModel modelo = (DefaultTableModel) tableRecords.getModel();
	if (tableRecords.getSelectedRow() >= 0) {
	       String familia = String.valueOf(modelo.getValueAt(tableRecords.getSelectedRow(), 2));
	       String nombreCientifico = String.valueOf(modelo.getValueAt(tableRecords.getSelectedRow(), 1));
	       String orden = String.valueOf(modelo.getValueAt(tableRecords.getSelectedRow(), 3));
	       String fecha = String.valueOf(modelo.getValueAt(tableRecords.getSelectedRow(), 4));
	       String lugarObservacion = String.valueOf(modelo.getValueAt(tableRecords.getSelectedRow(), 5));
	       String localidad = String.valueOf(modelo.getValueAt(tableRecords.getSelectedRow(), 6));
	       String provincia = String.valueOf(modelo.getValueAt(tableRecords.getSelectedRow(), 7));

	       String idRecord = String.valueOf(modelo.getValueAt(tableRecords.getSelectedRow(), 0));
	       int integerIdRecord = Integer.parseInt(idRecord);

	       try {
		PreparedStatement st = bd.prepareStatement("UPDATE REGISTRO SET nombreCientifico=?,familia=?,orden=?, fecha=?,lugarObservacion=?,localidad=?,provincia=?  WHERE id_registro=?");
		st.setString(1, nombreCientifico);
		st.setString(2, familia);
		st.setString(3, orden);
		st.setString(4, fecha);
		st.setString(5, lugarObservacion);
		st.setString(6, localidad);
		st.setString(7, provincia);
		st.setInt(8, integerIdRecord);

		st.executeUpdate();
	       } catch (SQLException ex) {
		Logger.getLogger(Conection_BD.class.getName()).log(Level.SEVERE, null, ex);
	       }
	} else {
	       JOptionPane.showMessageDialog(null, "No has seleccionado ninguna fila", "Nature Register", JOptionPane.WARNING_MESSAGE);
	}
       }

       /**
        * @return
        * the
        * contador
        */
       public static int getContador() {
	return contador;
       }

       /**
        * @param
        * aContador
        * the
        * contador
        * to
        * set
        */
       public static void setContador(int aContador) {
	contador = aContador;
       }

}
