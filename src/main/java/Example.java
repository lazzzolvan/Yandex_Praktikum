public class Example {
    public static void main(String[] args) {
        int eggs = 13; // Яйца
        int flour = 450; // Мука
        int sugar = 1500; // Сахар
        int milk = 300; // Молоко
        boolean oil = true; // Есть ли дома масло
        boolean smthElse = false; // Есть ли в холодильнике ещё что-то

        if (eggs > 2) {
            if (milk > 250) {
                if (oil) {
                    System.out.println("Вы сможете приготовить омлет.");
                }
            } else if (oil) {
                System.out.println("Вы сможете пожарить яйца.");
            }
        }

        if (eggs > 4) {
            if (milk > 500) {
                if (flour > 350) {
                    System.out.println("Вы сможете приготовить блины.");
                }
            } else if (flour > 400) {
                if (sugar > 250) {
                    System.out.println("Вы сможете приготовить сладкий пирог.");
                } else if (smthElse) {
                    System.out.println("Вы сможете приготовить пиццу.");
                } else {
                    System.out.println("Для пиццы или пирога недостаточно ингредиентов.");
                }
            }
        }
    }
}
