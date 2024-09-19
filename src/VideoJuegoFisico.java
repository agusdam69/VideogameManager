public class VideoJuegoFisico extends Videojuego{
    private double envio = 5;
    VideoJuegoFisico(String titulo, String consola, double precioBase,Genero genero) {
        super(titulo, consola, precioBase,genero);
        this.envio = envio;
    }

    @Override
    public  double calcularPrecioFinal() {
        return  getPrecioBase() + envio;
    }

}
