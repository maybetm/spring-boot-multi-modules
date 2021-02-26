package com.maybetm.db.service.repositories;

import com.maybetm.db.service.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author zebzeev-sv
 * @version 04.11.2020 17:22
 */
@Repository
public interface MessageRepo extends JpaRepository<Message, Long>
{

}
