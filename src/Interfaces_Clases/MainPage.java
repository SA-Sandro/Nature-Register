package Interfaces_Clases;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MainPage extends javax.swing.JFrame {

       static Boolean active = false;
       static ImageIcon iconButtom = null;
       static Conection_BD conexion = new Conection_BD();
       static Font font = new Font("Roboto", 0, 18);
       private static final long serialVersionUID = 1L;

       public MainPage() {
	initComponents();
	this.setTitle("Nature Register");
	//Tamaño y posición pantalla
	Toolkit mipantalla = Toolkit.getDefaultToolkit();
	Dimension tamanioPantalla = mipantalla.getScreenSize();

	int alturaPantalla = tamanioPantalla.height;
	int anchoPantalla = tamanioPantalla.width;
	int ventanaAncho = anchoPantalla / 2;
	int ventanaAlto = alturaPantalla / 2;
	this.setPreferredSize(new Dimension(ventanaAncho, ventanaAlto));
	this.setLocationRelativeTo(null);
	this.setResizable(false);

	Image imagen = new ImageIcon("..\\src\\Images\\fondoMainPage.png").getImage();
	ImageIcon icono = new ImageIcon(imagen.getScaledInstance(lBackground.getWidth(), lBackground.getHeight(), Image.SCALE_SMOOTH));
	lBackground.setIcon(icono);

	Icon addObservaction = new ImageIcon("..\\src\\Images\\add.png");
	bAddObservation.setIcon(addObservaction);

	Icon consultObservation = new ImageIcon("..\\src\\Images\\databasesearch_basededato_12920.png");
	bConsult.setIcon(consultObservation);

	Icon connectBD = new ImageIcon("..\\src\\Images\\connect.png");
	bConnect_Disconnect.setIcon(connectBD);

	Icon logoNatureRegister = new ImageIcon("..\\src\\Images\\nature register.png");
	lTitle.setIcon(logoNatureRegister);

	this.setIconImage(new ImageIcon("..\\src\\Images\\nature register1.png").getImage());
       }

       public MainPage(String nothing) {

	initComponents();

	this.setTitle("Nature Register");
	//Tamaño y posición pantalla
	Toolkit mipantalla = Toolkit.getDefaultToolkit();
	Dimension tamanioPantalla = mipantalla.getScreenSize();
	int alturaPantalla = tamanioPantalla.height;
	int anchoPantalla = tamanioPantalla.width;
	int ventanaAncho = (int) (anchoPantalla / 1.72);
	int ventanaAlto = (int) (alturaPantalla / 1.78);
	this.setPreferredSize(new Dimension(ventanaAncho, ventanaAlto));
	this.setLocationRelativeTo(null);
	this.setResizable(false);

	Image imagen = new ImageIcon("..\\src\\Images\\fondoMainPage.png").getImage();
	ImageIcon icono = new ImageIcon(imagen.getScaledInstance(lBackground.getWidth(), lBackground.getHeight(), Image.SCALE_SMOOTH));
	lBackground.setIcon(icono);

	Icon addObservaction = new ImageIcon("..\\src\\Images\\add.png");
	bAddObservation.setIcon(addObservaction);

	Icon consultObservation = new ImageIcon("..\\src\\Images\\databasesearch_basededato_12920.png");
	bConsult.setIcon(consultObservation);

	Icon connectBD = new ImageIcon("..\\src\\Images\\connect.png");
	bConnect_Disconnect.setIcon(connectBD);

	Icon logoNatureRegister = new ImageIcon("..\\src\\Images\\nature register.png");
	lTitle.setIcon(logoNatureRegister);

	this.setIconImage(new ImageIcon("..\\src\\Images\\nature register1.png").getImage());

	active = true;
	iconButtom = new ImageIcon("..\\src\\Images\\Delete_Database_36927.png");
	bConnect_Disconnect.setIcon(iconButtom);
	bConnect_Disconnect.setFont(font);
	bConnect_Disconnect.setText("Desconectar base de datos");
       }

       @SuppressWarnings("unchecked")
       // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
       private void initComponents() {

              pMainPane = new javax.swing.JPanel();
              lMarginLeft = new javax.swing.JLabel();
              lMarginRight = new javax.swing.JLabel();
              lMarginBot = new javax.swing.JLabel();
              lMarginTop = new javax.swing.JLabel();
              pCenterPane = new javax.swing.JPanel();
              pButtomsPane = new javax.swing.JPanel();
              bAddObservation = new javax.swing.JButton();
              bConsult = new javax.swing.JButton();
              bConnect_Disconnect = new javax.swing.JButton();
              lBackground = new javax.swing.JLabel();
              lTitle = new javax.swing.JLabel();

              setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
              setTitle("Nature Register");
              setBackground(new java.awt.Color(255, 255, 255));
              setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

              pMainPane.setBackground(new java.awt.Color(255, 255, 255));
              pMainPane.setLayout(new java.awt.BorderLayout());
              pMainPane.add(lMarginLeft, java.awt.BorderLayout.WEST);
              pMainPane.add(lMarginRight, java.awt.BorderLayout.EAST);
              pMainPane.add(lMarginBot, java.awt.BorderLayout.SOUTH);
              pMainPane.add(lMarginTop, java.awt.BorderLayout.NORTH);

              pCenterPane.setBackground(new java.awt.Color(255, 255, 255));
              pCenterPane.setForeground(new java.awt.Color(0, 102, 0));
              pCenterPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

              pButtomsPane.setOpaque(false);
              pButtomsPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

              bAddObservation.setBackground(new java.awt.Color(82, 175, 113));
              bAddObservation.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
              bAddObservation.setForeground(new java.awt.Color(255, 255, 255));
              bAddObservation.setText("  Añadir observaciones");
              bAddObservation.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
              bAddObservation.addActionListener(new java.awt.event.ActionListener() {
                     public void actionPerformed(java.awt.event.ActionEvent evt) {
                            bAddObservationActionPerformed(evt);
                     }
              });
              pButtomsPane.add(bAddObservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 290, 60));

              bConsult.setBackground(new java.awt.Color(82, 175, 113));
              bConsult.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
              bConsult.setForeground(new java.awt.Color(255, 255, 255));
              bConsult.setText("   Consultar registros");
              bConsult.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
              bConsult.setPreferredSize(new java.awt.Dimension(203, 31));
              bConsult.addActionListener(new java.awt.event.ActionListener() {
                     public void actionPerformed(java.awt.event.ActionEvent evt) {
                            bConsultActionPerformed(evt);
                     }
              });
              pButtomsPane.add(bConsult, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 290, 60));

              bConnect_Disconnect.setBackground(new java.awt.Color(82, 175, 113));
              bConnect_Disconnect.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
              bConnect_Disconnect.setForeground(new java.awt.Color(255, 255, 255));
              bConnect_Disconnect.setText("Conectar a la base de datos");
              bConnect_Disconnect.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
              bConnect_Disconnect.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
              bConnect_Disconnect.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
              bConnect_Disconnect.addActionListener(new java.awt.event.ActionListener() {
                     public void actionPerformed(java.awt.event.ActionEvent evt) {
                            bConnect_DisconnectActionPerformed(evt);
                     }
              });
              pButtomsPane.add(bConnect_Disconnect, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 290, 90));

              pCenterPane.add(pButtomsPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 610, 580));

              lBackground.setBackground(new java.awt.Color(204, 204, 255));
              pCenterPane.add(lBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 590, 570));

              lTitle.setBackground(new java.awt.Color(255, 255, 255));
              lTitle.setFont(new java.awt.Font("Roboto Bk", 1, 24)); // NOI18N
              lTitle.setForeground(new java.awt.Color(255, 255, 255));
              lTitle.setText("¡BIENVENIDO A NATURE REGISTER!");
              pCenterPane.add(lTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 560));

              pMainPane.add(pCenterPane, java.awt.BorderLayout.CENTER);

              getContentPane().add(pMainPane, java.awt.BorderLayout.CENTER);

              pack();
       }// </editor-fold>//GEN-END:initComponents

       private void bConnect_DisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConnect_DisconnectActionPerformed

	if (active == false) {
	       conexion.connect();
	       active = true;
	       iconButtom = new ImageIcon("..\\src\\Images\\Delete_Database_36927.png");
	       bConnect_Disconnect.setIcon(iconButtom);
	       bConnect_Disconnect.setFont(font);
	       bConnect_Disconnect.setText("Desconectar base de datos");

	} else {
	       conexion.close();
	       iconButtom = new ImageIcon("..\\src\\Images\\connect.png");
	       bConnect_Disconnect.setIcon(iconButtom);
	       bConnect_Disconnect.setFont(font);
	       bConnect_Disconnect.setText("Conectar base de datos");
	       active = false;
	}

       }//GEN-LAST:event_bConnect_DisconnectActionPerformed

       private void bAddObservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddObservationActionPerformed

	if (active == true) {
	       AddRecord añadirRegistros = new AddRecord();
	       añadirRegistros.setVisible(true);
	       this.setVisible(false);
	} else {
	       JOptionPane.showMessageDialog(this, "No puedes añadir registros si no te"
		 + " has conectado a la base de datos previamente", "Nature Register", JOptionPane.ERROR_MESSAGE);
	}
       }//GEN-LAST:event_bAddObservationActionPerformed

       private void bConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultActionPerformed

	if (active == true) {
	       Consult consultarRegistros = new Consult();
	       consultarRegistros.setVisible(true);
	       this.setVisible(false);
	} else {
	       JOptionPane.showMessageDialog(this, "No puedes consultar tus registros si no te"
		 + " has conectado a la base de datos previamente", "Nature Register", JOptionPane.ERROR_MESSAGE);
	}
       }//GEN-LAST:event_bConsultActionPerformed

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
	       java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	       java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	       java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	       java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(() -> {
	       new MainPage().setVisible(true);
	});
       }

       // Variables declaration - do not modify//GEN-BEGIN:variables
       private javax.swing.JButton bAddObservation;
       private javax.swing.JButton bConnect_Disconnect;
       private javax.swing.JButton bConsult;
       private javax.swing.JLabel lBackground;
       private javax.swing.JLabel lMarginBot;
       private javax.swing.JLabel lMarginLeft;
       private javax.swing.JLabel lMarginRight;
       private javax.swing.JLabel lMarginTop;
       private javax.swing.JLabel lTitle;
       private javax.swing.JPanel pButtomsPane;
       private javax.swing.JPanel pCenterPane;
       private javax.swing.JPanel pMainPane;
       // End of variables declaration//GEN-END:variables
}
