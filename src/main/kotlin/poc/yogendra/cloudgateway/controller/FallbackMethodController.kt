package poc.yogendra.cloudgateway.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FallbackMethodController {

    @GetMapping("/userServiceFallbackMethod")
    fun userServiceFallbackMethod() = "User service is taking longer than expected, please try again later"

    @GetMapping("/departmentServiceFallbackMethod")
    fun departmentServiceFallbackMethod() = "Department service is taking longer than expected, please try again later"
}