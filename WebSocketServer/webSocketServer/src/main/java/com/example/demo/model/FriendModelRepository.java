package com.example.demo.model;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.Nullable;

public interface FriendModelRepository extends CrudRepository<FriendModel, Integer> {

	@Nullable
	public Optional<List<FriendModel>> findByUserName(String userName);

}
