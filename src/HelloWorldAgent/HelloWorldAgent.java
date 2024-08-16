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

import BESA.ExceptionBESA;
import BESA.Kernel.Agent.AgentBESA;
import BESA.Kernel.Agent.KernelAgentExceptionBESA;
import BESA.Kernel.Agent.StateBESA;
import BESA.Kernel.Agent.StructBESA;

/**
 *
 * @author jairo
 */
public class HelloWorldAgent extends AgentBESA {

    public static HelloWorldAgent createAgent(String alias, double passwd) throws ExceptionBESA {
        return new HelloWorldAgent(
                alias,
                createState(),
                createStruct(
                        new StructBESA()
                ),
                passwd
        );
    }

    public HelloWorldAgent(String alias, StateBESA state, StructBESA structAgent, double passwd) throws KernelAgentExceptionBESA {
        super(alias, state, structAgent, passwd);
    }

    private static StructBESA createStruct(StructBESA structBESA) throws ExceptionBESA {
        structBESA.addBehavior("HelloWorldGuard");
        structBESA.bindGuard("HelloWorldGuard", HelloWorldGuard.class);
        return structBESA;
    }

    private static HelloWorldState createState() throws ExceptionBESA {
        return new HelloWorldState();
    }

    @Override
    public void setupAgent() {
    }

    @Override
    public void shutdownAgent() {
    }

}
