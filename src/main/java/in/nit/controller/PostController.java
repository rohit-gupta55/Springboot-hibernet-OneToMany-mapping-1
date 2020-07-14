package in.nit.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.nit.entity.Post;
import in.nit.repository.PostRepository;

@RestController
public class PostController {

	private PostRepository postRepository;
	
	@PostMapping(value = "/createpost")
	public String  createPostWithComment(@RequestBody Post post)
	{
		long id = postRepository.save(post).getId();
	     return "Post create with id:"+id;	
	}
}
