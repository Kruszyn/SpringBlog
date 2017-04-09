package services;

import models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by ibm on 2017-04-09.
 */

@Primary
@Service
public class PostServiceJDBC implements PostService {

    @Autowired
    private DataSource dataSource;

    @Override
    public List<Post> findAll() {

        String sql = "SELECT * FROM posts";

        List<Post> posts  = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(Post.class));

        return posts;

    }

    @Override
    public Post findById(Long id) {
        return null;
    }

    @Override
    public List<Post> findLatest5() {
        List<Post> posts = findAll();
        return posts.subList(0,4);
    }

    @Override
    public void add(Post post) {

    }

    @Override
    public Post edit(Post post) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(dataSource);
    }
}
