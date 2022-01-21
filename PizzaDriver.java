/** PizzaDriver.java
*This is a PizzaDriver class
*@version 1.0
*This program contains the main method that runs Pizza and PizzaOrder class.
*/
public class PizzaDriver{
  /** The main method
  * @param args
  */
  public static void main(String[] args){
  Pizza pizza1 = new Pizza("small", 1, 0, 1);
  Pizza pizza2 = new Pizza("large", 2, 2, 0);
  Pizza pizza3 = new Pizza(pizza2);
  Pizza pizza4 = new Pizza(pizza1);
  PizzaOrder order = new PizzaOrder(3);
  System.out.println(order.addPizza(pizza1)); // add pizza1 to the order
  System.out.println(order.addPizza(pizza2)); // add pizza2 to the order
  System.out.println(order.addPizza(pizza3)); // add pizza3 to the order
  System.out.println(order.addPizza(pizza4));
  System.out.println(pizza1.equals(pizza3));
  System.out.println(order);
  }
}
