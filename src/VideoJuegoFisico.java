import java.io.Console;

public class VideoJuegoFisico extends Videojuego{
    private double envio = 5;
    VideoJuegoFisico(String titulo,  double precioBase,Genero genero,Plataforma plataforma) {
        super(titulo,  precioBase,genero,plataforma);
        this.envio = envio;
    }
    private String plataformaCompatible;
    @Override
    public  double calcularPrecioFinal() {
        return  getPrecioBase() + envio;
    }

    @Override
    public void encender() {

    }

    @Override
    public void apagar() {

    }

    @Override
    public void instalar(Videojuego game) throws JuegoNoCompatibleException {

    }

    @Override
    public void playGame() {

    }


}
