package com.restful.nabi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restful.nabi.model.Tourist;
import com.restful.nabi.repo.TouristRepo;
import com.restful.nabi.service.TouristService;

@Service
public class TouristServiceImpl implements TouristService {

	@Autowired
	private TouristRepo  touristRepo;
	
	@Override
	public String registerTourist(Tourist tourist) {
		int tourId = touristRepo.save(tourist).getTid();
		return "Tourist is Register having the Id Value ::"+tourId;
	}

	@Override
	public List<Tourist> fetchAllTourist() {
		List<Tourist> list= touristRepo.findAll();
		list.sort((t1,t2)->t1.getTid().compareTo(t2.getTid()));
		return list;
	}

}
