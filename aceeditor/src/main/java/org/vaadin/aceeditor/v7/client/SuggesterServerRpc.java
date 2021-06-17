package org.vaadin.aceeditor.v7.client;


import org.vaadin.aceeditor.v7.client.TransportDoc.TransportRange;

import com.vaadin.shared.communication.ServerRpc;

public interface SuggesterServerRpc extends ServerRpc {
	
	// TODO: it may not be necessary to send the whole text here
	// but I guess it's simplest...
	
	public void suggest(String text, TransportRange selection);

	public void suggestionSelected(int index);
	
	
}
