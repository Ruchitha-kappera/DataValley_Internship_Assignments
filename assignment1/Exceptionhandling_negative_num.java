
package EXCEPTION_HANDLING_NEGATIVE_NUMBER;


public class NumberValidator {

    public static class CustomValidationException extends Exception {
      public CustomValidationException(String message) {
        super(message);  // in this code i am taking customvalidecxeption directly in the class by decalring as stactic as it can be acessed by static instaces like objects of the class
      }
    }
  
    public static void validateNumber(int number) throws CustomValidationException {
      if (number < 0) {
        throw new CustomValidationException("Number cannot be negative.");
      } else {
        System.out.println("Number is valid.");
      }
    }
  
    public static void main(String[] args) {
      int number = -5;
      try {
        validateNumber(number);
      } catch (CustomValidationException e) {
        System.out.println("Exception caught: " + e.getMessage());
      }
    }
  }
  
