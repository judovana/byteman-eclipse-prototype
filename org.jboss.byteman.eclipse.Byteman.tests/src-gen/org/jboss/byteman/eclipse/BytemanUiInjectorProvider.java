/*
* generated by Xtext
*/
package org.jboss.byteman.eclipse;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class BytemanUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.jboss.byteman.eclipse.ui.internal.BytemanActivator.getInstance().getInjector("org.jboss.byteman.eclipse.Byteman");
	}
	
}
