public class Test{
public static void main(String args[]){
Artist A1=new Artist("aslam");

Artwork Art1=new Artwork("Asma",12,A1);

Artwork Art2=new Artwork("Asma",13);

Art2.settitle("Asma");
Art2.setyear(15);

System.out.println(Art1);
System.out.println(Art2);

Artwork Art3=Art1.shallowcopy();//shallow copy
Artwork Art4=Art1.deepcopy();  //deep copy

System.out.println(Art1);
System.out.println(Art3);

System.out.println(Art4);
A1.setname("Ali");

System.out.println(Art1);
System.out.println(Art3);
System.out.println(Art4);

if(Art3.equals(Art4))
System.out.println("equal");
else
System.out.println("not equal");















}}