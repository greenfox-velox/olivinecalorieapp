package cal;

import java.util.Date;

public class Meal {
  public int id;
  public String name;
  public int calorie;
  public Date date;

  public Meal(int id, String name, int calorie, Date date) {
    this.id = id;
    this.name = name;
    this.calorie = calorie;
    this.date = date;
  }

  public String toString() {
    return "id = " + this.id + ", name = " + this.name + ", calories = " + calorie + " kcal, Date: " + date;
  }
}
