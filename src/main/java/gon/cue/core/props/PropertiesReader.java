package gon.cue.core.props;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class PropertiesReader {
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("examples_fileviewer");

	/**
	 * Returns a string from the resource bundle. We don't want to crash because
	 * of a missing String. Returns the key if not found.
	 */
	public static String getResourceString(String key) {
		try {
			return resourceBundle.getString(key);
		} catch (MissingResourceException e) {
			return key;
		} catch (NullPointerException e) {
			return "!" + key + "!";
		}
	}

	/**
	 * Returns a string from the resource bundle and binds it with the given
	 * arguments. If the key is not found, return the key.
	 */
	public static String getResourceString(String key, Object[] args) {
		try {
			return MessageFormat.format(getResourceString(key), args);
		} catch (MissingResourceException e) {
			return key;
		} catch (NullPointerException e) {
			return "!" + key + "!";
		}
	}
}
