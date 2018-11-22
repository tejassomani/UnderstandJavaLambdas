package LearningLambda;

import java.io.IOException;
import java.util.List;

public class CheckedExceptionFunctionalInterface {

    protected static List<String> create() throws IOException {
        throw new IOException();
    }
}
