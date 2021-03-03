 abstract class Calculator implements CalcInterface{
    double[] num;
    char[] op;
    String s;
    int len; int prev; String temp;
    int pos;
    int OpPos; int NumPos; double result;
    Calculator(String s) {
        result=0;
        this.s=s;
        len=s.length();
        num=new double[20];
        op=new char[20];
        prev=0;pos=0;OpPos=1;NumPos=0;
        GetNumOp();
        //for(int i=0; i<=NumPos; i+=2){ System.out.print(num[i]+" ");}
        //for(int i=1; i<=OpPos; i+=2){ System.out.print(op[i]+" ");}

        Calculate();
        result = num[0];
        //System.out.println("\nresult="+result);
    }
}
