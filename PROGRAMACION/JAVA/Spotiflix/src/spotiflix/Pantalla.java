package spotiflix;

import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author tomaa
 */
public class Pantalla extends javax.swing.JFrame {

MediaPlayer mediaPlayer;
Media Media;

    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
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
        botonRight = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        botonLeft = new javax.swing.JButton();
        botonPlay = new javax.swing.JButton();
        botonPause = new javax.swing.JButton();
        botonStop = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1185, 849));
        setMinimumSize(new java.awt.Dimension(1185, 849));
        setPreferredSize(new java.awt.Dimension(1185, 849));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Spotifai y Nesflis");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        botonRight.setText(">>");
        botonRight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonRightMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRightMouseExited(evt);
            }
        });
        botonRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRightActionPerformed(evt);
            }
        });
        getContentPane().add(botonRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        jList1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jList1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Gladiator", "Dragostea Din Tei", "La luna me sabe a poco" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 160, -1));

        botonLeft.setText("<<");
        botonLeft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonLeftMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonLeftMouseExited(evt);
            }
        });
        botonLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLeftActionPerformed(evt);
            }
        });
        getContentPane().add(botonLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 70, -1));

        botonPlay.setText("Play");
        botonPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonPlayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonPlayMouseExited(evt);
            }
        });
        botonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPlayActionPerformed(evt);
            }
        });
        getContentPane().add(botonPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        botonPause.setText("Pause");
        botonPause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonPauseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonPauseMouseExited(evt);
            }
        });
        botonPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPauseActionPerformed(evt);
            }
        });
        getContentPane().add(botonPause, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        botonStop.setText("Stop");
        botonStop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonStopMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonStopMouseExited(evt);
            }
        });
        botonStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonStopActionPerformed(evt);
            }
        });
        getContentPane().add(botonStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 400, 60));

        jSlider1.setValue(0);
        jSlider1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jSlider1MouseDragged(evt);
            }
        });
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, 20));

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void reproducirCancion(String fileName) {
        File file = new File("Musica/" + fileName);
        if (!file.exists()) {
            JOptionPane.showMessageDialog(this, "Archivo no encontrado: " + fileName);
            return;
        }
        
        String path = file.toURI().toString();
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
        Media= new Media(path);
        mediaPlayer = new MediaPlayer(Media);
        jLabel2.setText(fileName);
        mediaPlayer.play();
    }
    private void botonRightMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRightMouseEntered
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_botonRightMouseEntered

    private void botonRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRightActionPerformed
    int posicion = jList1.getSelectedIndex() +1 ;
    jLabel3.setText(String.valueOf(jList1.getModel()));
        if (posicion < jList1.getModel().getSize()) {
            jList1.setSelectedIndex(posicion);
            String fileName = jList1.getSelectedValue() + ".mp3";
            reproducirCancion(fileName);
        }
    }//GEN-LAST:event_botonRightActionPerformed

    private void botonLeftMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLeftMouseEntered
  
    }//GEN-LAST:event_botonLeftMouseEntered

    private void botonLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLeftActionPerformed
    int posicion = jList1.getSelectedIndex() - 1;
        if (posicion >= 0) {
            jList1.setSelectedIndex(posicion);
            String fileName = jList1.getSelectedValue() + ".mp3";
            reproducirCancion(fileName);
        }
    
       
    }//GEN-LAST:event_botonLeftActionPerformed

    private void botonPlayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPlayMouseEntered
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_botonPlayMouseEntered

    private void botonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPlayActionPerformed
    if (mediaPlayer != null) {
            mediaPlayer.play();
        }  
    timer.start();
    
    }//GEN-LAST:event_botonPlayActionPerformed

    private void botonPauseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPauseMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_botonPauseMouseEntered

    private void botonPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPauseActionPerformed
    if (mediaPlayer != null) {
            mediaPlayer.pause();
        }       
    timer.stop();
    }//GEN-LAST:event_botonPauseActionPerformed

    private void botonStopMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonStopMouseEntered
     
    }//GEN-LAST:event_botonStopMouseEntered

    private void botonStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonStopActionPerformed
    if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    timer.restart();
    }//GEN-LAST:event_botonStopActionPerformed

    private void botonLeftMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLeftMouseExited
    
    }//GEN-LAST:event_botonLeftMouseExited

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
    String fileName = jList1.getSelectedValue() + ".mp3";
        reproducirCancion(fileName);
    }//GEN-LAST:event_jList1MouseClicked

    private void botonPlayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPlayMouseExited
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_botonPlayMouseExited

    private void botonPauseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPauseMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_botonPauseMouseExited

    private void botonStopMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonStopMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_botonStopMouseExited

    private void botonRightMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRightMouseExited
        // TODO add your handling code here:
        
    
    }//GEN-LAST:event_botonRightMouseExited

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formMouseEntered

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formMouseDragged

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formMouseMoved

    private void jSlider1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MouseDragged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jSlider1MouseDragged
    public void tiempo(){
        
    }
    /**
     * @param args the command line arguments
     */Timer timer = new Timer (1000, new ActionListener (){
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e){
        //este codigo se repite cada 1000 ms
        jSlider1.setValue((int)(mediaPlayer.getCurrentTime().toSeconds()*100.0)/(int)mediaPlayer.getTotalDuration().toSeconds());
        
    } 
    });
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonLeft;
    private javax.swing.JButton botonPause;
    private javax.swing.JButton botonPlay;
    private javax.swing.JButton botonRight;
    private javax.swing.JButton botonStop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}