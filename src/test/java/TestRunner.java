import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(JunitTestSuite.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}

//https://niharikawhatsnext.wordpress.com/2015/03/11/running-maven-testng-tests-as-a-jar/
//
//java -cp MyProject-jar-with-dependencies.jar;MyProject.jar;MyProject-tests.jar
//
//        org.testng.TestNG   -testjar MyProject-tests.jar     -xmlpathinjar suites/GroupBased_Tests.xml