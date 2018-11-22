package LearningLambda;


import java.util.stream.Stream;

public class LambdasMain {

    public static void main(String[] args) {

        LambdasMain lambdasMain = new LambdasMain();
        lambdasMain.testLambdaTypes();

        LambdaOperations lambdaOperations = new LambdaOperations();

        System.out.println("\nIntermediate Operations");
        lambdaOperations.intermediateOperations();

        System.out.println("\nTerminal Operations");
        lambdaOperations.terminalOperations();

        System.out.println("\nCollectors");
        lambdaOperations.collectors();

        LambdaWrapperCheckedException cException = new LambdaWrapperCheckedException();
        System.out.println("\nChecked Exceptions");

        //this now will throw runtime exception
        //cException.checkedExceptionWithFunctionalInterface();
    }

    private void testLambdaTypes() {
        System.out.println("Built in Functional Interface Types");

        LambdaTypes ltype = new LambdaTypes();
        System.out.println("\nType Supplier -> Has a RETURN VALUE, no input");
        ltype.typeSupplier();

        System.out.println("\nType Consumer/BiConsumer -> No RETURN VALUE, Consumes Input");
        ltype.typeConsumer();

        System.out.println("\nType Predicate/BiPredicate -> Returns boolean, takes Input <T> or <T, U>");
        ltype.typePredicate();

        System.out.println("\nType Function/BiFunction -> Returns object Type (R), takes Input <T> or <T, U>");
        ltype.typeFunction();

        System.out.println("\nType Unary/BinaryOperator -> Returns object Type (T), takes Input <T> or <T, U>");
        ltype.typeUnary();
    }

    //Get a sample stream of elements of type String
    protected static Stream<String> getStreamOfElements() {
        return Stream.of("Tiger", "Lion", "Zebra");
    }




}
