public  class VideoJuegoDital extends Videojuego {
    private double  descuento = 0.20;
    public VideoJuegoDital(String titulo, String consola, double precioBase,Genero genero) {
        super(titulo, consola, precioBase,genero);
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase()-(getPrecioBase() * descuento);
    }

}
