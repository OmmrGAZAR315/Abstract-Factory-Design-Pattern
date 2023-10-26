package Abstract_Factory;

import Abstract_Factory.products.Chair.ModernChair;
import Abstract_Factory.products.Sofa.ModernSofa;
import Abstract_Factory.products.Table.ModernTable;

class Modern extends Creator {
    public ModernChair createChair() {
        return new ModernChair();
    }

    public ModernSofa createSofa() {
        return new ModernSofa();
    }

    public ModernTable createTable() {
        return new ModernTable();
    }



}
