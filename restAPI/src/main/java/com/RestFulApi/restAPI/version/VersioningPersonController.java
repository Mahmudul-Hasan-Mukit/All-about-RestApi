package com.RestFulApi.restAPI.version;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
@GetMapping("/v1/person")
public PersonV1 getFirstVersionOfPerson() {
	return new PersonV1("Mahmudul Hasan");
}
@GetMapping("/v2/person")
public PersonV2 getSecondVersionOfPerson() {
	return new PersonV2(new Name("Mahmudul","Hasan"));
}
@GetMapping(path="/person",params="version=1")
public PersonV1 getFirstVersionOfPersonRequestParameter() {
	return new PersonV1("Mahmudul Hasan");
}
@GetMapping(path="/person",params="version=2")
public PersonV2 getSecondVersionOfPersonRequestParameter() {
	return new PersonV2(new Name("Mahmudul","Hasan"));
}
}
