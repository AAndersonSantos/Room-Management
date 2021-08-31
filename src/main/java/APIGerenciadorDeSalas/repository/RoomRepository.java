package APIGerenciadorDeSalas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import APIGerenciadorDeSalas.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{

}
