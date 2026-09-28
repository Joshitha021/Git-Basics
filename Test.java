public class Test{
   static void checkAge(int age) throws InvalidAgeException{
    if(age<18){
        throw new InvalidAgeException("Not eligible to Vote");
    }
    System.out.println("Eligible to vote");
    System.out.println("Age should be above 18");
    
   }
   public static void main(String[] args) {
       try {
           checkAge(17);
       } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
       }
   }
}