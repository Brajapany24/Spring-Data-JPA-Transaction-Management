package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.PassengerInfo;

public interface PassengerInfoRepo extends JpaRepository<PassengerInfo, Long> {

}
