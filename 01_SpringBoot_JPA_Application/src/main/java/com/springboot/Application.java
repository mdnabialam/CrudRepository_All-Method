package com.springboot;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.model.FriendList;
import com.springboot.repository.FriendRepository;

@SpringBootApplication
public class Application {

	

	public static void main(String[] args) {
		ConfigurableApplicationContext c =	SpringApplication.run(Application.class, args);
		FriendRepository friendRepository= c.getBean(FriendRepository.class);
		/*
		FriendList friendList= new FriendList();
		friendList.setFId(101);
		friendList.setFname("Tahir");
		friendList.setAge(25);
		friendList.setEmail("tahir@gmail.com");
		friendList.setHomecity("Patna");
		friendRepository.save(friendList);
		System.out.println("Success Added Friend List");
		*/
		/*
		 * private Integer fId;
	private String Fname;
	private String email;
	private Integer age;
	private String homecity;
	
		 */
		/*
		FriendList f1= new FriendList(102,"zohan","zohan12@gmail.com",3,"Gaya");
		FriendList f2= new FriendList(103,"NABI ALAM","nabi@gmail.com",25,"HYD");
		FriendList f3= new FriendList(104,"NADEEM","nadeem@gmail.com",21,"Darbhanga");
		FriendList f4= new FriendList(105,"Nehal","nehal@gmail.com",20,"Patna");
		
		friendRepository.saveAll(Arrays.asList(f1,f2,f3,f4));
		System.out.println("Success Addes Friend in List ");		
		*/
			
			  Optional<FriendList> byId = friendRepository.findById(102);
			  if (byId.isPresent()) {
				System.out.println(byId.get());
			}
		
			  
		Iterable<FriendList> allById = friendRepository.findAllById(Arrays.asList(103,101,105));
		allById.forEach(friend ->{
			System.out.println(friend);
		});
		
		Iterable<FriendList> all = friendRepository.findAll();
		all.forEach(friend ->{
			System.out.println(friend);
		});
		
		
		long count = friendRepository.count();
		System.out.println("Totel Friends of Number "+count);
		
		friendRepository.deleteById(105);
		
		Iterable<FriendList> all1 = friendRepository.findAll();
		all1.forEach(friend ->{
			System.out.println(friend);
		});
	}

}
