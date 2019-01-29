public class Fractions{
    
    private int numerador;
    private int denominador;

    public Fractions(){
        System.out.println("Constructor sin parámetros.");
    }

    public Fractions(int numerador, int denominador){
        this.numerador=numerador;
        this.denominador=denominador;
    }

    public int getNum(){
        return numerador;
    }

    public int getDen(){
        return denominador;
    }

    public int calculateMCD(int numerador, int denominador){

        if(numerador%denominador==0){
            return denominador;
        }
        return calculateMCD(denominador, numerador%denominador);

    }

    public void simplify(){

        int mcd=calculateMCD(numerador, denominador);
        numerador /= mcd;
        denominador /= mcd;

    }

    public Fractions sum(Fractions fraction1){

        int sumNum=0;
        int sumDen=0;
        int multDenoms=0;
        int sumNums=0;

        multDenoms=denominador*fraction1.getDen();
        sumNums=(multDenoms*denominador/numerador)+(multDenoms*fraction1.getDen()/fraction1.getNum());
        Fractions result=new Fractions(sumNums, multDenoms);

        return result;

    }

    public Fractions substract(Fractions fraction2){

        int sumNum=0;
        int sumDen=0;
        int multDenoms=0;
        int sumNums=0;

        multDenoms=denominador*fraction2.getDen();
        sumNums=(multDenoms*denominador/numerador)-(multDenoms*fraction2.getDen()/fraction2.getNum());
        Fractions result=new Fractions(sumNums, multDenoms);

        return result;

    }

    public Fractions multiply(Fractions fraction3){

        int resNum=0;
        int resDen=0;
        Fractions result;

        resNum=numerador*fraction3.getNum();
        resDen=denominador*fraction3.getDen();
        result=new Fractions(resNum, resDen);

        return result;

    }

    public Fractions divide(Fractions fraction4){

        int resNum=0;
        int resDen=0;

        resNum=numerador*fraction4.getDen();
        resDen=denominador*fraction4.getNum();
        Fractions result=new Fractions(resNum, resDen);

        return result;

    }

    public void printFraction(){

        System.out.print(numerador + "/" + denominador + "\n");

    }

}