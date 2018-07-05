package integrationtests;

import com.springboot.testrunner.E2eJunitSuiteRunner;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.domain.TestPackageRoot;
import org.junit.runner.RunWith;

/**
 * This runs the entire test suite i.e. picking all tests under "resources/integration_tests"
 * recursively.
 *
 * To run individual tests, go to the corresponding package and run the test as JUnit
 * e.g. go to folders >> get, put etc
 */
@TargetEnv("abc_bankapp_host.properties")
@TestPackageRoot("integration_tests")
@RunWith(E2eJunitSuiteRunner.class)
public class IntegrationTestSuite {

}