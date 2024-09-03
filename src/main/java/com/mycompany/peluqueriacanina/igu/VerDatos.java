/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.Controladora;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author davii
 */
public class VerDatos extends javax.swing.JFrame {

    Controladora controladora = null;
    public VerDatos() {
        initComponents();
        controladora = new Controladora();
        btnEdit.setToolTipText("Editar");
        btnDelete.setToolTipText("Eliminar");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setText("Visualización de Datos");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaMascotas);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Datos de mascota");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(266, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        btnDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\davii\\OneDrive\\Documentos\\NetBeansProjects\\PeluqueriaCanina\\recursos\\delete.png")); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon("C:\\Users\\davii\\OneDrive\\Documentos\\NetBeansProjects\\PeluqueriaCanina\\recursos\\edit.png")); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(329, 329, 329))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(413, 413, 413)
                .addComponent(btnDelete)
                .addGap(45, 45, 45)
                .addComponent(btnEdit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        editarDatos();
    }//GEN-LAST:event_btnEditActionPerformed

    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarDatos();
    }//GEN-LAST:event_formWindowOpened

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (tablaMascotas.getRowCount() > 0) {
            if (tablaMascotas.getSelectedRow() != -1) {
                int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
                controladora.borrarMascota(num_cliente);
                msgPantalla("Eliminado", JOptionPane.INFORMATION_MESSAGE, "Eliminado correctamente");
                cargarDatos();
            } else
                msgPantalla("Selecciona mascota antes de eliminar", JOptionPane.ERROR_MESSAGE, "Selecciona papu");
        } else
            msgPantalla("No hay datos", JOptionPane.ERROR_MESSAGE, "Que vas a eliminar pringao");

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void msgPantalla(String titulo, int tipo, String msg) {
        JOptionPane optionPane = new JOptionPane(titulo);
        optionPane.setMessageType(tipo);
        JDialog dialog = optionPane.createDialog(msg);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaMascotas;
    // End of variables declaration//GEN-END:variables
    private void cargarDatos() {
            //Nos permite establecer un modelo a la tabla, ejemplo agregar columna para no editarlo mediante la interfaz
            DefaultTableModel modeloTabla = new DefaultTableModel() { //Abrimos llaves para agregar un parámetro más
                //Para que fila y columna no sean editables
                @Override
                public boolean isCellEditable (int row, int column) {
                    return false;
                }
            };
            String[] titulos = {"Num", "Nombre", "Color", "Raza", "Alergico", "At. Esp", "Dueño", "Cel"};
            modeloTabla.setColumnIdentifiers(titulos);
            List<Mascota> listaMascotas = controladora.traerMascotas();

            if (listaMascotas != null) {
                for (Mascota mascota: listaMascotas) 
                {
                    Object[] objeto = {
                        mascota.getNum_Cliente(), mascota.getNombre(), mascota.getColor(), mascota.getRaza(), mascota.getAlergico(), mascota.getAtencion_especial(),
                        mascota.getDuenio().getNombre(), mascota.getDuenio().getCelular()
                    };

                    modeloTabla.addRow(objeto);
                }
                tablaMascotas.setModel(modeloTabla);
            }
            
        }

    private void editarDatos() {
        if (tablaMascotas.getRowCount() > 0) {
            if (tablaMascotas.getSelectedRow() != -1) {
                int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
                EditarDatos editarDatos = new EditarDatos(num_cliente);
                editarDatos.setVisible(true);
                editarDatos.setLocationRelativeTo(null);
            } else
                msgPantalla("Selecciona mascota antes de editar", JOptionPane.ERROR_MESSAGE, "Selecciona papu");
        } else
            msgPantalla("No hay datos", JOptionPane.ERROR_MESSAGE, "Que vas a editar pringao");
    }
    
}
