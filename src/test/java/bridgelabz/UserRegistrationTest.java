package bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {


        UserRegistration userRegistration = new UserRegistration();

        @Test
        public void FirstName_Valid_ReturnHappy() {
            String validationResult = userRegistration.FirstName("Nagireddy");
            Assertions.assertEquals("HAPPY", validationResult);
        }

        @Test
        public void FirstName_FirstLetterNotCaps_ReturnSad() {
            String validationResult = userRegistration.FirstName("somula");
            Assertions.assertEquals("SAD", validationResult);
        }

        @Test
        public void FirstName_LessThanThreeLetters_ReturnSad() {
            String validationResult = userRegistration.FirstName("SN");
            Assertions.assertEquals("SAD", validationResult);
        }

        // Last Name Test Cases
        @Test
        public void LastName_Valid_ReturnHappy() {
            String validationResult = userRegistration.LastName("Nagireddy");
            Assertions.assertEquals("HAPPY", validationResult);
        }

        @Test
        public void LastName_FirstLetterNotCaps_ReturnSad() {
            String validationResult = userRegistration.LastName("nagireddy");
            Assertions.assertEquals("SAD", validationResult);
        }

        @Test
        public void LastName_LessThanThreeLetters_ReturnSad() {
            String validationResult = userRegistration.LastName("so");
            Assertions.assertEquals("SAD", validationResult);
        }

        // Phone Number Test Cases
        @Test
        public void PhoneNumber_Valid_ReturnHappy() {
            String validationResult = userRegistration.PhoneNumberValidate("91 9492880337");
            Assertions.assertEquals("HAPPY", validationResult);
        }

        @Test
        public void PhoneNumber_AfterCountrySpaceNotGiven_ReturnSad() {
            String validationResult = userRegistration.PhoneNumberValidate("919492880337");
            Assertions.assertEquals("SAD", validationResult);
        }

        @Test
        public void PhoneNumber_CountryCodeIsNotGiven_ReturnSad() {
            String validationResult = userRegistration.PhoneNumberValidate("9492880337");
            Assertions.assertEquals("SAD", validationResult);
        }

        @Test
        public void Number_NumberLengthIsMoreThanTen_ReturnSad() {
            String validationResult = userRegistration.PhoneNumberValidate("91 949288037");
            Assertions.assertEquals("SAD", validationResult);
        }


        // Email Test Cases
        @Test
        public void Email_Valid_ReturnHappy() {
            String validationResult = userRegistration.EmailValidation("nagireddy212@gmail.com");
            Assertions.assertEquals("HAPPY", validationResult);
        }

        @Test
        public void givenEmail_whenTLDIsNotGiven_ReturnSad() {
            String validationResult = userRegistration.EmailValidation("nagireddy212@gmail");
            Assertions.assertEquals("SAD", validationResult);
        }

        @Test
        public void Email_AtTheRateIsNotGiven_ReturnSad() {
            String validationResult = userRegistration.EmailValidation("nagireeddy212gmail.com");
            Assertions.assertEquals("SAD", validationResult);
        }

        @Test
        public void Email_TwoSpecial_ReturnSad() {
            String validationResult = userRegistration.EmailValidation("nagireddy-.somula@gmail.com");
            Assertions.assertEquals("SAD", validationResult);
        }

        @Test
        public void Email_StartsWithSpecialChar_ReturnSad() {
            String validationResult = userRegistration.EmailValidation("-nagireddy212@gmail.com");
            Assertions.assertEquals("SAD", validationResult);
        }


        // Password Test Cases
        @Test
        public void Password_Valid_ReturnHappy() {
            String validationResult = userRegistration.PasswordValidate("somuLa@naG@reddy212");
            Assertions.assertEquals("HAPPY", validationResult);
        }

        @Test
        public void Password_NoSpecialCharIsGiven_ReturnSad() {
            String validationResult = userRegistration.PasswordValidate("nagireddySomula212");
            Assertions.assertEquals("SAD", validationResult);
        }

        @Test
        public void Password_NoCapitalCharIsGiven_ReturnSad() {
            String validationResult = userRegistration.PasswordValidate("nagireddy@somula212");
            Assertions.assertEquals("SAD", validationResult);
        }

        @Test
        public void Password_NoNumberIsGiven_ReturnSad() {
            String validationResult = userRegistration.PasswordValidate("nag@reddy@");
            Assertions.assertEquals("SAD", validationResult);
        }

        @Test
        public void Password_LessThanEightChars_ReturnSad() {
            String validationResult = userRegistration.PasswordValidate("nagireddy$212");
            Assertions.assertEquals("SAD", validationResult);
        }
    }
