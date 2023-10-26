import Chapter3Exercise.PetrolPurchase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PetrolTest {

    @Test
    public void method_to_test_petrolPurchase_NoArgsConstructor() {
        PetrolPurchase petrolPurchase = new PetrolPurchase();
        assertNotNull(petrolPurchase);
    }

    @Test
    public void methodToTestInstanceVariableValue() {
        PetrolPurchase petrolPurchase = new PetrolPurchase("Ilora", 7, 800);
        assertNotEquals(0, petrolPurchase.getPurchaseAmount());
    }

    @Test
    public void method_to_test_petrolPUrchase_AllArgsConstructor() {
        PetrolPurchase petrolPurchase = new PetrolPurchase("Oyo", "Sweet Crude", 30, 777, 2);
        assertEquals(30*777-2, petrolPurchase.getPurchaseAmount());
    }
}
