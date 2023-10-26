package Abstract_Factory.products.Chair;

import Abstract_Factory.products.IChair;

public class ModernChair implements IChair {


    @Override
    public void display() {
        System.out.println("Hello from Modern Chair");
    }
}
