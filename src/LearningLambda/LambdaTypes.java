package LearningLambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdaTypes {

    //Best example -> Creating new instances
    protected void typeSupplier() {

        Supplier<Integer> s1 = () -> new Integer(2);
        System.out.println("Value supplied by supplier is " + s1.get());
    }

    // Best example -> System.out.println or map.put(k, v) (for BiConsumer)
    protected void typeConsumer() {

        Consumer<String> c = System.out::println;
        c.accept("ABC");
    }

    //Examples isEmpty
    protected void typePredicate() {
        Predicate<String> p = s -> s.isEmpty();
        System.out.println("Predicate's boolean return value is " + p.test(""));

    }

    //Example: given input String, return Length of String
    protected void typeFunction() {
        Function<String, Integer> function = s -> s.length();
        int i = function.apply("test");
        System.out.println("Length of input for Function's return value is " + i);
    }

    //Example: given String, convert to uppercase string
    protected void typeUnary() {
        UnaryOperator<String> uop = String::toUpperCase;
        String s = uop.apply("test again");
        System.out.println("Value returned by Unary Operator is " + s);
    }
}
