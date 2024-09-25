public interface IConsole {
    void encender();
    void apagar();
    void instalar(Videojuego game)throws JuegoNoCompatibleException;
    void playGame();
//    String getPlataforma();
}
