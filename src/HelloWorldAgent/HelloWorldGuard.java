/**
 * ==========================================================================
 * HelloWordAgent                                                           *
 * @version 1.0                                                             *
 * @since 2024                                                              *
 * @author Jairo Serrano                                                    *
 * ==========================================================================
 * Hello World Agent for Testing.                                           *
 * ==========================================================================
 */

package HelloWorldAgent;

import BESA.Kernel.Agent.Event.EventBESA;
import BESA.Kernel.Agent.GuardBESA;
import BESA.Log.ReportBESA;

/**
 * The HelloWorldGuard class is a guard that handles events sent to the HelloWorldAgent.
 * When an event is received, it logs a message to the console and reports a "Hello World" message
 * using the BESA logging system.
 * 
 * @author Jairo Serrano
 * @version 1.0
 * @since 2024
 */
public class HelloWorldGuard extends GuardBESA {

    /**
     * This method is executed when the guard receives an event. It logs a message indicating 
     * that information has arrived at the guard, and then it reports a "Hello World" message.
     *
     * @param ebesa The event received by the guard.
     */
    @Override
    public void funcExecGuard(EventBESA ebesa) {
        // Log a message to the console indicating that information has arrived at the guard.
        System.out.println("Llegó información a la Guarda");
        
        // Report a "Hello World" message using the BESA logging system.
        ReportBESA.info(SayHello());
    }

    /**
     * This private method returns a "Hello World" message.
     *
     * @return A string containing "Hello World".
     */
    private Object SayHello() {
        return "Hello World";
    }
    
}
