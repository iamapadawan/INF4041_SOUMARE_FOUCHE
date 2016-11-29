/*
 * Creation : 4 août 2016
 */
package com.inetpsa.pi201.manageprojects.batch;

import java.net.URL;

import javax.inject.Inject;

import org.seedstack.seed.cli.CliArgs;
import org.seedstack.seed.cli.CliCommand;
import org.seedstack.seed.cli.CliOption;
import org.seedstack.seed.cli.CommandLineHandler;
import org.seedstack.seed.core.utils.SeedReflectionUtils;

import com.inetpsa.pi201.domains.manageprojects.services.project.ProjectService;

@CliCommand("EntityManagerMigration")
public class ManageEntityCommandLineHandler implements CommandLineHandler {

    @CliOption(name = "f", longName = "file", valueCount = 1, mandatory = true)
    private String file;

    @CliOption(name = "t", longName = "test", valueCount = 1, mandatory = false)
    // private Boolean test = true;
    private String test;

    @CliArgs(mandatoryCount = 1)
    private String[] args;

    @Inject
    private ProjectService mProjectService;

    public Integer call() throws Exception {
        // do something here
        if (test != null && "test".equals(test)) {
            ClassLoader lClassLoader = SeedReflectionUtils.findMostCompleteClassLoader(ManageEntityCommandLineHandler.class);

            URL lURL = lClassLoader.getResource("META-INF/testdata");
            String lRootTestDataDirectory = lURL.getPath();
            // lRootTestDataDirectory = mXmlJaxBWrapperServices.getCorrectFilePath(lRootTestDataDirectory);

            // pathFile = lRootTestDataDirectory + File.separator + file;
            mProjectService.importProjectsWithDeliverablesFromCsvFile(lRootTestDataDirectory + "/" + file);
            return 0;
        }

        mProjectService.importProjectsWithDeliverablesFromCsvFile(file);

        return 0;
    }
}
