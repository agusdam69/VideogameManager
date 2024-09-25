import java.io.Console;

public  class VideoJuegoDital extends Videojuego {
    private double  descuento = 0.20;
    public VideoJuegoDital(String titulo, String consola, double precioBase,Genero genero) {
        super(titulo, consola, precioBase,genero);
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase()-(getPrecioBase() * descuento);
    }
    private String plataformaCompatible;
    @Override
    public boolean isCompatible(IConsole console) {
        return console.getPlataforma().equals(plataformaCompatible);
    }

    @Override
    public void encender() {

    }

    @Override
    public void apagar() {

    }

    @Override
    public void instalar() throws JuegoNoCompatibleException {

    }

    @Override
    public void playGame() {

    }

    @Override
    public String getPlataforma() {
        return "";
    }
}
