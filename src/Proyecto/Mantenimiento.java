/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fiosa
 */
public class Mantenimiento extends javax.swing.JFrame {

    ProyectoDepreciacion proy = new ProyectoDepreciacion();    /**
     * Creates new form Mnatenimiento
     */
    public Mantenimiento() {
        initComponents();
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
    
    VisualizadorXML frame2 = new VisualizadorXML();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtcodigobusq = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnombrebusq = new javax.swing.JTextField();
        btnBuscarmant = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablamant = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnEliminarmant = new javax.swing.JButton();
        btnModificarmant = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtValorActivomant = new javax.swing.JTextField();
        txtcodigomant = new javax.swing.JTextField();
        txtResponsablemant = new javax.swing.JTextField();
        txtVidaUtilmant = new javax.swing.JTextField();
        txtNombremant = new javax.swing.JTextField();
        CBTipoActivomant = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtValorRescatemant = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnXML = new javax.swing.JButton();
        btnleerXML = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(219, 197, 197));
        setName("Jfmantenimiento"); // NOI18N
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(102, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mantenimiento de Activos");
        jLabel1.setName(""); // NOI18N
        jLabel1.setOpaque(true);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Buscar Activo");

        txtcodigobusq.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtcodigobusq.setName("txtCodigo"); // NOI18N
        txtcodigobusq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigobusqActionPerformed(evt);
            }
        });
        txtcodigobusq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigobusqKeyTyped(evt);
            }
        });

        jLabel3.setText("C??digo Activo ");
        jLabel3.setToolTipText("");

        jLabel4.setText("Nombre Activo ");
        jLabel4.setToolTipText("");

        txtnombrebusq.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtnombrebusq.setName("txtCodigo"); // NOI18N
        txtnombrebusq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombrebusqActionPerformed(evt);
            }
        });
        txtnombrebusq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombrebusqKeyTyped(evt);
            }
        });

        btnBuscarmant.setBackground(new java.awt.Color(68, 90, 79));
        btnBuscarmant.setText("Buscar ");
        btnBuscarmant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarmantActionPerformed(evt);
            }
        });

        jTablamant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C??digo", "Nombre", "Tipo Activo", "Valor Activo", "Valor Rescate", "Responsable", "Vida ??til"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablamant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablamantMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablamant);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnEliminarmant.setBackground(new java.awt.Color(153, 62, 60));
        btnEliminarmant.setText("Eliminar");
        btnEliminarmant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarmantActionPerformed(evt);
            }
        });

        btnModificarmant.setBackground(new java.awt.Color(68, 90, 79));
        btnModificarmant.setText("Modificar");
        btnModificarmant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarmantActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Informaci??n del Activo");

        jLabel8.setText("Responsable");

        jLabel9.setText("Vida Util");

        txtValorActivomant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorActivomantKeyTyped(evt);
            }
        });

        txtcodigomant.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtcodigomant.setEnabled(false);
        txtcodigomant.setName("txtCodigo"); // NOI18N
        txtcodigomant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigomantActionPerformed(evt);
            }
        });
        txtcodigomant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigomantKeyTyped(evt);
            }
        });

        txtResponsablemant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtResponsablemantKeyTyped(evt);
            }
        });

        txtVidaUtilmant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVidaUtilmantKeyTyped(evt);
            }
        });

        txtNombremant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombremantActionPerformed(evt);
            }
        });
        txtNombremant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombremantKeyTyped(evt);
            }
        });

        CBTipoActivomant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Corriente", "No Corriente" }));
        CBTipoActivomant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBTipoActivomantActionPerformed(evt);
            }
        });

        jLabel11.setText("C??digo ");
        jLabel11.setToolTipText("");

        jLabel12.setText("Nombre");

        jLabel13.setText("Tipo de activo");

        jLabel14.setText("Valor de Activo");

        jLabel15.setText("Valor de Rescate");

        txtValorRescatemant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorRescatemantKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9)))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CBTipoActivomant, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtcodigomant)
                    .addComponent(txtNombremant)
                    .addComponent(txtValorActivomant)
                    .addComponent(txtValorRescatemant)
                    .addComponent(txtResponsablemant)
                    .addComponent(txtVidaUtilmant))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnModificarmant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarmant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodigomant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtNombremant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(CBTipoActivomant, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEliminarmant)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtValorActivomant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnModificarmant))
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtValorRescatemant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResponsablemant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVidaUtilmant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btnSalir.setBackground(new java.awt.Color(153, 62, 60));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnXML.setBackground(new java.awt.Color(68, 90, 79));
        btnXML.setText("Generar XML");
        btnXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXMLActionPerformed(evt);
            }
        });

        btnleerXML.setBackground(new java.awt.Color(68, 90, 79));
        btnleerXML.setText("Ver XML");
        btnleerXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnleerXMLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtcodigobusq)
                                            .addComponent(txtnombrebusq, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscarmant)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(246, 246, 246))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnXML)
                                .addGap(18, 18, 18)
                                .addComponent(btnleerXML, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(515, 515, 515))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtcodigobusq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtnombrebusq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarmant))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnleerXML)
                    .addComponent(btnXML))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigobusqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigobusqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigobusqActionPerformed

    private void txtcodigobusqKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigobusqKeyTyped
        char enter = evt.getKeyChar();
        txtnombrebusq.setText("");
        if (!(Character.isLetterOrDigit(enter))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcodigobusqKeyTyped

    private void txtnombrebusqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombrebusqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombrebusqActionPerformed

    private void txtnombrebusqKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombrebusqKeyTyped
 
        char enter = evt.getKeyChar();
        txtcodigobusq.setText("");
        if ((Character.isDigit(enter))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnombrebusqKeyTyped

    private void btnBuscarmantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarmantActionPerformed
      
        DefaultTableModel model=(DefaultTableModel)jTablamant.getModel();
        model.setRowCount(0);
        
        boolean rest=false;
        String tipo="";
        if(txtcodigobusq.getText().length()==0){
           rest=proy.BuscarMantenimiento(txtnombrebusq.getText(),"nombre");
           tipo="nombre";
          }
          else{
           rest=proy.BuscarMantenimiento(txtcodigobusq.getText(),"codigo");
           tipo="codigo";
          } 
          
        if (rest==true){
            if(tipo=="codigo"){
            Object[] row={proy.codigo,proy.nombre,proy.tipoActivo,proy.valorActivo,proy.valorRescate,proy.responsable,proy.vidaUtil};
            model.addRow(row);
            
            }else{
                
                for(int i=0; i<proy.BusquedaArrayList.size();i++){
                   
                 String[] temp = proy.BusquedaArrayList.get(i).split(";");
                 Object[] row={temp[1],temp[0],temp[2],temp[3],temp[4],temp[5],temp[6]};
                  model.addRow(row);  
            }
                
            }

        }else if(rest==false){
        
            JOptionPane.showMessageDialog(null,"El activo no existe.");
        }
            
            
          
    }//GEN-LAST:event_btnBuscarmantActionPerformed

    private void btnModificarmantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarmantActionPerformed
        
        boolean nom = proy.validartexto(txtNombremant.getText());
        boolean co = proy.validartexto(txtcodigomant.getText());
        boolean vact = proy.validartexto(txtValorActivomant.getText());
        boolean valResc = proy.validartexto(txtValorRescatemant.getText());
        boolean resp = proy.validartexto(txtResponsablemant.getText());
        boolean vidaUtil = proy.validartexto(txtVidaUtilmant.getText());
        
        if ((nom == false) || (co == false) || (vact == false) || (valResc == false) || (resp == false) || (vidaUtil == false)) {
            JOptionPane.showMessageDialog(null, "Algunos campos estan vacios");
            
        } else if (Integer.parseInt(txtValorRescatemant.getText()) < Integer.parseInt(txtValorActivomant.getText())) {
        if(Integer.parseInt(txtVidaUtilmant.getText())>10){
             JOptionPane.showMessageDialog(null, "La vida ??til del activo no puede superar los 10 a??os");
        
        }else{
            proy.BuscarModificar(txtNombremant.getText(), txtcodigomant.getText(), CBTipoActivomant.getSelectedItem().toString(), txtValorActivomant.getText(), txtValorRescatemant.getText(), txtResponsablemant.getText(), txtVidaUtilmant.getText());
         txtcodigomant.setText(null);
        txtNombremant.setText(null);
        txtValorActivomant.setText(null);
        txtValorRescatemant.setText(null);
        txtResponsablemant.setText(null);
        txtVidaUtilmant.setText(null);
        }
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese un valor de rescate menor al valor del activo");
        }
        
         
       
    }//GEN-LAST:event_btnModificarmantActionPerformed

    private void btnEliminarmantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarmantActionPerformed
