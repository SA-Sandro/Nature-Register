package Interfaces_Clases;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author
 * The_9
 */
public class VentanasImagenes extends javax.swing.JFrame {

       private static final long serialVersionUID = 1L;
       public static int currentIndex = 0;
       private static JTable tableOfRecords;
       private static int contador = 1;
       private boolean works = true;
       private static String ruta1;
       private static String nombreCientifico;
       private static String fecha;
       private boolean activado = false;

       public VentanasImagenes() {

	initComponents();
	this.setTitle("Nature Register");
	this.setIconImage(new ImageIcon("..\\src\\Images\\nature register1.png").getImage());
	Toolkit mipantalla = Toolkit.getDefaultToolkit();
	Dimension tamanioPantalla = mipantalla.getScreenSize();
	int alturaPantalla = tamanioPantalla.height;
	int anchoPantalla = tamanioPantalla.width;
	int ventanaAncho = (int) (anchoPantalla / 1.486);
	int ventanaAlto = (int) (alturaPantalla / 1.15);

	this.setPreferredSize(new Dimension(ventanaAncho, ventanaAlto));

	this.setLocationRelativeTo(null);

	this.setResizable(false);

	Icon backIcon = new ImageIcon("..\\src\\Images\\left_arrow_icon_224523.png");
	bBack.setIcon(backIcon);

	Icon nextIcon = new ImageIcon("..\\src\\Images\\right_arrow_icon_224556.png");
	bNext.setIcon(nextIcon);

	Icon saveIcon = new ImageIcon("..\\src\\Images\\save_icon-icons.com_53618.png");
	bSave.setIcon(saveIcon);
       }

       public VentanasImagenes(String ruta, JTable tableRecords) {
	initComponents();
	this.setIconImage(new ImageIcon("..\\src\\Images\\nature register1.png").getImage());
	this.setTitle("Nature Register");
	tableOfRecords = tableRecords;
	ruta1 = ruta;
	Toolkit mipantalla = Toolkit.getDefaultToolkit();
	Dimension tamanioPantalla = mipantalla.getScreenSize();
	int alturaPantalla = tamanioPantalla.height;
	int anchoPantalla = tamanioPantalla.width;
	int ventanaAncho = (int) (anchoPantalla / 1.486);
	int ventanaAlto = (int) (alturaPantalla / 1.15);

	this.setPreferredSize(new Dimension(ventanaAncho, ventanaAlto));

	this.setLocationRelativeTo(null);

	this.setResizable(false);

	ImageIcon iconoImagen = new ImageIcon(ruta);
	Image imagen = iconoImagen.getImage();
	lImagen.setIcon(new ImageIcon(imagen.getScaledInstance(lImagen.getWidth(), lImagen.getHeight(), Image.SCALE_SMOOTH)));

	Icon backIcon = new ImageIcon("..\\src\\Images\\left_arrow_icon_224523.png");
	bBack.setIcon(backIcon);

	Icon nextIcon = new ImageIcon("..\\src\\Images\\right_arrow_icon_224556.png");
	bNext.setIcon(nextIcon);

	Icon saveIcon = new ImageIcon("..\\src\\Images\\save_icon-icons.com_53618.png");
	bSave.setIcon(saveIcon);
       }

       @SuppressWarnings("unchecked")
       // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
       private void initComponents() {

              pMainPane = new javax.swing.JPanel();
              pMarginRight = new javax.swing.JPanel();
              bNext = new javax.swing.JButton();
              bSave = new javax.swing.JButton();
              pMarginLeft = new javax.swing.JPanel();
              bBack = new javax.swing.JButton();
              lImagen = new javax.swing.JLabel();
              pMarginTop = new javax.swing.JPanel();
              pMarginBottom = new javax.swing.JPanel();

              setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
              addWindowListener(new java.awt.event.WindowAdapter() {
                     public void windowOpened(java.awt.event.WindowEvent evt) {
                            formWindowOpened(evt);
                     }
              });
              getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

              pMainPane.setLayout(new java.awt.BorderLayout());

              pMarginRight.setBackground(new java.awt.Color(137, 165, 122));
              pMarginRight.setPreferredSize(new java.awt.Dimension(40, 900));
              pMarginRight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

              bNext.setBackground(new java.awt.Color(255, 255, 255));
              bNext.addActionListener(new java.awt.event.ActionListener() {
                     public void actionPerformed(java.awt.event.ActionEvent evt) {
                            bNextActionPerformed(evt);
                     }
              });
              pMarginRight.add(bNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 30, -1));

