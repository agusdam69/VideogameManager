public class Consola extends Videojuego implements IConsole{
    public Consola(String titulo, String consola, double precioBase, Genero genero,Plataforma plataforma) {
        super(titulo, consola, precioBase, genero, plataforma);
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando");
    }

    @Override
    public void instalar() throws JuegoNoCompatibleException {
        Plataforma compatible = null;
        if (getPlataforma().equals(compatible)){
            System.out.println("Instalando");
        } else{
            throw new JuegoNoCompatibleException();
        }
    }

    @Override
    public void playGame() {

    }



    @Override
    public double calcularPrecioFinal() {
        return 0;
    }


}
