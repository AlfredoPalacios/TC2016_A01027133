/**
 * Operaciones
 */
public class Operaciones {
    protected Flotantes[][] matrizFlotantes2;
    protected int contTranspuesta;
    protected int contSuperior;
    protected int contInferior;
    protected int cont1;
    protected int cont2;
    protected int cont3;
    public Operaciones(){
        contTranspuesta = 0;
        contSuperior = 0;
        contInferior = 0;
        cont1=1;
        cont2=1;
        cont3=1;
    }
    public void transponer(MatrizFlotantes matrizFlotantes){
        System.out.println("---------------------------------------------");
        System.out.println("Matriz transpuesta:\n");
        matrizFlotantes2 = new Flotantes[matrizFlotantes.getMatrizFlotantes()[0].length][matrizFlotantes.getMatrizFlotantes().length];
        for(int x=0; x<matrizFlotantes.getMatrizFlotantes().length; x++){
            for(int y=0; y<matrizFlotantes.getMatrizFlotantes()[x].length; y++){
                matrizFlotantes2[y][x] = matrizFlotantes.getMatrizFlotantes()[x][y];
            }
        }
        for(int x=0; x<matrizFlotantes2.length; x++){
            for(int y=0; y<matrizFlotantes2[x].length; y++){
                matrizFlotantes2[x][y].printValue();
                contTranspuesta++;
                if(contTranspuesta==cont1*(matrizFlotantes.getMatrizFlotantes().length)){
                    cont1++;
                    System.out.println();
                }
            }
        }
    }
    
    public void operacionSuperior(MatrizFlotantes matrizFlotantes){
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("Matriz superior:\n");
        for(int x=0; x<matrizFlotantes.getMatrizFlotantes().length; x++){
            for(int y=0; y<matrizFlotantes.getMatrizFlotantes()[x].length; y++){
                if((x==1)&&(y==2)){
                    System.out.println();
                    break;
                }
                if((x==2)&&(y==1)){
                    break;
                }
                matrizFlotantes.getMatrizFlotantes()[x][y].printValue();
                contSuperior++;
                if(contSuperior==cont2*(matrizFlotantes.getMatrizFlotantes().length)){
                    cont2++;
                    System.out.println();
                }
            }
        }
    }
    
    public void operacionInferior(MatrizFlotantes matrizFlotantes){
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("Matriz inferior:\n");
        for(int x=matrizFlotantes.getMatrizFlotantes().length-1; x>=0; x--){
            for(int y=matrizFlotantes.getMatrizFlotantes()[x].length-1; y>=0; y--){
                if((x==1)&&(y==0)){
                    System.out.println();
                    break;
                }
                if((x==0)&&(y==1)){
                    break;
                }
                matrizFlotantes.getMatrizFlotantes()[x][y].printValue();
                contInferior++;
                if(contInferior==cont3*(matrizFlotantes.getMatrizFlotantes().length)){
                    cont3++;
                    System.out.println();
                }
            }
        }
    }
}