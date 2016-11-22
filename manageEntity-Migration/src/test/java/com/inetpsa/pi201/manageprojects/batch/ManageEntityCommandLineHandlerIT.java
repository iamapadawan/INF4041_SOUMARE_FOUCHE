/*
 * Creation : 4 août 2016
 */
package com.inetpsa.pi201.manageprojects.batch;

import org.junit.Test;
import org.seedstack.seed.cli.WithCommandLine;
import org.seedstack.seed.it.AbstractSeedIT;

public class ManageEntityCommandLineHandlerIT extends AbstractSeedIT {

    @Test
    @WithCommandLine(command = "EntityManagerMigration", args = { "arg1", "--file", "ProjectsDeliverables.csv", "--test",
            "test" }, expectedExitCode = 0)
    public void execute_sample_command() {
        // assert execution outcome here
    }

}
