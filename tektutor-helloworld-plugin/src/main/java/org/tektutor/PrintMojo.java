package org.tektutor;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

/**
 * Goal which touches a timestamp file.
 *
 * @goal printHello
 * 
 * @phase process-sources
 */
public class PrintMojo
    extends AbstractMojo
{
    public void execute()
        throws MojoExecutionException
    {
	System.out.println ("Hello World Plugin *************");
    }
}
