/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Control.Impl.Exception.DAOException;
import Control.Impl.ImplIdosoDAO;
import Control.Impl.ImplItemPrescricaoMedica;
import Control.Impl.ImplPrescricaoMedica;
import Control.Impl.ImplRegistroConsumoMedicamento;
import Model.Funcionario;
import Model.Idoso;
import Model.ItemPrescricaoMedica;
import Model.PrescricaoMedica;
import Model.RegistroConsumoMedicamento;
import Util.DataConverter;
import Util.Mensagens;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class FrameUtilizacaoRemedio extends javax.swing.JFrame {
    
    private List<ItemPrescricaoMedica> listaItens;
    
    private Funcionario func;
    
    /**
     * Creates new form RegistroUtilizacao
     */
    public FrameUtilizacaoRemedio(Funcionario func) {
        initComponents();
        this.func = func;
        listaItens = new ArrayList<>();
        try {
            List<Idoso> lista = ImplIdosoDAO.getInstance().encontrarTodosIdosos();
            for (Iterator<Idoso> it = lista.iterator(); it.hasNext();) {
                Idoso idoso = it.next();
                comboBoxIdoso.addItem(idoso);
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    private void atualizaPrescricao() {
        listaPrescricao.setListData(listaItens.toArray());
    }
    
    private void limpar() {
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        comboBoxPrescricao = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaRemedios = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        botaoRegistroUtilizacao = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPrescricao = new javax.swing.JList();
        comboBoxIdoso = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Utilização de Remédio"));

        comboBoxPrescricao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione prescrição médica" }));
        comboBoxPrescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPrescricaoActionPerformed(evt);
            }
        });

        areaRemedios.setEditable(false);
        areaRemedios.setColumns(20);
        areaRemedios.setRows(5);
        jScrollPane1.setViewportView(areaRemedios);

        jLabel1.setText("Remedios utilizados");

        botaoRegistroUtilizacao.setText("Registrar Utilização");
        botaoRegistroUtilizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRegistroUtilizacaoActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(listaPrescricao);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(119, 119, 119))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(comboBoxPrescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(botaoRegistroUtilizacao)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxPrescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(botaoRegistroUtilizacao)
                .addContainerGap())
        );

        comboBoxIdoso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione idoso" }));
        comboBoxIdoso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxIdosoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboBoxIdoso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 421, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comboBoxIdoso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxIdosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxIdosoActionPerformed
        if(comboBoxIdoso.getSelectedIndex() != 0) {
            try {
                List<PrescricaoMedica> lista = ImplPrescricaoMedica.getInstance().encontrarTodos();
                comboBoxPrescricao.removeAllItems();
                comboBoxPrescricao.addItem("Selecione prescrição");
                for (Iterator<PrescricaoMedica> it = lista.iterator(); it.hasNext();) {
                    PrescricaoMedica prescricaoMedica = it.next();
                    comboBoxPrescricao.addItem(prescricaoMedica);
                }
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_comboBoxIdosoActionPerformed

    private void comboBoxPrescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPrescricaoActionPerformed
        PrescricaoMedica pm = (PrescricaoMedica) comboBoxPrescricao.getSelectedItem();
        try {
            listaItens = ImplItemPrescricaoMedica.getInstance().encontrarTodos(pm.getCodigoPrescricao());
            atualizaPrescricao();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_comboBoxPrescricaoActionPerformed

    private void botaoRegistroUtilizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRegistroUtilizacaoActionPerformed
        if(!listaPrescricao.isSelectionEmpty()) {
            SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/YYYY");
            SimpleDateFormat horaFormat = new SimpleDateFormat("hh:mm");
            ItemPrescricaoMedica ipm = (ItemPrescricaoMedica) listaPrescricao.getSelectedValue();
            Date d = new Date(DataConverter.dateTypeToLong(dataFormat.format(new java.util.Date())));
            String hora = horaFormat.format(new java.util.Date());
            RegistroConsumoMedicamento registro = new RegistroConsumoMedicamento(ipm, d, 0, func);
            try {
                ImplRegistroConsumoMedicamento.getInstance().inserir(registro);
                ImplItemPrescricaoMedica.getInstance().remover(ipm);
                areaRemedios.setText("");
                List<RegistroConsumoMedicamento> lista = ImplRegistroConsumoMedicamento.getInstance().encontrarTodos();
                for (Iterator<RegistroConsumoMedicamento> it = lista.iterator(); it.hasNext();) {
                    RegistroConsumoMedicamento registroConsumoMedicamento = it.next();
                    areaRemedios.append(registroConsumoMedicamento + "\n");
                }
                listaItens.remove(ipm);
                limpar();
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        }
        else {
            Mensagens.campoInvalido(this, "Item Lista Prescrição Médica");
        }
    }//GEN-LAST:event_botaoRegistroUtilizacaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaRemedios;
    private javax.swing.JButton botaoRegistroUtilizacao;
    private javax.swing.JComboBox comboBoxIdoso;
    private javax.swing.JComboBox comboBoxPrescricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaPrescricao;
    // End of variables declaration//GEN-END:variables
}
