import Abstract_Factory.Creator;
import Abstract_Factory.Factory;
import Abstract_Factory.products.IChair;
import Abstract_Factory.products.ISofa;
import Abstract_Factory.products.ITable;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Creator m1 = factory.createAbstractFactory("Modern");
        IChair c1 = m1.createChair();
        c1.display();
        ISofa s1 = m1.createSofa();
        s1.display();
        ITable t1 = m1.createTable();
        t1.display();

        Creator v1 = factory.createAbstractFactory("Victorian");
        IChair c2 = v1.createChair();
        c2.display();
        ISofa s2 = v1.createSofa();
        s2.display();
        ITable t2 = v1.createTable();
        t2.display();


    }
}