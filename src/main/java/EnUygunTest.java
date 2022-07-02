import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnUygunTest {

    private Enuygun enUygun;

    @BeforeEach
    void setUp() {
        enUygun = new Enuygun();
    }
    //3'e bölünebiliyorsa String olarak "En", yazılıcak
    @Test
    public void returnEn(){
        assertEquals("En" , enUygun.stringFor(3));

    }
    //5'e bölünüyorsaString olarak "Uygun", yazılıcak
    @Test
    void returnUygun(){
        assertEquals("Uygun" ,enUygun.stringFor(5) );

    }
    //Hem 3'e hem de 5'e bölünüyorsa "Enuygun", yazılıcak
    @Test
    void returnEnuygun(){
        assertEquals("Enuygun" , enUygun.stringFor(15));

    }
    //Hem 3'e hem de 5'e bölünmüyorsa sayının kendisini, yazıcak
    @Test
    void returnTheNumber(){
        assertEquals("7" , enUygun.stringFor(7));
    }
}
