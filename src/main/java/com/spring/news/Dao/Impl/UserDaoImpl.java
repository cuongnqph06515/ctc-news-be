package com.spring.news.Dao.Impl;

import com.spring.news.Dao.UserDao;
import com.spring.news.Entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        String hql = "FROM User";
        List<User> userList = entityManager.createQuery(hql).getResultList();
        if (userList != null && userList.size() > 0){
            return userList;
        }
        return null;
    }

    @Override
    public User getUserByUsername(String username) {
        String hql = "FROM User where username= :username";
        Query query = entityManager.createQuery(hql).setParameter("username", username);
        List<User> userList = query.getResultList();
        if (userList != null && userList.size() > 0){
            return userList.get(0);
        }
        return null;
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public void deleteUser(int id) {
        entityManager.remove(entityManager.find(User.class, id));
    }
}
