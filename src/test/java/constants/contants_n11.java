package constants;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class contants_n11 {
    public static final By categories_button = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Kategoriler\") ");
    public static final By electronics_button = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Elektronik\") ");
    public static final By phones_and_accesories_button = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Telefon & Aksesuarları\") ");
    public static final By mobile_phones_button = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Cep Telefonu\") ");
    public static final By apple_button = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Apple\") ");

    public static final By filter_button = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Filtrele\") ");

    public static final By models_button = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Model\") ");

    public static final By iphone14Pro_button = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Iphone 14 Pro\") ");
    public static final By confirm_button = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Uygula\") ");
    public static final By show_results_button = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sonuçları Göster\") ");
    public static final By plus_button = MobileBy.id("com.dmall.mfandroid:id/ivAddToBasket"); //birden çok geliyor...
    public static final By add_to_basket_button = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sepete Ekle\") ");
    public static final By navigation_buttons = MobileBy.id("com.dmall.mfandroid:id/navigation_bar_item_icon_view"); // listede 3. yani get(2) go to basket
    public static final By item_count = MobileBy.id("com.dmall.mfandroid:id/numberOfBasketItems"); // 1 ürün
    public static final By clear_basket_button = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Seçileni Sil\") ");
    public static final By basket_clear_text = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sepetiniz Boş Görünüyor\") ");


}
