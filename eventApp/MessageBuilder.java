class MessageBuilder {
    private StringBuilder messageBuilder;
   
    public MessageBuilder() {
        this.messageBuilder = new StringBuilder();
    }

    public MessageBuilder addThemeMessage(String message) {
        messageBuilder.append(message).append(" teması seçildi. \n");
        return this;
    }

    public MessageBuilder addMessage(String message) {
        messageBuilder.append(message).append("\n");
        return this;
    }

    public String build() {
        return messageBuilder.toString();
    }
}
