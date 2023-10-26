package Abstract_Factory;

import Abstract_Factory.products.Chair.VictorianChair;
import Abstract_Factory.products.Sofa.VictorianSofa;
import Abstract_Factory.products.Table.VictorianTable;

class Victorian extends Creator {
    public VictorianChair createChair() {
        return new VictorianChair();
    }

    public VictorianSofa createSofa() {
        return new VictorianSofa();
    }

    public VictorianTable createTable() {
        return new VictorianTable();
    }



}
