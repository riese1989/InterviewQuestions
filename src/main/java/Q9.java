public class Q9 {
    public static class TestClass extends Thread {

        //выводит от 1 до 10
        private static int threadCounter = 0;

        public void run() {
            ++threadCounter;
            System.out.println(threadCounter);
        }

        public static void main(String[] args) throws Exception {
            for (int i = 0; i < 10; i++) {
                synchronized (TestClass.class) { //может быть запущен только один поток TestClass
                    new TestClass().start();
                }
            }

        }
    }
}
