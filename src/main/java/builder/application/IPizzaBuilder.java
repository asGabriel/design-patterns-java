package builder.application;

import builder.domain.Pizza;

public interface IPizzaBuilder {
    void borderPrepare();

    void sizePrepare();

    void addIngredients();

    void setValue();

    void cookTime();

    Pizza getPizza();

}
