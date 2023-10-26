package Abstract_Factory;

import Abstract_Factory.products.IChair;
import Abstract_Factory.products.ISofa;
import Abstract_Factory.products.ITable;

public abstract class Creator {
    public abstract IChair createChair();

    public abstract ISofa createSofa();


    public abstract ITable createTable();


}
