import java.io.Console;
import java.util.Objects;

public abstract  class  Videojuego implements IConsole {

    private String titulo;
     private String consola;
     private double precioBase;
     private  Genero genero;
     private Plataforma plataforma;
    public Videojuego(String titulo, String consola, double precioBase,Genero genero,Plataforma plataforma) {
        this.titulo = titulo;
        this.consola = consola;
        this.precioBase = precioBase;
        this.genero = genero;
        this.plataforma = plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setGenero(Genero genero) {

        this.genero = genero;
    }

    public Genero getGenero() {
        return genero;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public String getConsola() {
        return consola;
    }


    public void setPrecioBase(double precioBase) {

        this.precioBase = precioBase;
    }


    public double getPrecioBase() {
        return precioBase;
    }

    public abstract double calcularPrecioFinal();

    @Override
    public boolean equals(Object o) {
        //valor de retorno
        boolean testOK;
        //discriminación
        if (o == null) {
            testOK = false;
        } else if (!(o instanceof Videojuego)) {
            testOK = false;
        } else {
            Videojuego v = (Videojuego) o;
            testOK = this.titulo == v.titulo
                    && this.consola == v.consola
                    && this.precioBase == v.precioBase
                    && this.genero == v.genero;
        }
        return testOK;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, consola, precioBase, genero);
    }

    @Override
    public String toString() {
        return String.format("VideoJuego: %s%nGenero: %s%nConsola: %s%nPrecio: %s%n", titulo, genero,consola, precioBase);
    }
}

