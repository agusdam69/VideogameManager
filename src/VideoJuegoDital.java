public  class VideoJuegoDital extends Videojuego {
    private double  descuento = 0.20;
    public VideoJuegoDital(String titulo, String consola, double precioBase) {
        super(titulo, consola, precioBase);
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase() * descuento;
    }

}
