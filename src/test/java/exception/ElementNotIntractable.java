package exception;

import org.openqa.selenium.By;

public class ElementNotIntractable extends Exception {

    public String message;


    public ElementNotIntractable(String locatorValue, By elementLocator) {
        this.message = "This web element is a non-interacting web element, please specify another web element.\n " +
                "To find the element in the spec file, search with the text below in the spec file.\n" +
                "\"" + locatorValue + "\"\n" +
                "By value: " + elementLocator;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
