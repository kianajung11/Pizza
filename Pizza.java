/** Pizza.java
*This is a Pizza class
*@version 1.0
*This program stores the information for a single pizza including the size and number of cheese, pepperoni, and veggie toppings,
  and takes those attributes to find the total cost of the single pizza.
*/
public class Pizza{

  /**The size of the pizza*/
  private String m_size;
  /**The number of cheese toppings*/
  private int m_cheeseToppings;
  /**The number of pepperoni toppings*/
  private int m_pepperoniToppings;
  /**The number of veggie toppings*/
  private int m_veggieToppings;

  /**The default constructors
  */
  public Pizza(){
    m_size = "Unknown";
    m_cheeseToppings = 0;
    m_pepperoniToppings = 0;
    m_veggieToppings = 0;
  }

  /**An overloaded constructor that creates a pizza from a size and number of cheese, pepperoni, and veggie toppings
  * @param size - the size of the pizza
  * @param cheese - the number of cheese toppings
  * @param pepperoni - the number of pepperoni toppings
  * @param veggies - the number of veggie toppings
  */
  public Pizza(String size, int cheese, int pepperoni, int veggies){
    m_size = size;
    m_cheeseToppings = cheese;
    m_pepperoniToppings = pepperoni;
    m_veggieToppings = veggies;
  }

  /**The copy constructors
  * @param p - the pizza to copy
  */
  public Pizza(Pizza p){
    this.m_size = p.m_size;
    this.m_cheeseToppings = p.m_cheeseToppings;
    this.m_pepperoniToppings = p.m_pepperoniToppings;
    this.m_veggieToppings = p.m_veggieToppings;
  }

  /**The accessor for size attributes
  * @return a string representing the size
  */
  public String getSize(){
   return m_size;
  }

  /**The accessor for cheese topping attributes
  * @return a int representing the number of cheese toppings
  */
  public int getCheeseToppings(){
   return m_cheeseToppings;
  }

  /**The accessor for pepperoni topping attributes
  * @return a int representing the number of pepperoni toppings
  */
  public int getPepperoniToppings(){
   return m_pepperoniToppings;
  }

  /**The accessor for veggie topping attributes
  * @return a int representing the number of veggie toppings
  */
  public int getVeggieToppings(){
   return m_veggieToppings;
  }

  /**The mutator for size
  * @param size - the size of the pizza
  */
  public void setSize(String size){
    m_size = size;
  }

  /**The mutator for the cheese toppings
  * @param cheese - the number of cheese toppings
  */
  public void setCheeseToppings(int cheese){
    m_cheeseToppings = cheese;
  }

  /**The mutator for the cheese toppings
  * @param cheese - the number of cheese toppings
  */
  public void setPepperoniToppings(int pepperoni){
    m_pepperoniToppings = pepperoni;
  }

  /**The mutator for the cheese toppings
  * @param cheese - the number of cheese toppings
  */
  public void setVeggieToppings(int veggies){
    m_veggieToppings = veggies;
  }

  /**The calcCost method that finds the total cost of the pizza based on size and number of each toppings
  * @return a double that represents the cost of the pizza
  */
  public double calcCost(){
    double cost = 0.0;
    if (m_size == "small" || m_size == "Small"){
      cost = 10.0 + (m_cheeseToppings*2.0) + (m_pepperoniToppings*2.0) + (m_veggieToppings*2.0);
    }
    else if (m_size == "medium" || m_size == "Medium"){
      cost = 12.0 + (m_cheeseToppings*2.0) + (m_pepperoniToppings*2.0) + (m_veggieToppings*2.0);
    }
    else if (m_size == "large" || m_size == "Large"){
      cost = 14.0 + (m_cheeseToppings*2.0) + (m_pepperoniToppings*2.0) + (m_veggieToppings*2.0);
    }
    return cost;
  }

  /**The toString method that provides a formatted string representation of the pizza
  * @return a formatted string
  */
  public String toString(){
    String s = "";
    s += "\nSize: " + m_size;
    s += "\nNumber of Cheese Toppings: " + m_cheeseToppings;
    s += "\nNumber of Pepperoni Toppings: " + m_pepperoniToppings;
    s += "\nNumber of Veggie Toppings: " + m_veggieToppings;
    s += "\nCost: $" + calcCost();
    s += "\n";
    return s;
  }

  /**Compares an object to this pizza for equality
  * @param o - the object to compare to
  * @return true if they are equal and false otherwise
  */
  public boolean equals(Pizza p1){
    if (this == p1){
      return true;
    }
    if (!(p1 instanceof Pizza)){
      return false;
    }
    Pizza p = (Pizza) p1;
    return (this.m_size.equals(p.m_size) && this.m_cheeseToppings == p.m_cheeseToppings && this.m_pepperoniToppings == p.m_pepperoniToppings && this.m_veggieToppings == p.m_veggieToppings);
  }
}
