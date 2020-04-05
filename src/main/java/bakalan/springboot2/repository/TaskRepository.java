package bakalan.springboot2.repository;

import bakalan.springboot2.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findTasksByDateBetween(LocalDate startDate, LocalDate endDate);

    List<Task> findTasksByDateBetweenAndOrderId(LocalDate startDate, LocalDate endDate, long orderId);
}
