import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author inqui
 */
public class MenuPrincipal extends javax.swing.JPanel implements ActionListener{
      public SocialNetwork social;
      int n;
  		@SuppressWarnings("rawtypes")
  		LinkedList<Persona> arrpersona[];
  		@SuppressWarnings("rawtypes")
  		LinkedList<LinkedList> amigos;
    /**
     * Creates new form MenuPrincipal
     */
     public MenuPrincipal(SocialNetwork social) {
        initComponents();
        this.social=social;
        lista=new AdjList(10);
        numpersona=0;
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setName(""); // NOI18N

        jButton1.setText("Iniciar Sesion");
        jButton1.setName("sesion"); // NOI18N
        jButton1.addActionListener(this);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Crear nuevo perfil");
        jButton2.addActionListener(this);
        jButton3.setText("Salir");

        jLabel1.setText("Cara Libro");
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(174, 174, 174))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jButton1.getAccessibleContext().setAccessibleName("sesion");
        jButton2.getAccessibleContext().setAccessibleName("nuevoperfil");
        jButton3.getAccessibleContext().setAccessibleName("salir");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
    }//GEN-LAST:event_jButton1ActionPerformed
    @SuppressWarnings("unused")
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
   
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
	@Override
	public void actionPerformed(ActionEvent e) {
		 if(e.getSource()==jButton1){
             MenuUsuario vtn=new MenuUsuario(this.social);
             this.social.setPanel(vtn);
            }
           if(e.getSource()==jButton2) {
      	   String nombre = JOptionPane.showInputDialog("Escribe el nombre");
      	   int id= Integer.parseInt(JOptionPane.showInputDialog("Escribe el ID"));
      	   Persona persona=new Persona<Persona>(id, nombre);
      	   for (int i = 0; i < array.length; i++) {
			
		}
      	 lista.printGraph();
      	   
         }
		
	}
}
