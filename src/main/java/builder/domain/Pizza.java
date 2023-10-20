package builder.domain;

import java.math.BigDecimal;

public class Pizza {
    private String flavour;
    private String size;
    private String borderType;
    private String ingredients;
    private BigDecimal cookTime;
    private BigDecimal value;

    private Pizza(String flavour, String size, String borderType, String ingredients, BigDecimal cookTime, BigDecimal value) {
        this.flavour = flavour;
        this.size = size;
        this.borderType = borderType;
        this.ingredients = ingredients;
        this.cookTime = cookTime;
        this.value = value;
    }

    public static class PizzaBuilder {
        private String flavour;
        private String size;
        private String borderType;
        private String ingredients;
        private BigDecimal cookTime;
        private BigDecimal value;

        public PizzaBuilder setFlavour(String flavour) {
            this.flavour = flavour;
            return this;
        }
    }
}
