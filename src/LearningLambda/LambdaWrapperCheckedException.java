package LearningLambda;

import java.io.IOException;
import java.util.List;

public class LambdaWrapperCheckedException {

    protected void checkedExceptionWithFunctionalInterface() {
        //This doesn't compile as the create method throws checked exception

        // CheckedExceptionFunctionalInterface.create().stream().count();

        //this will not give compile time exception
        createWrapperCheckedException().stream().count();
    }

    //create wrapper
    protected List<String> createWrapperCheckedException() {
        try {
            return CheckedExceptionFunctionalInterface.create();
        }
        catch(IOException ie) {
            throw new RuntimeException(ie);
        }
    }
}
