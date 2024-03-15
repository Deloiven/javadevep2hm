package javadevep2hm;

public class Homework {


    public static void main(String[] args) {
        TestProcessor.runTest(MyTest.class);
    }

    static class MyTest {

        @Test(order = 1)
        void firstTest() {
            System.out.println("firstTest запущен");
        }

        @Test(order = 2)
        void secondTest() {
            System.out.println("secondTest запущен");
        }

        @Test(order = 3)
        void thirdTest() {
            System.out.println("thirdTest запущен");
        }

        @BeforeEach
        void beforeEach() {
            System.out.println("BeforeEach метод");
        }

        @AfterEach
        void afterEach() {
            System.out.println("AfterEach метод");
        }

    }


}