public class mulcatch {
    public static void main(String[] args) {
        try{
            String s=null;
            System.out.println(s.length());
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (Exception e){
            System.out.println("Exception occurs");
        }
    }
}
