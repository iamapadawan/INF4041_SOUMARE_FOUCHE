#!/bin/bash

echo "Start"
echo"invoking CLI command"

java -cp manageEntity-Migration-1.0.0-SNAPSHOT.jar org.seedstack.seed.core.SeedMain EntityManagerMigration arg1 --file ProjectsDeliverables.csv