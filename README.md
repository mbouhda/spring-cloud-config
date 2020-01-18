# spring-cloud-config
Poc of a couple micro-services fetching properties from a git repo using spring cloud config.

* The config server is connected to a git repo.
* The micro-services fetch properties values from the config server and are connected to a rabbitmq bus.
* Following an update of the properties file in git, a repo hook or a manual `POST` call to `/actuator/bus-refresh` of any micro-service can be used to trigger a refresh of the properies values.
* The refresh is broadcasted through the bus to all connected micro-services.