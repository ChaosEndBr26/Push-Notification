package com.push.resource;

import com.push.service.MessageService;
import com.vaadin.flow.server.connect.Endpoint;
import com.vaadin.flow.server.connect.auth.AnonymousAllowed;

import nl.martijndwars.webpush.Subscription;

public class PushResource {
	private MessageService messageService;

	  public MessageEndpoint(MessageService messageService) {
	    this.messageService = messageService;
	  }

	  public String getPublicKey() {
	    return messageService.getPublicKey();
	  }

	  public void subscribe(Subscription subscription) {
	    messageService.subscribe(subscription);
	  }

	  public void unsubscribe(String endpoint) {
	    messageService.unsubscribe(endpoint);
	  }
}
