package controller;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.fusion.Response;

import model.Gallery;
import model.GoshalaData;
import model.Members;

@Controller
public class GoshalaController{
	
	final String uri = "https://goshalawebservice.herokuapp.com";
	
	@RequestMapping(value="addGalleryData", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public String addGalleryData(@Valid Gallery gallery, Model model) {
	    Gallery gal = new Gallery(gallery.getUrl());
	    RestTemplate restTemplate = new RestTemplate();
	    Response obj = restTemplate.postForObject(uri + "/addGallery", gal, Response.class);
	    model.addAttribute("response", obj);
	    return "result";
	}
	
	
	@RequestMapping(value="addMemberData", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public String addMemberData(@Valid Members member, Model model) {
	    Members mem = new Members(member.getName(), member.getNumber(), member.getType(), member.getDesignation(), member.getUrl());
	    RestTemplate restTemplate = new RestTemplate();
	    Response obj = restTemplate.postForObject(uri + "/addMembers", mem, Response.class);
	    model.addAttribute("response", obj);
	    return "result";
	}
	
	@RequestMapping(value="addGosalaData", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public String addGosalaData(@Valid GoshalaData goshalaData, Model model) {
	    GoshalaData goData = new GoshalaData(goshalaData.getPage(), goshalaData.getText(), goshalaData.getUrl());
	    RestTemplate restTemplate = new RestTemplate();
	    Response obj = restTemplate.postForObject(uri + "/addGoshalaData", goData, Response.class);
	    model.addAttribute("response", obj);
	    return "result";
	}
}
