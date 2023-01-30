import Base.BaseTest;
import Pages.AllPages;
import Utilities.ConfigReader;
import org.testng.annotations.Test;

public class TC001 extends BaseTest {

    //BAK BUNLARA
    //https://medium.com/@gamzeakyol06/selenium-ve-page-object-model-pom-f0e16f04f675
    //https://www.automatedtestingwithtuyen.com/post/page-object-model-pattern
    //https://practice.automationtesting.in/test-cases/


    //1. Kullanıcı girişi yapılarak sepete ürün eklenmesi
    // Kullanıcı Hepsiburada.com sitesini ziyaret eder.
    // Kullanıcı giriş işlemi yapılır.
    // Yönlendirmeden sonra anasayfada kullanıcı giriş işleminin yapıldığı doğrulanır
    // Kullanıcı, burada satın almak istediği ürün için arama yapacaktır.
    // Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
    // Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.
    // Seçilen ürünün doğru olarak eklendiği 'Sepetim' sayfasında doğrulanmalıdır.

    //2. Kullanıcı girişi yapılmadan belirtilen ürünü sepete ekleme
    // Kullanıcı Hepsiburada.com sitesini ziyaret eder.
    //  Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
    // Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.
    // Seçilen ürünün doğru olarak eklendiği 'Sepetim' sayfasında doğrulanmalıdır.

    AllPages allPages=new AllPages();

    @Test
    public void test01(){
        allPages.mainPage().go_To_Url(ConfigReader.getProperty("baseURL"));
        allPages.mainPage().hoverOverGirisYapButon();
        allPages.loginPage().loginHepsiBurada(ConfigReader.getProperty("UserMail"),ConfigReader.getProperty("UserPassword"));
        allPages.userDashboardPage().verifyValidLogin("hasan ince");
        allPages.userDashboardPage().searchElement("robot supurge");

    }
}
