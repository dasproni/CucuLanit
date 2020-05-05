package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.annotations.Element;
import pages.annotations.Page;

import static com.codeborne.selenide.Selenide.$;

@Page(title = "Главная страница", url = "https://dev.n7lanit.ru")
public class MainPage extends AbstractPage {

    @Element("Вкладка Темы")
    public WebElement getThemesTab() {
        return $(By.xpath("//ul[@class = 'nav navbar-nav']//a[contains(text(), 'Темы')]"));
    }
}
