package cal;

import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MealsController {

  DataBase myFoods = new DataBase();

  @RequestMapping("/meal")
  public Meal meal(@RequestParam(value = "id") Integer id) {

    myFoods.addMeal(new Meal(1, "gyros", 450, new Date()));
    myFoods.addMeal(new Meal(2, "hamburger", 600, new Date()));
    myFoods.addMeal(new Meal(3, "tic-tac", 2, new Date()));

    return myFoods.getMeal(id);
//    return myFoods.getItem(id);
  }
}
