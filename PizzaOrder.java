/** PizzaOrder.java
*This is a PizzaOrder class
*@version 1.0
*This program stores the information for multiple pizzas and includes two methods addPizza, which adds a pizza to the order, and calcTotal, which
  calculates the total cost of the order.
*/
public class PizzaOrder{

  /**The pizza orders*/
  private Pizza[] m_order;
  /**The number of pizzas on the order*/
  private int m_numPizzas;
  /**The index of the pizza in the order array*/
  private int index = 0;

  /**The default constructors
  */
  public PizzaOrder(){
    m_numPizzas = 1;
    m_order = new Pizza[m_numPizzas];
    m_order[0] = new Pizza("large", 1, 0, 0);
  }

  /**An overloaded constructor that creates a pizza order
  * @param count - the number of pizzas in the order
  */
  public PizzaOrder(int numPizzas){
    m_numPizzas = numPizzas;
    m_order = new Pizza[m_numPizzas];
  }

  /**The addPizza method that adds object pizza to the pizza order array
  * @param pizza - the pizza object to add
  */
  public int addPizza(Pizza pizza){
    int success = 0;
    if(index > (m_numPizzas-1)){
      System.out.println("Pizza order is full.");
      return success = -1;
    }
    m_order[index] = pizza;

    index += 1;
    return success = 1;
  }

  /**The calcTotal method that finds the total cost of the pizza orders
  * @return a double that represents the total order
  */
  public double calcTotal(){
    double totalCost = 0.0;
    for(int i = 0; i < this.m_numPizzas; ++i){
      totalCost += this.m_order[i].calcCost();
    }
    return totalCost;
  }

  /**The toString method that provides a formatted string representation of the pizza order
  * @return a formatted string
  */
  public String toString(){
    String s = "";
    s += "$" + calcTotal();
    s += "\n" + m_numPizzas + " Pizzas";
    s += "\n";
    for(int i = 0; i < m_numPizzas; ++i){
      s += m_order[i].toString();
    }
    return s;
  }
}
