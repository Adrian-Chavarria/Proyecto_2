/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package modelo;

import proyecto2.Pelicula;
import modelo.Movies;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.image.BufferedImage;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyecto2.datosTrailer;

/**
 *
 * @author ESTUDIANTE
 */
/**
 * The Interface class represents the main graphical interface of MoviePrime.
 * Provides functionalities to show movies, search by different criteria
 * and play trailers associated with the films.
 */
public class Interfaz extends javax.swing.JFrame {
 private Movies movies;
    
 
    /**
     * Creates new form Interfaz
     */
  /**
     * Constructor of the Interface class.
     * Initialize the graphical interface and load all available movies at 
     * startup.
     */
 public Interfaz() {
     /**Initialize GUI components*/
    initComponents();
    /**Initialize your Movies instance to access movies*/
    movies = new Movies();

   /**Get All Movies When You Launch the Interface*/
    ArrayList<Pelicula> todasLasPeliculas = movies.obtenerPeliculas();
    //Display all movies in the interface at startup
    mostrarPeliculasEnInterfaz(todasLasPeliculas);
}
    /**
     * Muestra las películas proporcionadas en la interfaz gráfica.
     * @param peliculas ArrayList de películas a mostrar.
     */
private void mostrarPeliculasEnInterfaz(ArrayList<Pelicula> peliculas) {
   /**Build a text with the information of the films to be shown in the 
    * JTextArea*/
    
    StringBuilder peliculasTexto = new StringBuilder();
    /**Add the information from each movie to the text*/
    for (Pelicula pelicula : peliculas) {
        peliculasTexto.append("ID: ").append(pelicula.getId()).append("\n");
        /**Get the original title (if available in the Movie class)*/
        String originalTitle = pelicula.getOriginalTitle(); 
        
        /**Get the poster path (if available in the Movie class)*/
        String posterPath = pelicula.getPosterPath(); 
        
        /**Construct the text with the information of each film*/
        peliculasTexto.append("Título: ").append(pelicula.getTitulo())
                .append("\n");
        
        /**Add the original title if available*/
        if (originalTitle != null && !originalTitle.isEmpty()) {
            peliculasTexto.append("Título Original: ").append(originalTitle)
                    .append("\n");
        }
      
            peliculasTexto.append("Ruta del Póster: ").append(posterPath)
                    .append("\n");
        
        peliculasTexto.append("Resumen: ").append(pelicula.getOverview())
                .append("\n");
        int year = pelicula.getReleaseDate().getYear();
      peliculasTexto.append("Año: ").append(year).append("\n");
      
      
        peliculasTexto.append("\n");
    }
    
    
   /** Placing the Text in the JTextArea*/
    jTextArea1.setText(peliculasTexto.toString());
    
  /** Placing the JTextArea in the JScrollPane*/
    jScrollPane1.setViewportView(jTextArea1);
}

/**
 * Search for movies based on the search criteria and text provided.
 * @param textSearch Text to search within the movies.
 * @param type Search Criteria type: "Title", "Id" or "Year".
 * @return ArrayList of movies that match your search criteria.
 */
private ArrayList<Pelicula> buscarPeliculas(String textoBusqueda, String
        tipoBusqueda) {
    ArrayList<Pelicula> peliculas = movies.obtenerPeliculas();
    ArrayList<Pelicula> peliculasEncontradas = new ArrayList<>();
    
    for (Pelicula pelicula : peliculas) {
        String valorBuscado = "";
      /**Determine which field in your movie to use for your search*/
        switch (tipoBusqueda) {
            case "Titulo":
                valorBuscado = pelicula.getTitulo();
                break;
            case "Id":
                 
      
                
                
                break;
            case "Año":
               int añoBuscado = Integer.parseInt(textoBusqueda); 
              /**  Get the year of the movie*/
    int anioPelicula = pelicula.getReleaseDate().getYear(); 
    /**Get the Year of the Movie*/
    try{
    if (anioPelicula == añoBuscado) { 
        /**Compare the year of the movie to the year you searched for*/
        peliculasEncontradas.add(pelicula);
    }
    } catch(NumberFormatException e){
        /**Error handling if it can't be converted to number*/
        System.out.println("Error al convertir a número: " + e.getMessage());
    }     
                break;
            
        }
        
        /**Perform the comparison to see if it matches the search text*/
        if (valorBuscado != null && valorBuscado.toLowerCase().contains
        (textoBusqueda.toLowerCase())) {
            peliculasEncontradas.add(pelicula);
        }
    }
   
    return peliculasEncontradas;
}




    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblImagenLogo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCollage = new javax.swing.JLabel();
        bntBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        cmbTiposdeBusqueda = new javax.swing.JComboBox<>();
        lblTipoBusqueda = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        lblImagenLogo.setBackground(new java.awt.Color(255, 255, 255));
        lblImagenLogo.setForeground(new java.awt.Color(255, 255, 255));
        lblImagenLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modelo/Logo3.1.png"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MoviePrime");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lblImagenLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addComponent(lblImagenLogo)
                .addContainerGap(311, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 710));

        lblCollage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modelo/collage 6.png"))); // NOI18N
        jPanel1.add(lblCollage, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, 420, 710));

        bntBuscar.setBackground(new java.awt.Color(204, 204, 204));
        bntBuscar.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        bntBuscar.setText("Buscar");
        bntBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(bntBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 190, 110, 40));
        bntBuscar.getAccessibleContext().setAccessibleName("btnBuscar");

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(204, 204, 204));
        txtBuscar.setText("Buscar pelicula");
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarMousePressed(evt);
            }
        });
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 320, 30));
        txtBuscar.getAccessibleContext().setAccessibleName("buscarTxt");

        cmbTiposdeBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Titulo", "ID", "Año" }));
        cmbTiposdeBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTiposdeBusquedaActionPerformed(evt);
            }
        });
        jPanel1.add(cmbTiposdeBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 120, 40));

        lblTipoBusqueda.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        lblTipoBusqueda.setText("Tipo de Busqueda");
        jPanel1.add(lblTipoBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 150, 40));

        lblTitulo.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        lblTitulo.setText("MoviePrime");
        lblTitulo.setToolTipText("");
        lblTitulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 260, 70));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 520, 310));

        jButton1.setText("Trailer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 550, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMousePressed
        txtBuscar.setText("");
        txtBuscar.setForeground (Color.black); 
        
    }//GEN-LAST:event_txtBuscarMousePressed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void bntBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBuscarActionPerformed
        // TODO add your handling code here:
       String textoBusqueda = txtBuscar.getText();
    String tipoBusqueda = (String) cmbTiposdeBusqueda.getSelectedItem();

    ArrayList<Pelicula> peliculasEncontradas = buscarPeliculas(textoBusqueda, 
            tipoBusqueda);
    
    mostrarPeliculasEnInterfaz(peliculasEncontradas);
    }//GEN-LAST:event_bntBuscarActionPerformed

    private void cmbTiposdeBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTiposdeBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTiposdeBusquedaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     // TODO add your handling code here:
         ArrayList<Pelicula> peliculas = movies.obtenerPeliculas();
    ArrayList<Pelicula> peliculasEncontradas = new ArrayList<>();
    
  for (Pelicula pelicula : peliculas) {
    
    /**   Get the Movie ID*/
        String movieId = pelicula.getId();
    
    /**Get the trailer key using the getLinkTrailer feature*/
    String trailerKey = movies.obtenerLinkTrailer(movieId);
    
    if (trailerKey != null && !trailerKey.isEmpty()) {
        /** Open the browser with the trailer link when the button is clicked*/
        try {
            Desktop.getDesktop().browse(new URI
        ("https://www.youtube.com/watch?v=" + trailerKey));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }
    }
    

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntBuscar;
    private javax.swing.JComboBox<String> cmbTiposdeBusqueda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblCollage;
    private javax.swing.JLabel lblImagenLogo;
    private javax.swing.JLabel lblTipoBusqueda;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables


}
