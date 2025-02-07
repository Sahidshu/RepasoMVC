
package espoch.edu.ec.repasomvc.vista;


public class Principal extends javax.swing.JFrame {


    public Principal() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        lblTituloTarea = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        txtTexto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA = new javax.swing.JTextArea();
        lblEstado = new javax.swing.JLabel();
        rdCompleta = new javax.swing.JRadioButton();
        rdPendiente = new javax.swing.JRadioButton();
        jbGuardar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        labelError = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmMenu = new javax.swing.JMenu();
        ListarT = new javax.swing.JMenuItem();
        jmMenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText("GESTION DE TAREAS");

        lblTituloTarea.setText("Titulo de Tarea:");

        lblDescripcion.setText("Descripcion:");

        txtA.setColumns(20);
        txtA.setRows(5);
        jScrollPane1.setViewportView(txtA);

        lblEstado.setText("Estado de la Tarea:");

        buttonGroup1.add(rdCompleta);
        rdCompleta.setText("Completa");
        rdCompleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdCompletaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdPendiente);
        rdPendiente.setText("Pendiente");

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");

        labelError.setText("Error");

        jmMenu.setText("Menu");
        jmMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMenuActionPerformed(evt);
            }
        });

        ListarT.setText("Listar Tareas");
        ListarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarTActionPerformed(evt);
            }
        });
        jmMenu.add(ListarT);

        jMenuBar1.add(jmMenu);

        jmMenuSalir.setText("Salir");
        jMenuBar1.add(jmMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rdCompleta)
                            .addComponent(jbGuardar))
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbLimpiar)
                            .addComponent(rdPendiente)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTituloTarea)
                            .addComponent(lblDescripcion))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTexto, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelError)
                            .addComponent(lblEstado))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTitulo)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloTarea)
                    .addComponent(txtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescripcion))
                .addGap(18, 18, 18)
                .addComponent(lblEstado)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdCompleta)
                    .addComponent(rdPendiente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiar)
                    .addComponent(jbGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelError)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void rdCompletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdCompletaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdCompletaActionPerformed

    private void jmMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMenuActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jmMenuActionPerformed

    private void ListarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarTActionPerformed
        // TODO add your handling code here:
        Listado objListado = new Listado();
        objListado.setVisible(true);
    }//GEN-LAST:event_ListarTActionPerformed
public String getTitulo(){
        return txtTexto.getText();
    }
    
    public String getDescripcion(){
        return txtA.getText();
    }
    
    public boolean getEstado(){
        return rdCompleta.isSelected();
    }
    
    public void error(String text){
        labelError.setText(text);
    }
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ListarT;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JMenu jmMenu;
    private javax.swing.JMenu jmMenuSalir;
    private javax.swing.JButton labelError;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloTarea;
    private javax.swing.JRadioButton rdCompleta;
    private javax.swing.JRadioButton rdPendiente;
    private javax.swing.JTextArea txtA;
    private javax.swing.JTextField txtTexto;
    // End of variables declaration//GEN-END:variables
}
