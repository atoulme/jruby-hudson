/**
 * 
 */
package org.jruby.hudson;

import java.util.Collections;
import java.util.List;

import hudson.tools.ToolDescriptor;
import hudson.tools.ToolInstallation;
import hudson.tools.ToolInstaller;

/**
 * @author antoine
 *
 */
public class JRubyToolDescriptor extends ToolDescriptor<ToolInstallation> {

	public String getDisplayName() {
		return "JRuby";
	}
	
	public List<? extends ToolInstaller> getDefaultInstallers() {
        return Collections.singletonList(new JRubyToolInstaller());
    }

}
