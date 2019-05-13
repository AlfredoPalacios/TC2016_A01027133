/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
        MatrizFlotantes matrizFlotantes = new MatrizFlotantes(3, 3);
        Flotantes num1 = new Flotantes();
        num1.setValue(3.2f);
        Flotantes num2 = new Flotantes();
        num2.setValue(4.5f);
        Flotantes num3 = new Flotantes();
        num3.setValue(9.2f);
        Flotantes num4 = new Flotantes();
        num4.setValue(1.2f);
        Flotantes num5 = new Flotantes();
        num5.setValue(4.3f);
        Flotantes num6 = new Flotantes();
        num6.setValue(8.2f);
        Flotantes num7 = new Flotantes();
        num7.setValue(3.3f);
        Flotantes num8 = new Flotantes();
        num8.setValue(6.6f);
        Flotantes num9 = new Flotantes();
        num9.setValue(4.4f);
        matrizFlotantes.setXY(0, 0, num1);
        matrizFlotantes.setXY(1, 0, num2);
        matrizFlotantes.setXY(2, 0, num3);
        matrizFlotantes.setXY(0, 1, num4);
        matrizFlotantes.setXY(1, 1, num5);
        matrizFlotantes.setXY(2, 1, num6);
        matrizFlotantes.setXY(0, 2, num7);
        matrizFlotantes.setXY(1, 2, num8);
        matrizFlotantes.setXY(2, 0, num9);
        matrizFlotantes.getMatrizFlotantes()[1][1].printValue();
        operaciones.transponer(matrizFlotantes);
        operaciones.operacionSuperior(matrizFlotantes);
        operaciones.operacionInferior(matrizFlotantes);
    }
}