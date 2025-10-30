package abstractandinterface;

interface A{
    int a();
    int b();

}
interface B extends A{
    int x();
    int y();

}
abstract class C implements B{
    public abstract void p();
}
class D extends C{
   int u,v;
   D(int u,int v){
       this.u=u;
       this.v=v;
   }

    @Override
    public void p() {
        System.out.println("u%v: " + x() + " u^v: " + y() + " u+v: " + a() + " u*v: " + b());

    }

    @Override
    public int x() {
        return u%v;
    }

    @Override
    public int y() {
        return (int) Math.pow(u,v);
    }



    @Override
    public int a() {
        return u+v;
    }

    @Override
    public int b() {
        return u*v;
    }
}
public class Fall2024 {
    public static void main(String[] args) {
        D d = new D(10,20);
        d.p();

    }
}
