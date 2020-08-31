package com.example.notificationserviceapplication.repositories;

import com.example.notificationserviceapplication.models.Notifications;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationsRepository extends JpaRepository<Notifications, Integer> {


}
