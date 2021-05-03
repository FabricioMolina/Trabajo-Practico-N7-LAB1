/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Entidades.*;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author bebo_
 */
public class viewMenu extends javax.swing.JFrame {
    private Set<Alumnos> listaAlum = new HashSet<>();
    private Set<Materia> listaMat = new HashSet<>();    
    public viewMenu() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAltaMaterias = new javax.swing.JMenu();
        jmAltaAlumnos = new javax.swing.JMenu();
        jmFormulario = new javax.swing.JMenu();
        jmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );

        jmAltaMaterias.setText("Alta de Materias");
        jmAltaMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmAltaMateriasMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmAltaMaterias);

        jmAltaAlumnos.setText("Alta de Alumnos");
        jmAltaAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmAltaAlumnosMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmAltaAlumnos);

        jmFormulario.setText("Formulario de Inscripcion");
        jmFormulario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmFormularioMouseClicked(evt);
            }
        });
        jmFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormularioActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmFormulario);

        jmSalir.setText("Salir");
        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmAltaMateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmAltaMateriasMouseClicked
        escritorio.removeAll();
        escritorio.repaint();
        viewAltaMaterias alta = new viewAltaMaterias(listaMat);
        alta.setVisible(true);
        escritorio.add(alta);
        escritorio.moveToFront(alta);
    }//GEN-LAST:event_jmAltaMateriasMouseClicked

    private void jmAltaAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmAltaAlumnosMouseClicked
        escritorio.removeAll();
        escritorio.repaint();
        viewAltaAlumnos alum = new viewAltaAlumnos(listaAlum);
        alum.setVisible(true);
        escritorio.add(alum);
        escritorio.moveToFront(alum);
    }//GEN-LAST:event_jmAltaAlumnosMouseClicked

    private void jmFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormularioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmFormularioActionPerformed

    private void jmFormularioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmFormularioMouseClicked
            escritorio.removeAll();
            escritorio.repaint();
            viewFormulario form = new viewFormulario(listaMat, listaAlum);
            form.setVisible(true);
            escritorio.add(form);
            escritorio.moveToFront(form);
    }//GEN-LAST:event_jmFormularioMouseClicked

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
            java.util.logging.Logger.getLogger(viewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmAltaAlumnos;
    private javax.swing.JMenu jmAltaMaterias;
    private javax.swing.JMenu jmFormulario;
    private javax.swing.JMenu jmSalir;
    // End of variables declaration//GEN-END:variables
}
