import java.io.Console;

public  class VideoJuegoDital extends Videojuego {
    private double  descuento = 0.20;
    public VideoJuegoDital(String titulo,  double precioBase,Genero genero,Plataforma plataforma) {
        super(titulo,  precioBase,genero,plataforma);
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase()-(getPrecioBase() * descuento);
    }
    private String plataformaCompatible;


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
