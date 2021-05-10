package exception;

import org.openqa.selenium.By;

public class ElementReferenceIsStale extends Exception {
    public String message;


    public ElementReferenceIsStale(String locatorValue, By elementLocator) {
        this.message = "This web element reference is stale.\n" +
                "Please get the element again before use or define a different web element. \n " +
                "To find the element in the spec file, search with the text below in the spec file.\n" +
                "\"" + locatorValue + "\"\n" +
                "By value: " + elementLocator;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
