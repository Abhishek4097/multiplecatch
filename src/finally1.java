public class finally1 {
    public static void main(String[] args) {
        try{
            int a=50/5;
            System.out.println(a);
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
        finally {
            System.out.println("code will execute properly");
        }
    }
}
