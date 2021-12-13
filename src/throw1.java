public class throw1 {
            public static void abc(int age) {
                if(age<18) {
                    throw new ArithmeticException("not eligible to vote");
                }
                else {
                    System.out.println("eligible to vote!!");
                }
            }
            public static void main(String args[]){
                abc(13);

        }
    }

