package fish.payara.batch.tck.extension;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;


public class PayaraJunit5Extension implements BeforeAllCallback, AfterAllCallback {

// concretely, in practise, integrators will have to:
// 1. ensure they have a JUnit 5 integration if not already (we can do an arquillian bridge as an optional module)
// 2. create in their TCK run module a META-INF/services/org.junit.jupiter.api.extension.Extension with their impl (like this class)
// 3. set in surefire (gradle test task) the system property junit.jupiter.extensions.autodetection.enabled=true
//
    @Override
    public void beforeAll(final ExtensionContext context) throws Exception {
        System.out.println("STARTING Glasshfish");
        System.out.println("DEPLOYING Test + classpath");
    }

    @Override
    public void afterAll(final ExtensionContext context) throws Exception {
        System.out.println("UNDEPLOYING");
        System.out.println("STOPPING");
    }
}
