package com.prospring5.ch02;

public class StandardOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException("You must set property messageProvider of the class: "
                    + StandardOutMessageRenderer.class.getName());
        }

        System.out.println(getMessageProvider().getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;

    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
    
}