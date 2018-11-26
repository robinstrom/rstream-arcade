package com.rstreamdevelopments.arcade.health

import groovyx.net.http.RESTClient
import spock.lang.Specification

class HealthCheckSpec extends Specification {

    def "Health check should be up"() {
        given:
        def restClient = new RESTClient("http://localhost:8080/")

        when:
        def result = restClient.get(path: "/actuator/health")

        then:
        result.status == 200

    }
}
