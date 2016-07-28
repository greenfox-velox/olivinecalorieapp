package cal;

import java.util.Date;

public class Meal {
  public int id;
  public String name;
  public int calorie;
  public String date;

  public Meal(int id, String name, int calorie, String date) {
    this.id = id;
    this.name = name;
    this.calorie = calorie;
    this.date = date;
  }

  public Meal() {

  }

  public String toString() {
    return "id = " + this.id + ", name = " + this.name + ", calories = " + calorie + " kcal, Date: " + date;
  }
}
