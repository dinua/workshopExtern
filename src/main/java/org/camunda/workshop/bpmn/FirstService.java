package org.camunda.workshop.bpmn;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Logger;

/**
 * Created by adrian.dinu on 9/3/2018.
 */
public class FirstService implements JavaDelegate {

    private final Logger LOGGER = Logger.getLogger("FirstService");

    public void execute(DelegateExecution execution) throws Exception {
       LOGGER.info("-------Hello... How are you ? ---------------------");
    }
}
