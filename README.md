JAVA EE application using Wildfly Swarm
===================

This application show how to create a JAVA EE application using Wildfly Swarm. 
This example is using:

 - **CDI**
 - **EJB**
 - **JPA** 
 - **JAX-RS**

The database used in this example is SQLServer because i didn't find examples showing how to do this integration, only with databases on the official examples ([JPA EXAMPLE](https://github.com/wildfly-swarm/wildfly-swarm-examples/tree/master/datasource/datasource-subsystem)). 
To use other database is necessary add the module on the *modules* folder and add the driver dependency in pom.xml.


----------


In the future this example will show how to use CONSUL as the configuration server, including a way to use with CDI and to configure the database information.

With this example is easy to create a REST service with basic features, the increments should be implemented when the requirements appear.


----------


> **NOTE**:
> To use SQLJDBC4 driver with maven is necessary add a repository with this artifact