              bSave.setBorder(javax.swing.BorderFactory.createEtchedBorder());
              bSave.addActionListener(new java.awt.event.ActionListener() {
                     public void actionPerformed(java.awt.event.ActionEvent evt) {
                            bSaveActionPerformed(evt);
                     }
              });
              pMarginRight.add(bSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

              pMainPane.add(pMarginRight, java.awt.BorderLayout.EAST);

              pMarginLeft.setBackground(new java.awt.Color(137, 165, 122));
              pMarginLeft.setPreferredSize(new java.awt.Dimension(40, 820));
              pMarginLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

              bBack.setBackground(new java.awt.Color(255, 255, 255));
              bBack.addActionListener(new java.awt.event.ActionListener() {
                     public void actionPerformed(java.awt.event.ActionEvent evt) {
                            bBackActionPerformed(evt);
                     }
              });
              pMarginLeft.add(bBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 30, -1));

              pMainPane.add(pMarginLeft, java.awt.BorderLayout.WEST);
              pMainPane.add(lImagen, java.awt.BorderLayout.CENTER);
              lImagen.getAccessibleContext().setAccessibleParent(lImagen);

              pMarginTop.setBackground(new java.awt.Color(137, 165, 122));
              pMarginTop.setPreferredSize(new java.awt.Dimension(1280, 30));
              pMarginTop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
              pMainPane.add(pMarginTop, java.awt.BorderLayout.PAGE_START);

              pMarginBottom.setBackground(new java.awt.Color(137, 165, 122));
              pMarginBottom.setPreferredSize(new java.awt.Dimension(1280, 40));

              javax.swing.GroupLayout pMarginBottomLayout = new javax.swing.GroupLayout(pMarginBottom);
              pMarginBottom.setLayout(pMarginBottomLayout);
              pMarginBottomLayout.setHorizontalGroup(
                     pMarginBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGap(0, 1280, Short.MAX_VALUE)
              );
              pMarginBottomLayout.setVerticalGroup(
                     pMarginBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGap(0, 40, Short.MAX_VALUE)
              );

              pMainPane.add(pMarginBottom, java.awt.BorderLayout.SOUTH);

