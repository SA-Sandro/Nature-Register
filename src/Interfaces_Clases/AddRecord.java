package Interfaces_Clases;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;

public final class AddRecord extends javax.swing.JFrame {

       private static final long serialVersionUID = 1L;

       public AddRecord() {

	initComponents();

	this.setTitle("Nature Register");
	Toolkit mipantalla = Toolkit.getDefaultToolkit();
	Dimension tamanioPantalla = mipantalla.getScreenSize();
	int alturaPantalla = tamanioPantalla.height;
	int anchoPantalla = tamanioPantalla.width;
	int ventanaAncho = (int) (anchoPantalla / 2.8);
	int ventanaAlto = (int) (alturaPantalla / 0.33);
	this.setPreferredSize(new Dimension(ventanaAncho, ventanaAlto));
	this.setLocationRelativeTo(null);

	this.setResizable(false);

	addPlaceHolderToTxtFields();

	Icon returnIcon = new ImageIcon("..\\src\\Images\\arrowbackoutline_110825.png");
	bReturn.setIcon(returnIcon);

	Icon accessIcon = new ImageIcon("..\\src\\Images\\carpeta.png");
	bImageAccess.setIcon(accessIcon);

	this.setIconImage(new ImageIcon("..\\src\\Images\\nature register1.png").getImage());
       }

       public void addPlaceHolderToTxtFields() {
	TextPrompt txtP = null;
	txtP = new TextPrompt("Escribe aquí...", txScientificName);
	txtP = new TextPrompt("Escribe aquí...", txFamily);
	txtP = new TextPrompt("Escribe aquí...", txOrden);
	txtP = new TextPrompt("Escribe aquí...", txProvince);
	txtP = new TextPrompt("Escribe aquí...", txCoordenates);
	txtP = new TextPrompt("Escribe aquí...", txURL);
	txtP = new TextPrompt("Escribe aquí...", txLocation);
	txtP = new TextPrompt("Escribe aquí...", txObservationPlace);
       }

