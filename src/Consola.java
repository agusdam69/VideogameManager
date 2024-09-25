public class Consola implements IConsole{
    private Plataforma plataforma;
    public Consola(Plataforma plataforma) {
    this.plataforma = plataforma;

    }

    @Override
    public void encender() {
        System.out.println("Encendiendo ....: ");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando ....:");
    }

    @Override
    public void instalar(Videojuego game) throws JuegoNoCompatibleException {

        if (this.plataforma.equals(game.plataforma)){
            System.out.println("El juego es compatible");
            System.out.println("Se procede a la instalacion... ");
        } else{
            throw new JuegoNoCompatibleException();
        }
    }

    @Override
    public void playGame() {

    }






}
