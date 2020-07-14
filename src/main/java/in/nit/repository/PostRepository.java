package in.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nit.entity.Post;

public interface PostRepository  extends JpaRepository<Post,Long>{

}