       @SuppressWarnings("unchecked")
       // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
       private void initComponents() {

              pMainPane = new javax.swing.JPanel();
              pSouthPane = new javax.swing.JPanel();
              bRegister = new javax.swing.JButton();
              bClean = new javax.swing.JButton();
              bReturn = new javax.swing.JButton();
              pTopPane = new javax.swing.JPanel();
              lTopText = new javax.swing.JLabel();
              pInformation = new javax.swing.JPanel();
              lScientificName = new javax.swing.JLabel();
              txScientificName = new javax.swing.JTextField();
              lFamily = new javax.swing.JLabel();
              txFamily = new javax.swing.JTextField();
              lOrden = new javax.swing.JLabel();
              txOrden = new javax.swing.JTextField();
              lDate = new javax.swing.JLabel();
              lObservationPlace = new javax.swing.JLabel();
              txObservationPlace = new javax.swing.JTextField();
              lLocation = new javax.swing.JLabel();
              txLocation = new javax.swing.JTextField();
              lProvince = new javax.swing.JLabel();
              txProvince = new javax.swing.JTextField();
              lCoordenates = new javax.swing.JLabel();
              txCoordenates = new javax.swing.JTextField();
              lURL = new javax.swing.JLabel();
              txURL = new javax.swing.JTextField();
              bImageAccess = new javax.swing.JButton();
              dchDate = new com.toedter.calendar.JDateChooser();
              pMarginRight = new javax.swing.JPanel();
              pMarginLeft = new javax.swing.JPanel();

              setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
              setIconImage(getIconImage());

              pMainPane.setBackground(new java.awt.Color(255, 255, 255));
              pMainPane.setLayout(new java.awt.BorderLayout());

              pSouthPane.setBackground(new java.awt.Color(255, 255, 255));
              pSouthPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 1, true));

              bRegister.setBackground(new java.awt.Color(76, 156, 64));
              bRegister.setFont(new java.awt.Font("Roboto Bk", 1, 18)); // NOI18N
              bRegister.setForeground(new java.awt.Color(255, 255, 255));
              bRegister.setText("Registrar observación");
              bRegister.setOpaque(false);
              bRegister.setPreferredSize(new java.awt.Dimension(139, 50));
              bRegister.addActionListener(new java.awt.event.ActionListener() {
                     public void actionPerformed(java.awt.event.ActionEvent evt) {
                            bRegisterActionPerformed(evt);
                     }
              });

              bClean.setBackground(new java.awt.Color(76, 156, 64));
              bClean.setFont(new java.awt.Font("Roboto Bk", 1, 18)); // NOI18N
              bClean.setForeground(new java.awt.Color(255, 255, 255));
              bClean.setText("Limpiar");
              bClean.setPreferredSize(new java.awt.Dimension(65, 50));
              bClean.addActionListener(new java.awt.event.ActionListener() {
                     public void actionPerformed(java.awt.event.ActionEvent evt) {
                            bCleanActionPerformed(evt);
                     }
              });

              bReturn.setBackground(new java.awt.Color(76, 156, 64));
              bReturn.setFont(new java.awt.Font("Roboto Bk", 1, 18)); // NOI18N
              bReturn.setForeground(new java.awt.Color(255, 255, 255));
              bReturn.setPreferredSize(new java.awt.Dimension(53, 40));
              bReturn.addActionListener(new java.awt.event.ActionListener() {
                     public void actionPerformed(java.awt.event.ActionEvent evt) {
                            bReturnActionPerformed(evt);
                     }
              });

              javax.swing.GroupLayout pSouthPaneLayout = new javax.swing.GroupLayout(pSouthPane);
              pSouthPane.setLayout(pSouthPaneLayout);
              pSouthPaneLayout.setHorizontalGroup(
                     pSouthPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSouthPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(bReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                            .addComponent(bClean, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(bRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(119, 119, 119))
              );
              pSouthPaneLayout.setVerticalGroup(
                     pSouthPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSouthPaneLayout.createSequentialGroup()
                            .addContainerGap(29, Short.MAX_VALUE)
                            .addGroup(pSouthPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                   .addComponent(bClean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(bRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(28, 28, 28))
                     .addGroup(pSouthPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(bReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
              );

              pMainPane.add(pSouthPane, java.awt.BorderLayout.SOUTH);

              pTopPane.setBackground(new java.awt.Color(115, 217, 99));
              pTopPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
              pTopPane.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
              pTopPane.setMinimumSize(new java.awt.Dimension(283, 100));
              pTopPane.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 30));

              lTopText.setBackground(new java.awt.Color(255, 255, 255));
              lTopText.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
              lTopText.setForeground(new java.awt.Color(255, 255, 255));
              lTopText.setText("¡AÑADE TUS OBSERVACIONES!");
              pTopPane.add(lTopText);

              pMainPane.add(pTopPane, java.awt.BorderLayout.NORTH);

              pInformation.setBackground(new java.awt.Color(255, 255, 255));
              pInformation.setPreferredSize(new java.awt.Dimension(685, 540));

              lScientificName.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
              lScientificName.setText("Nombre científico: ");

              txScientificName.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

              lFamily.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
              lFamily.setText("Familia: ");

              txFamily.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

              lOrden.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
              lOrden.setText("Orden: ");

              txOrden.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

              lDate.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
              lDate.setText("Fecha: ");

              lObservationPlace.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
              lObservationPlace.setText("Lugar de Observación: ");

              txObservationPlace.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

              lLocation.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
              lLocation.setText("Localidad: ");

              txLocation.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

              lProvince.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
              lProvince.setText("Provincia: ");

              txProvince.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

              lCoordenates.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
              lCoordenates.setText("Coordenadas: ");

              txCoordenates.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

              lURL.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
              lURL.setText("URL de la imagen: ");

              txURL.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

              bImageAccess.setForeground(new java.awt.Color(153, 255, 102));
              bImageAccess.setBorder(null);
              bImageAccess.addActionListener(new java.awt.event.ActionListener() {
                     public void actionPerformed(java.awt.event.ActionEvent evt) {
                            bImageAccessActionPerformed(evt);
                     }
              });

              dchDate.setBackground(new java.awt.Color(255, 255, 255));
              dchDate.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

              javax.swing.GroupLayout pInformationLayout = new javax.swing.GroupLayout(pInformation);
              pInformation.setLayout(pInformationLayout);
              pInformationLayout.setHorizontalGroup(
                     pInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(pInformationLayout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addGroup(pInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                   .addGroup(pInformationLayout.createSequentialGroup()
                                          .addComponent(lOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(txOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addGap(24, 24, 24)
                                          .addComponent(lDate)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(dchDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                   .addGroup(pInformationLayout.createSequentialGroup()
                                          .addComponent(lProvince)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                          .addComponent(txProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                                   .addGroup(pInformationLayout.createSequentialGroup()
                                          .addComponent(lScientificName)
                                          .addGap(18, 18, 18)
                                          .addComponent(txScientificName, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                                   .addGroup(pInformationLayout.createSequentialGroup()
                                          .addComponent(lFamily, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(txFamily, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                   .addGroup(pInformationLayout.createSequentialGroup()
                                          .addComponent(lLocation)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                          .addComponent(txLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                                   .addGroup(pInformationLayout.createSequentialGroup()
                                          .addComponent(lCoordenates)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                          .addComponent(txCoordenates, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                                   .addGroup(pInformationLayout.createSequentialGroup()
                                          .addComponent(lObservationPlace)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                          .addComponent(txObservationPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                                   .addGroup(pInformationLayout.createSequentialGroup()
                                          .addComponent(lURL)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(txURL, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                          .addComponent(bImageAccess, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(49, Short.MAX_VALUE))
              );
              pInformationLayout.setVerticalGroup(
                     pInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(pInformationLayout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addGroup(pInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                   .addComponent(lScientificName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(txScientificName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(pInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                   .addComponent(lFamily, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(txFamily, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(pInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                   .addComponent(lOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(txOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(lDate)
                                   .addComponent(dchDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(pInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                   .addComponent(lObservationPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(txObservationPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(pInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                   .addComponent(lLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(txLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(pInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                   .addComponent(lProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(txProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(pInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                   .addComponent(lCoordenates, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(txCoordenates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(38, 38, 38)
                            .addGroup(pInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(pInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(lURL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(txURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                   .addComponent(bImageAccess, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(52, Short.MAX_VALUE))
              );

              pMainPane.add(pInformation, java.awt.BorderLayout.CENTER);

              pMarginRight.setBackground(new java.awt.Color(0, 153, 0));

              javax.swing.GroupLayout pMarginRightLayout = new javax.swing.GroupLayout(pMarginRight);
              pMarginRight.setLayout(pMarginRightLayout);
              pMarginRightLayout.setHorizontalGroup(
                     pMarginRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGap(0, 20, Short.MAX_VALUE)
              );
              pMarginRightLayout.setVerticalGroup(
                     pMarginRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGap(0, 555, Short.MAX_VALUE)
              );

              pMainPane.add(pMarginRight, java.awt.BorderLayout.EAST);

              pMarginLeft.setBackground(new java.awt.Color(0, 153, 0));

              javax.swing.GroupLayout pMarginLeftLayout = new javax.swing.GroupLayout(pMarginLeft);
              pMarginLeft.setLayout(pMarginLeftLayout);
              pMarginLeftLayout.setHorizontalGroup(
                     pMarginLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGap(0, 20, Short.MAX_VALUE)
              );
              pMarginLeftLayout.setVerticalGroup(
                     pMarginLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGap(0, 555, Short.MAX_VALUE)
              );

              pMainPane.add(pMarginLeft, java.awt.BorderLayout.WEST);

              javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
              getContentPane().setLayout(layout);
              layout.setHorizontalGroup(
                     layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGap(0, 685, Short.MAX_VALUE)
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pMainPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE))
              );
              layout.setVerticalGroup(
                     layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGap(0, 771, Short.MAX_VALUE)
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pMainPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
              );

              pack();
       }// </editor-fold>//GEN-END:initComponents

       private void bRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegisterActionPerformed
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Conection_BD conexion = new Conection_BD();
	String fecha;
	conexion.createTable();

	String nombreCientifico = txScientificName.getText();
	String familia = txFamily.getText();
	String orden = txOrden.getText();
	String lugarObservacion = txObservationPlace.getText();
	String localidad = txLocation.getText();
	String provincia = txProvince.getText();
	String URLImagen = txURL.getText();
	String coordenadas = txCoordenates.getText();
	String observaciones = lURL1.getText();
	if (dchDate.getDate() != null) {
	       fecha = sdf.format(dchDate.getDate());
	} else {
	       fecha = "";
	}

	if (!nombreCientifico.isEmpty() && !familia.isEmpty() && !orden.isEmpty() && !lugarObservacion.isEmpty() && !localidad.isEmpty() && !provincia.isEmpty()
	        && !URLImagen.isEmpty() && !coordenadas.isEmpty() && !fecha.isEmpty()) {
	       Registros registro = new Registros(nombreCientifico, familia, orden, fecha, lugarObservacion, localidad, provincia, coordenadas, URLImagen, observaciones);

	       conexion.saveRecord(registro);
	       JOptionPane.showMessageDialog(this, "Se ha añadido el registro corréctamente", "Nature Register", JOptionPane.INFORMATION_MESSAGE);
	} else {
	       JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios de rellenar", "Nature Register", JOptionPane.WARNING_MESSAGE);
	}
       }//GEN-LAST:event_bRegisterActionPerformed

       private void bReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bReturnActionPerformed

	try {
	       UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
	} catch (Exception e) {
	       System.out.println(e);
	}
	this.setVisible(false);
	boolean active = true;
	MainPage paginaPrincipal = new MainPage("");
	paginaPrincipal.setVisible(true);

       }//GEN-LAST:event_bReturnActionPerformed

       private void bCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCleanActionPerformed

	txScientificName.setText("");
	txFamily.setText("");
	txOrden.setText("");
	txObservationPlace.setText("");
	txLocation.setText("");
	txProvince.setText("");
	txCoordenates.setText("");
	txURL.setText("");
	dchDate.setDate(null);

       }//GEN-LAST:event_bCleanActionPerformed

       private void bImageAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bImageAccessActionPerformed

	LookAndFeel lAF = UIManager.getLookAndFeel();
	try {
	       UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
	       Logger.getLogger(AddRecord.class.getName()).log(Level.SEVERE, null, ex);
	}

	final JLabel img = new JLabel();
	img.setPreferredSize(new Dimension(850, 800));
	img.setHorizontalAlignment(JLabel.CENTER);
	final JFileChooser ventana = new JFileChooser("E:\\Importante\\FOTOGRAFÍA\\BIODIVERSIDAD\\AFICCIÓN");
	FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
	ventana.setAccessory(img);
	ventana.setFileFilter(filtroImagen);
	ventana.setAcceptAllFileFilterUsed(false);
	ventana.addPropertyChangeListener(new PropertyChangeListener() {

	       @Override
	       public void propertyChange(PropertyChangeEvent evt) {
		try {
		       if (evt.getPropertyName().equals(JFileChooser.SELECTED_FILE_CHANGED_PROPERTY)) {
			img.setText("");
			ImageIcon iconoImagen = new ImageIcon(ventana.getSelectedFile().getPath());
			Image imagen = iconoImagen.getImage();
			img.setIcon(new ImageIcon(imagen.getScaledInstance(950, 750, Image.SCALE_FAST)));
		       }
		} catch (Exception ex) {
		       img.setText("Solo imagenes");
		       img.setIcon(new ImageIcon());
		}
	       }
	});
	int Abrir = ventana.showOpenDialog(this);
	ventana.setDialogTitle("IMAGENES");
	File getSelectedFile = ventana.getSelectedFile();

	if (Abrir == JFileChooser.APPROVE_OPTION) {
	       if (getSelectedFile != null && getSelectedFile.isFile()) {
		try {
		       UIManager.setLookAndFeel(lAF);

		} catch (UnsupportedLookAndFeelException ex) {
		       Logger.getLogger(AddRecord.class.getName()).log(Level.SEVERE, null, ex);
		}
		String ruta = ventana.getSelectedFile().getPath();
		txURL.setText(ruta);
	       } else {
		JOptionPane.showMessageDialog(this, "Debes elegir una imagen", "Nature Register", JOptionPane.ERROR_MESSAGE);
	       }
	}

       }//GEN-LAST:event_bImageAccessActionPerformed

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
	} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
	       java.util.logging.Logger.getLogger(AddRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(() -> {
	       new AddRecord().setVisible(true);
	});
       }

       // Variables declaration - do not modify//GEN-BEGIN:variables
       private javax.swing.JButton bClean;
       private javax.swing.JButton bImageAccess;
       private javax.swing.JButton bRegister;
       private javax.swing.JButton bReturn;
       private com.toedter.calendar.JDateChooser dchDate;
       private javax.swing.JLabel lCoordenates;
       private javax.swing.JLabel lDate;
       private javax.swing.JLabel lFamily;
       private javax.swing.JLabel lLocation;
       private javax.swing.JLabel lObservationPlace;
       private javax.swing.JLabel lOrden;
       private javax.swing.JLabel lProvince;
       private javax.swing.JLabel lScientificName;
       private javax.swing.JLabel lTopText;
       private javax.swing.JLabel lURL;
       private javax.swing.JPanel pInformation;
       private javax.swing.JPanel pMainPane;
       private javax.swing.JPanel pMarginLeft;
       private javax.swing.JPanel pMarginRight;
       private javax.swing.JPanel pSouthPane;
       private javax.swing.JPanel pTopPane;
       private javax.swing.JTextField txCoordenates;
       private javax.swing.JTextField txFamily;
       private javax.swing.JTextField txLocation;
       private javax.swing.JTextField txObservationPlace;
       private javax.swing.JTextField txOrden;
       private javax.swing.JTextField txProvince;
       private javax.swing.JTextField txScientificName;
       private javax.swing.JTextField txURL;
       // End of variables declaration//GEN-END:variables
}
