/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentanaCuestionarioCM.java
 *
 * Created on 23-nov-2013, 20:18:52
 */
package cuestionarios_cambioModelo;

import java.util.ArrayList;

/**
 *
 * @author mjfortiz
 */
public class VentanaCuestionarioCM extends javax.swing.JFrame implements InterfazVistaCuestionarioCM{

    /** Creates new form VentanaCuestionarioCM */
    public VentanaCuestionarioCM() {
        initComponents();
        botonComprobar.setActionCommand("COMPROBAR");
        botonPuntos.setActionCommand("VERPUNTOS");
        botonRepetir.setActionCommand("REPETIR");
        botonNueva.setActionCommand("NUEVA");
    }
        @Override
    public String getRespuesta(){
        return respuesta.getText();
    }
      @Override  
    public void escribePregunta(String s){
        pregunta.setText(s);
    }
       @Override 
    public void escribeComprobar(String s){
        comprobar.setText(s);
    }
       @Override 
    public void escribePuntos(String s){
        puntos.setText(s);
    }
       
    public void repetir(String s){
        this.escribePregunta(s);
    }
    
    public ArrayList<String> nuevaPregunta(){
        ArrayList <String> par=new ArrayList();
        par.add(nuevaPre.getText());
        par.add(nuevaRes.getText());
        nuevaPre.setText("");
        nuevaRes.setText("");
        return par;
    }
    
        @Override
public void setControlador(ControlCuestionarioCM c){
botonPuntos.addActionListener(c);
botonComprobar.addActionListener(c);
botonRepetir.addActionListener(c);
botonNueva.addActionListener(c);}

    @Override
public void arranca(){
pack(); // coloca los componentes
setLocationRelativeTo(null); // centra la ventana en la pantalla 
setVisible(true); // visualiza la ventana
}
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        info = new javax.swing.JLabel();
        pregunta = new javax.swing.JLabel();
        respuesta = new javax.swing.JTextField();
        botonComprobar = new javax.swing.JButton();
        botonPuntos = new javax.swing.JButton();
        comprobar = new javax.swing.JLabel();
        puntos = new javax.swing.JLabel();
        botonRepetir = new javax.swing.JButton();
        botonNueva = new javax.swing.JButton();
        pre = new javax.swing.JLabel();
        res = new javax.swing.JLabel();
        peticion = new javax.swing.JLabel();
        nuevaPre = new javax.swing.JTextField();
        nuevaRes = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        info.setText("Responde a la siguiente pregunta");

        botonComprobar.setText("comprobar");

        botonPuntos.setText("ver Puntos");

        botonRepetir.setText("Repetir");
        botonRepetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRepetirActionPerformed(evt);
            }
        });

        botonNueva.setText("Guardar nueva  pregunta");

        pre.setText("Pregunta");

        res.setText("Respuesta");

        peticion.setText("Escribe una nueva pregunta con su respuesta si lo deseas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(respuesta, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                    .addComponent(pregunta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(botonRepetir))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(botonPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(puntos, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(peticion)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pre)
                                    .addComponent(res))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nuevaRes)
                                    .addComponent(nuevaPre, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(292, Short.MAX_VALUE)
                .addComponent(botonNueva)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRepetir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonComprobar)
                    .addComponent(botonPuntos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comprobar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(puntos, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(peticion)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pre)
                    .addComponent(nuevaPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(res)
                    .addComponent(nuevaRes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonNueva))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void botonRepetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRepetirActionPerformed
// TODO add your handling code here:
    
}//GEN-LAST:event_botonRepetirActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCuestionarioCM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCuestionarioCM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCuestionarioCM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCuestionarioCM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VentanaCuestionarioCM().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonComprobar;
    private javax.swing.JButton botonNueva;
    private javax.swing.JButton botonPuntos;
    private javax.swing.JButton botonRepetir;
    private javax.swing.JLabel comprobar;
    private javax.swing.JLabel info;
    private javax.swing.JTextField nuevaPre;
    private javax.swing.JTextField nuevaRes;
    private javax.swing.JLabel peticion;
    private javax.swing.JLabel pre;
    private javax.swing.JLabel pregunta;
    private javax.swing.JLabel puntos;
    private javax.swing.JLabel res;
    private javax.swing.JTextField respuesta;
    // End of variables declaration//GEN-END:variables

    
}
