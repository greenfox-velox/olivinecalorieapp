package cal;

import java.util.Date;

import org.springframework.web.bind.annotation.*;

@RestController
public class MealsController {

  DataBase myFoods = new DataBase();

  @RequestMapping(value = "/meal/{id}", method = RequestMethod.GET)
  public Meal meal(@PathVariable("id") Integer id) {
    myFoods.defaultMeal();
    return myFoods.getMeal(id);
//    return myFoods.getItem(id);
  }

  @RequestMapping(value = "/meal", method = RequestMethod.GET)
  public Meal meal2(@RequestParam(value = "id") Integer id) {
    myFoods.defaultMeal();
    return myFoods.getMeal(id);
//    return myFoods.getItem(id);
  }

  @RequestMapping(value = "/meals", method = RequestMethod.GET)
  public DataBase meals() {
    myFoods.defaultMeal();
    return myFoods;
  }

  @RequestMapping(value = "/meals", method = RequestMethod.POST)
  public String addMeal(@RequestBody Meal addedMeal) {
    myFoods.addMeal(addedMeal);
    return "nagyon fasza ez emígyen";
  }

  @RequestMapping(value = "/meals/{id}", method = RequestMethod.DELETE)
  public String deleteMeal(@PathVariable("id") Integer id) {
    myFoods.deleteMeal(id);
    return id + ". torolve";
  }

}
