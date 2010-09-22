/**
 * 
 */
package org.jruby.hudson;

import java.io.IOException;

import hudson.FilePath;
import hudson.model.TaskListener;
import hudson.model.Node;
import hudson.tools.ToolInstaller;
import hudson.tools.ToolInstallation;

/**
 * @author antoine
 *
 */
public class JRubyToolInstaller extends ToolInstaller {

	protected JRubyToolInstaller() {
		super("JRuby Installer");
	}

	public FilePath performInstallation(ToolInstallation tool, Node node,
			TaskListener log) throws IOException, InterruptedException {
		return null;
	}

	
}
