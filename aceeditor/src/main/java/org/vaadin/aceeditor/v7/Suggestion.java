package org.vaadin.aceeditor.v7;

import org.vaadin.aceeditor.v7.client.TransportSuggestion;

/**
 * A single suggestion.
 * 
 * Feel free to subclass.
 */
public class Suggestion {

	private final String displayText;
	private final String descriptionText;
	private final String suggestionText;

	/**
	 * 
	 * @param displayText
	 *            the text shown in the popup list
	 * @param descriptionText
	 *            a longer description
	 */
	public Suggestion(String displayText,
			String descriptionText) {
		this(displayText, descriptionText, "");
	}
	
	/**
	 * 
	 * If suggestionText is "cat", the suggestion popup will stay there
	 * if user types "c" "ca" or "cat".
	 * 
	 * @param displayText
	 *            the text shown in the popup list
	 * @param descriptionText
	 *            a longer description
	 * @param suggestionText
	 */
	public Suggestion(String displayText,
			String descriptionText, String suggestionText) {
		this.displayText = displayText;
		this.descriptionText = descriptionText;
		this.suggestionText = suggestionText;
	}
	
	public TransportSuggestion asTransport(int index) {
		TransportSuggestion ts = new TransportSuggestion();
		ts.displayText = displayText;
		ts.descriptionText = descriptionText;
		ts.suggestionText = suggestionText;
		ts.index = index;
		return ts;
	}

	public String getDisplayText() {
		return displayText;
	}

	public String getDescriptionText() {
		return descriptionText;
	}

	public String getSuggestionText() {
		return suggestionText;
	}
	
	
}
