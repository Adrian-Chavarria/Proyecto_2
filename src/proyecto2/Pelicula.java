/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

import com.google.gson.JsonElement;
import java.time.LocalDate;
import java.util.List;
import javax.swing.ImageIcon;

public class Pelicula {
    private String titulo;
    private String originalTitle;
    private String overview;
    private String posterPath;
    private LocalDate releaseDate;
      private String id;
      private String trailerKey;

    public Pelicula(String titulo, String originalTitle, String overview, 
            String posterPath, LocalDate releaseDate, String id) {
        this.titulo = titulo;
        this.originalTitle = originalTitle;
        this.overview = overview;
        this.posterPath = posterPath;
        this.releaseDate = releaseDate;
        this.id = id;
         
     
    }
 
   
    

    public Pelicula() {
    }

   

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }


    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

   

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", originalTitle=" +
                originalTitle + ", overview=" + overview + ", posterPath=" + 
                posterPath + ", releaseDate=" + releaseDate + ", id=" + id +
                '}';
    }

    public String getTrailerKey() {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

   

   
     
}
