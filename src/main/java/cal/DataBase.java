package cal;

import java.util.ArrayList;

public class DataBase {

  public ArrayList<Meal> meals = new ArrayList<Meal>();

  public void addMeal(Meal veryNew) {
    meals.add(veryNew);
  }

  public Meal getMeal(int id) {
    for(Meal meal : meals) {
      if(meal.id == id) {
        return meal;
      }
    }
    return null;
  }

//  public Meal getItem(int i) {
//    return list.get(i);
//  }

}
