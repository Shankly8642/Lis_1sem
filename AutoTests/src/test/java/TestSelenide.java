import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class TestSelenide {

    @Test
    public void OpenWebsite(){
        open("https://www.google.com/");
        sleep(2000);
        $x("//textarea[@name='q']").setValue("KFC");
        sleep(1000);
        $x("//textarea[@name='q']").pressEnter();
        sleep(2000);
        $x("//div[@class='yuRUbf']//h3[@class='LC20lb MBeuO DKV0Md']").click();
        sleep(3000);
    }

    @Test
    public void Authorization(){
        open("https://www.kfc.ru/");
        $x("//button[@class='_1wB2dsQNmuD']").click();
        sleep(3000);
        $x("//div[@class='contentBody__inputWrapper']//input[@id='phone']").setValue("9292420598");
        sleep(1000);
        $x("//div[@class='checkbox']//span[@class='checkbox__icon']").click();
        sleep(1000);
        $x("//button[@id='phoneSubmit']").click();
        sleep(4000);

    }

    @Test
    public void ArrowsClick(){
        open("https://www.kfc.ru/");
        sleep(1000);
        $x("//div[@class='_1g0tPX7NQXx']").click();
        sleep(1000);
        $x("//div[@class='_1g0tPX7NQXx']").click();
        sleep(1000);
        $x("//div[@class='_1g0tPX7NQXx _249oR_1bgZc']").click();
        sleep(2000);
    }

    @Test
    public void MenuTest(){
        open("https://www.kfc.ru/");
        sleep(1000);
        $x("//ul[@class='_3EVCovE_YeB pl-0']//a[@class='_3VhMo9GOunE']").click();
        sleep(2000);
        $x("//div[@class='_2yYx1Up9dQH']//a[@data-id='1003127']").click();
        sleep(2000);
        $x("//div[@class='_2yYx1Up9dQH']//a[@data-id='1004841']").click();
        sleep(2000);
    }

    @Test
    public void SelectProductTest(){
        open("https://www.kfc.ru/");
        sleep(1000);
        $x("//ul[@class='_3EVCovE_YeB pl-0']//a[@class='_3VhMo9GOunE']").click();
        sleep(2000);
        $x("//div[@class='_2yYx1Up9dQH']//a[@data-id='1003914']").click();
        sleep(2000);
        $x("//div[@class='_3u9QmTsan2S mt-24']//a[@href='/product/5989']").click();
        sleep(3000);
    }

    @Test
    public void ProductTest(){
        open("https://www.kfc.ru/product/5989");
        sleep(2000);
        $x("//button[@class='_2zeYDvP7GSV _1GBepiW9MEE']").click();
        sleep(1000);
        $x("//button[@class='_2zeYDvP7GSV _1GBepiW9MEE']").click();
        sleep(1000);
        $x("//button[@class='_2zeYDvP7GSV _3xJawrP1bhN _1GBepiW9MEE']").click();
        sleep(1000);
        $x("//div[@class='_2ffuo-FS4md condensed t-xl _33kSldExX9K']").click();
        sleep(2000);
    }

    @Test
    public void AddCartTest(){
        open("https://www.kfc.ru/product/5989");
        sleep(2000);
        $x("//button[@class='button-primary _74DnAKtkq_q']").click();
        sleep(2000);
    }

    @Test
    public void CLearCartTest(){
        open("https://www.kfc.ru/product/5989");
        sleep(2000);
        $x("//button[@class='button-primary _74DnAKtkq_q']").click();
        sleep(3000);
        $x("//a[@href='/checkout']").click();
        sleep(2000);
        $x("//button[@class='_1--29m3fLAp']").click();
        sleep(2000);
        $x("//button[@class='_225gEwPJmZm _3ck1sRnyI40']").click();
        sleep(3000);
    }

    @Test
    public void DeliveryTest(){
        open("https://www.kfc.ru/");
        sleep(1000);
        $x("//button[@class='_2qov04xvnIx']").click();
        sleep(2000);
        $x("//span[@class='_1CybJ2TfggF']").click();
        sleep(3000);
        $x("//input[@class='_1cE6wpVzEGb']").setValue("Тюмень Перекопская 15а");
        sleep(2000);
        $x("//div[@class='_3XxtD2ehsPG t-m-sm']").click();
        sleep(2000);
        $x("//button[@class='_13dsgNgMUHO']").click();
        sleep(6000);

    }

    @Test
    public void InRestaurantApproachDistanceTest(){
        open("https://www.kfc.ru/");
        sleep(1000);
        $x("//button[@class='_2qov04xvnIx']").click();
        sleep(2000);
        $x("//button[@class='_2jMgNFhtxDE']").click();
        sleep(1000);
        $x("//button[@class='_2jMgNFhtxDE']").click();
        sleep(2000);
    }

    @Test
    public void InRestaurantSearchTest(){
        open("https://www.kfc.ru/");
        sleep(2000);
        $x("//button[@class='_3lHyIDuspmn']").click();
        sleep(2000);
        $x("//span[@class='_1CybJ2TfggF']").click();
        sleep(3000);
        $x("//input[@class='brBTjPssynL']").setValue("Республика Тюмень");
        sleep(2000);
        $x("//button[@class='gYjHUJeFRwb p-16 _3psqxL9FnO5']").click();
        sleep(2000);
        $x("//button[@class='_2mdGGhQeS__ button-m-primary']").click();
        sleep(3000);
    }

    @Test
    public void InRestaurantFilterTest(){
        open("https://www.kfc.ru/");
        sleep(1000);
        $x("//button[@class='_2qov04xvnIx']").click();
        sleep(2000);
        $x("//span[@class='_1CybJ2TfggF']").click();
        sleep(3000);
        $x("//button[@class='_3w4_2NaasRs']").click();
        sleep(2000);
        $x("//button[span='Есть Драйв']").click();
        sleep(500);
        $x("//button[span='24 часа']").click();
        sleep(1000);
        $x("//button[@class='qS-6vSWUziy button-m-primary']").click();
        sleep(3000);
    }

    @Test
    public void InRestaurantCloseTest(){
        open("https://www.kfc.ru/");
        sleep(1000);
        $x("//button[@class='_2qov04xvnIx']").click();
        sleep(3000);
        $x("//button[@class='EzuYqKyyVJc t-m-sm c-description']").click();
        sleep(2000);
    }

    @Test
    public void ChooseCouponTest(){
        open("https://www.kfc.ru/");
        sleep(1000);
        $x("//ul[@class='_3EVCovE_YeB pl-0']//a[@href='/coupons']").click();
        sleep(1500);
        $x("//div[@class='popmechanic-close']").click();
        sleep(1000);
        $x("//div[@class='_2NyuN9wIxbr _2863BpiS1vT']//a[@href='/product/6885']").scrollIntoView(false);
        sleep(1000);
        $x("//div[@class='_2NyuN9wIxbr _2863BpiS1vT']//a[@href='/product/6885']").click();
        sleep(2000);
    }

    @Test
    public void ChoosePromoTest(){
        open("https://www.kfc.ru/");
        sleep(2000);
        $x("//ul[@class='_3EVCovE_YeB pl-0']//a[@href='/promo']").click();
        sleep(2000);
        $x("//div[@class='_1wzRMBtfHmO mb-32 ml-32']//a[@href='/promo/22']").click();
        sleep(2000);
        $x("//div[@class='_28xfuSskJEx']").scrollIntoView(false);
        sleep(2000);
        $x("//a[@class='Z8ibqryvopS t-sm']").click();
        sleep(2000);
    }

    @Test
    public void ChooseRestaurantTest(){
        open("https://www.kfc.ru/");
        sleep(2000);
        $x("//ul[@class='_3EVCovE_YeB pl-0']//a[@href='/restaurants']").click();
        sleep(2000);
        $x("//button[@class='button-light']").click();
        sleep(2000);
        $x("//button[@class='dJc0QMIjOjl button-m-primary']").click();
        sleep(3000);
    }

    @Test
    public void ChooseCareerTest(){
        open("https://www.kfc.ru/");
        sleep(2000);
        $x("//ul[@class='_3EVCovE_YeB pl-0']//a[@href='/career']").click();
        sleep(3000);
        $x("//div[@class='_2Oh236HX5tS']//a[@href='/career/4']").click();
        sleep(2000);
        $x("//a[@class='_3tY3fHa_WhP']").click();
        sleep(2000);
        $x("//a[@href='/career/2']").click();
        sleep(3000);
    }

    @Test
    public void ChooseCareerPlaceTest(){
        open("https://www.kfc.ru/");
        sleep(2000);
        $x("//ul[@class='_3EVCovE_YeB pl-0']//a[@href='/career']").click();
        sleep(3000);
        $x("//label[span='В офисе']").click();
        sleep(1500);
        $x("//label[span='В ресторане']").click();
        sleep(2000);
    }

    @Test
    public void ChooseCareerSearchTest(){
        open("https://www.kfc.ru/");
        sleep(2000);
        $x("//ul[@class='_3EVCovE_YeB pl-0']//a[@href='/career']").click();
        sleep(3000);
        $x("//input[@class='brBTjPssynL']").setValue("Москва");
        sleep(1000);
        $x("//div[@class='_3XxtD2ehsPG t-m-sm _3ERdhYpvLSD']").click();
        sleep(2000);

    }

    @Test
    public void FillQuestionnaireTest(){
        open("https://www.kfc.ru/");
        sleep(2000);
        $x("//ul[@class='_3EVCovE_YeB pl-0']//a[@href='/career']").click();
        sleep(3000);
        $x("//div[@class='_2Oh236HX5tS']//a[@href='/career/4']").click();
        sleep(2000);
        $x("//button[@class='button-primary']").click();
        sleep(2000);
        $x("//div[@id='name']//input[@class='_1cE6wpVzEGb']").setValue("Роман Березин");
        sleep(1000);
        $x("//div[@id='age']//input[@class='_1cE6wpVzEGb']").setValue("20");
        sleep(2000);
    }
}
