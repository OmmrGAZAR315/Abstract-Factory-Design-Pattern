package Abstract_Factory.products.Table;

import Abstract_Factory.products.ITable;

public class ModernTable implements ITable {
  @Override
  public void display() {
    System.out.println("Hello from Modern Table");
  }
}
