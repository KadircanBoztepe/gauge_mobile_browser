package exception;

import org.openqa.selenium.By;

public class ElementNotEnabled extends Exception {

    public String message;

    public ElementNotEnabled(String locatorValue, By elementLocator) {
        this.message = "This web element is not enabled, please define a different web element.\n " +
                "To find the element in the spec file, search with the text below in the spec file.\n" +
                "\"" + locatorValue + "\"\n" +
                "By value: " + elementLocator;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
