package org.myjunit2;

public class TestResult {

    /**
     * Test class name.
     */
    String clazz;

    /**
     * Test method name
     */
    String method;

    /**
     * Is test method passed?
     */
    boolean passed;

    public TestResult(String clazz, String method, boolean passed) {
        this.clazz = clazz;
        this.method = method;
        this.passed = passed;
    }

    @Override
    public String toString() {
        String result =  passed ? clazz + "#" + method + " : " + " pass" : clazz + "#" + method + " : " + " failed.\n";
        return result;
    }
}
