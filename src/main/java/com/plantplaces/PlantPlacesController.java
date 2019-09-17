package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 *Handle the /start endpoint
 *@return
 */

@Controller
public class PlantPlacesController {

	@RequestMapping("/start")
	public String start()
	{
		return "start";
	}
	
	/**
	 * Handle the / endpoint
	 *@return
	 */
	@RequestMapping("/")
	public String index()
	{
		return "start";
		
	}
}
