import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws JuegoNoCompatibleException {
//        System.out.println("JUEGOTI CHULIPINTSTICO");
//        System.out.println("======================");
//        VideoJuegoFisico vf = new VideoJuegoFisico("CS", "PS5", 20, Genero.ACCION);
//        double precioFinal = vf.calcularPrecioFinal();
//        System.out.println(vf);
//        System.out.println("Precio más gasto de envio= " + precioFinal);
//        System.out.println("---");
//        VideoJuegoDital vd = new VideoJuegoDital("ARK","PC",20,Genero.ACCION);
//        double precioFinal2 = vd.calcularPrecioFinal();
//        System.out.println(vd);
//        System.out.println("Precio con descuento de vip Digital= " + precioFinal2);

        Consola c = new Consola(Plataforma.Playstation);
        VideoJuegoFisico vf = new VideoJuegoFisico("wukong",20,Genero.ACCION,Plataforma.Playstation);
        c.instalar(vf);
        System.out.println(c);
    }
}