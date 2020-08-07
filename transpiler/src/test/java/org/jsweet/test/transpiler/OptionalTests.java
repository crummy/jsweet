package org.jsweet.test.transpiler;

import org.junit.Test;
import source.optional.Optionals;

public class OptionalTests extends AbstractTest {
    @Test
    public void testOptional() {
        eval((logHandler, result) -> {
            logHandler.assertNoProblems();
        }, getSourceFile(Optionals.class));
    }
}
