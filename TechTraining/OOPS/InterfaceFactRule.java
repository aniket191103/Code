interface A{
int MAX = 100;
void show();
}
interface B extends A{
   int MAX =20; 
   void show();
}
interface C extends A,B{
    
}
public class InterfaceFactRule {
    
}
