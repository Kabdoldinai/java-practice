package org.cases.exception_cases;

public class AgeValidation {

    public void checkAge(int age) throws CustomException {
        try {
            validateAge(age);
        } catch (CustomException e) {
            System.out.println(e);
        }
    }

    private void validateAge(int age) throws CustomException{
       if (age < 18) {
           throw new CustomException("Too young!");
       }

       System.out.println("Yay, too old!");
    }

}
