package org.camunda.workshop;

import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;

/**
 * Created by adrian.dinu on 3/21/2017.
 */

@ProcessApplication("Test Service")
public class DeploymentApplication extends ServletProcessApplication {
}
