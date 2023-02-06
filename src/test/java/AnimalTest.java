import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnimalTest {
    Animal myTestLion;

    @BeforeEach
    void setUp() {
        myTestLion = new Animal("Herbert", 3, "Lion", "Roar");
    }

    @Test
    void giveAnimalLoud() {
        Assertions.assertEquals("Roar", myTestLion.giveAnimalLoud());
    }

    @Test
    void getNameAndAge() {
        Assertions.assertEquals("Herbert 3", myTestLion.getNameAndAge());
    }

    @Test
    void ageCategory() {
        Assertions.assertEquals("young animal", myTestLion.ageCategory());
    }
}