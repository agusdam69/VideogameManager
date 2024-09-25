import java.io.Console;

public class VideoJuegoFisico extends Videojuego{
    private double envio = 5;
    VideoJuegoFisico(String titulo, String consola, double precioBase,Genero genero) {
        super(titulo, consola, precioBase,genero);
        this.envio = envio;
    }
    private String plataformaCompatible;
    @Override
    public  double calcularPrecioFinal() {
        return  getPrecioBase() + envio;
    }

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
