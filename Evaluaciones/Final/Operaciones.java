/**
 * Operaciones
 */
public class Operaciones {
    protected Flotantes[][] matrizFlotantes2;
    public Operaciones(){
    }
    public void transponer(MatrizFlotantes matrizFlotantes){
        System.out.println("---------------------------------------------");
        matrizFlotantes2 = matrizFlotantes.getMatrizFlotantes();
        for(int x=0; x<matrizFlotantes.getMatrizFlotantes().length-1; x++){
            for(int y=0; y<matrizFlotantes.getMatrizFlotantes()[x].length-1; y++){
                matrizFlotantes2[y][x] = matrizFlotantes.getMatrizFlotantes()[x][y];
            }
        }
        for(int x=0; x<matrizFlotantes2.length-1; x++){
            for(int y=0; y<matrizFlotantes2[x].length-1; y++){
                matrizFlotantes2[x][y].printValue();
            }
        }
        System.out.println("---------------------------------------------");
    }
    
    public void operacionSuperior(MatrizFlotantes matrizFlotantes){
        for(int x=0; x<matrizFlotantes.getMatrizFlotantes().length-1; x++){
            for(int y=0; y<matrizFlotantes.getMatrizFlotantes().length-1; y++){
                if(x==1){
                    y++;
                }
                if(x==2){
                    y=y+2;
                }
                matrizFlotantes.getMatrizFlotantes()[x][y].printValue();
            }
        }
        System.out.println("---------------------------------------------");
    }
    
    public void operacionInferior(MatrizFlotantes matrizFlotantes){
        for(int x=matrizFlotantes.getMatrizFlotantes().length; x>0; x--){
            for(int y=matrizFlotantes.getMatrizFlotantes().length; y>0; y--){
                if(x==2){
                    y--;
                }
                if(x==1){
                    y=y-2;
                }
                matrizFlotantes.getMatrizFlotantes()[x][y].printValue();
            }
        }
    }
}