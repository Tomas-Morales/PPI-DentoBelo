/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author emanu
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        AgendarCita = new javax.swing.JButton();
        CitasAgendadas = new javax.swing.JButton();
        registraCliente = new javax.swing.JButton();
        clienteRegistrado = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("Menú");

        AgendarCita.setBackground(new java.awt.Color(51, 255, 51));
        AgendarCita.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        AgendarCita.setText("Agendar Cita");
        AgendarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendarCitaActionPerformed(evt);
            }
        });

        CitasAgendadas.setBackground(new java.awt.Color(51, 255, 51));
        CitasAgendadas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        CitasAgendadas.setText("Citas Agendadas");
        CitasAgendadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitasAgendadasActionPerformed(evt);
            }
        });

        registraCliente.setBackground(new java.awt.Color(51, 255, 51));
        registraCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        registraCliente.setText("Registrar Cliente");
        registraCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registraClienteActionPerformed(evt);
            }
        });

        clienteRegistrado.setBackground(new java.awt.Color(51, 255, 51));
        clienteRegistrado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        clienteRegistrado.setText("Clientes Registrados");
        clienteRegistrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteRegistradoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AgendarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registraCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CitasAgendadas)
                    .addComponent(clienteRegistrado))
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgendarCita)
                    .addComponent(CitasAgendadas))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registraCliente)
                    .addComponent(clienteRegistrado))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgendarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendarCitaActionPerformed
       this.setVisible(false);
       Agendamiento agendamiento = new Agendamiento();
       agendamiento.setVisible(true);
    }//GEN-LAST:event_AgendarCitaActionPerformed

    private void CitasAgendadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitasAgendadasActionPerformed
        this.setVisible(true);
        Citas citas = new Citas();
        citas.setVisible(true);
    }//GEN-LAST:event_CitasAgendadasActionPerformed

    private void clienteRegistradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteRegistradoActionPerformed
       this.setVisible(false);
       Registros registros = new Registros();
       registros.setVisible(true);
    }//GEN-LAST:event_clienteRegistradoActionPerformed

    private void registraClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registraClienteActionPerformed
        this.setVisible(false);
        Registrar registrar = new Registrar();
        registrar.setVisible(true);
    }//GEN-LAST:event_registraClienteActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgendarCita;
    private javax.swing.JButton CitasAgendadas;
    private javax.swing.JButton clienteRegistrado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton registraCliente;
    // End of variables declaration//GEN-END:variables
}