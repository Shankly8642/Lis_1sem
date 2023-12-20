import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class TestSelenide {

    @Test
    public void testGoogle(){
        open("https://www.google.com/");
        sleep(2000);
        $x("//textarea[@name='q']").setValue("Березин Роман Вячеславович").pressEnter();
        sleep(5000);
    }

}
