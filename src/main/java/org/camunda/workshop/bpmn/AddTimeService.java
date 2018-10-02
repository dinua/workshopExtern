package org.camunda.workshop.bpmn;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

/**
 * Created by adrian.dinu on 9/3/2018.
 */
public class AddTimeService implements JavaDelegate {
//2018-10-02T16:47:00
//http://localhost:8088/engine-rest/engine/default/process-instance/f2a7ebde-c64e-11e8-af32-d0577b7c0f3e/variables/importComplete
    //{"value" : true, "type": "Boolean"}
    private final Logger LOGGER = Logger.getLogger("DefaultService");

    public void execute(DelegateExecution execution) throws Exception {

        String date = (String) execution.getVariable("DATE_VALID");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

        Calendar cal = Calendar.getInstance();
        cal.setTime(df.parse(date));
        cal.add(Calendar.MINUTE, 1);
        String newTime = df.format(cal.getTime());

        execution.setVariable("DATE_VALID", newTime);

       LOGGER.info("-------new time " + newTime);
    }
}
