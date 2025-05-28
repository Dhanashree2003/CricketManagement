package com.hexaware.test.cricketTeam.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(reason = "Player Not Found for given ID", code = HttpStatus.NOT_FOUND)
public class PlayerNotFoundException extends RuntimeException {

}
