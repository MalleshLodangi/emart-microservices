package com.project.loginservice.dao;






import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.loginservice.entity.ItemEntity;





@Repository
public interface ItemDao extends JpaRepository<ItemEntity, Integer>
{

}
