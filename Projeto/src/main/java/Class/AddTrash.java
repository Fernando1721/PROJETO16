/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Class;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Miranda
 */
public class AddTrash extends javax.swing.JFrame {

    /**
     * Creates new form AddTrash
     */
    public AddTrash() {
        initComponents();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnPesquisarLixo = new javax.swing.JButton();
        btnAdicionarLixo = new javax.swing.JButton();
        txtIdLixo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNomeLixo = new javax.swing.JTextField();
        btnAtualizarLixo = new javax.swing.JButton();
        btnExcluirLixo = new javax.swing.JButton();
        cboLixo = new javax.swing.JComboBox<>();
        lblImagem = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCaminhoImg = new javax.swing.JTextField();
        btnCarregarFoto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id Lixo");

        btnPesquisarLixo.setText("Pesquisar ");
        btnPesquisarLixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarLixoActionPerformed(evt);
            }
        });

        btnAdicionarLixo.setText("Adicionar");
        btnAdicionarLixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarLixoActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo De Lixo");

        jLabel3.setText("Nome ");

        btnAtualizarLixo.setText("Atualizar");
        btnAtualizarLixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarLixoActionPerformed(evt);
            }
        });

        btnExcluirLixo.setText("Excluir");
        btnExcluirLixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirLixoActionPerformed(evt);
            }
        });

        cboLixo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Plastico", "Vidro", "Papel", "Metal", "Organico" }));
        cboLixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLixoActionPerformed(evt);
            }
        });

        lblImagem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setText("Caminho da Imagem");

        btnCarregarFoto.setText("Carregar Foto");
        btnCarregarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarFotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCarregarFoto)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCaminhoImg, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtIdLixo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomeLixo)
                                    .addComponent(cboLixo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(225, 225, 225)
                                .addComponent(btnPesquisarLixo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(btnAdicionarLixo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAtualizarLixo)
                                .addGap(56, 56, 56)))
                        .addComponent(btnExcluirLixo)
                        .addGap(83, 83, 83))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnPesquisarLixo)
                    .addComponent(txtIdLixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cboLixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeLixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtCaminhoImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCarregarFoto)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdicionarLixo)
                            .addComponent(btnAtualizarLixo)
                            .addComponent(btnExcluirLixo))
                        .addGap(136, 136, 136))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarLixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarLixoActionPerformed
        // TODO add your handling code here:
        pesquisarLixo();
        
    }//GEN-LAST:event_btnPesquisarLixoActionPerformed

    private void cboLixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLixoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboLixoActionPerformed

    private void btnAdicionarLixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarLixoActionPerformed
        // TODO add your handling code here:
        adicionarLixo();
    }//GEN-LAST:event_btnAdicionarLixoActionPerformed

    private void btnAtualizarLixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarLixoActionPerformed
        // TODO add your handling code here:
        atualizarLixo();
    }//GEN-LAST:event_btnAtualizarLixoActionPerformed

    private void btnExcluirLixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirLixoActionPerformed
        // TODO add your handling code here:
        excluirLixo();
    }//GEN-LAST:event_btnExcluirLixoActionPerformed

    private void btnCarregarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarFotoActionPerformed
        // TODO add your handling code here:
        carregarFoto();
    }//GEN-LAST:event_btnCarregarFotoActionPerformed

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
            java.util.logging.Logger.getLogger(AddTrash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTrash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTrash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTrash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTrash().setVisible(true);
            }
        });
    }
    
     DAO dao = new DAO();
    
     private FileInputStream fis;
     private File icon;
     private int tamanho;
     private BufferedImage bfi;
    
     private void pesquisarLixo() {
		if (txtIdLixo.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Digite o id da lixeira");
			txtIdLixo.requestFocus();
		} else {
			// lógica principal
			// query principal ( Instrução SQL)
			String read = "select * from lixo where idlixo = ?";
			// tratar excessões sempre que lidar com o banco
			try {
				// estabelecer a conexão
				Connection con = dao.conectar();
				// Preparar a execução da Query
				PreparedStatement pst = con.prepareStatement(read);
				// Setar o argumento (id)
				// Substituir o ? pelo conteúdo da caixa de texto
				pst.setString(1, txtIdLixo.getText());
				// Executar a query e exibir o resultado no formulário
				ResultSet rs = pst.executeQuery();
				// Validação (existência de clientes)
				// rs.next() -> existência de clientes
				//limparCampos();
				if (rs.next()) {
					// preencher(setar) os campos do formulario
					txtIdLixo.setText(rs.getString(1));
                                        cboLixo.setSelectedItem(rs.getString(2));
					txtNomeLixo.setText(rs.getString(3));
                                        txtCaminhoImg.setText(rs.getString(4));
                                        File imgsave = new File(rs.getString(4));
                                        tamanho = (int)  imgsave.length();
                                        Image foto = ImageIO.read(imgsave).getScaledInstance(lblImagem.getWidth(), lblImagem.getHeight(),Image.SCALE_SMOOTH);
                                        lblImagem.setIcon(new ImageIcon(foto));
                                        lblImagem.updateUI();
                                        
                                       
                                        
                                        
				} else {
					JOptionPane.showMessageDialog(null, "Lixo não cadastrado");
				}
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
    
     private void adicionarLixo() {

		if (txtIdLixo.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Informe o Id do lixo");
			txtIdLixo.requestFocus();
		} else if (cboLixo.getSelectedItem().equals("")) {
			JOptionPane.showMessageDialog(null, "Informe o tipo de lixo");
			cboLixo.requestFocus();
		} else if (txtNomeLixo.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Informe o nome do lixo");
			txtNomeLixo.requestFocus();
		}else if (txtCaminhoImg.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Informe o caminho da imagem do lixo");
			txtCaminhoImg.requestFocus();
                }else {
			// lógica principal
			String create = "insert into lixo(idlixo, tipolixo, nome, caminhoimg) values (?,?,?,?)";
			try {
                                bfi = ImageIO.read(icon);
                                URL url = getClass().getResource("../");
                                String pathIcon = url.getPath().substring(1) + "img/" + icon.getName();
                                File imgsave = new File(pathIcon);
                                ImageIO.write(bfi, "png" , imgsave);
				// Estabelecer a conexão
				Connection con = dao.conectar();
				// Preparar a execução da Query
				PreparedStatement pst = con.prepareStatement(create);
				// Substituir o ? pelo conteúdo da caixa de texto
				pst.setString(1, txtIdLixo.getText());
				pst.setString(2, cboLixo.getSelectedItem().toString());
				pst.setString(3, txtNomeLixo.getText());
                                pst.setString(4, txtCaminhoImg.getText());
				// Executar a query e inserir o cliente no banco
				pst.executeUpdate();
				// confirmação
				JOptionPane.showMessageDialog(null, "Lixo adicionado com sucesso");
				// Encerrar a conexão
                                
				con.close();
                                
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
     
     
    
     private void atualizarLixo() {

		if (txtIdLixo.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Informe o Id do lixo");
			txtIdLixo.requestFocus();
		} else if (cboLixo.getSelectedItem().equals("")) {
			JOptionPane.showMessageDialog(null, "Informe o tipo de lixo");
			cboLixo.requestFocus();
		} else if (txtNomeLixo.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Informe o nome do lixo");
			txtNomeLixo.requestFocus();
		} else {
			// lógica principal
			String update = "update lixo set tipolixo=?, nome=?, caminhoimg=? where idlixo=?";
			try {
                                bfi = ImageIO.read(icon);
                                URL url = getClass().getResource("../");
                                String pathIcon = url.getPath().substring(1) + "img/" + icon.getName();
                                File imgsave = new File(pathIcon);
                                ImageIO.write(bfi, "png" , imgsave);
				// Estabelecer a conexão
				Connection con = dao.conectar();
				// Preparar a execução da Query
				PreparedStatement pst = con.prepareStatement(update);
				// Substituir o ? pelo conteúdo da caixa de texto
				
				pst.setString(1, cboLixo.getSelectedItem().toString());
				pst.setString(2, txtNomeLixo.getText());
                                pst.setString(3, txtCaminhoImg.getText());
                                pst.setString(4, txtIdLixo.getText());
				// Executar a query e inserir o cliente no banco
				pst.executeUpdate();
				// confirmação
				JOptionPane.showMessageDialog(null, "Lixo atualizado com sucesso");
				// Encerrar a conexão
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
        private void excluirLixo() {
		// validação (confirmação da exclusão)
		int confirma = JOptionPane.showConfirmDialog(null, "Confirma a exclusão do cliente?", "Atenção!",
				JOptionPane.YES_NO_OPTION);
		if (confirma == JOptionPane.YES_OPTION) {
			String delete = "delete from lixo where idlixo=?";
			try {
				// Estabelecer a conexão
				Connection con = dao.conectar();
				// Preparar a execução da Query
				PreparedStatement pst = con.prepareStatement(delete);
				// Substituir o ? pelo conteúdo da caixa de texto
				pst.setString(1, txtIdLixo.getText());
				// Executar a query e excluir o cliente do banco
				pst.executeUpdate();
				// confirmação
				
				JOptionPane.showMessageDialog(null, "Lixo excluido com sucesso");
				// Encerrar a conexão
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
        
        private void carregarFoto(){
            JFileChooser jfc = new JFileChooser();
            jfc.setDialogTitle("Selecionar arquivo");
            jfc.setFileFilter(new FileNameExtensionFilter("Arquivo de imagens(*.PNG,*.JPG,*.JPEG)","png","jpg","jpeg"));
            int resultado = jfc.showOpenDialog(this);
            if(resultado == JFileChooser.APPROVE_OPTION);
            try{
                icon = jfc.getSelectedFile();
                URL url = getClass().getResource("../");
                String path = url.getPath().substring(1) + "img/";
                File directory = new File(path);
      
                if (!directory.exists()){
                    directory.mkdir();
                }
                String pathIcon = path + icon.getName();
                txtCaminhoImg.setText(pathIcon);
                //fis = new FileInputStream(jfc.getSelectedFile());
                tamanho = (int) jfc.getSelectedFile().length();
                Image foto = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(lblImagem.getWidth(), lblImagem.getHeight(),Image.SCALE_SMOOTH);
                lblImagem.setIcon(new ImageIcon(foto));
                lblImagem.updateUI();
            }catch (Exception e){
                e.printStackTrace();
            }
     }
        
       
     
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarLixo;
    private javax.swing.JButton btnAtualizarLixo;
    private javax.swing.JButton btnCarregarFoto;
    private javax.swing.JButton btnExcluirLixo;
    private javax.swing.JButton btnPesquisarLixo;
    private javax.swing.JComboBox<String> cboLixo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JTextField txtCaminhoImg;
    private javax.swing.JTextField txtIdLixo;
    private javax.swing.JTextField txtNomeLixo;
    // End of variables declaration//GEN-END:variables
}