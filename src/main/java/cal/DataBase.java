package cal;

import java.util.ArrayList;

public class DataBase {

  public ArrayList<Meal> meals = new ArrayList<Meal>();

  public void defaultMeal() {
    if (meals.size() == 0) {
      meals.add(new Meal(1, "gyros", 450, "2016-05-24 13:22"));
      meals.add(new Meal(2, "hamburger", 600, "2016-05-24 14:56"));
      meals.add(new Meal(3, "tic-tac", 2, "2016-05-24 12:35"));
    }
  }

  public void addMeal(Meal veryNew) {
    meals.add(veryNew);
  }

  public void deleteMeal(Integer id) {
    for(Meal meal : meals) {
      if(meal.id == id) {
        meals.remove(meal);
      }
    }
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
