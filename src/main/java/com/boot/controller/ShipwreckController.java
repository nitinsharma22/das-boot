package com.boot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Shipwreck;

@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {
	
	@RequestMapping(method=RequestMethod.GET, value="shipwrecks")
	public List<Shipwreck> list(){
		return ShipwreckStub.list();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="shipwrecks")
	public Shipwreck create(@RequestBody Shipwreck shipwreck){
		return ShipwreckStub.create(shipwreck);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="shipwrecks/{id}")
	public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck shipwreck){
		return ShipwreckStub.update(id, shipwreck);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="shipwrecks/{id}")
	public Shipwreck delete(@PathVariable Long id){
		return ShipwreckStub.delete(id);
	}
	

}
