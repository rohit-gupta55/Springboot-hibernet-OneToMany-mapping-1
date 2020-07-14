package in.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.nit.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long>{

}
