package Bo1;

public class test01 {

    public static void main(String[] args) {

        try{
            int i=10/0;
        }
        catch (ArithmeticException e){
            System.out.println("The Exception e "+e);
        }
        catch (Exception e){
            System.out.println("The other exception hi "+e);
        }
        finally {
            System.out.println(" I am here");
        }


    }
}
