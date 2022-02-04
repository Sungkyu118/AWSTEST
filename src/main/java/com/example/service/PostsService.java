package com.example.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.domain.PostsSaveRequestDto;
import com.example.repository.PostsRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class PostsService {
	private PostsRepository postsRepository;

	@Transactional
	public Long save(PostsSaveRequestDto dto) {
		return postsRepository.save(dto.toEntity()).getId();
	}
}