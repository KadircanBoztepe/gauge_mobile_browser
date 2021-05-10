package exception;

import org.openqa.selenium.By;

public class ElementCouldNotFound extends Exception {
    public String message;

    public ElementCouldNotFound(String locatorValue, By elementLocator) {
        this.message = "Selenium couldn't find web element, please define a different web element. \n " +
                "To find the element in the spec file, search with the text below in the spec file.\n " +
                "\"" + locatorValue + "\"\n" +
                "element by: " + elementLocator;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
