package exception;

import org.openqa.selenium.By;

public class ElementIsNotVisible extends Exception {
    public String message;

    public ElementIsNotVisible(String locatorValue, By elementLocator) {
        this.message = "This web element is invisible, please define a different web element. \n " +
                "To find the element in the spec file, search with the text below in the spec file.\n " +
                "\"" + locatorValue + "\"\n" +
                "element by: " + elementLocator;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
