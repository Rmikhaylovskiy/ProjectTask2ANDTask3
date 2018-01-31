package Steps;
import Pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;
public class Mainstep extends Basestep {
    @Step("Выбран пунк меню {0}")
    public void stepSelectMainMenu(String menuItem){
        MainPage mainPage = new MainPage(driver);
        mainPage.selectMainMenu(menuItem);
    }

    @Step("Выбран пунк меню {0}]")
    public void stepSelectSubMenu(String menuItem){
        MainPage mainPage = new MainPage(driver);
        mainPage.waitVisibilityOfelement();
        mainPage.selectSubMenu(menuItem);
    }
}
