package com.firstproj.checktask.checkcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstproj.checktask.checkmodel.CheckModel;
import com.firstproj.checktask.checkrepo.CheckRepo;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/checktask")
public class CheckController {
	
	@Autowired
	private CheckRepo checkRepo;
	
	
	@GetMapping("/get")
	public List<CheckModel> getAllTask(){
		return  checkRepo.findAll();
	}
	
	@GetMapping("/get/{id}")
	public CheckModel getTask(@PathVariable long id) {
		return checkRepo.findById(id).orElse(null);
	}
	
	@PostMapping("/post")
	public CheckModel addTask(@RequestBody CheckModel checkModel) {	
		checkRepo.save(checkModel);
		return checkModel;	
	}
	
	@PutMapping("/update")
	public CheckModel updateTask(@RequestBody CheckModel checkModel) {
		checkRepo.save(checkModel);
		return checkModel;
		
	}
	
	@PutMapping("/update/{id}")
	public CheckModel updateTaskById(@RequestBody CheckModel checkModel,@PathVariable long id) {
		CheckModel oldTask = checkRepo.findById(id).orElse(null);
		//oldTask.setId(checkModel.getId());
		oldTask.setTask(checkModel.getTask());
		oldTask.setDate(checkModel.getDate());
		oldTask.setChk(checkModel.isChk());
		checkRepo.save(oldTask);
		return oldTask;
	}
	
	@DeleteMapping("/delete/{id}")
	//public ResponseEntity<String> deleteTask(@PathVariable long id) {
	public String deleteTask(@PathVariable long id) {
		try{
			//CheckModel checkModel = checkRepo.findById(id).get();
			checkRepo.deleteById(id);
			return "employee deleted";
			//return new ResponseEntity<String>("Task is deleted succesfully",HttpStatus.OK);
		}catch(Exception e) {
			//return new ResponseEntity<String>("Task not found",HttpStatus.INTERNAL_SERVER_ERROR);
			return "error";
		}
	}
	

}
