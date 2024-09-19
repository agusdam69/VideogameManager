public abstract  class  Videojuego{
    private String titulo;
     private String consola;
     private double precioBase;
     private  String genero
    public Videojuego(String titulo, String consola, double precioBase) {
        this.titulo = titulo;
        this.consola = consola;
        this.precioBase = precioBase;
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
                    && this.precioBase == v.precioBase;
        }
        return testOK;
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return String.format("VideoJuego: %s%n Consola: %s%n Precio: %s%n", titulo, consola, precioBase);
    }
}

