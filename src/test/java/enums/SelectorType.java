package enums;

public enum SelectorType {
    ID("id"),
    CLASSNAME("className"),
    LINK_TEXT("linkText"),
    CSS_SELECTOR("cssSelector"),
    XPATH("xpath"),
    ID_CONTAINS("contains");

    private final String value;

    SelectorType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
