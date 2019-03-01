/**
 * RelatedThings
 */
public interface RelatedThings {
    double getArea();
    double getPerimeter();
    /*
    int getNumLados();
    int getBaseMa();
    int getBaseMe();
    int getAltura();
    int getDiag1();
    int getDiag2();
    double getLado1();
    double getLado2();
    double getLado3();
    double getLado4();
    default int getArea(RelatedThings a){
        if(getNumLados()==3){
            return (a.getBaseMa()*(a.getAltura())/2);
        }
        else if(getNumLados()==4&&(a.getDiag1()==0&&a.getDiag2()==0)){
            if(a.getBaseMe()==0&&(a.getBaseMa()==a.getAltura())){
                return a.getBaseMa()*a.getAltura();
            }
            else if(a.getBaseMe()==0&&(a.getBaseMa()!=a.getAltura())){
                return a.getBaseMa()*a.getAltura();
            }
            else if(a.getBaseMe()!=0){
                return a.getAltura()*((a.getBaseMe()+a.getBaseMa())/2);
            }
        }
        else if(getNumLados()==4&&(a.getDiag1()!=0)){
            return (a.getDiag1()*a.getDiag2())/2;
        }
        return a.getBaseMa()*a.getAltura();
    }
    default double getPerimetro(RelatedThings b){
        if(b.getNumLados()==3){
            return b.getLado1()+b.getLado2()+b.getLado3();
        }
        return b.getLado1()+b.getLado2()+b.getLado3()+b.getLado4();
    }
    */
}