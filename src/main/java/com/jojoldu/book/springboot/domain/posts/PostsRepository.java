package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// p.95 ( Mybatis 에서 Dao 라고 불리는 DB Layer 접근자 - JPA에서는 리포지토리 라고함 )

public interface PostsRepository extends JpaRepository<Posts,Long> {

}