              getContentPane().add(pMainPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 900));

              pack();
       }// </editor-fold>//GEN-END:initComponents

       private void bBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBackActionPerformed

	activado = true;
	Conection_BD conection = new Conection_BD();
	System.out.println(currentIndex);
	ArrayList<String> listadoURLS = new ArrayList<>();
	listadoURLS = conection.scrollImage();
	int realSize = conection.realSizeAL();

	currentIndex--;
	if (currentIndex < 0) {
	       if (tableOfRecords.getSelectedRow() != 0 && works == true) {
		currentIndex = tableOfRecords.getSelectedRow() - contador;
		contador++;
		System.out.println("estoy aquí" + currentIndex);
		if (currentIndex <= 0) {
		       System.out.println("hola");
		       currentIndex = 0;
		       contador = 1;
		       works = false;
		}
	       } else {
		currentIndex = realSize - 1;
	       }
	}

	works = false;
	ruta1 = listadoURLS.get(currentIndex);
	ImageIcon iconoImagen = new ImageIcon(listadoURLS.get(currentIndex));
	Image imagen = iconoImagen.getImage();
	lImagen.setIcon(new ImageIcon(imagen.getScaledInstance(lImagen.getWidth(), lImagen.getHeight(), Image.SCALE_SMOOTH)));


       }//GEN-LAST:event_bBackActionPerformed

       private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed

	if (!activado == true) {

	       nombreCientifico = (String) tableOfRecords.getValueAt(tableOfRecords.getSelectedRow(), 1);
	       fecha = (String) tableOfRecords.getValueAt(tableOfRecords.getSelectedRow(), 4);

	       String nuevaFecha = fecha.replace("/", "");

	       File sourceFile = null;
	       File destinationFile = null;
	       String newPath = "..\\ImagenesGuardadas";
	       File directorio = new File(newPath);

	       if (!directorio.exists()) {
		directorio.mkdirs();
		JOptionPane.showMessageDialog(this, "Carpeta creada", "Nature Register", JOptionPane.INFORMATION_MESSAGE);
	       }
	       sourceFile = new File(ruta1);
	       String extension = ruta1.substring(ruta1.lastIndexOf('.') + 1);
	       destinationFile = new File(newPath + "\\" + nombreCientifico + "_" + nuevaFecha + "." + extension);
	       try {
		if (!destinationFile.exists()) {
		       Files.copy(sourceFile.toPath(), destinationFile.toPath());
		       JOptionPane.showMessageDialog(this, "Imagen guardada", "Nature Register", JOptionPane.INFORMATION_MESSAGE);
		} else {
		       JOptionPane.showMessageDialog(this, "La imagen ya está guardada", "Nature Register", JOptionPane.WARNING_MESSAGE);
		}
	       } catch (IOException ex) {
		Logger.getLogger(VentanasImagenes.class.getName()).log(Level.SEVERE, null, ex);
	       }
	} else {
	       JOptionPane.showMessageDialog(this, "Para guardar otra imagen, seleccionala desde la tabla", "Nature Register", JOptionPane.WARNING_MESSAGE);
	}

       }//GEN-LAST:event_bSaveActionPerformed

       @SuppressWarnings({"unchecked", "unchecked"})
       private void bNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNextActionPerformed

	activado = true;
	Conection_BD conection = new Conection_BD();
	ArrayList<String> listadoURLS = conection.scrollImage();
	int realSize = conection.realSizeAL();
	System.out.println(realSize);
	currentIndex++;

	if (tableOfRecords.getSelectedRow() > 0 && works == true) {
	       currentIndex = tableOfRecords.getSelectedRow() + contador;
	       System.out.println("Valor selectedRow: " + tableOfRecords.getSelectedRow());
	       System.out.println("Valor contador: " + contador);
	       System.out.println(currentIndex);
	       contador++;
	}
	if (currentIndex >= realSize) {
	       System.out.println("hola");
	       currentIndex = 0;
	       contador = 1;
	       works = false;
	}
	System.out.println(currentIndex);
	System.out.println(listadoURLS.get(currentIndex));
	// Obtener la URL de la imagen en el índice actual
	String imageURL = listadoURLS.get(currentIndex);
	// Cargar la imagen y mostrarla en la etiqueta
	ImageIcon iconoImagen = new ImageIcon(imageURL);
	Image imagen = iconoImagen.getImage();
	lImagen.setIcon(new ImageIcon(imagen.getScaledInstance(lImagen.getWidth(), lImagen.getHeight(), Image.SCALE_SMOOTH)));


       }//GEN-LAST:event_bNextActionPerformed

       private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
	System.out.println("hola");
	currentIndex = 0;
	contador = 1;
       }//GEN-LAST:event_formWindowOpened

       public static void main(String args[]) {
	/* Set the Nimbus look and feel */
	//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
	/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
	 */
	try {
	       for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
		if ("Nimbus".equals(info.getName())) {
		       javax.swing.UIManager.setLookAndFeel(info.getClassName());
		       break;
		}
	       }
	} catch (ClassNotFoundException ex) {
	       java.util.logging.Logger.getLogger(VentanasImagenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	       java.util.logging.Logger.getLogger(VentanasImagenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	       java.util.logging.Logger.getLogger(VentanasImagenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	       java.util.logging.Logger.getLogger(VentanasImagenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(() -> {
	       new VentanasImagenes().setVisible(true);
	});
       }

       // Variables declaration - do not modify//GEN-BEGIN:variables
       private javax.swing.JButton bBack;
       private javax.swing.JButton bNext;
       private javax.swing.JButton bSave;
       private javax.swing.JLabel lImagen;
       private javax.swing.JPanel pMainPane;
       private javax.swing.JPanel pMarginBottom;
       private javax.swing.JPanel pMarginLeft;
       private javax.swing.JPanel pMarginRight;
       private javax.swing.JPanel pMarginTop;
       // End of variables declaration//GEN-END:variables
}
