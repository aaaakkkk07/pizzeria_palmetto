package am.pizzeria.palmetto;

import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

// type safety
public class StackTest {

    public static void main(String[] args) {

        Stack<String> objectStack = new Stack<>(12);



    }

    private static Optional<String> getObject() {

        return ThreadLocalRandom.current().nextBoolean() ? Optional.of("Hello") : Optional.empty();
    }
}
