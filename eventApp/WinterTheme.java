public class WinterTheme implements ThemeSelector {
    @Override
    public String selectTheme() {
        MessageBuilder messageBuilder = new MessageBuilder();
        return messageBuilder.addThemeMessage("Kış").build();
    }
}


