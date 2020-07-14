# spring-actuator-demo
demo how to use a spring actuator to monitor the application. 

# Health endpoint
* Provides status of application
* Provides status of dependencies

# Info endpoint
* Provides customizable piont of information

# JMX(Java Management Extention) Functionality
* Beans:a list of all beans in the application context
* Env:a list of the state of the environent
* Memory dumps: Heapdump and threaddump
* Mappings:a list of web URL mappings
* Metrics:micrometer metrix

# Define Exposures
* management.endpoints.jmx.exposure.exclude/include
* management.endpoints.web.exposure.exclude/include
* management.endpoint.<id>.enabled

# Securing Actuator
* Actuator is a data sensitive exposure piont.
* Spring security must be enabled to protect it. 
* Even inside the orgnisation actuator should be protected. 

