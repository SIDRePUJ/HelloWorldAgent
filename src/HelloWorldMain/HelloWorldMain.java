/**
 * ==========================================================================
 * HelloWorldAgent                                                          *
 * @version 1.0                                                             *
 * @since 2024                                                              *
 * @author Jairo Serrano                                                    *
 * ==========================================================================
 * Hello World Agent for Testing.                                           *
 * ==========================================================================
 */

package HelloWorldMain;

import BESA.ExceptionBESA;
import BESA.Kernel.Agent.Event.EventBESA;
import BESA.Kernel.System.AdmBESA;
import HelloWorldAgent.HelloWorldAgent;
import HelloWorldAgent.HelloWorldGuard;

/**
 * The HelloWorldMain class serves as the main entry point for the HelloWorld
 * example using the BESA framework. This class demonstrates the creation and
 * activation of a simple agent, followed by sending an event to that agent.
 * 
 * @author Jairo Serrano
 * @version 1.0
 * @since 2024
 */
public class HelloWorldMain {

    /**
     * The main method is the entry point for the application.
     * It initializes the BESA system, creates a HelloWorldAgent, starts the agent,
     * and sends an event to the agent's guard.
     *
     * @param args Command line arguments.
     * @throws BESA.ExceptionBESA If there is an error initializing the BESA 
     *                            system or creating the agent.
     */
    public static void main(String[] args) throws ExceptionBESA {
        // Initialize the BESA administration system.
        AdmBESA admBesa = AdmBESA.getInstance();
        
        // Create a new HelloWorldAgent with the alias "HolaMundo" and a password of 0.99.
        HelloWorldAgent helloWorldAgent = HelloWorldAgent.createAgent("HolaMundo", 0.99);
        
        // Start the HelloWorldAgent.
        helloWorldAgent.start();
        
        // Retrieve the agent's handler by its alias and send an event to the HelloWorldGuard.
        admBesa.getHandlerByAlias("HolaMundo").sendEvent(
                new EventBESA(
                        HelloWorldGuard.class.getName(), 
                        null
                )
        ); 
        
        // Print the BESA system configuration to the console.
        System.out.println(admBesa.getConfigBESA());
    }
    
}
