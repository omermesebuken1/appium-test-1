package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.n11Pages;
import util.DriverFactory;
import util.ElementHelper;

import static constants.contants_n11.*;

public class n11Steps {

    n11Pages n11Page = new n11Pages(DriverFactory.getDriver());

    @When("click categories")
    public void clickCategories() throws InterruptedException {
        ElementHelper.waitSomeTime(5000);
        n11Page.clickItem(categories_button);
    }

    @When("click electronics")
    public void clickElectronics() {
        n11Page.clickItem(electronics_button);
    }


    @When("click phones and accessories")
    public void clickPhonesAndAccesories() {
        n11Page.clickItem(phones_and_accesories_button);
    }

    @When("click mobile phones")
    public void clickMobilePhones() {
        n11Page.clickItem(mobile_phones_button);
    }

    @When("select brand")
    public void selectBrand() {
        n11Page.clickItem(apple_button);
    }

    @When("open filter")
    public void openFilter() {
        n11Page.clickItem(filter_button);
    }

    @When("select filters")
    public void selectFilters() {
        n11Page.clickItem(models_button);
        n11Page.clickItem(iphone14Pro_button);
        n11Page.clickItem(confirm_button);
    }

    @When("apply filter")
    public void applyFilter() {
        n11Page.clickItem(show_results_button);
    }

    @When("add to basket")
    public void addToBasket() {
        n11Page.clickFromList(plus_button,0);
        n11Page.clickItem(add_to_basket_button);

    }

    @When("go to basket")
    public void goToBasket() throws InterruptedException {
        n11Page.clickFromList(navigation_buttons,2);
    }

    @When("check basket have added item")
    public void checkBasketHaveAddedItem() {
        n11Page.assertString(item_count,"(1 ürün)");
    }

    @When("delete items from basket")
    public void deleteItemsFromBasket() {
        n11Page.clickItem(clear_basket_button);
    }

    @Then("check basket empty")
    public void checkBasketEmpty() throws InterruptedException {
        ElementHelper.waitSomeTime(2000);
        n11Page.assertString(basket_clear_text,"Sepetiniz Boş Görünüyor");
    }


}
