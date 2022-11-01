package org.myjunit2;

// 小さい実装から始める。
// 最初はコマンドライン引数として、テストファイルが渡されると想定。

public class Main {

    /**
     * Run Test.
     * @param args Test class name.
     */
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("org.myjunit2.SampleTest");
            TestCase testCase = new TestCase();
            TestResult result = testCase.run(clazz);
            System.out.println(result);
        } catch (ClassNotFoundException ex) {
            System.out.print("Can not find test class ");
            ex.printStackTrace();
        }
    }
}