if(txtcodigomant.getText().length()==0){
     JOptionPane.showMessageDialog(null, "Debe Seleccionar un Activo de la tabla");
        
}
else{
        proy.BuscarEliminar(txtcodigomant.getText().toString());
        
        txtcodigomant.setText(null);
        txtNombremant.setText(null);
        txtValorActivomant.setText(null);
        txtValorRescatemant.setText(null);
        txtResponsablemant.setText(null);
        txtVidaUtilmant.setText(null);
}          
    }//GEN-LAST:event_btnEliminarmantActionPerformed

    private void txtValorActivomantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorActivomantKeyTyped
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtValorActivomantKeyTyped

    private void txtcodigomantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigomantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigomantActionPerformed

    private void txtcodigomantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigomantKeyTyped
           char enter = evt.getKeyChar();
        if (!(Character.isLetterOrDigit(enter))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcodigomantKeyTyped

    private void txtValorRescatemantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorRescatemantKeyTyped
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtValorRescatemantKeyTyped

    private void txtResponsablemantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResponsablemantKeyTyped
        char enter = evt.getKeyChar();
        if ((Character.isDigit(enter))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtResponsablemantKeyTyped

    private void txtVidaUtilmantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVidaUtilmantKeyTyped
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtVidaUtilmantKeyTyped

    private void txtNombremantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombremantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombremantActionPerformed

    private void txtNombremantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombremantKeyTyped
        char enter = evt.getKeyChar();
        if ((Character.isDigit(enter))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombremantKeyTyped

    private void CBTipoActivomantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBTipoActivomantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBTipoActivomantActionPerformed

    private void jTablamantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablamantMouseClicked

        DefaultTableModel model=(DefaultTableModel)jTablamant.getModel();
        int row= jTablamant.getSelectedRow();
        String codmant=jTablamant.getValueAt(row,0).toString();
        txtcodigomant.setText(codmant);
        String nommant=jTablamant.getValueAt(row,1).toString();
        txtNombremant.setText(nommant);
        String tipomant=jTablamant.getValueAt(row,2).toString();
        CBTipoActivomant.setSelectedItem(tipomant);
        String valmant=jTablamant.getValueAt(row,3).toString();
        txtValorActivomant.setText(valmant);
        String rescmant=jTablamant.getValueAt(row,4).toString();
        txtValorRescatemant.setText(rescmant);
        String responmant=jTablamant.getValueAt(row,5).toString();
        txtResponsablemant.setText(responmant);
        String vidamant=jTablamant.getValueAt(row,6).toString();
        txtVidaUtilmant.setText(vidamant);
        
    }//GEN-LAST:event_jTablamantMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
      dispose(); 
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXMLActionPerformed
        proy.GenerarXML();
        
    }//GEN-LAST:event_btnXMLActionPerformed

    private void btnleerXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnleerXMLActionPerformed
        
        frame2.setVisible(true);
    }//GEN-LAST:event_btnleerXMLActionPerformed

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
            java.util.logging.Logger.getLogger(Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mantenimiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBTipoActivomant;
    private javax.swing.JButton btnBuscarmant;
    private javax.swing.JButton btnEliminarmant;
    private javax.swing.JButton btnModificarmant;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnXML;
    private javax.swing.JButton btnleerXML;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablamant;
    private javax.swing.JTextField txtNombremant;
    private javax.swing.JTextField txtResponsablemant;
    private javax.swing.JTextField txtValorActivomant;
    private javax.swing.JTextField txtValorRescatemant;
    private javax.swing.JTextField txtVidaUtilmant;
    private javax.swing.JTextField txtcodigobusq;
    private javax.swing.JTextField txtcodigomant;
    private javax.swing.JTextField txtnombrebusq;
    // End of variables declaration//GEN-END:variables
}
