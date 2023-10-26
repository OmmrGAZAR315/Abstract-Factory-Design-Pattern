package Abstract_Factory.products.Sofa;

import Abstract_Factory.products.ISofa;

public class VictorianSofa implements ISofa {
    @Override
    public void display() {
        System.out.println("Hello from Victorian Sofa");
    }
}
