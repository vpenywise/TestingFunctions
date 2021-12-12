package functionalinterface;

import java.util.function.Predicate;

// BOOLEAN

public class _Predicate {

    public static void main(String[] args) {

        System.out.println("Without Predicate: ");
        System.out.println(isPhoneNumberValid("+3598999999"));
        System.out.println(isPhoneNumberValid("35989999991"));

        System.out.println("\nWith Predicate: ");
        System.out.println(isPhoneNumberValidPredicate.test("+3598999999"));
        System.out.println(isPhoneNumberValidPredicate.test("+3598999991"));

        System.out.println("\nIs phone number valid OR contains number 3: " +
                isPhoneNumberValidPredicate.or(containsNumber3).test("+3598999991"));

    }

    // Imperative coding
    static boolean isPhoneNumberValid (String phoneNumber) {
        return phoneNumber.startsWith("+359") && phoneNumber.length() == 11;
    }

    // Declarative coding
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("+359") && phoneNumber.length() ==11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
