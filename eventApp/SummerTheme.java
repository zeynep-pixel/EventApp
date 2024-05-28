public class SummerTheme implements ThemeSelector {
    @Override
    public String selectTheme() {
        MessageBuilder messageBuilder = new MessageBuilder();
        return messageBuilder.addThemeMessage("Yaz").build();
    }
}


