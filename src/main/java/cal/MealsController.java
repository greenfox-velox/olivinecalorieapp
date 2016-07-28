package cal;

import java.util.Date;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MealsController {

  DataBase myFoods = new DataBase();

  @RequestMapping("/meal/{id}")
  public Meal meal(@PathVariable("id") Integer id) {

    myFoods.addMeal(new Meal(1, "gyros", 450, "2016-05-24 13:22"));
    myFoods.addMeal(new Meal(2, "hamburger", 600, "2016-05-24 14:56"));
    myFoods.addMeal(new Meal(3, "tic-tac", 2, "2016-05-24 12:35"));

    return myFoods.getMeal(id);
//    return myFoods.getItem(id);
  }

  @RequestMapping("/meal")
  public Meal meal2(@RequestParam(value = "id") Integer id) {

    myFoods.addMeal(new Meal(1, "gyros", 450, "2016-05-24 13:22"));
    myFoods.addMeal(new Meal(2, "hamburger", 600, "2016-05-24 14:56"));
    myFoods.addMeal(new Meal(3, "tic-tac", 2, "2016-05-24 12:35"));

    return myFoods.getMeal(id);
//    return myFoods.getItem(id);
  }

  @RequestMapping("/meals")
  public DataBase meals() {

    myFoods.addMeal(new Meal(1, "gyros", 450, "2016-05-24 13:22"));
    myFoods.addMeal(new Meal(2, "hamburger", 600, "2016-05-24 14:56"));
    myFoods.addMeal(new Meal(3, "tic-tac", 2, "2016-05-24 12:35"));

    return myFoods;
  }


}
