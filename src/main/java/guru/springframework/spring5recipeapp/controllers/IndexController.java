package guru.springframework.spring5recipeapp.controllers;

import guru.springframework.spring5recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

//    private CategoryRepository categoryRepository;
//    private UnitOfMeasureRepository unitOfMeasureRepository;

//    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
//        this.categoryRepository = categoryRepository;
//        this.unitOfMeasureRepository = unitOfMeasureRepository;
//    }

    @RequestMapping({"", "/", "/index"})
    public String getindexPage(Model model) {

//        Optional<Category> categoryOptional = categoryRepository.findByDescription("America");
//        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
//
//        System.out.println("Cat id is: " + categoryOptional.get().getId());
//        System.out.println("UOM Id is: " + unitOfMeasureOptional.get().getId());

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
