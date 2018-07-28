package calculator2;

import java.awt.event.FocusEvent;

public class FocusListener implements java.awt.event.FocusListener {

	@Override
	public void focusGained(FocusEvent e) {
		displayMessage("Focus gained", e);

	}

	@Override
	public void focusLost(FocusEvent e) {
		
		displayMessage("Focus lost", e);
	}
	 void displayMessage(String prefix, FocusEvent e) {
	        System.out.println(prefix
	            + (e.isTemporary() ? " (temporary):" : ":")
	            + e.getComponent().getClass().getName()
	            + "; Opposite component: "
	            + (e.getOppositeComponent() != null ? e.getOppositeComponent().getClass().getName()
	                : "null"));
	      }

}
