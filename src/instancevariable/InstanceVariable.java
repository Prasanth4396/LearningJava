package instancevariable;

public class InstanceVariable {
    int c;

    public void addition(){
        int a=10;
        int b=20;
        c=a+b;
        System.out.println("the addition of a and b is " + c);

    }
    public void difference(){
        int x=50;
        int y=20;
        c=x-y;
        System.out.println("the difference is x and y is "+ c);
    }
    public static void main(String[] args){
        InstanceVariable ins1=new InstanceVariable();
        ins1.addition();
        ins1.difference();

    }

}
