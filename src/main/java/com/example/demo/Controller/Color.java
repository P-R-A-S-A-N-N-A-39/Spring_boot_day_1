package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Color {
	private String color="Green";
	@GetMapping("colo")
 public String getMyFav()
 {
	 return "My Favourite color is "+color;
 }
}
