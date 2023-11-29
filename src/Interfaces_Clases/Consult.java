package Interfaces_Clases;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class Consult extends javax.swing.JFrame {

       static DefaultTableModel modelo;
       static String nombreCientificoF;
       static String familiaF;
       static String ordenF;
       static String localidadF;
       static String provinciaF;
       static String fechaF;

       public Consult() {
	initComponents();

	this.setTitle("Nature Register");

	Toolkit mipantalla = Toolkit.getDefaultToolkit();
	Dimension tamanioPantalla = mipantalla.getScreenSize();
	int alturaPantalla = tamanioPantalla.height;
	int anchoPantalla = tamanioPantalla.width;
	int ventanaAncho = (int) (anchoPantalla /1.50);
	int ventanaAlto = (int) (alturaPantalla / 1.51);
	this.setPreferredSize(new Dimension(ventanaAncho, ventanaAlto));
	System.out.println(this.getSize());
	this.setLocationRelativeTo(null);	
	this.setResizable(false);

	addPlaceholder();

	Image imagen = new ImageIcon("..\\src\\Images\\—Pngtree—hand drawn magnifying glass insect_4591232.png").getImage();
	ImageIcon icono = new ImageIcon(imagen.getScaledInstance(lIcon.getWidth(), lIcon.getHeight(), Image.SCALE_SMOOTH));
	lIcon.setIcon(icono);

	Icon returnIcon = new ImageIcon ("..\\src\\Images\\arrowbackoutline_110825.png");
	bReturn.setIcon(returnIcon);

       }

       @Override
       public Image getIconImage() {
	Image retValue = Toolkit.getDefaultToolkit().getImage("..\\src\\Images\\nature register1.png");

	return retValue;
       }

       public void addPlaceholder() {
	TextPrompt txtP1 = null;

	txtP1 = new TextPrompt("Nombre científico...", txScientificName);
	txtP1 = new TextPrompt("Familia...", txFamily);
	txtP1 = new TextPrompt("Orden...", txOrden);
	txtP1 = new TextPrompt("Localidad...", txLocate);
	txtP1 = new TextPrompt("Provincia...", txProvince);
       }

       @SuppressWarnings("unchecked")
       // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
       private void initComponents() {

              pMainPane = new javax.swing.JPanel();
              pFilters = new javax.swing.JPanel();
              pBottom = new javax.swing.JPanel();
              bFilter = new javax.swing.JButton();
              pClear = new javax.swing.JButton();
              lNumeroElementosConsultados = new javax.swing.JLabel();
              pTop = new javax.swing.JPanel();
              txScientificName = new javax.swing.JTextField();
              txFamily = new javax.swing.JTextField();
              txOrden = new javax.swing.JTextField();
              txProvince = new javax.swing.JTextField();
              txLocate = new javax.swing.JTextField();
              dchDate = new com.toedter.calendar.JDateChooser();
              pTitle = new javax.swing.JPanel();
              pConsultRecords = new javax.swing.JPanel();
              jLabel1 = new javax.swing.JLabel();
              lMarginLeft = new javax.swing.JLabel();
              lMarginRight = new javax.swing.JLabel();
              lMarginBot = new javax.swing.JLabel();
              pButtomsAndRecords = new javax.swing.JPanel();
              pTable = new javax.swing.JPanel();
              jScrollPane2 = new javax.swing.JScrollPane();
              jtTableRecords = new javax.swing.JTable();
              pButtoms = new javax.swing.JPanel();
              lIcon = new javax.swing.JLabel();
              bRemoveRecords = new javax.swing.JButton();
              bReturn = new javax.swing.JButton();
              bClearTable = new javax.swing.JButton();
              pShowImage = new javax.swing.JButton();
              bUpdate = new javax.swing.JButton();

              setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
              setIconImage(getIconImage());
              setPreferredSize(new java.awt.Dimension(1280, 799));
              getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

              pMainPane.setBackground(new java.awt.Color(204, 255, 204));
              pMainPane.setLayout(new java.awt.BorderLayout());

              pFilters.setLayout(new java.awt.BorderLayout());

              pBottom.setBackground(new java.awt.Color(255, 255, 255));

              bFilter.setBackground(new java.awt.Color(255, 102, 102));
              bFilter.setFont(new java.awt.Font("Roboto Bk", 0, 18)); // NOI18N
              bFilter.setForeground(new java.awt.Color(255, 255, 255));
              bFilter.setText("Filtrar registros");
              bFilter.addActionListener(new java.awt.event.ActionListener() {
                     public void actionPerformed(java.awt.event.ActionEvent evt) {
                            bFilterActionPerformed(evt);
                     }
              });

              pClear.setBackground(new java.awt.Color(255, 102, 102));
              pClear.setFont(new java.awt.Font("Roboto Bk", 0, 18)); // NOI18N
              pClear.setForeground(new java.awt.Color(255, 255, 255));
              pClear.setText("Limpiar");
              pClear.addActionListener(new java.awt.event.ActionListener() {
                     public void actionPerformed(java.awt.event.ActionEvent evt) {
                            pClearActionPerformed(evt);
                     }
              });

              lNumeroElementosConsultados.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

              javax.swing.GroupLayout pBottomLayout = new javax.swing.GroupLayout(pBottom);
              pBottom.setLayout(pBottomLayout);
              pBottomLayout.setHorizontalGroup(
                     pBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(pBottomLayout.createSequentialGroup()
                            .addGap(98, 98, 98)
                            .addGroup(pBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addComponent(bFilter)
                                   .addGroup(pBottomLayout.createSequentialGroup()
                                          .addGap(32, 32, 32)
                                          .addComponent(pClear)))
                            .addContainerGap(106, Short.MAX_VALUE))
                     .addGroup(pBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBottomLayout.createSequentialGroup()
                                   .addContainerGap(19, Short.MAX_VALUE)
                                   .addComponent(lNumeroElementosConsultados, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addContainerGap()))
              );
              pBottomLayout.setVerticalGroup(
                     pBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(pBottomLayout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(bFilter)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pClear)
                            .addContainerGap(223, Short.MAX_VALUE))
                     .addGroup(pBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBottomLayout.createSequentialGroup()
                                   .addContainerGap(157, Short.MAX_VALUE)
                                   .addComponent(lNumeroElementosConsultados)
                                   .addContainerGap(158, Short.MAX_VALUE)))
              );

              pFilters.add(pBottom, java.awt.BorderLayout.PAGE_END);

              pTop.setBackground(new java.awt.Color(255, 255, 255));

              txScientificName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

              txFamily.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

              txOrden.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

              txProvince.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

              txLocate.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

              dchDate.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

              javax.swing.GroupLayout pTopLayout = new javax.swing.GroupLayout(pTop);
              pTop.setLayout(pTopLayout);
              pTopLayout.setHorizontalGroup(
                     pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(pTopLayout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addComponent(txLocate, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(txProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(txFamily, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(txScientificName, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addGroup(pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                          .addComponent(dchDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addComponent(txOrden, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(46, Short.MAX_VALUE))
              );
              pTopLayout.setVerticalGroup(
                     pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(pTopLayout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(txScientificName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txFamily, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(dchDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txLocate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(74, Short.MAX_VALUE))
              );

              pFilters.add(pTop, java.awt.BorderLayout.CENTER);

              pTitle.setBackground(new java.awt.Color(255, 255, 255));
              pTitle.setPreferredSize(new java.awt.Dimension(359, 100));
              pTitle.setLayout(new java.awt.BorderLayout());

              pConsultRecords.setBackground(new java.awt.Color(255, 102, 102));
              pConsultRecords.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

              jLabel1.setBackground(new java.awt.Color(255, 51, 51));
              jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
              jLabel1.setForeground(new java.awt.Color(255, 255, 255));
              jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
              jLabel1.setText("CONSULTAR REGISTROS");
              jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
              jLabel1.setPreferredSize(new java.awt.Dimension(270, 100));
              pConsultRecords.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 90));

              pTitle.add(pConsultRecords, java.awt.BorderLayout.CENTER);

              lMarginLeft.setText("   ");
              pTitle.add(lMarginLeft, java.awt.BorderLayout.WEST);

              lMarginRight.setText("   ");
              pTitle.add(lMarginRight, java.awt.BorderLayout.EAST);

              lMarginBot.setBackground(new java.awt.Color(255, 255, 255));
              lMarginBot.setForeground(new java.awt.Color(255, 255, 255));
              lMarginBot.setText("   ");
              pTitle.add(lMarginBot, java.awt.BorderLayout.SOUTH);

              pFilters.add(pTitle, java.awt.BorderLayout.NORTH);

              pMainPane.add(pFilters, java.awt.BorderLayout.WEST);

              pButtomsAndRecords.setBackground(new java.awt.Color(204, 255, 204));
              pButtomsAndRecords.setLayout(new java.awt.BorderLayout());

              jScrollPane2.setBorder(null);
              jScrollPane2.setForeground(new java.awt.Color(153, 255, 51));
              jScrollPane2.setFocusable(false);
              jScrollPane2.setOpaque(false);

              jtTableRecords.setModel(new javax.swing.table.DefaultTableModel(
                     new Object [][] {

                     },
                     new String [] {
                            "ID", "Nombre científico", "Familia", "Orden", "Fecha", "Lugar de observación", "Localidad", "Provincia", "Coordenadas"
                     }
              ) {
                     Class[] types = new Class [] {
                            java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                     };

                     public Class getColumnClass(int columnIndex) {
                            return types [columnIndex];
                     }
              });
              jtTableRecords.setOpaque(false);
              jScrollPane2.setViewportView(jtTableRecords);
              if (jtTableRecords.getColumnModel().getColumnCount() > 0) {
                     jtTableRecords.getColumnModel().getColumn(0).setPreferredWidth(25);
                     jtTableRecords.getColumnModel().getColumn(1).setPreferredWidth(150);
                     jtTableRecords.getColumnModel().getColumn(5).setPreferredWidth(140);
                     jtTableRecords.getColumnModel().getColumn(6).setPreferredWidth(100);
                     jtTableRecords.getColumnModel().getColumn(8).setPreferredWidth(140);
              }

              javax.swing.GroupLayout pTableLayout = new javax.swing.GroupLayout(pTable);
              pTable.setLayout(pTableLayout);
              pTableLayout.setHorizontalGroup(
                     pTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(pTableLayout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 241, Short.MAX_VALUE))
              );
              pTableLayout.setVerticalGroup(
                     pTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
              );

              pButtomsAndRecords.add(pTable, java.awt.BorderLayout.CENTER);

              pButtoms.setBackground(new java.awt.Color(255, 255, 255));
              pButtoms.setBorder(javax.swing.BorderFactory.createEtchedBorder());

              bRemoveRecords.setBackground(new java.awt.Color(255, 153, 153));
              bRemoveRecords.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
              bRemoveRecords.setForeground(new java.awt.Color(255, 255, 255));
              bRemoveRecords.setText("Borrar registro");
              bRemoveRecords.addActionListener(new java.awt.event.ActionListener() {
                     public void actionPerformed(java.awt.event.ActionEvent evt) {
                            bRemoveRecordsActionPerformed(evt);
                     }
              });

              bReturn.setBackground(new java.awt.Color(255, 102, 102));
              bReturn.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
              bReturn.setForeground(new java.awt.Color(255, 255, 255));
              bReturn.setBorder(null);
              bReturn.setOpaque(false);
              bReturn.addActionListener(new java.awt.event.ActionListener() {
                     public void actionPerformed(java.awt.event.ActionEvent evt) {
                            bReturnActionPerformed(evt);
                     }
              });

              bClearTable.setBackground(new java.awt.Color(255, 153, 153));
              bClearTable.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
              bClearTable.setForeground(new java.awt.Color(255, 255, 255));
              bClearTable.setText("Vaciar tabla");
              bClearTable.addActionListener(new java.awt.event.ActionListener() {
                     public void actionPerformed(java.awt.event.ActionEvent evt) {
                            bClearTableActionPerformed(evt);
                     }
              });

              pShowImage.setBackground(new java.awt.Color(255, 153, 153));
              pShowImage.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
              pShowImage.setForeground(new java.awt.Color(255, 255, 255));
              pShowImage.setText("Ver imagen del registro seleccionado");
              pShowImage.addActionListener(new java.awt.event.ActionListener() {
                     public void actionPerformed(java.awt.event.ActionEvent evt) {
                            pShowImageActionPerformed(evt);
                     }
              });

              bUpdate.setBackground(new java.awt.Color(255, 153, 153));
              bUpdate.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
              bUpdate.setForeground(new java.awt.Color(255, 255, 255));
              bUpdate.setText("Actualizar");
              bUpdate.addActionListener(new java.awt.event.ActionListener() {
                     public void actionPerformed(java.awt.event.ActionEvent evt) {
                            bUpdateActionPerformed(evt);
                     }
              });

              javax.swing.GroupLayout pButtomsLayout = new javax.swing.GroupLayout(pButtoms);
              pButtoms.setLayout(pButtomsLayout);
              pButtomsLayout.setHorizontalGroup(
                     pButtomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pButtomsLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(bReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                            .addGroup(pButtomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pButtomsLayout.createSequentialGroup()
                                          .addComponent(bRemoveRecords)
                                          .addGap(4, 4, 4)
                                          .addComponent(bUpdate)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(bClearTable))
                                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pButtomsLayout.createSequentialGroup()
                                          .addComponent(pShowImage)
                                          .addGap(30, 30, 30)))
                            .addGap(86, 86, 86)
                            .addComponent(lIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(275, 275, 275))
              );
              pButtomsLayout.setVerticalGroup(
                     pButtomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(pButtomsLayout.createSequentialGroup()
                            .addGroup(pButtomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(pButtomsLayout.createSequentialGroup()
                                          .addGroup(pButtomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                 .addGroup(pButtomsLayout.createSequentialGroup()
                                                        .addGap(45, 45, 45)
                                                        .addComponent(pShowImage))
                                                 .addGroup(pButtomsLayout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(bReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addGroup(pButtomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                 .addComponent(bRemoveRecords)
                                                 .addComponent(bClearTable)
                                                 .addComponent(bUpdate))
                                          .addGap(0, 0, Short.MAX_VALUE))
                                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pButtomsLayout.createSequentialGroup()
                                          .addGap(0, 11, Short.MAX_VALUE)
                                          .addComponent(lIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap())
              );

              pButtomsAndRecords.add(pButtoms, java.awt.BorderLayout.SOUTH);

              pMainPane.add(pButtomsAndRecords, java.awt.BorderLayout.CENTER);

              getContentPane().add(pMainPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 760));

              pack();
       }// </editor-fold>//GEN-END:initComponents

       private void bReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bReturnActionPerformed
	this.setVisible(false);
	MainPage paginaprincipal = new MainPage("");
	paginaprincipal.setVisible(true);
       }//GEN-LAST:event_bReturnActionPerformed

       private void pClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pClearActionPerformed

	clearTextField();

       }//GEN-LAST:event_pClearActionPerformed

       private void bFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFilterActionPerformed

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	modelo = (DefaultTableModel) jtTableRecords.getModel();
	

	nombreCientificoF = txScientificName.getText();
	familiaF = txFamily.getText();
	ordenF = txOrden.getText();
	localidadF = txLocate.getText();
	provinciaF = txProvince.getText();
	if (dchDate.getDate() != null) {
	       fechaF = sdf.format(dchDate.getDate());
	} else {
	       fechaF = "";
	}

	removingRows();

	Conection_BD conexion = new Conection_BD();
	conexion.showRecords(jtTableRecords, nombreCientificoF, familiaF, ordenF, localidadF, provinciaF, fechaF);
	setNumberRecordsInLabel();

       }//GEN-LAST:event_bFilterActionPerformed

       public void removingRows() {
	for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
	       modelo.removeRow(i);
	}
       }

       public void setNumberRecordsInLabel() {
	modelo = (DefaultTableModel) jtTableRecords.getModel();
	if (modelo.getRowCount() > 1 || modelo.getRowCount() == 0) {
	       lNumeroElementosConsultados.setText("Se han filtrado " + modelo.getRowCount() + " registros");
	} else {
	       lNumeroElementosConsultados.setText("Se ha filtrado " + modelo.getRowCount() + " registro");
	}
       }

       private void bClearTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearTableActionPerformed

	modelo = (DefaultTableModel) jtTableRecords.getModel();
	removingRows();
	setNumberRecordsInLabel();
       }//GEN-LAST:event_bClearTableActionPerformed

       private void pShowImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pShowImageActionPerformed

	modelo = (DefaultTableModel) jtTableRecords.getModel();
	if (jtTableRecords.isRowSelected(jtTableRecords.getSelectedRow())) {

	       Conection_BD conecction = new Conection_BD();

	       String ruta = conecction.showImage(jtTableRecords);

	       VentanasImagenes showingImage = new VentanasImagenes(ruta, jtTableRecords);

	       showingImage.setVisible(true);
	} else {
	       JOptionPane.showMessageDialog(this, "Selecciona primero un registro para  ver su fotografía", "SQLITE", JOptionPane.WARNING_MESSAGE);
	}

       }//GEN-LAST:event_pShowImageActionPerformed

       private void bRemoveRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemoveRecordsActionPerformed

	if (jtTableRecords.isRowSelected(jtTableRecords.getSelectedRow())) {
	       Conection_BD conecction = new Conection_BD();
	       conecction.removeSelectedRow(jtTableRecords);
	       removingRows();

	       conecction.showRecords(jtTableRecords, nombreCientificoF, familiaF, ordenF, localidadF, provinciaF, fechaF);
	       setNumberRecordsInLabel();
	} else {
	       JOptionPane.showMessageDialog(this, "Selecciona el registro que quieres eliminar", "SQLITE", JOptionPane.WARNING_MESSAGE);
	}
       }//GEN-LAST:event_bRemoveRecordsActionPerformed

       private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed

	modelo = (DefaultTableModel) jtTableRecords.getModel();

	Conection_BD conecction = new Conection_BD();
	conecction.updateSelectedRow(jtTableRecords);
	removingRows();
	conecction.showRecords(jtTableRecords, nombreCientificoF, familiaF, ordenF, localidadF, provinciaF, fechaF);

       }//GEN-LAST:event_bUpdateActionPerformed

       public void clearTextField() {
	txScientificName.setText("");
	txFamily.setText("");
	txOrden.setText("");
	dchDate.setDate(null);
	txLocate.setText("");
	txProvince.setText("");
       }

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
	       java.util.logging.Logger.getLogger(Consult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(() -> {
	       new Consult().setVisible(true);
	});
       }

       // Variables declaration - do not modify//GEN-BEGIN:variables
       private javax.swing.JButton bClearTable;
       private javax.swing.JButton bFilter;
       private javax.swing.JButton bRemoveRecords;
       private javax.swing.JButton bReturn;
       private javax.swing.JButton bUpdate;
       private com.toedter.calendar.JDateChooser dchDate;
       private javax.swing.JLabel jLabel1;
       private javax.swing.JScrollPane jScrollPane2;
       private javax.swing.JTable jtTableRecords;
       private javax.swing.JLabel lIcon;
       private javax.swing.JLabel lMarginBot;
       private javax.swing.JLabel lMarginLeft;
       private javax.swing.JLabel lMarginRight;
       private javax.swing.JLabel lNumeroElementosConsultados;
       private javax.swing.JPanel pBottom;
       private javax.swing.JPanel pButtoms;
       private javax.swing.JPanel pButtomsAndRecords;
       private javax.swing.JButton pClear;
       private javax.swing.JPanel pConsultRecords;
       private javax.swing.JPanel pFilters;
       private javax.swing.JPanel pMainPane;
       private javax.swing.JButton pShowImage;
       private javax.swing.JPanel pTable;
       private javax.swing.JPanel pTitle;
       private javax.swing.JPanel pTop;
       private javax.swing.JTextField txFamily;
       private javax.swing.JTextField txLocate;
       private javax.swing.JTextField txOrden;
       private javax.swing.JTextField txProvince;
       private javax.swing.JTextField txScientificName;
       // End of variables declaration//GEN-END:variables
}
