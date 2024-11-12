package com.firstproject.firstproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;



@RestController
public class DemoController {
	@GetMapping("/Items")
	public List<ItemList> RetreiveAllItems() {
		return Arrays.asList(
				new ItemList(1,"Fruit","Manga"),
				new ItemList(2,"Tree","Narra"),
				new ItemList(3,"Vegetables","Squash"),
				new ItemList(4,"Animal","Dog")
		);
	}
}
