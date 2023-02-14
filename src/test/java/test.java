import com.github.javafaker.Faker;
import org.testng.Assert;

public class test {
    public static void main(String[] args) {

        Faker fake = new Faker();
        System.out.println(fake.business().creditCardNumber());
        System.out.println(fake.address().lastName());
        System.out.println(fake.phoneNumber().cellPhone());
    }
}
