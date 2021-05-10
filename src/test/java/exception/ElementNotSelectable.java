package exception;

import org.openqa.selenium.By;

public class ElementNotSelectable extends Exception{
    public String message;


    public ElementNotSelectable(String locatorValue, By elementLocator) {
        this.message = "This web element is a non-selectable web element, please define a different web element.\n " +
                "To find the element in the spec file, search with the text below in the spec file.\n" +
                "\"" + locatorValue + "\"\n" +
                "By value: " + elementLocator;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
