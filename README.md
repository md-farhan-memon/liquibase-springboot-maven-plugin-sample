# liquibase-springboot-maven-plugin-sample
Sample setup for Springboot App, with liquibase plugin and maven. Helps in generating migration files and run automatically on start.

Command to generate new migrations based on entities added to models folder.

````
make migration MIGRATION_LABEL="add-collumn-to-a-table-whatever" PROPERTY_FILE="src/main/resources/liquibase.properties"
````
