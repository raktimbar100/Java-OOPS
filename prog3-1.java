import java.util.*;
class ConvToFar{
double t,c;
void process(double t)
{
  c=(5*(t-32))/9;
  System.out.println("Temparature in celsius is:"+c);

}


}
class Temp{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter temparature in farenhite ");
double d=sc.nextDouble();
ConvToFar obj=new ConvToFar();
obj.process(d);
}
}
