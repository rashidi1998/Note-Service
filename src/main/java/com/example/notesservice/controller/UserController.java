package com.example.notesservice.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/users")
@RestController
@Api(tags = "users")
public class UserController {
}
