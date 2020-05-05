package stepdefs;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import cucumber.api.java.ru.И;
import org.openqa.selenium.By;

import java.lang.reflect.InvocationTargetException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static pages.AbstractPage.getPageByTitle;

public class MyStepdefs {
    @И("^Открыть сайт$")
    public void открытьСайт() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        Configuration.startMaximized = true;
        Configuration.timeout = 5;
        open("http://dev.n7lanit.ru");
    }

    @И("^Нажать кнопку войти$")
    public void нажатьКнопкуВойти() {
        $(By.xpath("//div[@class='nav nav-guest']/button[@class='btn navbar-btn btn-default btn-sign-in']")).click();
        Configuration.timeout = 5000;
    }

    @И("^ввести логин$")
    public void ввестиЛогин() {
        $(By.xpath("//div[@class='control-input']/input[@id='id_username']")).shouldHave(Condition.appear).val("dasproni");
        Configuration.timeout = 5000;
    }

    @И("ввести пароль")
    public void ввестиПароль() {
        $(By.xpath("//div[@class='control-input']/input[@id='id_password']")).shouldHave(Condition.appear).val("Cosmopolitanzxcv123456789").pressEnter();
        Configuration.timeout = 5000;
    }

    @И("нажать войти")
    public void нажатьВойти() {
        $(By.xpath("//div[@class='modal-footer']")).pressEnter();
        Configuration.timeout = 5000;
    }
    @И("^посмотреть отображение иконки$")
    public void посмотретьОтображениеИконки() {
        $(By.xpath("//div[@id='user-menu-mount']//li[@class='dropdown']/a/img")).shouldBe(Condition.visible);
        Configuration.timeout = 5000;
    }

    @И("на странице {string} выбираем вкладу {string}")
    public void открытьЛюбуюТему(String title, String tabName) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        getPageByTitle(title).getElementByName(tabName).click();
        $(By.xpath("//div[@class='media-body']/a[@href='/t/new-topic-vegas/909/']")).click();
        Configuration.timeout = 5000;
    }

    @И("^ввести в поле ответа \"Давайте спрева перекусим, дружелюбие появится потом\"$")
    public void ввестиВПолеОтветаСтроку() {
        $(By.xpath("//textarea[@id='editor-textarea']")).val("Давайте спрева перекусим, дружелюбие появится потом").shouldHave(Condition.visible);
        Configuration.timeout = 5000;
    }

    @И("нажать кнопку отправить ответ")
    public void нажатьКнопкуОтправитьОтвет() {
        $(By.xpath("//button[@class='btn btn-primary btn-sm pull-right'][@type='submit']")).click();
        Configuration.timeout = 5000;
    }

    @И("проверить наличие сообщение на экране")
    public void проверитьНаличиеСообщенияНаЭкране() {
        $(By.xpath("//div[@class='post-body']/article[last()]")).shouldBe(Condition.visible);
        Configuration.timeout = 5000;
    }
    @И("перейти во вкладку темы")
    public void перейтиВоВкладкуТемы() {
        $(By.xpath("//ul[@class='nav navbar-nav']")).click();
    }

    @И("повторить ввод сообщения")
    public void повторитьВводСообщения() {
        $(By.xpath("//div[@class='media-body']/a[@href='/t/new-topic-vegas/909/']")).click();
        Configuration.timeout = 5000;
        $(By.xpath("//textarea[@id='editor-textarea']")).val("Давайте спрева перекусим, дружелюбие появится потом").shouldHave(Condition.visible);
        Configuration.timeout = 5000;
        $(By.xpath("//button[@class='btn btn-primary btn-sm pull-right'][@type='submit']")).click();
        Configuration.timeout = 5000;
        $(By.xpath("//div[@class='post-body']/article[last()]")).shouldBe(Condition.visible);
        Configuration.timeout = 5000;
    }
}
